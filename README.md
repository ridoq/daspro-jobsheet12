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

#   Percobaan 2 : Membuat Fungsi Dengan Parameter

---

##  Soal

1.  Apakah kegunaan parameter di dalam fungsi?  
2.  Jelaskan mengapa pada percobaan ini fungsi _Menu()_ menggunakan parameter _namaPelanggan_ dan _isMember_? 
3.  Apakah parameter sama dengan variabel? Jelaskan. 

---

##  Jawaban

1.  Parameter digunakan untuk mengirim data dari luar fungsi ke dalam fungsi, supaya fungsi bisa bekerja berdasarkan nilai yang diberikan.
2.  Karena _function Menu(parameter)_ membutuhkan informasi tambahan supaya outputnya personalisasi, jadi ketika _function Menu(parameter)_ dipanggil ouputnya akan _flexible_
3.  Parameter dan variale mirip namun tidak sama:
    -   parameter dideklarasikan di definisi fungsi, sedangkan variable dideklarasikan di dalam blok code(funsi, loop, dll)
    -   fungsi parameter untuk menerima nilai dari luar fungsi, sedangkan variable untuk menyimpan data sementara di dalam program

---

#   Percobaan 3 : Membuat Fungsi dengan Nilai Kembalian

---

##  Soal

1.  Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2.  Fungsi _hitungTotalHargaNoAbsen_ saat ini mengembalikan total harga berdasarkan _pilihanMenu_ dan _jumlahPesanan_. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
3.  Modifikasi kode di atas sehingga fungsi _hitungTotalHarga_ dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari _totalHarga_ dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari _totalHarga_ dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga _totalHarga_.
4.  Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)? 

---

##  Jawaban

1.  Fungsi butuh nilai kembalian (return value) kalau fungsi harus menghasilkan suatu nilai dan nilai itu mau dipake lagi di luar fungsi, contohnya adalah fungsi _hitungTotalharga(parameter)_. Lalu fungsi tidak perlu return value (void) kalau fungsi cuma melakukan aksi (misal: print tampilan), bukan menghitung sesuatu, contoh adalah fungsi _Menu()_.
2.  Tipe data nilai kembalian nya adalah *int*, karena fungsi mengembalikan total harga dalam bentuk angka bulat. Lalu dua parameter:
    -   int _pilihanMenu_ adalah nomor menu yang dipilih user (1 = kopi hitam, 2 = cappuccino, dst).
    -   int _jumlahPesanan_ adalah banyak item yang dipesan user untuk menu tersebut.
3.  done✅
4.  done✅

---

#   Percobaan 4 : Fungsi Varargs

---

##  Soal

1.  Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan _String... namaPengunjung_!
2. Modifikasi method _daftarPengunjung_ menggunakan _for-each_ loop.
3. Bisakah menggunakan dua tipe data _varaargs_ dalam satu fungsi? Jelaskan jawaban
Anda berdasarkan aturan _varargs_ di Java, dan berikan contohnya!
4. Jelaskan apa yang terjadi jika fungsi _daftarPengunjung_ dipanggil tanpa argumen.
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan?
Jika tetap berjalan, bagaimana output yang dihasilkan?

---

##  Jawaban

1.  Karena menggunakan varargs (...), itu artinya:
    -   method bisa nerima jumlah parameter yang fleksibel (boleh 1, 2, 10, bahkan 0 data sekaligus)
    -   juga di dalam method, namaPengunjung otomatis dianggap array
2.  done✅
3.  Tidak bisa. Java hanya boleh 1 varargs per method. Kenapa?
    -   Varargs berubah menjadi array
    -   Jika ada dua varargs, Java bingung memetakan parameter mana yang masuk ke varargs A atau varargs B. Karena itu aturan resmi Java: "Hanya boleh 1 varargs, dan harus berada di posisi paling terakhir."

---