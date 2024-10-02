import java.util.Scanner;

public class DaysInMonth {

    // Hàm kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // Hàm trả về số ngày trong tháng dựa trên tháng và năm
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // Giá trị tháng không hợp lệ
        }
    }

    // Hàm chuyển đổi tên tháng sang số
    public static int monthStringToNumber(String month) {
        month = month.toLowerCase();
        switch (month) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1; // Nếu nhập tháng không hợp lệ
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = -1;
        int year = -1;

        // Nhập tháng và kiểm tra tính hợp lệ
        while (monthNumber == -1) {
            System.out.print("Nhập tháng : ");
            String monthInput = scanner.nextLine();
            monthNumber = monthStringToNumber(monthInput);

            if (monthNumber == -1) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
            }
        }

        while (year < 0) {
            System.out.print("Nhập năm (số nguyên dương): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year < 0) {
                    System.out.println("Năm phải là số không âm. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Giá trị nhập không hợp lệ. Vui lòng nhập lại.");
                scanner.next();
            }

            // Lấy số ngày trong tháng
            int days = getDaysInMonth(monthNumber, year);

            if (days == -1) {
                System.out.println("Tháng không hợp lệ.");
            } else {
                System.out.println("Tháng " + monthNumber + " năm " + year + " có " + days + " ngày.");
            }

            scanner.close();
        }
    }
}

