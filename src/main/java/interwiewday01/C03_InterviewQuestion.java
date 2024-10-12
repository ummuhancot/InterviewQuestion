package interwiewday01;

import java.util.Scanner;

public class C03_InterviewQuestion {
    public static void main(String[] args) {

        /*
      Find the Largest Number in Java Program
      Java'da en buyuk sayiyi bulan programi yazınız
      */
        int a=16;
        int b=19;
        int c=25;

        if (a>b&&a>c){
            System.out.println("En büyük sayi : "+a);
        } else if (b>a&&b>c) {
            System.out.println("En büyük sayi : "+b);
        }else if (c>a&&c>b){
            System.out.println("En büyük sayi : "+c);
        }else {
            System.out.println("Bu sayılardan aynı olanlar olabilir");
        }
        //2.yol
        Scanner scanner = new Scanner(System.in);
        // Kaç adet sayı gireceğinizi soruyoruz
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();
        // Sayıları tutacak bir dizi oluşturuyoruz
        int[] numbers = new int[n];
        // Kullanıcıdan sayıları alıyoruz
        System.out.println("Lütfen " + n + " adet sayı giriniz:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        // İlk sayıyı en büyük olarak kabul ediyoruz
        int largest = numbers[0];
        // En büyük sayıyı bulmak için döngü kullanıyoruz
        for (int i = 1; i < numbers.length; i++) {
            largest = Math.max(largest, numbers[i]);
        }
        System.out.println("En büyük sayı: " + largest);

        Scanner Scanner = new Scanner(System.in);
        // Kaç adet sayı gireceğinizi soruyoruz
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n1 = Scanner.nextInt();
        // Sayıları tutacak bir dizi oluşturuyoruz
        int[] numbers1 = new int[n];
        // Kullanıcıdan sayıları alıyoruz
        System.out.println("Lütfen " + n + " adet sayı giriniz:");
        for (int i = 0; i < n; i++) {
            numbers[i] = Scanner.nextInt();
        }
        // İlk sayıyı en büyük olarak kabul ediyoruz
        int largest1 = numbers[0];
        // En büyük sayıyı bulmak için döngü kullanıyoruz
        for (int i = 1; i < numbers.length; i++) {
            largest = Math.max(largest, numbers[i]);
        }
        System.out.println("En büyük sayı: " + largest);
    }




}
