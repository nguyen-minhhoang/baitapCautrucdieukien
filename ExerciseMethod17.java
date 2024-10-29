package ExercisePackage2;

import java.util.Scanner;

public class ExerciseMethod17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c:");
        double c = scanner.nextDouble();

        if (a == 0 ) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double root = -c / b;
                System.out.println("Nghiệm của phương trình:" + root);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double root = -b / (2 * a);
                System.out.println("Nghiệm của phương trình:" + root);
            } else {
                double root1 = (-b - Math.sqrt(delta))/ (2 * a);
                double root2 = (-b + Math.sqrt(delta))/ (2 * a);
                System.out.println("Nghiệm　một của phương trình:" + root1);
                System.out.println("Nghiệm　hai của phương trình:" + root2);
            }
        }
    }
}
