import java.util.Scanner;
public class RekapPenjualanKafe24 {
    //Fungsi untuk menginputkan data penjualan setiap menu untuk setiap hari 
    public static void IsianRekapPenjualan(int rekapPenjualan[][], String menu[], Scanner sc){
        System.out.println("=".repeat(35 * 2));
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
        System.out.println("=".repeat(35 * 2));
        System.out.println("Rekap Penjualan KAFE24:");
        System.out.printf("%-20s","Menu\\Hari");
        for (int j = 0; j < rekapPenjualan[0].length; j++) {
            System.out.printf("%-10s", "Hari " + (j + 1));
        }
        System.out.println();
        System.out.println("-".repeat(35 * 2));
        for (int i = 0; i < rekapPenjualan.length; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                System.out.printf("%-10d", rekapPenjualan[i][j]);
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

    //fungsi input nama menu
    public static String[] InputNamaMenu(Scanner sc, int jmlMenu){
        String menu[] = new String[jmlMenu];
        System.out.println("MASUKKAN NAMA MENU KAFE:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
        return menu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Hari: ");
        int jmlHari = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine(); 
        System.out.println("=".repeat(35 * 2));
        String menu[] = InputNamaMenu(sc, jmlMenu);
        int rekapPenjualan[][] = new int[jmlMenu][jmlHari];

        IsianRekapPenjualan(rekapPenjualan, menu, sc);
        TampilRekapPenjualan(rekapPenjualan, menu);
        
        String hasilMenuTerlaris = MenuTerlaris(rekapPenjualan, menu);
        System.out.println(hasilMenuTerlaris);
        System.out.println("=".repeat(35 * 2));
        System.out.println("Rata-rata penjualan setiap menu selama " + jmlHari + " hari:");
        for (int i = 0; i < menu.length; i++) {
            double rataRata = RataRataPenjualan(rekapPenjualan, i);
            System.out.printf("%-25s: %.2f item%n", menu[i], rataRata);
        }
        sc.close();
    }
}
