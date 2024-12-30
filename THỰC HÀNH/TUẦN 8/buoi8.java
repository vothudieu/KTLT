package dieu110537;

public class buoi8 {
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
public static void main(String[] args) {
xacDinhTamGiac(3, 3, 3);
}
}
