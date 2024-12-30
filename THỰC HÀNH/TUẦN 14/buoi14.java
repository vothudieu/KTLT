package dieu110537;

import java.util.Scanner;

public class buoi14 {
    public static final Scanner sc = new Scanner(System.in);
    //bai35
    public static int[][] nhapMaTran() {
        int colNum, rowNum;
        while (true) {
            try {
                System.out.print("\nnhập số dòng: ");
                rowNum = Integer.parseInt(sc.nextLine());
                System.out.println("nhập số cột:");
                colNum = Integer.parseInt(sc.nextLine());
                if (rowNum > 0 && colNum > 0)
                break;
                else
                System.out.println("gia tri không hợp lệ, hãy nhập lại!!");
           } catch (Exception e ) {
            System.out.println("dữ liệu không hợp lệ, hãy nhập lại!!");
           }
        }
            int matran[][] = new int[rowNum][colNum];
            for (int i = 0; i < rowNum; i++) {
                for(int j=0;i < colNum; i ++)
                {
                while (true) {
                    try {
                        System.out.print("nhập phần tử: ");
                        matran[i][j] = Integer.parseInt(sc.nextLine());
                        if (matran[i][j] > 0 && matran[i][j] < 100)
                        break;
                        else
                        System.out.println("giá trị không hợp lệ, hãy nhập lại!");
                    } catch (Exception e ) {
                        System.out.println("Dữu liệu không hợp lệ, hãy nhập lại!!!");
                    }                    
                }
            }
        } 
        return matran;
    }
            public static void xuatMaTran(int a [] []){
                for (int i = 0; i < a.length; i++){
                    for(int j =0; j<a[i].length;j++){
                    System.out.print("\t" + a[i][j]);
                    }
                    System.out.println();
                }   
    }
    public static void timPhamTuLonThuHai(int a[])
    {
        if(a.length < 2)
        {
            System.out.println("Không tồn tại phần tử lớn thứ 2!");
        }
        int max = 0, secondMax = 0, chiSoLonNhat = 0, chiSoLonHai=0;
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
      //cau a 
      public static void timPhamTuLonThuNhat(int a[][])
      {
        int max = a[0][0],row = 0, col = 0;
        for (int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                if (a[i][j] >max)
                {
                    max = a[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println("phần tử lớn nhất là: " + max + "xuất hiện tại dòng " + row +"và cột" + col);
      }
      //cau b 
      public static boolean kiemTraDoiXung(int num){
        int soBanDau =num, soDaoNguoc = 0;
        while (num != 0) {
            int tam = num % 10;
            soDaoNguoc= soDaoNguoc *10 +tam;
            num/=10;
        }
        return soBanDau==soDaoNguoc;
      }
      public static void hienThiSoDoiXung(int a[][])
      {
        for(int i=0; i<a.length;i++)
        {
            for(int j=0;j<a[i].length; j++)
            {
                if(kiemTraDoiXung(a[i][j]))
                System.out.print("\t"+ a[i][j]);
            }
        }
      }
      //cau c
      public static boolean kiemtraNguyenTo(int n)
      {
        boolean nt = true;
        if (n ==0||n ==1)
        return false;
        int i =2;
        int tam = (int) Math.sqrt(n);
        while (i <=tam) {
            if(n % i==0){
                nt =false;
                break;
            }
            i++;
        }
        return nt;
      }
      public static void hienThiSoNguyenTo(int a[][])
      {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                if (kiemtraNguyenTo(a[i][j]))
                System.out.print("\t" +a[i][j]);
                else
                System.out.print("\t" +0);
            }
            System.out.println();
        }
      }
      public static void main(String[] args) {
        int matran[][]= nhapMaTran();
        System.out.println("nhập ma trận vừa nhập là: ");
        xuatMaTran(matran);
    }
}
