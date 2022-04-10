package com.bridgelabz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {

	static UserRegistration userRegistration = new UserRegistration();

	@BeforeClass
	public  static void setUp() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void testUserFirstName_whenValid_ShouldReturnSuccess(){
		try {
			boolean result = userRegistration.validateFirstName("Suman");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserFirstName_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateFirstName("suman");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserFirstName_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateFirstName(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserLastName_whenValid_ShouldReturnSucess(){
		try {
			boolean result = userRegistration.validateLastName("Chandragiri");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserLastName_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateLastName("chandragiri");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserLastName_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateLastName(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserEmailID_whenValid_ShouldReturnSucess(){
		try {
			boolean result = userRegistration.validateEmailID("csumn132@gmail.com");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserEmailID_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateEmailID("13@gmail");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserEmailID_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateEmailID(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserMobileNumber_whenValid_ShouldReturnSucess(){
		try {
			boolean result = userRegistration.validateMobileNumber("91 9999999999");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserMobileNumber_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateMobileNumber("181881");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserMobileNumber_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateEmailID(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserPassword_whenValid_ShouldReturnSucess(){
		try {
			boolean result = userRegistration.validatePassword("Healup13@");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserPassword_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validatePassword("transition");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserPassword_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validatePassword(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}
}
