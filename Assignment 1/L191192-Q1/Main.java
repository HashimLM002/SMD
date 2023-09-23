import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        while (number != 0) {
            System.out.println("Please enter 1 for crikceter , 2 for bowler, 3 for allrounder");
            number = sc.nextInt();
            if (number == 1) {
                int batscore;
                int batranking;
                String Name;
                String Nat;
                int Age;
                System.out.println("Enter score for batsman");
                batscore = sc.nextInt();
                System.out.println("Enter ranking for batsamn");
                batranking = sc.nextInt();
                System.out.println("Enter name of batsamn:");
                Name = sc.next();
                System.out.println("Enter nationality of batsamn:");
                Nat = sc.next();
                System.out.println("Enter age of batsman:");
                Age = sc.nextInt();
                Batsman NewBats = new Batsman();
                NewBats.setScore(batscore);
                NewBats.setRanknig(batranking);
                NewBats.setAge(Age);
                NewBats.setName(Name);
                NewBats.setNationality(Nat);
                NewBats.getRanking();
                NewBats.getScore();
                NewBats.getNationality();
                NewBats.getAge();
                NewBats.getName();
                NewBats.print();
            }
            if (number == 2) {
                int bowlwicket;
                int bowlranking;
                String Name;
                String Nat;
                int Age;
                System.out.println("Enter wickets for bowler");
                bowlwicket = sc.nextInt();
                System.out.println("Enter ranking for bowler");
                bowlranking = sc.nextInt();
                System.out.println("Enter name of bowler:");
                Name = sc.next();
                System.out.println("Enter nationality of bowler:");
                Nat = sc.next();
                System.out.println("Enter age of bowler:");
                Age = sc.nextInt();
                Bowler NewBowl = new Bowler();
                NewBowl.setAge(Age);
                NewBowl.setName(Name);
                NewBowl.setNationality(Nat);
                NewBowl.setWickets(bowlwicket);
                NewBowl.setRanking(bowlranking);
                NewBowl.getRanking();
                NewBowl.getWickets();
                NewBowl.getNationality();
                NewBowl.getAge();
                NewBowl.getName();
                NewBowl.print();
            }
            if(number == 3) {
                int ranking;
                int batscore;
                int bowlwicket;
                String Name;
                String Nat;
                int Age;
                System.out.println("Enter wickets :");
                bowlwicket = sc.nextInt();
                System.out.println("Enter score :");
                batscore = sc.nextInt();
                System.out.println("Enter ranking :");
                ranking = sc.nextInt();
                System.out.println("Enter name of allrounder:");
                Name = sc.next();
                System.out.println("Enter nationality of allrounder:");
                Nat = sc.next();
                System.out.println("Enter age of allrounder:");
                Age = sc.nextInt();

                Bowler NewBowl = new Bowler();
                NewBowl.setWickets(bowlwicket);
                NewBowl.setRanking(ranking);
                NewBowl.setAge(Age);
                NewBowl.setName(Name);
                NewBowl.setNationality(Nat);
                Batsman NewBats = new Batsman();
                NewBats.setScore(batscore);
                NewBats.setRanknig(ranking);
                NewBats.setAge(Age);
                NewBats.setName(Name);
                NewBats.setNationality(Nat);
                AllRounder NewAll = new AllRounder(NewBats, NewBowl);
                NewAll.print();
            }
        }
    }
}