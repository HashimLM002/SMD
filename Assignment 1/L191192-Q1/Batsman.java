public class Batsman implements BatsmanInterface{
    private int Score;
    private int Ranking;
    private String Name;
    private String National;
    private int age;
   public int getScore(){
       return this.Score;
   }
   public int getRanking(){
       return this.Ranking;
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
   public void setScore(int score){
        this.Score = score;
   }
   public void setRanknig(int ranking){
        this.Ranking = ranking;
   }
   public void print() {
       System.out.println(this.Name + " is a Batsman with Score : " + this.Score + " And ranking:" + this.Ranking + "and  Nationality and " +
               "Age as followed :" + this.National + " and " + this.age);
   }
   }
