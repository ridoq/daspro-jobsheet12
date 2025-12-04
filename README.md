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
    
---