import java.util.Scanner;
public class HitungBalok24 {
    //fungsi hitung luas balok
    public static int HitungLuas(int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }

    //fungsi hitung volume balok
    public static int HitungVolume(int tinggi, int a, int b){
        int volume = HitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;
        
        System.out.println("Masukkan panjang: ");
        p = sc.nextInt();

        System.out.println("Masukkan lebar: ");
        l = sc.nextInt();

        System.out.println("Masukkan tinggi: ");
        t = sc.nextInt();

        L = HitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah: " + L);
        vol = HitungVolume(t, p, l);
        System.out.println("Volume Balok adalah: " + vol);
        sc.close();
    }
}
