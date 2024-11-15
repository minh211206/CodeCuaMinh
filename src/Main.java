import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.printf("%20s %n", "==MENU==");
        System.out.printf("%10s %n", "1.Hiển thị danh sách các quyển sách");
        System.out.printf("%10s %n", "2.Thêm sách vào danh sách");
        System.out.printf("%10s %n", "3.Sửa thông tin sách theo id");
        System.out.printf("%10s %n", "4.Thoát chương trình");
    }

    public static Scanner sc = new Scanner(System.in);
    public static qlisach ql = new qlisach();

    public static void main(String[] args) {
        int show = 0;
        while (true) {
            Main.menu();
            System.out.print("Hãy chọn từ 1-4: ");
            show = sc.nextInt();
            sc.nextLine();
            switch (show) {
                case 1:
                    ql.hienthisach();
                    break;
                case 2:
                    ql.themsach();
                    break;
                case 3:
                    ql.sua();
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Không hợp lệ. Vui lòng nhập lại");
                    break;
            }
        }
    }
}