import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner sınıfını kullanalım
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girmesini isteyelim
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan bir ondalıklı sayı girmesini isteyelim
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürerek ekrana yazdıralım
        double tamSayiOndalikli = (double) tamSayi;
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürüldü: " + tamSayiOndalikli);

        // Ondalıklı sayıyı tam sayıya dönüştürerek ekrana yazdıralım
        int ondalikliSayiTam = (int) ondalikliSayi;
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürüldü: " + ondalikliSayiTam);

        // Scanner'ı kapat
        scanner.close();
    }
}
