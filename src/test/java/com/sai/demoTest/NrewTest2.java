package com.sai.demoTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class NrewTest2 {
	@Test(enabled=false)
	public void test1() {
		System.out.println("new test2---- test1");
	}
	@Test
	public void test2() {
		System.out.println("new test2---- test2");
	}
	@Ignore
	@Test
	public void test3() {
		System.out.println("new test2---- test3");
	}
	@Test
	public void test4() {
		System.out.println("new test2---- test4");
	}


}
