/**
 * 
 */
package com.dkumar.springbootjava14.java9;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.SubmissionPublisher;
import static java.lang.System.out;

import org.slf4j.Logger;

/**
 * @author Dilip
 * May 6, 2020
 */
@Component
public class Java9Test implements CommandLineRunner{

	private static final Logger logger =LoggerFactory.getLogger(Java9Test.class);
	
	 
	@Override
	public void run(String... args) throws Exception,InterruptedException {
		// TODO Auto-generated method stub
		logger.info("Start Execution=====>>>");
		testReactiveStream();
		testModularitySystem();
		testImmutableList();
		testImmutableListSet();
		testImmutableListMap();
		testTryWithResources();
		
	}
	
	
	/**
	 * 
	 */
	private void testTryWithResources()throws Exception {
		// TODO Auto-generated method stub
		Connection connection =new Connection();

	try(connection){
			connection.testStartConnection();
		}
}

	/**
	 * 
	 */
	private void testModularitySystem() {
		// TODO Auto-generated method stub
		logger.info("!!======>>modularitySystem");
		
	}
	private void testReactiveStream() throws InterruptedException {
		logger.info("!!====Call=======>>>Reactive Stream in java 9");
		// TODO Auto-generated method stub
		SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        //PlusTenProcessor processor = new PlusTenProcessor();
        PrintSubscriber subscriber = new PrintSubscriber();
        publisher.subscribe(subscriber);
       // publisher.subscribe(processor);
       // processor.subscribe(subscriber);
        System.out.println("Submitting items..Execustion start.");
        for (int i = 0; i < 10; i++) {
            publisher.submit(i);
        }
        Thread.sleep(1000);
        publisher.close();
    }
	/**
	 * 
	 */
	private void testImmutableListMap() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 */
	private void testImmutableListSet() {
		// TODO Auto-generated method stub
		logger.info("Set before java 9====>>");
		
		Set<String> locations_set=new HashSet<>();
		
		locations_set.add("Patan");
		locations_set.add("Kolkata");
		locations_set.add("Delhi");
		locations_set.add("Patan");
		locations_set.add("Bangalore");
		locations_set.forEach(System.out::println);
		
		logger.info("Set after java 9====>>");
		Set<String> locations_sets=Set.of("Kolkata","Bangalore","Delhi","Patna");
		locations_sets.forEach(System.out::println);
	}
	/**
	 * 
	 *
	 */
	private void testImmutableList() {
		// TODO Auto-generated method stub
		logger.info(" List before java9 ===========>>>");	
		List<String> listOf_location = new ArrayList<>();
		listOf_location.add("Patna");
		listOf_location.add("kolkata");
		listOf_location.add("delhi");
		listOf_location.add("bangalore");
		listOf_location = Collections.unmodifiableList(listOf_location);
		listOf_location.forEach(System.out::println);
		
		logger.info("List After java9 ===========>>>");
		
		List<String> list_city = List.of("Patna", "Kolkata", "Bangalore");
		list_city.forEach(System.out::println);
		
	}

	
	
	}


