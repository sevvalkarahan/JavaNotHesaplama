import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz:");
        mat = klavye.nextInt();
        System.out.println("Fizik notunu giriniz:");
        fizik = klavye.nextInt();
        System.out.println("Kimya notunu giriniz:");
        kimya = klavye.nextInt();
        System.out.println("Türkçe notunu giriniz:");
        turkce = klavye.nextInt();
        System.out.println("Tarih notunu giriniz:");
        tarih = klavye.nextInt();
        System.out.println("Müzik notunu giriniz:");
        muzik = klavye.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Not ortalamanız: " + sonuc);

        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println(gectiMi);
    }
}
