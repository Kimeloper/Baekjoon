import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        //10의 12승은 int의 범위를 넘기때문에 long을 사용했다.

        System.out.println(A + B + C);

        sc.close();

    }
}
