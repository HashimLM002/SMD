import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = 1;
        String Specialize;
        String section;
        int Stud;
        String Quali;
        String Tech;
        String Emp_id;
        String Emp_role;
        String Emp_dept;
        Float Salary;
        int Experience;
        String Roll_No;
        String Specialization;
        String studentId;
        String major;
        int year;
        int semester;
        String College;
        int grade;
        int Adharr;
        String name;
        String address;
        int Phone;
        String Profession;
        int count=0;
        System.out.print("Please enter Roll No: ");
        Roll_No = sc.next();
        System.out.print("Please enter Specialization: ");
        Specialization = sc.next();
        System.out.print("Please enter Student ID: ");
        studentId = sc.next();
        System.out.print("Please enter Major: ");
        major = sc.next();
        System.out.print("Please enter Year: ");
        year = sc.nextInt();
        System.out.print("Please enter Semester: ");
        semester = sc.nextInt();
        System.out.print("Please enter College: ");
        College = sc.next();
        System.out.print("Please enter Grade: ");
        grade = sc.nextInt();
        System.out.print("Please enter Adhaar number: ");
        Adharr = sc.nextInt();
        System.out.print("Please enter Name: ");
        name = sc.next();
        System.out.print("Please enter Address: ");
        address = sc.next();
        System.out.print("Please enter Phone: ");
        Phone = sc.nextInt();
        System.out.print("Please enter Profession: ");
        Profession = sc.next();
        PG_Student NewStud = new PG_Student(Roll_No, Specialization, studentId, major, year, semester, College, grade, Adharr, name, address, Phone, Profession);

        System.out.println("Now please enter info about Faculty");
        System.out.print("Please enter Specialization: ");
        Specialization = sc.next();
        System.out.print("Please enter Total number of students: ");
        Stud = sc.nextInt();
        System.out.print("Please enter Qualification: ");
        Quali = sc.next();
        System.out.print("Please enter Section: ");
        section = sc.next();
        System.out.print("Please enter Employee ID: ");
        Emp_id = sc.next();
        System.out.print("Please enter Employee Role: ");
        Emp_role = sc.next();
        System.out.print("Please enter Employee Department: ");
        Emp_dept = sc.next();
        System.out.print("Please enter Employee Salary: ");
        Salary = sc.nextFloat();
        System.out.print("Please enter Employee Experience: ");
        Experience = sc.nextInt();
        System.out.print("Please enter Adhaar number: ");
        Adharr = sc.nextInt();
        System.out.print("Please enter Name: ");
        name = sc.next();
        System.out.print("Please enter Address: ");
        address = sc.next();
        System.out.print("Please enter Phone: ");
        Phone = sc.nextInt();
        System.out.print("Please enter Profession: ");
        Profession = sc.next();
        Fac NewFac = new Fac(Specialization, section, Stud, Quali, Emp_id, Emp_role, Emp_dept, Salary, Experience, Adharr,
                name, address, Phone, Profession);

        System.out.print("Please enter Technician Type: ");
        Tech= sc.next();
        System.out.print("Please enter Employee ID: ");
        Emp_id = sc.next();
        System.out.print("Please enter Employee Role: ");
        Emp_role = sc.next();
        System.out.print("Please enter Employee Department: ");
        Emp_dept = sc.next();
        System.out.print("Please enter Employee Salary: ");
        Salary = sc.nextFloat();
        System.out.print("Please enter Employee Experience: ");
        Experience = sc.nextInt();
        System.out.print("Please enter Adhaar number: ");
        Adharr = sc.nextInt();
        System.out.print("Please enter Name: ");
        name = sc.next();
        System.out.print("Please enter Address: ");
        address = sc.next();
        System.out.print("Please enter Phone: ");
        Phone = sc.nextInt();
        System.out.print("Please enter Profession: ");
        Profession = sc.next();



        while(number!=0){
            System.out.print("Press 1 for PG Student functions, 2 for Faculty functions and 3 for Technician functions. Press 0  to exit");
            number = sc.nextInt();
            if(number == 1) {
                System.out.println(NewStud.Register(123));
                System.out.println(NewStud.Include("Carpenter"));
                NewStud.Submit_Thesis();
                System.out.println(NewStud.Learn());
                System.out.println(NewStud.Like("McLarens"));
                System.out.println(NewStud.Perform("Garden Cleaning"));

            }
            else if (number == 2){
                System.out.println(NewFac.Perform("Law Study"));
                System.out.println(NewFac.Asses(NewStud));

            }
            else if (number == 3) {
                Technician NewTech = new Technician(Tech, Emp_id, Emp_role, Emp_dept, Salary, Experience, Adharr,
                        name, address, Phone, Profession);
                System.out.println(NewTech.Perform("Manager"));
                System.out.println(NewTech.Installs("PC Systems"));
                System.out.println(NewTech.Mantain("Lab 6"));
            }
            }
        }

    }