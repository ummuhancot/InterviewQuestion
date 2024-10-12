package interwiewday01;

import java.util.Scanner;

public class C06_InterviewQuestion {
    public static void main(String[] args) {

        /*
          Check no is Armstrong or not   in java Program
          Bir sayinin armstrong olup olmadıgını kontrol eden java programini yaziniz
         */
        /*
        454 -> 4^3+5^3+4^3->253!=454 -> no armstrong!!!
        123
        548
        407-> 4^3+0^3+7^3->343+64->407==407-> armstrong sayidir!!!

         */

        //1.yol data primitive
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen armstorong sayi olup olmadığını kontrol etmek istediğiniz sayıyı giriniz");
        int sayi =input.nextInt();
        //sayının kaç basamaklı oldugunu primitive datalar da 10 a bölerek buluruz
        int sayac = 0;
        for (int i = sayi; i > 0; i /= 10) {
            sayac++;//sayac bizim kuvvetimiz
        }
        //System.out.println("sayac = " + sayac);

        //basamak değerlerini toplayacagız sayac kadar kuvvet hesaplayız sonra toplarız toplarız

        int sum = 0;
        for (int i = sayi; i > 0 ; i /= 10) {
            sum += Math.pow(i % 10, sayac);
        }
        if (sayi == sum){
            System.out.println("Bu sayi armstrong sayıdır");
        } else {
            System.out.println("Bu sayi armstrong sayı değildir");
        }

        //2.yol
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lütfen armstorong sayi olup olmadığını kontrol etmek istediğiniz sayıyı giriniz");
        int sayi1 =input1.nextInt();
        int sum1 = 0;
        for (int i = sayi; i > 0 ; i /= 10) {
            sum1 += power(i % 10, sayac);
        }
        if (sayi1 == sum1){
            System.out.println("Bu sayi armstrong sayıdır");
        } else {
            System.out.println("Bu sayi armstrong sayı değildir");
        }

    }


    public  static  int power(int a, int b){
        int c = 1;
        for (int i = 1; i <= b; i++) {
            c *= a;
        }
        return c;
    }



}
