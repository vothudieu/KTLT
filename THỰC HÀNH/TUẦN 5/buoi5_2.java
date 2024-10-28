package dieu110537;

public class buoi5_2 {
    public static void main(String[] args) {
        viDu1();
        viDu2();
        viDu3();
        viDu4();
        viDu5();
        viDu6();
        
    }
    public static void viDu1(){
        int a = 3;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a+++1);
        System.out.println(++a + 1);
    
    }
    public static void viDu2(){
        int a = 0, b, c;
        a++;
        b = a;
        c = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void viDu3(){
        int a = 0, b, c;
        ++a;
        b = a;
        c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void viDu4(){
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void viDu5(){
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void viDu6(){
        int a = 0, b, c;
        ++a;
        b = a++;
        c = b++;
        c += c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
    }
}
