package dieu110537;

import java.util.Scanner;

public class buoi12 {
    //bai10
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
//bai11
public static void hienThiMangTang(int a[])
{
    for(int i=0; i<a.length; i++)
    {
        System.out.print("\t" + a[i]);
    }
}
//bai12
public static int timGiatrNhoNhat(int a[])
{
    int gtnn =a[0];
    for(int i=1; i<a.length;i++)

{
    if(gtnn > a[i])
    gtnn = a[i];
}
return gtnn;
}
//bai14
public static int timGiatriLonNhat(int a[])
{
    int gtln =a[0];
    for(int i=1; i<a.length;i++)

{
    if(gtln < a[i])
    gtln = a[i];
}
return gtln;
}
public static int timSoLonNhatBaSo(int num1, int num2, int num3)
{
    int tam= num1;
    if(num2> tam)
    tam=num2;
    if(num3> tam)
    tam=num3;
    return tam;
}
//bai18
public static void PhanTichThuaSoNguyenTo(int n)
{
    System.out.printf("%d phân tích thành thừa số nguyên tố là: ", n);
    int i= 2;
    while ( n !=0) 
    {
        if(n%i==0)
        {
            n /=i;
            System.out.print("\t" + i);
        }
        else
        i++;
    }
}
//bai27
public static int nhapGIaTriTuBanPhim(){
    Scanner sc = new Scanner (System.in);
    int tam;
    while (true){
       try{
           System.out.print("Nhap gia tri: ");
           tam = Integer. parseInt(sc.nextLine ());
           sc.close();
           return tam;
       } catch (Exception e) {
           System.out.println("Du lieu ko hop le, hay nhap lai!!!");
       }
    }
 }
 public static boolean kiemTraSoHoanHao(int n) {
   int tong = 0;
   for (int i= 1; i <= n / 2; i++) {
       if (n % i ==0)
       tong += i;
   }
   return tong == n;
}
public static void hienThiSoHoanHao(int n )
{
    int tong = 0;
    if(kiemTraSoHoanHao(n)) {
        System.out.printf("%d la so hoan hao va cac uoc so cua no la: ", n);
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print("\t" + i);
                tong += i;
                if (tong == n)
                break;
            }
        }
    }else 
    System.out.printf("%d khong phai la so hoan hao", n);
}
        public static void main(String[] args) { 
            int num1 =5, num2 = 7, num3= 10, a[] = {-8, 5, 4, 2, 10};
            System.out.print(" Mang ban dau:");
            hienThiMangTang(a);
            System.out.print("\nMảng sau khi được sắp xếp theo thứ tự giảm dần: ");
            hienThiMangTang(sapXepMangGiam(a));
            System.out.print("\nGiá trị nhỏ nhất trong mảng ban đầu là: " + timGiatrNhoNhat(a));
            System.out.print("\nGiá trị lớn nhất trong mảng ban đầu là:" + timGiatriLonNhat(a));
            System.out.printf("\ngiá trị lớn nhất của ba số %d, %d và %d là %d", num1, num2, num3, timSoLonNhatBaSo(num1, num2, num3));
            PhanTichThuaSoNguyenTo(15);
            int tam = nhapGIaTriTuBanPhim();
            hienThiSoHoanHao(tam);
}
}
