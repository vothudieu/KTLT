package dieu110537;

public class Buoi6_1 {
    public static void main(String[] args) {
        //Trường hợp 1
        String hoTen1 = "Nguyễn Văn An";
        String ngaySinh1 = "20/10/2006";
        String diemTongKet1Str = "5.5";
        String tuoi1Str = "18";

        //Chuyển đổi kiểu dữ liệu
        float diemTongKet1 = Float.parseFloat(diemTongKet1Str);
        int tuoi1 = Integer.parseInt(tuoi1Str);
        
        //Hiển thị thông tin
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet1 + " (Float)");
        System.out.println("Tuổi: " + tuoi1 + " (int)");
        System.out.println("-----HẾT-----");

        //Trường hợp 2
        String hoTen2 = "Nguyễn Văn An";
        String ngaySinh2 = "20/10/2006";
        Float diemTongKet2 = 5.5f;
        int tuoi2 = 18;

        //Hiển thị thông tin
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và Tên: " + hoTen2 + " (String)");
        System.out.println("Ngày Sinh: " + ngaySinh2 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet2 + " (String)");
        System.out.println("Tuổi: " + tuoi2 + " (String)");
        System.out.println("----HẾT-----");
    }
}
