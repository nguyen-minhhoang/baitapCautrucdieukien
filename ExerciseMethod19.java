package ExercisePackage2;

import java.util.Scanner;

public class ExerciseMethod19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một ký tự chữ cái:");
        char character = scanner.next().charAt(0);

        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')){
            if (character >= 'A' && character <= 'Z') {
                character += 32;
            } else {
                character -= 32;
            }
            System.out.println("Ký tự chữ cái sau khi thay đổi:" + character);
        } else {
            System.out.println("Dữ liệu đã nhập sai. Hãy nhập một ký tự chữ cái:");
        }
    }
}
