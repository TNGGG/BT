package Bai1;

public class ThongTin {
    public static void main(String[] args) {
        // Gọi phương thức nhập thông tin để gán giá trị
        //cho biến static trc khi truy cập trong lớp khác
        NhanVien.nhapThongTin("Nem",25);
        System.out.println("Ten nhan viên: "+NhanVien.Ten);
        System.out.println("Tuổi nhan viên: "+NhanVien.Tuoi);
    }
}
