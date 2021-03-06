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
 * Sang-cheon Park	2012. 9. 11.		First Draft.
 */
package com.athena.chameleon.engine.threadpool.task;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.athena.chameleon.engine.threadpool.handler.ChameleonTaskExceptionHandler;

/**
 * <pre>
 * Encoding 변환 task, XML Parsing task 등을 위한 기본 task로써 Runnable interface가 구현되어 있다.
 * BaseTask를 상속받고 taskRun() 메소드를 구현해야 한다.
 * </pre>
 * 
 * @author Sang-cheon Park
 * @version 1.0
 */
public abstract class BaseTask implements Runnable {
    
    protected static final Logger logger = LoggerFactory.getLogger(BaseTask.class);
    protected String taskName;
    protected static final String IPADDRESS_PATTERN = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName == null ? super.toString() : taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
    
    /**
     * <pre>
     * Constructor
     * </pre>
     * @param taskName
     */
    public BaseTask() {
    }//end of Constructor()
    
    /**
     * <pre>
     * Constructor
     * </pre>
     * @param taskName
     */
    public BaseTask(String taskName) {
    	this.taskName = taskName;
    }//end of Constructor()

	/**
     * <pre>
     * 
     * </pre>
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
    	// Thread 실행 시 UncaughtException에 대해 catch 하기 위해 handler 등록.
        Thread.currentThread().setUncaughtExceptionHandler(new ChameleonTaskExceptionHandler());
        
        logger.debug("[{}] is started.", getTaskName());
        // TODO 사전 작업이 필요하면 beforeRun() 메소드 구현 후 호출
        
    	taskRun();
    	
    	// TODO 사후 작업이 필요하면 afterRun() 메소드 구현 후 호출
    	logger.debug("[{}] is completed.", getTaskName());
    }
    
    /**
     * <pre>
     * 파일의 내용을 문자열로 변환하여 반환한다.
     * </pre>
     * @param file
     * @return
     */
    protected String fileToString(String file) {
        String result = null;

        try {
            DataInputStream in = null;
            File f = new File(file);
            byte[] buffer = new byte[(int) f.length()];
            in = new DataInputStream(new FileInputStream(f));
            in.readFully(buffer);
            result = new String(buffer);
            IOUtils.closeQuietly(in);
        } catch (IOException e) {
            throw new RuntimeException("IO problem in fileToString", e);
        }
        
        return result;
    }//end of fileToString()
    
    @Override
    public String toString() {
    	return getTaskName();
    }
    
    protected abstract void taskRun();
    
}//end of BaseTask.java