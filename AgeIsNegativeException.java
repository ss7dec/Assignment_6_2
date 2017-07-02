//Assignment 6.2
//Write a program to generate a user-defined exception called NegativeAgeException
//if the user inputs negative value for age.


package assignment_6_2;

//Defining Our own Exception by extending Exception class

class AgeIsNegativeException extends Exception
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String errorMessage;

  public AgeIsNegativeException(String errorMessage)
  {
      this.errorMessage = errorMessage;
    
      
  }
  
  //Modifying toString() method to display customized error message

  @Override
  public String toString()
  {
      return errorMessage;
  }
}

//Above defined exception is called User-Defined Exception or Customized Exception. 
//Now throw this customized exception when user enters Negative value.
//You can create own customized exception as per requirements of the application. 
//We know that for each application there are specific constraints. 
//Error-handling become necessary while developing a constraint application.
//The Exception class and its subclass in java is not able to meet up the required 
//constraint in application. For this, you create your own customized Exception to over 
//address these constraints and ensure the integrity in the application