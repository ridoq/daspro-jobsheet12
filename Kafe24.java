import java.util.Scanner;
public class Kafe24 {

    public static void Menu(String namaPelanggan, String menu[], int hargaMenu[]){
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        System.out.println("===== MENU RESTO KAFE24 =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + hargaMenu[i]);
        }
        System.out.println("===============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int HitungTotalHarga(int pilihanMenu[], int banyakItem[], int hargaMenu[], double promo){
        int hargaTotal = 0;
        for (int i = 0; i < pilihanMenu.length; i++) {
            if (pilihanMenu[i] == 0) {
                break;
            }
            int indexMenu = pilihanMenu[i] - 1;
            hargaTotal += hargaMenu[indexMenu] * banyakItem[i];
        }
        hargaTotal = (int)(hargaTotal * (1 - promo));
        return hargaTotal;
    } 
    public static double HitungPromo(String kodePromo, Scanner sc){
        if (kodePromo.equals("DISKON50")) {
            return 0.50;
        } else if (kodePromo.equals("DISKON30")) {
            return 0.30;
        } else {
            return 0.0;
        }
    } 

    public static void Pesan(int pilihanMenu[], int banyakItem[], String menu[], Scanner sc){
        int i = 0;
        boolean lanjutPesan = false;
        do{
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan (max 6 pesanan): ");
            pilihanMenu[i] = sc.nextInt();
            if (pilihanMenu[i] > menu.length || pilihanMenu[i] < 1) {
                System.out.println("Menu tidak tersedia.");
                continue;
            }
            System.out.print("Masukkan banyak item: ");
            banyakItem[i] = sc.nextInt();
            if (banyakItem[i] < 1) {
                System.out.println("Jumlah item tidak valid.");
                continue;
            }
            i++;
            if (i < menu.length) {
                System.out.print("Apakah anda ingin memesan menu lain? (ketik y jika iya): ");
                String lanjut = sc.next();
                if(lanjut.equalsIgnoreCase("y") || lanjut.equalsIgnoreCase("ya")|| lanjut.equalsIgnoreCase("iya")){
                    lanjutPesan = true;
                }else{
                    lanjutPesan = false;
                }
            }
        }while(lanjutPesan && i < menu.length);
    }

    public static void RincianPesanan(int pilihanMenu[], int banyakItem[], String menu[], int hargaMenu[], int totalHargaPesanan){
        System.out.println("=".repeat(30));
        System.out.println("Rincian Pesanan Anda:");
        for (int i = 0; i < pilihanMenu.length; i++) {
            if (pilihanMenu[i] == 0) {
                break;
            }
            int indexMenu = pilihanMenu[i] - 1;
            System.out.println(menu[indexMenu] + " x " + banyakItem[i] + " = Rp " + (hargaMenu[indexMenu] * banyakItem[i]));
            totalHargaPesanan += hargaMenu[indexMenu] * banyakItem[i];
        }
        System.out.println("-".repeat(30));
        System.out.println("Total harga pesanan (sebelum diskon): Rp " + totalHargaPesanan);
    }

    public static void main(String[] args) {
        //deklarasi ulala
        Scanner
        sc = new Scanner(System.in);
        String
        kodePromo,
        menu[] = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};
        int
        totalHargaPesanan = 0,
        pilihanMenu[] = new int[menu.length], banyakItem[] = new int[menu.length],
        hargaMenu[] = {15000, 20000, 22000, 12000, 10000, 18000};

        //pemanggilan method ulala
        Menu("Andi", menu, hargaMenu);
        Pesan(pilihanMenu, banyakItem, menu, sc);
        //code kodepromo ulala
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        kodePromo = sc.nextLine();
        double promo = HitungPromo(kodePromo, sc);
        int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem,hargaMenu, promo);
        //pemanggilan rincian pesanan ulala + output akhir ulala
        RincianPesanan(pilihanMenu, banyakItem, menu, hargaMenu, totalHargaPesanan);
        //output akhir uye
        if (promo == 0.0) {
            System.out.println("Diskon: Kode tidak valid");
        } else {
            System.out.println("Diskon: " + (int)(promo * 100) + "%");
        }
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
        System.out.println("=".repeat(30));
        sc.close();
    }
}
