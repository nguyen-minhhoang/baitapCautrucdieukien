package ExercisePackage2;

import java.util.Scanner;

public class ExerciseMethod11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số tự nhiên từ 1 đến 10");
        int num = scanner.nextInt();
        String numEng;

        switch (num) {
            case 1:
                numEng = "One";
                break;
            case 2:
                numEng = "Two";
                break;
            case 3:
                numEng = "Three";
                break;
            case 4:
                numEng = "Four";
                break;
            case 5:
                numEng = "Five";
                break;
            case 6:
                numEng = "Six";
                break;
            case 7:
                numEng = "Seven";
                break;
            case 8:
                numEng = "Eight";
                break;
            case 9:
                numEng = "Nine";
                break;
            case 10:
                numEng = "Ten";
                break;
            default:
                numEng = "số không hợp lệ";
        }
        System.out.println("Tên tiếng anh số đã nhập:" + numEng);
    }
}
