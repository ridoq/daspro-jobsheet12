public class PengunjungCafe24 {
    public static void DaftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
        DaftarPengunjung("Ali", "Budi", "Citra");
        DaftarPengunjung("Andi");
        DaftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
