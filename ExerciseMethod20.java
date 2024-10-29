package ExercisePackage2;

import java.util.Scanner;

public class ExerciseMethod20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số nguyên dương:");
        int num = scanner.nextInt();

        double squareRoot;
        squareRoot = Math.sqrt(num);

        if (squareRoot % 1 == 0){
            System.out.println("Số " + num + " là một số chính phương.");
        } else {
            System.out.println("Số " + num + " không phải là một số chính phương.");
        }
    }
}
