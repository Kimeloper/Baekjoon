import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(score>=90){//100~90
            System.out.println("A");
        }else if(score>=80){//89~80
            System.out.println("B");
        }else if(score>=70){//79~70
            System.out.println("C");
        }else if(score>=60){//69~60
            System.out.println("D");
        }else{//59~0
            System.out.println("F");
        }

        sc.close();
    }
}
