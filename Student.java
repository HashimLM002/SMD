public class Student extends Person{
    protected String studentId;
    protected String major;
    protected int year;
    protected int semester;
    protected String college;
    protected int grade;

    Student(String studentId,String major,int year,int semester,String College,int grade,
    int Adhar, String name, String address, int Phone, String Profession){
        super(Adhar,name,address,Phone,Profession);
      this.studentId=studentId;
      this.major=major;
      this.year=year;
      this.semester=semester;
      this.college=College;
      this.grade=grade;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }

    public String Attend(String classy){
        return "Student ("+this.name+") attends class of "+classy;
    }

    public String Learn(){
        return "The Student with ("+this.name+") is learning ";
    }
}
