import java.util.Scanner;
public class RekapPenjualanKafe24 {
    //Fungsi untuk menginputkan data penjualan setiap menu untuk setiap hari 
    public static void IsianRekapPenjualan(int rekapPenjualan[][], String menu[], Scanner sc){
        for (int i = 0; i < rekapPenjualan.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu " + menu[i] + ":");
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                rekapPenjualan[i][j] = sc.nextInt();
            }
        }
    }
    
    // Fungsi untuk menampilkan seluruh data penjualan
    public static void TampilRekapPenjualan(int rekapPenjualan[][], String menu[]){
        System.out.println("\nRekap Penjualan KAFE24:");
        System.out.print("Menu\\Hari\t");
        for (int j = 0; j < rekapPenjualan[0].length; j++) {
            System.out.print("Hari " + (j + 1) + "\t");
        }
        System.out.println();
        System.out.println("-".repeat(35 * 2));
        for (int i = 0; i < rekapPenjualan.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].equalsIgnoreCase("Kopi") || menu[i].equalsIgnoreCase("Teh")) {
                System.out.print("\t");
            }
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                System.out.print(rekapPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-".repeat(35 * 2));
    }

    // Fungsi untuk menampilkan menu yang memiliki total penjualan tertinggi
    public static String MenuTerlaris(int rekapPenjualan[][], String menu[]){
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < rekapPenjualan.length; i++) {
            int totalPenjualanMenu = 0;
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                totalPenjualanMenu += rekapPenjualan[i][j];
            }
            if (totalPenjualanMenu > maxPenjualan) {
                maxPenjualan = totalPenjualanMenu;
                menuTerlaris = menu[i];
            }
        }
        return "Menu terlaris adalah " + menuTerlaris + " dengan total penjualan " + maxPenjualan + " item.";
    }
    
    //Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu selama tujuh hari (tampilkan nama menu dan nilai rata-ratanya).
    public static double RataRataPenjualan(int rekapPenjualan[][], int indexMenu){
        int totalPenjualanMenu = 0;
        for (int j = 0; j < rekapPenjualan[indexMenu].length; j++) {
            totalPenjualanMenu += rekapPenjualan[indexMenu][j];
        }
        return (double) totalPenjualanMenu / rekapPenjualan[indexMenu].length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[] = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int rekapPenjualan[][] = new int[5][7]; // 5 menu, 7 hari
        IsianRekapPenjualan(rekapPenjualan, menu, sc);
        TampilRekapPenjualan(rekapPenjualan, menu);
        String hasilMenuTerlaris = MenuTerlaris(rekapPenjualan, menu);
        System.out.println(hasilMenuTerlaris);
        System.out.println("\nRata-rata penjualan setiap menu selama 7 hari:");
        for (int i = 0; i < menu.length; i++) {
            double rataRata = RataRataPenjualan(rekapPenjualan, i);
            System.out.printf("%-25s: %.2f item%n", menu[i], rataRata);
        }
        sc.close();
    }
}
