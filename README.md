#   Percobaan 1 : Membuat Fungsi Tanpa Parameter

---

##  Soal

1.  Apakah fungsi tanpa parameter selalu harus bertipe void?
2.  Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3.  Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
4.  Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).

---

##  Jawaban

1.  Tidak. Fungsi tanpa parameter tidak harus bertipe void. Yang penting adalah apakah fungsi tersebut mengembalikan nilai atau tidak. Jika mengembalikan nilai maka tidak pakai void, jika tidak mengembalikan nilai maka harus pake void
2.  Bisa, dengan cara memindahkan kode untuk print menu yang ada fdi _function menu()_ ke function _main_
3.  ada beberapa keuntungan yaitu
    -   kode menjadi lebih rapi, karena setiap fitur diletakkan di _function_ terendiri
    -   menghindari duplikasi kode, misal jika ingin memakai kode suatu fitur lebih dari satu, tidak perlu menulis ulang kode tersebut, kita hanya perlu memanggil kembali _function_ yang berkaitan
4.  berikut alurnya:
    -   Program mulai dari eksekusi fungsi _main()_.
    -   Di dalam _main()_, baris _Menu();_ dipanggil lalu dieksekusi.
    -   Java berpindah sementara ke fungsi _Menu()_.
    -   Semua _System.out.println()_ di dalam fungsi _Menu()_ dijalankan berurutan.
    -   Setelah semua baris selesai, fungsi _Menu()_ selesai dijalankan.
    -   Program kembali lagi ke _main()_ melanjutkan baris setelah pemanggilan _Menu()_.
    -   Karena tidak ada perintah lain, program berhenti.
    
---