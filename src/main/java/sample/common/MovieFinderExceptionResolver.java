/*
 * Copyright 2008-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.common;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * This MovieFinderExceptionResolver class is exception resolver.
 * 
 * @author Youngmin Jo
 */
public class MovieFinderExceptionResolver extends SimpleMappingExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(MovieFinderExceptionResolver.class);

    @Inject
    private MessageSource messageSource;

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        MovieFinderException movieFinderException;

        if (!(ex instanceof MovieFinderException)) {
        	String className = null;
        	if(handler != null) {
        		className = handler.getClass().getSimpleName().toLowerCase();
        	}
            logger.error(ex.getMessage(), ex);

            try {
                messageSource.getMessage("error." + className, new String[] {}, Locale.getDefault());
                movieFinderException = new MovieFinderException("error." + className);
            } catch (Exception e) {
                movieFinderException = new MovieFinderException("error.common");
            }

        } else {
            movieFinderException = (MovieFinderException) ex;
        }
        return super.doResolveException(request, response, handler, movieFinderException);
    }
}
