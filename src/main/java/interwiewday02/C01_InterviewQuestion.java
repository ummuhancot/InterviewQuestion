package interwiewday02;

public class C01_InterviewQuestion {
    public static void main(String[] args) {

        //Bir string tüm substringlerini bulan kodu yazınız
        //substringlerini = ilk girilen indexten ikinci indexe kadar(ikinci index dahil degildir) olan degeri bize dondurur

        String str = "Java bugün çok güzel";
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {//başlangıc
            for (int j = 1; j <= str.length() - i ; j++) {//bitiş
                sayac++;
                System.out.println(str.substring(i, j + i));
            }
        }
        System.out.println(sayac);






    }
}
