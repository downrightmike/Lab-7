        /********************************************************************************************************************
        * Lab_6_MB.java
        * Author: Downrightmike
        * CIS 131
        * 
        * 
        ********************************************************************************************************************/
        import java.util.Scanner;

public class Lab_7_Driver_MB {       
        public static void main(String[] args) {           
        // Create a ClassSection object using the default constructor
        //1) create one instance of a class section object using its default constructor.       
        ClassSection class1 = new ClassSection();

        //2) Then it will use the object’s setter methods to assign values to its attributes
               class1.setCRN( 20001 );  
               class1.setCourseNumber( 131 );  
               class1.setCapacity( 30 );  
               class1.setEnrollment( 30 );  
               class1.setInstructorID( 654 );  
               class1.setMode( "online" );  
               class1.setCampus( "East" );  
               class1.setDepartmentCode("CIS");  
               class1.setMeetingDays(  "N/A"); 
               //class1.setMeetingDays(  "24");  // will still be NNA with online mode
               class1.setMeetingTimes( "N/A" ); 
        
        //4) Next, it will create a second instance of a class section object using the constructor that accepts values for all of its attributes.
        //ClassSection class2 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "24", "12:00p - 2:50p" );
        //ClassSection class2 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "1245", "12:00p - 2:50p" );
        //ClassSection class2 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "1234567", "12:00p - 2:50p" );
        ClassSection class2 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "3456712", "12:00p - 2:50p" );
        
 
        //3) After doing this, the driver will use either println or printf to display the String returned by toString.
        System.out.println("\n------- ClassSection Objects -------");
        System.out.println("class1: \n" + class1.toString());
        //5) Again, it will it will use either println or printf to display the String returned by toString.
        System.out.println("class2: \n" + class2.toString());
      
////testing the getters///////////////////////////////////////////////////////////////////
       //System.out.println(class1.getMeetingTimes());
      //System.out.println(class2.getMeetingTimes());
      /*
      System.out.println(class1.getCRN());  
      System.out.println(class1.getCourseNumber(  ));  
      System.out.println(class1.getCapacity(  ));  
      System.out.println(class1.getEnrollment(  ));  
      System.out.println(class1.getInstructorID(  ));  
      System.out.println(class1.getMode(  ));  
      System.out.println(class1.getCampus(  ));  
      System.out.println(class1.getDepartmentCode());  
      System.out.println(class1.getMeetingDays(  ));  
      System.out.println(class1.getMeetingTimes(  )); 
      */


  }
}