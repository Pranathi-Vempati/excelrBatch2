import java.util.Scanner;
class Bowler {
    Scanner obj = new Scanner(System.in);
    String name;
    int matches,wickets,balls_bowled,runs_conceded;
    public Bowler(){
        System.out.println("Enter the bowler Name: ");
        name = obj.next();
        System.out.println("Enter no.of wickets: ");
        wickets=obj.nextInt();
        System.out.println("Enter no.of matches played : ");
        matches=obj.nextInt();
        System.out.println("Enter no.of balls_bowled: ");
        balls_bowled=obj.nextInt();
        System.out.println("no.of runs_conceded : ");
        runs_conceded=obj.nextInt();   
    }
    public Bowler(String name, int wickets,int matches,int balls_bowled,int runs_conceded){
        this.name=name;
        this.wickets=wickets;
        this.matches=matches;
        this.balls_bowled=balls_bowled;
        this.runs_conceded=runs_conceded;
    }
    void computeBowlingAverage(){
        if(matches<=0){
            System.out.println("Error: no.of matches cannot be negative.");
        }else{
        float average = (float) runs_conceded / wickets;
        System.out.println("Name: "+name);
        System.out.println("Bowling Average: "+average);
        }
    }
    void showStatistics(){
        System.out.println("Name: "+name);
        System.out.println("Wickets: "+wickets);
        System.out.println("Matches: "+matches);
        System.out.println("Balls_bowled: "+balls_bowled);
        System.out.println("Runs Conceded: "+runs_conceded);
    }
    void computeStrikeRate(){
        System.out.println("Name: "+name);
        double strikeRate = (double) runs_conceded / balls_bowled;
        System.out.println("Striking rate : "+strikeRate);
    }
}
    public class PS03{
    public static void main(String[] args) {
        Bowler ps = new Bowler();
        ps.computeBowlingAverage();
        ps.showStatistics();
        ps.computeStrikeRate();
    }
}