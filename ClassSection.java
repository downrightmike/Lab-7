/********************************************************************************************************************
* ClassSection.java
* Author: Downrightmike
* CIS 131
* 
* 
********************************************************************************************************************/
        
public class ClassSection{
    private Integer CRN;
    private Integer courseNumber;
    private Integer capacity;
    private Integer enrollment;
    private Integer instructorID;
    private String mode;
    private String campus;
    private String departmentCode;
    private String meetingDays;
    private String meetingTimes;
    //add an ArrayList of student enrollees to the class section class.
    private List<Student> studentList = new ArrayList<Student>();
    //Add Student object
    private Student studentobj;

    public ClassSection(){ 
        //System.out.println("\nIn ClassSection() default constructor"); // Just to show we're here.
    this.CRN = 0;
    this.courseNumber = 0;
    this.capacity = 0;
    this.enrollment = 0;
    this.instructorID = 0;
    this.mode = "";
    this.campus = "";
    this.departmentCode = "";
    this.meetingDays = "";
    this.meetingTimes = "";
    //Add student object
    studentObj = new Student();
    }

    //create an instance of a ClassSection class that accepts hard coded values for all parameters.
    public ClassSection(Integer newCRN, Integer newCourseNumber, Integer newCapacity, Integer newEnrollment, Integer newInstructorID, String newMode, String newCampus, String newDepartmentCode, String newMeetingDays, String newMeetingTimes, Integer studentID, int grade){ 
        //System.out.println("\nIn ClassSection() all params constructor"); // Just to show we're here.
        this.CRN = newCRN;
        this.courseNumber = newCourseNumber;
        this.capacity = newCapacity;
        this.enrollment = newEnrollment;
        this.instructorID = newInstructorID;
        this.mode = newMode;
        this.campus = newCampus;
        this.departmentCode = newDepartmentCode;
        this.meetingDays = newMeetingDays;
        this.meetingTimes = newMeetingTimes;
        studentObj = new Student(studentID, grade);
    }
        // Define "setter" a.k.a. mutator methods.
   public void  setCRN( Integer newCRN ){
    this.CRN = newCRN ; //return this.CRN; 
}
   public void setCourseNumber( Integer newCourseNumber ){
    this.courseNumber = newCourseNumber ; //return this.courseNumber; 
}
   public void setCapacity( Integer newCapacity ){
    this.capacity = newCapacity ;// return this.capacity; 
 }
   public void setEnrollment( Integer newEnrollment ){
    this.enrollment = newEnrollment ;  //return this.enrollment; 
}
   public void setInstructorID( Integer newInstructorID ){
    this.instructorID = newInstructorID ; //return this.instructorID;
  }
   public void setMode(String newMode ){
    String[] modes = new String[3];
     modes[0] = "online";
     modes[1] = "hybrid";
     modes[2] = "classroom";
    this.mode = "N/A"; //Setting a default

    for(int i = 0; i < modes.length; i++){
        if(newMode.equals(modes[i])){this.mode = newMode ; }
         
        else {
        this.mode = modes[i];
        }
    }
}

   public void setCampus(String newCampus ){
       //v2 #5 Campus, like East or West
      /*Campuses from Pima.edu 
        "Community",
        "Desert Vista",
        "Downtown",
        "East",
        "Northwest",
        "West" */
    String[] campuses = new String[6];
        campuses[0] = "Community";
        campuses[1] = "Desert Vista";
        campuses[2] = "Downtown";
        campuses[3] = "East";
        campuses[4] = "Northwest";
        campuses[5] = "West";

        this.campus = "N/A"; //Setting a default

      for(int i = 0; i < campuses.length; i++){
        if(newCampus.equals(campuses[i])){this.campus = newCampus ; }
        else {
        this.campus = campuses[i];
        }
     }
    }


   public void setDepartmentCode(String newDepartmentCode ){
    this.departmentCode =  newDepartmentCode;  //return this.departmentCode;
}

   public void setMeetingDays(String newMeetingDays ){
       //v2 #6 Meeting days (NAfor online classes, 1234567 for Monday through Sunday. 
       //TTh would be 24)
      //set meeting days to that string
      StringBuffer strBuf = new StringBuffer("");
       // Check for online, set to default NA
       if(this.mode.equals("online")){this.meetingDays = "N/A"; //return this.meetingDays ;
    }else{

        //get each location (to array?)
        char[] charArray = new char[newMeetingDays.length()];
        for(int i = 0; i < newMeetingDays.length(); i++){
            charArray[i] = newMeetingDays.charAt(i);
            //System.out.println(charArray[i]);
        
        //append each day to a string
        switch (charArray[i]) {
             case '1': strBuf.append("Monday"); strBuf.append(", ");  break;
             case '2': strBuf.append("Tuesday"); strBuf.append(", ");  break;
             case '3': strBuf.append("Wednesday"); strBuf.append(", ");  break;
             case '4': strBuf.append("Thursday"); strBuf.append(", ");  break;
             case '5': strBuf.append("Friday"); strBuf.append(", ");  break;
             case '6': strBuf.append("Saturday"); strBuf.append(", ");  break;
             case '7': strBuf.append("Sunday"); strBuf.append(", ");  break;
             default: strBuf.append("N/A  "); break;
            }  
         } //end of for
        }
         int strBufLength = strBuf.length();

         strBuf.delete(strBufLength-2, strBufLength); //trim the last append off by 2
         this.meetingDays = strBuf.toString();
         //return this.meetingDays;
        }

   public void setMeetingTimes(String newMeetingTimes ){
       //v2 #7 Meeting times (NA, or free form such as: 12 noon to 2pm)
       if(this.mode.equals("online") || this.mode.equals("")){//check online classes also
           this.meetingTimes = "N/A"; //return this.meetingTimes ;
        }
           else{this.meetingTimes = newMeetingTimes ;  //return this.meetingTimes;
        }
       }
///////End of Class Setters///////////

///////Start of Student Setters///////
    //A method, let’s call it addStudent, to add an individual student to the enrollee list
    //create a public addStudent method of the ClassSection class which will pass the Student 
    //object to the add method of the ArrayList class.
    public void addStudent(Student student){
        this.studentObj.addStudent(studentID);
        }//end of addStudent
    // A method to withdraw a student
    public int dropStudent(Integer studentID){
    for(int i = 0; i < Student.size(); i++){
        if(Student.get(i) == this.studentID){
         this.studentObj.dropStudent(studentID);
        return 1;
        } else {return -1;}//-1 indicates the search failed to find studentID
    }
    }//end of dropStudent
    //A method to assign a grade to a student
    public void gradeStudent(Integer studentID, int grade){
        for(int i = 0; i < Student.size(); i++){
            if(Student.get(i) == this.studentID){
            this.studentObj.getGrade = grade;
            } else {}//else do nothing
        }
    }//end of dropStudent

///////End of Student Setters/////////

/////////////////////////////////////////////////////////////////////////////////////////////////
    // Define "getter" a.k.a. accessor methods.
    public Integer getCRN(){
        return this.CRN ;  }
       public Integer getCourseNumber(){
        return this.courseNumber ;  }
       public Integer getCapacity(){
        return this.capacity ;  }
        //Change the getEnrollment method of the class section class to return the number of enrollees in the ArrayList by invoking its size method.
       public Integer getEnrollment(){
        return Student.size();  }
       public Integer getInstructorID(){
        return this.instructorID ;  }
       public String getMode(){
        return this.mode ;  }
       public String getCampus(){
        return this.campus ;  }
       public String getDepartmentCode(){
        return this.departmentCode;  }
       public String getMeetingDays(){
        return this.meetingDays;  }
       public String getMeetingTimes(){
        return this. meetingTimes ;  }
///////End of Class Getters///////////

///////Start of Student Getters///////
//A method to locate the ArrayList element which holds (actually points to) the 
//enrollee object that has a particular student ID
    public Integer getStudent(Integer studentID){
        for(int i = 0; i < Student.size(); i++){
            if(Student.get(i) == this.studentID){
                return this.studentObj.getStudent(studentID);//Does he want the index number and no t the ID?
            } else {return -1;}//-1 indicates the search failed to find studentID
    return this.studentID ;  }

   // A method to display a list of enrollees
   public void displayStudentList(){
    return this.studentID ;  }
///////End of Student Getters/////////

///////toString Override//////////////
    public String toString(){
        StringBuffer strBuf = new StringBuffer("Class Section Data: \n");
        
        strBuf.append("***********************************\n");
        strBuf.append("CRN :                 ");
        strBuf.append(this.CRN) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Department :          ");
        strBuf.append(this.departmentCode) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Course Number :       ");
        strBuf.append(this.courseNumber) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Instructional Mode :  ");
        strBuf.append(this.mode) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Campus :              ");
        strBuf.append(this.campus) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Meeting Days :        ");
        strBuf.append(this.meetingDays) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Meeting Times :       ");
        strBuf.append(this.meetingTimes) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Capacity :            ");
        strBuf.append(this.capacity) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Enrollment :          ");
        strBuf.append(this.enrollment) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Instructor's ID :     ");
        strBuf.append(this.instructorID) ;
        strBuf.append( "\n") ;    
        strBuf.append( "***********************************") ;    
        
        return strBuf.toString() ;
     }
    
}