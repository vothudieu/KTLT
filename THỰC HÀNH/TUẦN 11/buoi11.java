package dieu110537;

public class buoi11 {
    public static void xacDinhTamGiac(double a, double b, double c)
    {
        if (a+b > c && a + c > b && b + c > a){
            if (a == b && b ==c){
                System.out.printf("ba giá trị %.1f, %.1f, %.1f tạo thành tam giác đều!", a, b, c);
            } else{
                if ( a== b|| b ==c || a==c ){
                    if (a * a==b *b + c* c|| b* a==a * a+c * c ||c *c == a * a +b *b){
                        System.out.printf("ba giá trị %.1f, %.1f, %.1f tạo thành tam giác vuông cân!",a, b, c);
                    } else {
                        System.out.printf("ba giá trị %.1f, %.1f, %.1f tạo thành tam giác cân!",a, b, c);
                    }
                } else {
                    if(a * a==b *b + c* c|| b* a==a * a+c * c ||c *c == a * a +b *b){
                        System.out.printf("ba giá trị %.1f, %.1f, %.1f tạo thành tam giác vuông!",a, b, c);
                    } else {
                        System.out.printf("ba giá trị %.1f, %.1f, %.1f tạo thành tam giác thường!",a, b, c );
                    }
                }
            }
        } else
            System.out.printf("ba giá trị %.1f, %.1f, %.1f không phải là cạnh của tam giác!",a, b, c );
    }

    public static long tinhGiaiThua(int n)
    {
        long tong = 1;
        for(int i=1; i<=n; i++)
        {
            tong *=1;
        }
        return tong;
    }
    public static void tinhTongGiaiThua()
    {
        long S = tinhGiaiThua(4) + tinhGiaiThua(5) + tinhGiaiThua(7) + tinhGiaiThua(9);
        System.out.println("Tổng giai thừa của 4, 5, 7 và 9 là: " + 5);
    }
    //bai7:
    public static int tinhUCLN(int num1, int num2) 
    {
        int ucln;
        while (num2 !=0)
        { 
            ucln = num1%num2;
            num1 = num2;
            num2 = num1;           
        }
        return num1;
    }
    //bai8:
    public static int tinBCNN(int num1,int num2)
    {
        int tam = (num1*num2)/tinhUCLN(num1, num1);
        return tam;
    }
    //bai9:
public static int tinhTongCacSoLe(int n)
{
    int tong =0;
    for(int i=1; i<=n; i++)
    {
        if(i%2 !=0)
        {
            tong +=i;
        }
    }
    return tong;
}
//bai5:
public static int [] sapXepMangTang(int a[])
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
public static void hienThiMangTang(int a[])
{
    for(int i=0; i<a.length; i++)
    {
        System.out.print("\t" + a[i]);
    }
}
//bai10:
public static int [] sapXepMangGiam(int a[])
{
    for(int i=0; i<a.length-1; i++)
    {
        for (int j=0; j<a.length-1-i;j++)
        {
            if(a[j]<a[j+1]);
            {
                int tam = a[j];
                a[j] = a[j+1];
                a[j+1] =tam;
            }
        }
    }
    return a;
}
public static void hienThiMangGiam(int a[])
{
    for(int i= 0; i>a.length; i++)
    {
        System.out.print("\t" + a[i]);
    }
 }
 //bài 11:
 public static int timGiaTriNhoNhat (int a[])
 {
     int gtnn = a[0];
     for(int i = 1; i<a.length; i++)
     {
         if(gtnn>a[i])
         gtnn = a[i];
     }
     return gtnn;
 }
 //bài 12
 public static int timGiaTriLonNhat (int a[])
 {
     int gtln = a[0];
     for(int i = 1; i<a.length; i++)
     {
         if(gtln < a[i])
         gtln = a[i];
     }
     return gtln;
 }
    public static void main(String[] args) {
        int a[]={-8, 5 , 7, 10};
        xacDinhTamGiac(3, 4, 5);
        tinhTongGiaiThua();
        System.out.println("ước chung lớn nhất của 2 số 4 và 5 là: " + tinhUCLN(4, 5));
        System.out.println("ước chung lớn nhất của 2 số 4 và 5 là: " + tinBCNN(4, 5));
        System.out.printf("tổng các số lẻ từ 1 đến %d", 10,tinhTongCacSoLe(10));
        System .out.println("Mang ban dau la: ");
        hienThiMangGiam(a);
        System.out.println("\nMang sau khi sx theo thu tu giam: ");
        hienThiMangGiam(sapXepMangGiam(a));   
        System.out.print("\nGia tri nho nhat trong mang ban dau la: " + timGiaTriNhoNhat(a));
        System.out.print("\nGia tri lon nhat trong mang ban dau la: " + timGiaTriLonNhat(a));
    }
}
