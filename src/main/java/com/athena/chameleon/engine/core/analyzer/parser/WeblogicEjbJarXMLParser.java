/*
 * Copyright 2012 the original author or authors.
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
 *
 * Revision History
 * Author			Date				Description
 * ---------------	----------------	------------
 * Sang-cheon Park	2012. 10. 3.		First Draft.
 */
package com.athena.chameleon.engine.core.analyzer.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import com.athena.chameleon.engine.entity.pdf.AnalyzeDefinition;
import com.athena.chameleon.engine.entity.pdf.CommonAnalyze;
import com.athena.chameleon.engine.utils.JaxbUtils;

/**
 * <pre>
 *
 * </pre>
 * 
 * @author Sang-cheon Park
 * @version 1.0
 */
public class WeblogicEjbJarXMLParser extends Parser {

	/* (non-Javadoc)
	 * @see com.athena.chameleon.engine.core.analyzer.parser.Parser#parse(java.io.File, com.athena.chameleon.engine.entity.pdf.AnalyzeDefinition)
	 */
	@Override
	public Object parse(File file, AnalyzeDefinition analyzeDefinition) {
		this.analyzeDefinition = analyzeDefinition;

        try {
            CommonAnalyze commonAnalyze = new CommonAnalyze();
            commonAnalyze.setItem(file.getName());
            commonAnalyze.setLocation(file.getPath());
            commonAnalyze.setContents(fileToString(file.getAbsolutePath()));
            
            analyzeDefinition.getDescripterList().add(commonAnalyze);
        } catch (IOException e) {
            logger.error("IOException has occurred.", e);
        }
        
    	Object obj = null;
    	
    	try {
        	// weblogic-ejb-jar v9_0
			obj = ((JAXBElement<?>)JaxbUtils.unmarshal(com.athena.chameleon.engine.entity.xml.ejbjar.weblogic.v9_0.WeblogicEjbJarType.class.getPackage().getName(), file)).getValue();
    	} catch (JAXBException e1) {
	    	try {
	        	// weblogic-ejb-jar v8_1
				obj = JaxbUtils.unmarshal(com.athena.chameleon.engine.entity.xml.ejbjar.weblogic.v8_1.WeblogicEjbJar.class.getPackage().getName(), file);
			} catch (JAXBException e2) {
				logger.error("JAXBException has occurred.", e2);
			}
    	}
		
		// jboss.xml 변환 생성
    	
    	return obj;
	}//end of parse()

}
//end of WeblogicEjbJarXMLParser.java