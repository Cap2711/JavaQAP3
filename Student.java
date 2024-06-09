class Student extends Person {
    
    protected String myIdNum;  
    protected double myGPA;    

    public Student(String name, int age, String gender, String idNum, double gpa) {
        
        super(name, age, gender);
        
        myIdNum = idNum;
        myGPA = gpa;
    }

    //getters
    public String getIdNum(){
        return myIdNum;
    }

    public double getGPA(){
        return myGPA;
    }

    //setters
    public void setIdNum(String idNum){
        myIdNum = idNum;
    }

    public void setGPA(double gpa){
        myGPA = gpa;
    }
}
