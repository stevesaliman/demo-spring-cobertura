package com.demo;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: steve
 * Date: 6/22/19
 * Time: 9:04 AM
 * To change this template use File | Settings | File Templates.
 *
 * @author Steven C. Saliman
 */
public class WorkerImplTest {
	@Test
	public void testSomething() {
		Worker worker = new WorkerImpl();
		worker.doWork();
	}
}
