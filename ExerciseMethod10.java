package ExercisePackage2;

import java.util.Scanner;

public class ExerciseMethod10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số tự nhiên từ 1 đến 10");
        int num = scanner.nextInt();
        String numEng;

        if (num == 1) {
            numEng = "One";
        } else if (num == 2) {
            numEng = "Two";
        } else if (num == 3) {
            numEng = "Three";
        } else if (num == 4) {
            numEng = "Four";
        } else if (num == 5) {
            numEng = "Five";
        } else if (num == 6) {
            numEng = "Six";
        } else if (num == 7) {
            numEng = "Seven";
        } else if (num == 8) {
            numEng = "Eight";
        } else if (num == 9) {
            numEng = "Nine";
        } else if (num == 10) {
            numEng = "Ten";
        } else {
            numEng = "số nhập vào không hợp lệ";
        }
        System.out.println("Tên tiếng anh của số đã nhập vào là:" + numEng);
    }
}
