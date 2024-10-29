package ExercisePackage2;

import java.util.Scanner;

public class ExerciseMethod15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên a:");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên b:");
        int b = scanner.nextInt();

        int max = (a > b)? a : b;
        int min = (a < b)? a : b;

        System.out.println("MAX:" + max);
        System.out.println("MIN:" + min);
    }
}
