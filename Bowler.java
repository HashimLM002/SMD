public class Bowler implements BowlerInterface{

    private int Wickets;
    private int ranking;
    private String Name;
    private String National;
    private int age;
   public int getRanking(){
       return this.ranking;
    }
    public int getWickets(){
       return this.Wickets;
    }
    public String getName(){
       return this.Name;
    }
    public String getNationality(){
       return this.National;
    }

    public int getAge(){
       return this.age;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setNationality(String National){
        this.National = National;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWickets(int wickets){
       this.Wickets = wickets;
    }
    public void setRanking(int ranking){
       this.ranking = ranking;
    }
    public void print() {
        System.out.println(this.Name + " is a Bowler with Wickets : " + this.Wickets + " And ranking:" + this.ranking + "and  Nationality and " +
                "Age as followed :" + this.National + " and " + this.age);
    }
}
