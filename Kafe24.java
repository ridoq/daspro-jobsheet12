import java.util.Scanner;
public class Kafe24 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member. dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE24 =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie GOreng - Rp 18.000");
        System.out.println("===============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, double promo){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = (int)((hargaItems[pilihanMenu - 1] * banyakItem) * (1 - promo));

        return hargaTotal;
    } 
    public static double hitungPromo(String kodePromo, Scanner sc){
        if (kodePromo.equals("DISKON50")) {
            return 0.50;
        } else if (kodePromo.equals("DISKON30")) {
            return 0.30;
        } else {
            return 0.0;
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodePromo;

        Menu("Andi", true);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan banyak item: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        kodePromo = sc.nextLine();

        double promo = hitungPromo(kodePromo, sc);
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, promo);
        System.out.println("-".repeat(30));
        if (promo == 0.0) {
            System.out.println("Kode tidak valid.");
        } else {
            System.out.println("Diskon: " + (int)(promo * 100) + "%");
        }
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
        sc.close();
    }
}
