package dieu110537;

import java.util.Scanner;

public class buoi13 {
    public static final Scanner sc = new Scanner(System.in);
    //bai30
    public static void kiemTraDoiXung(int num)
    {
        int soBanDau = num, soDaoNguoc = 0;
        while (num!=0) {
            int ketqua = num%10;
            soDaoNguoc = soDaoNguoc *10 + ketqua;
            num /=10;
            
        }
        if(soBanDau == soDaoNguoc)
        {
            System.out.println(soBanDau + "\tlà số đối xứng!");
        }
        else 
        System.out.print(soBanDau + "\tkhông phải là số đối xứng!");
    }
    public static void soNguocCuaMotSoBatki(int num)
    {
        System.out.print("\nĐảo ngược số ban đầu: " + num + " thành " );
        while (num != 0 ) 
        {
            System.out.print(num%10);
            num/=10;
        }
    }
    //bai38a
    public static int[] nhapMang() {
        int n;
        while (true) {
            try {
                System.out.print("\nNhập kích thước mảng: ");
                n = Integer.parseInt(sc.nextLine());
                if(n>0)
                    break;
                else
                System.out.println("Giá trị không hợp lệ, hãy nhập lại!");
           } catch (Exception e ) {
            System.out.println("dữ liệu không hợp lệ, hãy nhập lại!!");
           }
        }
            int tam[] = new int[n];
            for (int i = 0; i < n; i++) {
                while (true) {
                    try {
                        System.out.print("nhập phần tử: ");
                        if (tam[i] > 0 && tam[i] < 100)
                        break;
                        else
                        System.out.println("giá trị không hợp lệ, hãy nhập lại!");
                    } catch (Exception e ) {
                        System.out.println("Dữu liệu không hợp lệ, hãy nhập lại!!!");
                    }                    
                }
            }
            return tam;
        }
            public static void xuatMang(int a []){
                for (int i = 0; i < a.length; i++){
                    System.out.print("\t" + a[i]);
                }   
    }
    public static void timPhamTuLonThuHai(int a[])
    {
        if(a.length < 2)
        {
            System.out.println("Không tồn tại phần tử lớn thứ 2!");
        }
        int max = 0, secondMax = 0, chiSoLonNhat = 0, chiSoLonHai =0;
        for(int i =0; i<a.length; i++)
        {
            if(a[i]> max)
            {
                secondMax = max;
                max = a[i];
                chiSoLonHai = chiSoLonNhat;
                chiSoLonNhat = 1;
            }
        }
        if(secondMax == 0)
        System.out.print("không tồn tại phần tử lớn thứ 2 trong mảng!");  
        else
        System.out.println("phần tử lớn thứ hai trong mảng có giá trị là " + secondMax);
      }
    //38b
  public static int [] sapXepMangGiam(int a[])
{
    for(int i=0; i< a.length-1; i++)
    {
        for(int j =0; j<a.length-1-i; i++)
        {
            if(a[j]< a[j+1])
            {
                int tam = a[j];
                a[j] = a[j+1];
                a[j+1] = tam;
            }
        }
    }
    return a;
}
//bai 38c
public static int [] chenPhanTu(int a[], int x)
{
    int tam [] = new int[a.length +1 ];
    System.arraycopy(a, 0, tam, 0, a.length);
    //tim vi tri chen x
    int vt = 0;
    for(int i=0; i<tam.length; i++)
    {
        if(tam[i] > x)
        vt = i+1;
        else
        break;
    }
    //dich chuyen cac phan tu trong mang de chen
    for(int i=tam.length-1; i>vt; i--)
    {
        tam[i] = tam[i-1];
    }
    tam[vt] = x;
    return tam;
}
    public static void main(String[] args) {
        int num= 133;
        kiemTraDoiXung(num);
        soNguocCuaMotSoBatki(num);
        int tam[] = nhapMang(), x =5 ;
        System.out.print("Mảng vừa nhập là: ");
        xuatMang(tam);
        timPhamTuLonThuHai(tam);
        System.out.println("Mang sau khi sap xep theo chieu giam: ");
        xuatMang(sapXepMangGiam(tam));
        System.out.print("Mang sau khi chen phan tu " + x + ":");
        xuatMang(chenPhanTu(tam, x));

    }
}
