package com.sai.test;
import org.testng.annotations.Test;

public class FlightBookingTest {
	@Test(priority = 1)
	public void signup() {
		System.out.println("sign up");
	}
	@Test(priority = 2)
    public void login() {
		System.out.println("login");
    }
	@Test(priority = 3)
    public void  searchfortheflight() {
		System.out.println("search for flight");
    }
	@Test(priority = 4)
    public void booktheflight() {
		System.out.println("book the flight");
    }
	@Test(priority = 5)
    public void saveTheTicket() {
		System.out.println("save the ticket");
    }
	@Test(priority = 6)
    public void logOut() {
		System.out.println("logout");
    	
    }
}
