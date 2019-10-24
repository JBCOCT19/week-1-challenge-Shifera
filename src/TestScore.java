import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner keybd = new Scanner(System.in);
        int score;
        System.out.println("Enter a score or -1 to stop");
        score = keybd.nextInt();

        do {
            if (score == -1) {
                break;
            }
            if ((score < 0)) || (score > 110)) {
                System.out.println("unknown score");
            }
            if (score >= 60) {
                System.out.println("you passed");

            }

            else if {

                System.out.println("you faild");
            }

            else {
            System.out.println("Enter a score or -1 to stop.");
            score = keybd.nextInt();

        } while(score>==0);

    }
}
