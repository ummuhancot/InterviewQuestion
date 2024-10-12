package interwiewday01;

import java.util.Scanner;

public class C04_InterviewQuestion {
    public static void main(String[] args) {

        /*
    Print Reverse number in  java program
    Bir sayiyi tersten yazdıran programi yazınız
     */
        /*
        714532
        235417
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ters çevirmek istediginiz sayiyi giriniz");

        //1. yol string ile yaptık
        String ters = "";//basamak değeri atamak için yaptık
        for (int sayi = input.nextInt(); sayi > 0; sayi /= 10){
            ters = ters + sayi % 10;
        }
        System.out.println("ters = " + ters);
        //System.out.println(Integer.parseInt(ters) * 3);//tekrar intecire çevirme böyle

        //2.yol int ile yaptık
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lütfen ters çevirmek istediginiz sayiyi giriniz");

        int reverse = 0;
        for (int sayi1 = input1.nextInt(); sayi1 > 0; sayi1 /= 10){
            reverse = reverse + sayi1 * 10;//basamak değerini arttırmak için 10 ile çarptık
            reverse = reverse + sayi1 % 10;
        }
        System.out.println("ters = " + reverse);



    }
}
