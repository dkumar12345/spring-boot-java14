/**
 * 
 */
package com.dkumar.springbootjava14.java9;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import org.springframework.stereotype.Service;



/**
 * @author Dilip
 * May 6, 2020
 */
@Service
public class PrintSubscriber implements Subscriber<Integer> {
  
	private Subscription subscription;
    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }
    @Override
    public void onNext(Integer item) {
        System.out.println("Received item===>>: " + item);
        subscription.request(1);
    }
    @Override
    public void onError(Throwable error) {
        System.out.println("Error occurred: " + error.getMessage());
    }
    @Override
    public void onComplete() {
        System.out.println("PrintSubscriber is complete");
    }
}