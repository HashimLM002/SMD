import java.util.Scanner;

public class Fac extends Staff{
    private String facultySpecialization;
        private String section;
        private int noOfStudents;
        private String qualification;

        Fac(String Specialize, String section, int Stud, String Quali,String Emp_id, String Emp_role,String Emp_dept,Float Salary,int Experience,int Adhar,
            String name, String address, int Phone, String Profession){

            super(Emp_id,Emp_role,Emp_dept,Salary,Experience,Adhar,name
            ,address,Phone,Profession);
            this.facultySpecialization = Specialize;
            this.section = section;
            this.noOfStudents = Stud;
            this.qualification = Quali;

        }

    public String Teach(String Course){
        return this.name+" Teaches the Course "+Course;
    }

    public String Asses(Student IP ){
        Scanner se = new Scanner(System.in);
        System.out.println("Please enter new grade");
        int number  = se.nextInt();
        IP.setGrade(number);
        return "Grade updated successfully";
    }
}
