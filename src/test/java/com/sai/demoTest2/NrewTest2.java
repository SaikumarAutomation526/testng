package com.sai.demoTest2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NrewTest2 {
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("new test2---- test1 -- smoke");
	}
	@Test(groups= {"smoke","functional"})
	public void test2() {
		System.out.println("new test2---- test2  --smoke,functional");
	}

	@Test(groups= {"fuctional"})
	public void test3() {
		System.out.println("new test2---- test3 -- functional");
	}
	@Test(groups= {"regression"})
	public void test4() {
		System.out.println("new test2---- test4 --- regression");
	}


}
