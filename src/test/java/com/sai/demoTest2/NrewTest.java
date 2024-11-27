package com.sai.demoTest2;

import org.testng.annotations.Test;

public class NrewTest {
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("test1  - sanity");
	}
	@Test(groups = {"sanity","functionl"})
	public void test2() {
		System.out.println("test2 ---sanity,functional");
	}
	@Test(groups = {"regression","sanity","smoke"})
	public void test3() {
		System.out.println("test3 -- regression,sanity,smoke");
	}
	@Test
	public void test4() {
		System.out.println("test4");
	}


}
