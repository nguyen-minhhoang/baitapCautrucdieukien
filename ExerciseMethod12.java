package ExercisePackage2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseMethod12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên a:");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên b;");
        int b = scanner.nextInt();

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Số nguyên sau khi đảo vị trí:" );
        System.out.println("Số nguyên a:" + a);
        System.out.println("Số nguyên b:" + b);
    }
}
