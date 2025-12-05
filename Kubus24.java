import java.util.Scanner;
public class Kubus24 {
    // Fungsi menghitung volume kubus
    public static int HitungVolume(int sisi){
        int volume = sisi * sisi * sisi;
        return volume;
    }
    
    // Fungsi menghitung luas permukaan kubus
    public static int HitungLuasPermukaan(int sisi){
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int volumeKubus = HitungVolume(sisi);
        int luasPermukaanKubus = HitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus: " + volumeKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaanKubus);

        sc.close();
    }
}
