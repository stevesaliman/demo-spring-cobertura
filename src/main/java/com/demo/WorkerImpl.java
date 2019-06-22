package com.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: steve
 * Date: 6/22/19
 * Time: 9:03 AM
 * To change this template use File | Settings | File Templates.
 *
 * @author Steven C. Saliman
 */
@Component
public class WorkerImpl implements Worker {
	@Override
	@PostConstruct
	public void doWork() {
		double x;
		x = Math.random();
		if ( x > 0.5 ) {
			System.out.println("We had a 50/50 shot");
		} else {
			System.out.println("Better luck next time");
		}
	}
}
