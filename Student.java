/********************************************************************************************************************
* Student.java
* Author: Downrightmike
* CIS 131
* 
* 
********************************************************************************************************************/
import java.util.List; //.ArrayList;
import java.util.ArrayList;

public class Student{
    private Integer studentID;
    private int grade; // GPA range from 0 to 4
   
public Student(){
//Student's default constructor will intialize the variables with 0 for numbers and "" for strings
    this.studentID = 0;
    this.grade = 0; 
}//end of Student default constructor
public Student(Integer newStudentID, int newGrade){
//Student's loaded constructor
    this.studentID = newStudentID ;
    this.grade = newGrade; 
}//end of Student loaded constructor

//////////////////////Define Setter mutator methods//////////////
public void addStudent(Integer newStudentID){
    this.studentID = newStudentID;
}
public void setGrade(int newGrade){
    this.grade = newGrade;
}

//////////////////////// Define "getter" accessor methods.///////
public Integer getStudentID(){
    return this.studentID;
}
public int getGrade(){
    return this.grade;
}

////////////////////////////toString Override////////////////////
    public String toString(){
        StringBuffer strBuf = new StringBuffer("Student Data: \n");
        
        strBuf.append("***********************************\n");
        strBuf.append("Student ID :          ");
        strBuf.append(this.studentID) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Grade :               ");
        strBuf.append(this.grade) ;
        strBuf.append( "\n\n") ;    

        return strBuf.toString() ;
    }
}//end of student class  
