/********************************************************
 *
 *  Project :  Regular Expressions
 *  File    :  Validator.java
 *  Name    :  Frederick Javalera
 *  Date    :  3-20-2017 (due date: 3-22-2017)
 *
 *  Description : (Narrative description, not code)
 *
 *    1) What is the purpose of the code; what problem does the code solve.
 *    This code checks whether an input is valid or not.
 *
 *    2) What data-structures are used.
 *    Regex values.
 *
 *    3) What algorithms, techniques, etc. are used in implementing the data structures.
 *	  Regex validation.
 *
 *    4) What methods are implemented (optional).
 *
 *  Changes :  <Description|date of modifications>
 *
 ********************************************************/
package m4_a5;

//Test
public class Validator
{
	/****************************************************
	 * Method : ValidateFirstName
	 *
	 * Purpose : The ValidateFirstName method checks firstName in order to
	 * ensure that it is a valid input in accordance with the regex parameters
	 * specified.
	 *
	 * Parameters : firstName - the first name to be validated
	 *
	 * Returns : This method returns a true or false boolean value.
	 *
	 ****************************************************/
	public static boolean validateFirstName(String firstName)
	{
		return firstName.matches("[A-Z][a-zA-Z]*");
	}

	/****************************************************
	 * Method : ValidateLastName
	 *
	 * Purpose : The ValidateLastName method checks lastName in order to ensure
	 * that it is a valid input in accordance with the regex parameters
	 * specified.
	 *
	 * Parameters : lastName - the last name to be validated
	 *
	 * Returns : This method returns a true or false boolean value.
	 *
	 ****************************************************/
	public static boolean validateLastName(String lastName)
	{
		return lastName.matches("[a-zA-Z ]+([ '-][a-zA-Z]+)*");
	}

	/****************************************************
	 * Method : ValidateAddress
	 *
	 * Purpose : The ValidateAddress method checks address in order to ensure
	 * that it is a valid input in accordance with the regex parameters
	 * specified.
	 *
	 * Parameters : address - the address to be validated.
	 *
	 * Returns : This method returns a true or false boolean value.
	 *
	 ****************************************************/
	public static boolean validateAddress(String address)
	{
		return address.matches(".*");
	}

	/****************************************************
	 * Method : ValidateCity
	 *
	 * Purpose : The ValidateCity method checks city in order to ensure that it
	 * is a valid input in accordance with the regex parameters specified.
	 *
	 * Parameters : city - the city to be validated.
	 *
	 * Returns : This method returns a true or false boolean value.
	 *
	 ****************************************************/
	public static boolean validateCity(String city)
	{
		return city.matches("[A-Z][a-zA-Z]*");
	}

	/****************************************************
	 * Method : ValidateZip
	 *
	 * Purpose : The ValidateZip method checks zip in order to ensure that it is
	 * a valid input in accordance with the regex parameters specified.
	 *
	 * Parameters : zip - the zip to be validated.
	 *
	 * Returns : This method returns a true or false boolean value.
	 *
	 ****************************************************/
	public static boolean validateZip(String zip)
	{
		return zip.matches("[0-9]{5}(-[0-9]{4})*");
	}

	/****************************************************
	 * Method : ValidatePhone
	 *
	 * Purpose : The ValidatePhone method checks phone in order to ensure that
	 * it is a valid input in accordance with the regex parameters specified.
	 *
	 * Parameters : phone - the phone to be validated.
	 *
	 * Returns : This method returns a true or false boolean value.
	 *
	 ****************************************************/
	public static boolean validatePhone(String phone)
	{
		return phone.matches("[ -(]*\\d{3}[ -).]*[ -.]*\\d{3}[ -.]*\\d{4}");
	}

	/****************************************************
	 * Method : ValidateEmail
	 *
	 * Purpose : The ValidateEmail method checks email in order to ensure that
	 * it is a valid input in accordance with the regex parameters specified.
	 *
	 * Parameters : email - the email to be validated.
	 *
	 * Returns : This method returns a true or false boolean value.
	 *
	 ****************************************************/
	public static boolean validateEmail(String email)
	{
		return email.matches(".*[.]*.\\@.*\\.[A-Za-z]{3}");
	}
}
