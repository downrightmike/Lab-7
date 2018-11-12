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
        //ClassSection class1 = new ClassSection();

        //2) Then it will use the object’s setter methods to assign values to its attributes
             /*  class1.setCRN( 20001 );  
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
        */
        //4) Next, it will create a second instance of a class section object using the constructor that accepts values for all of its attributes.
        //ClassSection class2 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "24", "12:00p - 2:50p" );
        //ClassSection class2 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "1245", "12:00p - 2:50p" );
        //ClassSection class2 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "1234567", "12:00p - 2:50p" );
       // ClassSection class2 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "3456712", "12:00p - 2:50p" );
       
       
       //New Student class added
        ClassSection class3 = new ClassSection(20009, 182, 31, 31, 664, "hybrid", "East", "CIS", "3456712", "12:00p - 2:50p");
        //V2_1 Display the results of the ClassSection object’s toString method, just as you did in the previous project.
        class3.toString();
       
        /*V2_2 Next add several students to the enrollee ArrayList using the method that accepts one student. Give them sequential 
        IDs (such as A001 to A004), and grades of 0 because the semester just started and they haven’t earned any grades yet.
        */
        Student A001 = new Student();
        Student A002 = new Student();
        Student A003 = new Student();
        Student A004 = new Student();
        A001.addStudent(001);
        A001.setGrade(0);
        A002.addStudent(002);
        A002.setGrade(0);
        A003.addStudent(003);
        A003.setGrade(0);
        A004.addStudent(004);
        A004.setGrade(0);

        class3.addStudent(A001);
        class3.addStudent(A002);
        class3.addStudent(A003);
        class3.addStudent(A004);
                
        //V2_3 After adding the students, display the enrollee list.
        class3.displayStudentList();

        //V2_4 Change the grades of the students to 1, 2, 3 and 4.

        A001.setGrade(1);
        A002.setGrade(2);
        A003.setGrade(3);
        A004.setGrade(4);

        //V2_5 Display the enrollee list again.
        class3.displayStudentList();

        //V2_6 Now delete a student then display the enrollee’s again.
        class3.dropStudent(A004);
        class3.displayStudentList();
        

       /* commenting out the V1 objects. 
       //3) After doing this, the driver will use either println or printf to display the String returned by toString.
        System.out.println("\n------- ClassSection Objects -------");
        System.out.println("class1: \n" + class1.toString());
        //5) Again, it will it will use either println or printf to display the String returned by toString.
        System.out.println("class2: \n" + class2.toString());
                */
        
        //New Student class print out
        System.out.println("class3: \n" + class3.toString());
        
        //System.out.println(class3.getEnrollment());
       // class3.displayStudentList();
      
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