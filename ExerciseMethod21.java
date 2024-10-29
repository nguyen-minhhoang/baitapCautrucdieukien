package ExercisePackage2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.Scanner;

public class ExerciseMethod21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày:");
        int day = scanner.nextInt();

        if ( day < 1 || day > 31 ) {
            System.out.println("Ngày không hợp lệ");
            return;
        }

        System.out.println("Nhập tháng:");
        int month = scanner.nextInt();

        if ( month < 1 || month > 12 ) {
            System.out.println("Tháng không hợp lệ");
            return;
        }

        System.out.println("Nhập năm:");
        int year = scanner.nextInt();

        if ( year < 1 ) {
            System.out.println("Năm không hợp lệ");
            return;
        }

        if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
            if ( day == 31 ) {
                System.out.println("Ngày không hợp lệ");
                return;
            }

        }

        if ( month == 2) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
                if ( day > 29 ) {
                    System.out.println("Ngày không hợp lệ");
                    return;
                }
            } else {
                if ( day > 28) {
                    System.out.println("Ngày không hợp lệ");
                    return;
                }
            }
        }

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
            if ( day == 30 ) {
                nextDay = 1;
                nextMonth++;
            } else {
                nextDay++;
            }
        } else if ( month == 2) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
                if ( day == 29 ) {
                    nextDay = 1;
                    nextMonth++;
                } else {
                    nextDay++;
                }
            } else {
                if (day == 28) {
                    nextDay = 1;
                    nextMonth++;
                } else {
                    nextDay++;
                }
            }
        } else {
            if ( day == 31 ) {
                if ( month == 12 ) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear++;
                } else {
                    nextDay = 1;
                    nextMonth++;
                }
            } else {
                nextDay++;
            }
        }

        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        if ( day == 1 ) {
            if ( month == 1 ) {
                previousDay = 31;
                previousMonth = 12;
                previousYear--;
            } else {
                previousDay--;
                previousMonth--;
            }
        } else {
            previousDay--;
        }
        System.out.println("Ngày kế tiếp:" + nextDay + "-" + nextMonth + "-" + nextYear);
        System.out.println("Ngày trước đó:" + previousDay + "-" + previousMonth + "-" + previousYear);

    }
}
