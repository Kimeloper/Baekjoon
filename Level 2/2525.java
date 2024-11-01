
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();

        M += T;

        while(M > 59){
            H++;
            M -= 60;

            if(H > 23){
                H -= 24;
            }
        }
        System.out.println(H + " " + M);
        sc.close();
    }
}
