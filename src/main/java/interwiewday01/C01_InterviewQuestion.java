package interwiewday01;

import java.util.Scanner;

public class C01_InterviewQuestion {
    public static void main(String[] args) {

        /*How to convert
    Fahrenheit  to Celsius

    Program in
    java*/

     /*
    java'da nasıl fahrenheit celcius'a cevrilir
     */

        double derece;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit cinsinden dereceyi giriniz");
        derece = input.nextDouble();
        //bir formülü var
        //°C = (°F - 32) × 5/9
        derece = (derece-32)*5/9;
        System.out.println("Celsius cinsinden derece : " + derece);















    }


}
