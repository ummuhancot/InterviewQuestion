package interwiewday02;

import java.util.ArrayList;
import java.util.Scanner;

public class C03_InterviewQuestion {
    public static void main(String[] args) {

       /* Kullanıcıdan bir pozitif tam sayı alın. Bu sayı, Fibonacci dizisinin kaç terimini üreteceğinizi belirleyecek.
                Fibonacci dizisini hesaplayın ve dizinin elemanlarını ekrana yazdırın.
                Fibonacci dizisinin toplamını hesaplayın ve ekrana yazdırın.
        Fibonacci dizisindeki en büyük terimi ve en küçük terimi bulun ve bunları ekrana yazdırın.
        */

        //Fibonacci dizisi, 0 ve 1 ile başlar ve sonraki terimler, önceki iki terimin toplamı olarak hesaplanır.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac fibonacci terimi üreteceksiniz");
        int count = input.nextInt();
        ArrayList<Integer> fibonaccilist = new ArrayList<>();
        //ilk iki terimi ekleyelim
        fibonaccilist.add(0);//1. terim(sayı) //0. index
        fibonaccilist.add(1);//2. terim(sayı) //1. index

        //fibbonici dizisini oluşturalım
        for (int i = 2; i < count ; i++) {// birinci ve ikinci terim değişmiyor o yüzden 2 ye eşitledik i yi
            int nextTerim = fibonaccilist.get(i-1) + fibonaccilist.get(i-2);
            fibonaccilist.add(nextTerim);

        }
        //fibbonici dizisini yazdıralım
        System.out.println(fibonaccilist);

        //fibboncici dizisinin toplamını bulalım
        int sum = 0;
        for (int num : fibonaccilist){
            sum += num;
        }
        System.out.println("Toplam : " + sum);








    }
}
