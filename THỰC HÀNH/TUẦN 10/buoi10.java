package dieu110537;

public class buoi10 {
    // Hàm kiểm tra nguyên tố
    public static boolean kiemTraNguyenTo(int n) {
        boolean nt = true;
        if (n==0 || n==1)
            return false;
        int i = 2;
        int tam= (int) Math.sqrt(n);
        while (i <= tam ) {
            if (n % i == 0) {
                nt = false;
                break;
            }
            i++;
        }
        return nt;
    }
     //bài 19.Liệt kê các số nguyên tố nhỏ hơn n
     public static void LietKeNguyenTo(int n)
     {
        System.out.printf("các nguyên tố nhỏ hơn %d là: ", n);
        for(int i=1; i<n; i++)
        {
            if(kiemTraNguyenTo(i) == true)
            {
                System.out.print("\t" +i);
            }
        }
     }
     //bài 20. Liệt kê n số nguyên tố đầu tiên
     public static void LietKeSoNguyenTo(int n)
     {
        int dem=0;
        System.out.printf("Danh sách %d số nguyên tố đầu tiên là: ",n );
        for(int i=1; ;i++)
        {
            if(kiemTraNguyenTo(i)==true)
            {
                if(dem == n)
                {
                    break;
                }
                else
                {
                    dem += 1;
                    System.out.print("\t" + i);
                }
            }
        }
     }

    public static void main(String[] args) {
    LietKeNguyenTo(11);
    LietKeSoNguyenTo(5);
    }
}
