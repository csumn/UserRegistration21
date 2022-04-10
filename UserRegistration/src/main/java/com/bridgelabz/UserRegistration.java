package com.bridgelabz;

public class UserRegistration{

	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";;
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL_ID_PATTERN =  "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	private static final String MOBILE_NUMBER_PATTERN =  "^([0-9]{2}\\s)?[6789]{1}[0-9]{9}";
	private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";

	UserRegistrationInterface validateFirstName = firstName->{
		boolean result = firstName.matches(FIRST_NAME_PATTERN);
		if (result){
			return result;
		} else{
			throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
		}
	};

	UserRegistrationInterface validateLastName = lastName->{
		boolean result = lastName.matches(LAST_NAME_PATTERN);
		if (result){
			return result;
		} else{
			throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
		}
	};

	UserRegistrationInterface validateEmailID = emailId->{
		boolean result = emailId.matches(EMAIL_ID_PATTERN);
		if (result){
			return result;
		} else{
			throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
		}
	};

	UserRegistrationInterface validateMobileNumber = mobileNumber->{
		boolean result = mobileNumber.matches(MOBILE_NUMBER_PATTERN);
		if (result){
			return result;
		} else{
			throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
		}
	};

	UserRegistrationInterface validatePassword = password->{
		boolean result = password.matches(PASSWORD_PATTERN);
		if (result){
			return result;
		} else{
			throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
		}
	};
}


