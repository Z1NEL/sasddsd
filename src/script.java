import java.util.Scanner;

public class script {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year =scanner.nextInt();

        int year1 = 90 - year ;
        int days = year1 * 365;
        int weeks = year1 * 52;
        int month = year1 * 12 ;
        System.out.println(" " + days + " " + weeks + " " + month);


        // method


    }
}
