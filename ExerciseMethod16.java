package ExercisePackage2;

import java.util.Scanner;

public class ExerciseMethod16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b:");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double root = -b/a;
            System.out.println("Nghiệm của phương trình:" + root);
        }
    }
}
