//Assignment 6.2
//Write a program to generate a user-defined exception called NegativeAgeException
//if the user inputs negative value for age.


//An exception is a problem that arises during the execution of a program.  An exception can occur 
//for many different reasons, including the following:
//* A user has entered invalid data.
//* A file that needs to be opened cannot be found.
//* A network connection has been lost in the middle of communications, or the JVM has run out of memory.
//Some of these exceptions are caused by end user error, others by programmer error, and others by 
//physical resources that have failed in some manner.Though Java provides an extensive set of in-built 
//exceptions, there are cases in which we may need to define our own exceptions in order to handle the 
//various application specific errors that we might encounter.
//In Java,Exceptions have been Categorized in two ways:
//1. Java’s Built-In Exceptions
//2. Custom Exceptions also called as User-Defined Exception
//All Checked and Unchecked Exceptions are Java’s Built-In Exceptions.

//Developer can able to create their Own Exception Class by :
//1.Extending the Exception class.
//2.And the toString() method should be overridden in the user defined exception class in order to  
//display meaningful information about the exception.
//3.If want to write a checked exception that is automatically enforced by the Handle or Declare Rule,
//you need to extend the Exception class.
//4.If want to write a runtime exception, you need to extend the RuntimeException class.


package assignment_6_2;
import java.util.*;

public class NegativeAgeException
{
    public static void main(String[] args)
    {
          @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new Exception();    //throws an Exception if age is negative
              }
          }
          catch(Exception ex)
          {
              System.out.println(ex);     //Prints exception description
          }
    }
}




