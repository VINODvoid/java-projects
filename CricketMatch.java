import java.util.*;
public class CricketMatch {
    public static void main(String[] args) {
        int[] teamA = new int[11];
        int[] teamB = new int[11];
        int totalscoreofA = 0, totalscoreofB = 0, maxRun = 0;
        int matchWinner = 0; 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the scores for Team A");
        for(int i=0;i<11;i++)
        {
            teamA[i]=s.nextInt();
        }
        for(int i=0; i<11; i++){
            totalscoreofA += teamA[i];
            if(teamA[i] > maxRun) {
                maxRun = teamA[i];
                matchWinner = 1;
               
            }
        }
        System.out.println("Enter the scores for Team B");
        for(int i=0;i<11;i++)
        {
            teamB[i]=s.nextInt();
        }
        for(int i=0; i<11; i++){
            totalscoreofB += teamB[i];
            if(teamB[i] > maxRun) {
                maxRun = teamB[i];
                matchWinner = 2; 
            }
        }
        String winner = (totalscoreofA > totalscoreofB ? "A" : "B");
        String winning_team = (matchWinner==1?"A":"B");

        System.out.println("Team A total: " + totalscoreofA + ", Team B total: " + totalscoreofB);
        System.out.println("Winning team: Team " + winner);
        System.out.println("Man of the match is from Team " + winning_team + " with runs: " + maxRun );
        s.close();
    }
}
