/**
 * 
 */
package com.dkumar.springbootjava14.java9;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

/**
 * @author Dilip
 * May 7, 2020
 */
@Service
public class Connection implements AutoCloseable{
private static final Logger logger=LoggerFactory.getLogger(Connection.class);
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		logger.info("Connection is closed");
	}

	
	void makeImportantPreparations() { }

	void testStartConnection() {
		
		logger.info("Start the connection");
		
	}

}
