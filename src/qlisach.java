import java.util.ArrayList;
import java.util.Scanner;

public class qlisach {
    private ArrayList<Sach> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public void themsach(){
        System.out.print("Hãy nhập ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Hãy nhập tên sách: ");
        String tensach = sc.nextLine();

        System.out.print("Hãy nhập tên tác giả:");
        String tacgia = sc.nextLine();

        System.out.print("Hãy nhập tên nhà xuất bản:");
        String nhaxuatban = sc.nextLine();

        Sach newsach = new Sach(id,tensach,tacgia,nhaxuatban);
        list.add(newsach);
        System.out.println("Thêm thành công");
    }
    public void hienthisach(){
        System.out.println("THƯ VIỆN SÁCH");
        for (int i = 0; i <this.list.size() ; i++) {
            Sach sach = list.get(i);
            sach.chitiet();
        }
    }
    public void sua(){
        System.out.print("Hãy nhập id cần tìm: ");
        int ID = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < this.list.size(); i++) {
            Sach sach = list.get(i);
            if (sach.getId() == ID){
                System.out.print("Hãy nhập tên sách mới: ");
                String newsach = sc.nextLine();

                System.out.print("Hãy nhập tên tác giả mới: ");
                String newtacgia = sc.nextLine();

                System.out.print("Hãy nhập tên nhà xuất bản mới: ");
                String newnhaxuatban = sc.nextLine();

                sach.setTensach(newsach);
                sach.setTentacgia(newtacgia);
                sach.setTennhaxuatban(newnhaxuatban);

                System.out.println("Sửa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }


}
