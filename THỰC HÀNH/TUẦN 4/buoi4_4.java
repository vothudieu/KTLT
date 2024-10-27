package dieu110537;

public class buoi4_4 {
     public static void bai4_4() {
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        int i = 0, j = 0;
        System.out.printf("Phần tử thứ nhất arr2[%d][%d] = %d", i, j, arr2[i][j]);
        System.out.printf("\nPhần tử thứ hai arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
        System.out.printf("\nPhần tử thứ ba arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
        System.out.printf("\nPhần tử thứ tư arr2[%d][%d] = %d", i = i + 1, j = 0, arr2[i][j]);
        System.out.printf("\nPhần tử thứ năm arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
        System.out.printf("\nPhần tử thứ sáu arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
        System.out.printf("\nPhần tử thứ bảy arr2[%d][%d] = %d", i = i + 1, j = 0, arr2[i][j]);
        }
        
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            bai4_4();
        }
        }

