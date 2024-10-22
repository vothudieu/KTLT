package vothudieu;

import java.util.Scanner;

public class dieu110537 {

    public static String gioiTinh(boolean gt) {
    return gt ? "Nam" : "Nữ";
}

public static void main(String[] args) {
    String maSinhVien = "110537", hoVaTen = "Võ Thu Diệu", ngaySinh = "12/10/2006", lop = "GD24A",
     khoa = "Mỹ Thuật Ứng Dụng", diachi = "Đà Nẵng";
     int tuoi = 18;
     boolean gt = false;
     System.out.println("-----THÔNG TIN SINH VIÊN-----");
     System.out.println("Mã sinh viên: " + maSinhVien);
     System.out.println("Họ và tên: " + hoVaTen);
     System.out.println("Ngày sinh: " + ngaySinh);
     System.out.println("Tuổi: " + tuoi);
     System.out.println("Giới tính: " + gioiTinh(false));
     System.out.println("Lớp: " + lop);
     System.out.println("Khoa: " + khoa);
     System.out.println("Địa Chỉ: " + diachi);
     System.err.println("------HẾT------");
     String hTen;
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhập họ và tên ");
         hTen = sc.nextLine();
    }
     System.out.println("Họ và tên " + hTen);
     
}
}