package com.leo;

import junit.framework.Assert;

import org.junit.Test;

public class TestService {

	@Test
	public void test() {
		Service service = new Service();
		
		int a = service.sum(2, 3);
		
		Assert.assertEquals(a, 5);
	}
	@Test
	public void test2() {
		Service service = new Service();
		
		int a = service.sum(2, -2);
		
		Assert.assertEquals(a, 0);
	}
}
