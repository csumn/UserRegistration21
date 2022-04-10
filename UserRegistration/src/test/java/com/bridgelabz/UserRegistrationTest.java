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
			boolean result = userRegistration.validateFirstName.validate("Suman");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserFirstName_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateFirstName.validate("suman");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserFirstName_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateFirstName.validate(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserLastName_whenValid_ShouldReturnSucess(){
		try {
			boolean result = userRegistration.validateLastName.validate("Chandragiri");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserLastName_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateLastName.validate("chandragiri");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserLastName_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateLastName.validate(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserEmailID_whenValid_ShouldReturnSucess(){
		try {
			boolean result = userRegistration.validateEmailID.validate("csumn132@gmail.com");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserEmailID_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateEmailID.validate("13@gmail");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserEmailID_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateEmailID.validate(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserMobileNumber_whenValid_ShouldReturnSucess(){
		try {
			boolean result = userRegistration.validateMobileNumber.validate("91 9999999999");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserMobileNumber_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateMobileNumber.validate("181881");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserMobileNumber_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validateMobileNumber.validate(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserPassword_whenValid_ShouldReturnSucess(){
		try {
			boolean result = userRegistration.validatePassword.validate("Healup13@");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserPassword_whenInValid_ShouldReturnException(){
		try {
			boolean result = userRegistration.validatePassword.validate("transition");
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}

	@Test
	public void testUserPassword_whenNull_ShouldReturnException(){
		try {
			boolean result = userRegistration.validatePassword.validate(null);
			Assert.assertTrue(result);
		}catch (InvalidUserException e){
			System.out.println(e);
		}
	}
}
