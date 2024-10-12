package interwiewday01;

public class C02_InterviewQuestion {
    public static void main(String[] args) {

        /* algoritma mantığı
         Java'da 2 degisken nasıl değiştirilir?
         How to swap 2 variables in Java?
         */

        //a=10 b =6 olacak soru bunu istiyor
//1. yol
        int a = 6;
        int b = 10;

        a = a +b;//16 sayısını elde ederiz
        // a=16 b=10 sayılarımız var
        b = a - b;//16-10=6 b = 6 oldu
        a = a - b;//16-6=10 a = 10 oldu
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//2. yol ---pahalı işlem !!! fazladan veriables var depolamayı dolduruyor---

        int c = a;
        a=b;
        b=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//3.yol
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);












    }
}
