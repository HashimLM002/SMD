public class AllRounder implements AllRounderInteface{

    private BatsmanInterface NewBat;
    private BowlerInterface NewBowl;

    AllRounder(BatsmanInterface Batsman,BowlerInterface Bowler){
        this.NewBat=Batsman;
        this.NewBowl=Bowler;
    }
    public String getName(){
        return this.NewBat.getName();
    }
    public String getNationality(){
        return this.NewBat.getNationality();
    }

    public int getAge(){
        return this.NewBat.getAge();
    }
    public int getWickets()
    {
        return this.NewBowl.getWickets();
    }
    public int getRanking()
    {
        return this.NewBat.getRanking();
    }
    public int getScore()
    {
        return this.NewBat.getScore();
    }
    public void print(){
        System.out.println("I am an AllRounder with Score of : "+this.NewBat.getScore()+ "and wickets : "+this.NewBowl.getWickets()+ "And ranking of "+NewBat.getRanking()+ "And " +
                "Name : "  +this.NewBat.getName()+" Age: " +this.NewBat.getAge()+ "  and Nationality is :  " +this.NewBat.getNationality());
    }
}
