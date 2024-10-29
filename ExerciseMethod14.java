package ExercisePackage2;

import java.util.Scanner;

public class ExerciseMethod14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên a:");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên b:");
        int b = scanner.nextInt();

        int max, min;

        if (a > b) {
            max = a;
            min = b;
        } else if  (a < b) {
            max = b;
            min = a;
        } else {
            max = min = a;
            System.out.println("Hai số nguyên bằng nhau");
        }
        System.out.println("MAX:" + max);
        System.out.println("MIN:" + min);
    }
}

