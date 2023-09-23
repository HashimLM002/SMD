public abstract class Person {
protected int adharCard;
protected String name;

protected String address;

protected int phoneNo;

protected String Profession;

Person(int adhar,String name,String address,int phoneNo,String Profession){
        this.adharCard=adhar;
        this.name=name;
        this.address=address;
        this.phoneNo=phoneNo;
        this.Profession=Profession;
    }
public String Register(int UID){
    return "Registration Successful for "+this.name+" with ID : "+UID+" And Adhaar Card ID: "+this.adharCard;
}
public String Perform(String duty){
    return this.name+" Performs this Duty : "+duty;
}
public String Include(String Service){
    return this.name+" give these type of services : "+Service;
}

public String Like(String Item){
    return this.name+" Likes : "+Item;
}
}
