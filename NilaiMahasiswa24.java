import java.util.Scanner;

public class NilaiMahasiswa24 {
    // fungsi isian array
    public static void IsianArray(int nilaiMatkulA[], Scanner sc){
        System.out.println("-".repeat(30));
        System.out.println("Masukkan nilai mahasiswa untuk mata kuliah A:");
        for (int i = 0; i < nilaiMatkulA.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMatkulA[i] = sc.nextInt();
        }
    }

    // fungsi menampilkan array
    public static void TampilArray(int nilaiMatkulA[]){
        System.out.println("-".repeat(30));
        System.out.println("Nilai Mahasiswa Mata Kuliah A:");
        for (int i = 0; i < nilaiMatkulA.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMatkulA[i]);
        }
    }

    // fungsi menghitung total nilai
    public static int HitTot(int nilaiMatkulA[]){
        int totalNilai = 0;
        for (int i = 0; i < nilaiMatkulA.length; i++) {
            totalNilai += nilaiMatkulA[i];
        }
        return totalNilai;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();
        int nilaiMatkulA[] = new int[jmlMahasiswa];
        IsianArray(nilaiMatkulA, sc);
        TampilArray(nilaiMatkulA);
        int totalNilai = HitTot(nilaiMatkulA);
        System.out.println("-".repeat(30));
        System.out.println("Total nilai semua mahasiswa: " + totalNilai);
        sc.close();
    }
}
