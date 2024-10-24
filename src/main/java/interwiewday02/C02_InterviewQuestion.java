package interwiewday02;

import java.util.Arrays;
import java.util.Scanner;

public class C02_InterviewQuestion {
    public static void main(String[] args) {

        //bir cümlenin kelimelerini sayacak, her kelimeyi ters çevirecek kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String str = input.nextLine();
        str.split(" ");
        //hem kelimelere ayırdık hemde kelime sayisini buldum
        String[] words = str.split(" ");
        System.out.println("Cümledeki kelime sayısı : " + words.length);//3

        //her kelimeyi ters cevirelim
        System.out.println("Ters çevrilmiş kelimeler : ");
        for (String word : words){

            //StringBuilder sb=new StringBuilder(word);
            //System.out.print(sb.reverse()+" ");
            System.out.print(new StringBuilder(word).reverse().toString() + " ");
        }

        //son kelimeden başlayarak tes çevirseydik ne olur
        //ali can topu bana at
        //ta anab uqot nac ali
        //her kelimeyi ters çevirelim
        System.out.println("Ters çevrilmiş kelimeler : ");
        for (int i = words.length - 1 ; i >= 0 ; i--) {
            StringBuilder sb = new StringBuilder(words[i]);
            System.out.print(sb.reverse()+" ");
        }




    }
}
