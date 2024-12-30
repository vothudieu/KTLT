package dieu110537;

public class buoi9 {
    public static void tamGiacVuongSao(int n)
    {
        System.out.println("tam giac vuông sao: ");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void tamGiacVuongSaoNguoc(int n)
    {
        System.out.print("tam giác vuông sao ngược:\n");
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();}
     }
     public static void tamGiacSo(int n)
     {
        System.out.println("tam giác vuông số:");
         for (int i = 1; i <= n; i++) 
         {
             for (int j = 1; j <= i; j++) {
                 System.out.print(j + " ");
             }
         System.out.println();
         }
     }
     public static void tamGiacSoNguoc(int n)
     {
        System.out.println("tam giác vuông số ngược:");
        for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void kimTuThapSao(int n)
    {
        System.out.println("kim tự tháp sao:");
        for(int i=1; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void kimTuThapSaoNguoc(int n){
        System.out.println("kim tự tháp sao  ngược:");
        for(int i=n; i >= 1; i--)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
    public static void kimTuThapSo(int n)
    {
        System.out.println("kim tự tháp số: ");
        for(int i= 1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<(i*i)/2; k++)
            {
                System.out.print(k);
            }
            for(int l=(2*i)/2; l>=1; l--)
            {
                System.out.print(l);
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        tamGiacVuongSao(5);
        tamGiacVuongSaoNguoc(5);
        tamGiacSo(5);
        tamGiacSoNguoc(5);
        kimTuThapSao(3);
        kimTuThapSaoNguoc(3);
        kimTuThapSo(3);
    }
}
