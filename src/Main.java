import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ab=new Scanner(System.in);

        int KdvsizFiyat;

        System.out.print("Kdvsiz Fiyat : ");
        KdvsizFiyat = ab.nextInt();

        int KdvMiktari = KdvsizFiyat > 1000 ? (KdvsizFiyat * 8 / 100) : (KdvsizFiyat * 18 / 100);

        int KdvliFiyat = KdvsizFiyat + KdvMiktari;

        System.out.println(KdvsizFiyat);
        System.out.println("Kdv Tutarı : " + KdvMiktari);
        System.out.println("Kdvli Fiyat : " + KdvliFiyat);

    }
}