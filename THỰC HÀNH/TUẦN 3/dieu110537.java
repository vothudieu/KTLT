package buoi3;

public class dieu110537 {
    public static String gioiTinh(boolean gt) {
        return gt ? "Nam" : "Nữ";
    }


    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String maSinhVien = "110537", hoVaTen = "Võ Thu Diệu", ngaySinh = "12/10/2006", lop = "GD24A",
        Khoa ="Mỹ Thuật Ứng Dụng", diaChi = "16/20 Mỹ Đa Đông 12";
        int tuoi = 18;
        boolean gt = false;
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Mã sinh viên : " + maSinhVien);
        System.out.println("Họ và Tên :" + hoVaTen);
        System.out.println("tuổi : " + tuoi);
        System.out.println("Giới tính : " + gioiTinh(gt));
        System.out.println("Lớp : " + lop);
        System.out.println("Khoa " + Khoa);
        System.out.println("Địa chỉ : " + diaChi);
        System.out.println("-----HẾT-----");
    }   
}
