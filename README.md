# PostTest4PBO



Isrina Luthfiah | 2409116003 | 

Sistem Informasi A'24

# DESKRIPSI SINGKAT PROGRAM
Sistem Konsultasi Psikolog merupakan program yang dibuat untuk mengatur dan mengelola data konsultasi antara pasien dan psikolog. Sistem ini berfungsi untuk menyimpan informasi penting seperti nama pasien,keluhan yang dialami, serta jadwal konsultasi yang telah ditentukan. 

Selain itu, sistem konsultasi juga menyediakan fitur untuk menampilkan kembali data yang sudah ada, memperbarui apabila terjadi perubahan, dan menghapus data yang tidak lagi diperlukan.Dengan adanya sistem ini, proses administrasi konsultasi menjadi lebih terstruktur, rapi, dan efisien, sehingga membantu psikolog maupun pengelola layanan dalam memberikan pelayanan yang lebih terorganisir kepada pasien.

# Package 
<img width="304" height="338" alt="Screenshot 2025-09-16 185600" src="https://github.com/user-attachments/assets/5f5c3f83-4866-4070-ba7a-63047e0b83ca" />


Sistem Konsultasi Psikolog ini memiliki tiga class utama, masing-masing diletakkan di package sesuai fungsinya:


▸Model (Konsultasi) Untuk Menyimpan data pasien seperti id, nama, keluhan, dan jadwal.

▸Service (KonsultasiService) Untuk Mengatur semua operasi data seperti tambah, lihat, ubah, hapus, dan cari data pasien.

▸Main (Main) Untuk Menampilkan menu dan menerima input dari pengguna.

# Abstraction 

<img width="282" height="376" alt="image" src="https://github.com/user-attachments/assets/1058a8a7-d1a0-47ce-8cbb-ddb8600e05bd" />

<img width="664" height="419" alt="image" src="https://github.com/user-attachments/assets/7e58d60d-94e4-4b1b-86b1-f3a326ad9e2b" />

Class Orang adalah class abstrak yang berisi atribut umum seperti nama dan umur. Class ini tidak bisa dibuat objek langsung, tapi menjadi dasar untuk class lain seperti Pasien dan Psikolog. Ada juga method abstrak info() yang harus diisi ulang oleh class turunannya. Abstraction ini dipakai supaya hal-hal umum ditaruh di satu tempat, sedangkan detailnya disesuaikan di class turunan.


# Interface

<img width="656" height="233" alt="image" src="https://github.com/user-attachments/assets/ca37eec0-9ab9-4796-bc2e-01daeb8ba135" />


AturJadwal adalah interface yang berisi aturan untuk mengatur dan mengambil jadwal. Interface hanya berisi nama method, tanpa isi. Class yang memakai interface ini wajib mengisi method sesuai kebutuhannya. Dengan cara ini, semua class yang berbeda bisa punya aturan yang sama.

# Hubungan Abstraction dan Interface

Abstraction dipakai untuk membuat dasar umum (misalnya class Orang), sedangkan interface dipakai untuk aturan khusus (misalnya atur jadwal konsultasi). Keduanya membuat program lebih rapi, mudah diatur, dan jelas fungsinya.


# Inheritance
<img width="372" height="139" alt="image" src="https://github.com/user-attachments/assets/864f91f4-7a2b-429d-838b-8965dc052de7" />




▸Package Model

Package Model berisi class Orang sebagai superclass dengan atribut dasar, lalu diturunkan ke subclass Pasien (atribut keluhan) dan Psikolog (atribut spesialis) sebagai penerapan inheritance. Selain itu, ada class Konsultasi untuk menyimpan data pasien, psikolog, dan jadwal konsultasi.

 
▸Service (KonsultasiService) 

Package Service berisi class KonsultasiService untuk mengelola data konsultasi. Di dalamnya ada operasi CRUD seperti menambah, melihat, mengupdate, mencari, dan menghapus data dengan penyimpanan menggunakan ArrayList agar lebih mudah dikelola.


▸Main (Main)

Package Main berisi class Main sebagai pusat jalannya program dan tempat interaksi pengguna. 

# Overriding 
<img width="1083" height="418" alt="image" src="https://github.com/user-attachments/assets/edb78328-b3b8-4f64-a0df-3aa5d990592f" />

1. Penerapan Override pada subclass Pasien

<img width="1074" height="354" alt="image" src="https://github.com/user-attachments/assets/ff961db1-7e59-4ec2-a32b-43407225d3d2" />

2. Penerapan Override pada subclass Psikolog
   

<img width="1102" height="455" alt="image" src="https://github.com/user-attachments/assets/83338da5-4f23-4473-9f4c-ffeec6c5ac45" />

3. Penerapan Override pada class Konsultasi


   
Pada class Pasien dan Psikolog, method info() menggunakan Override untuk menambahkan data khusus masing-masing, seperti keluhan pada Pasien dan spesialis untuk Psikolog. Dengan override, subclass bisa menampilkan informasi tambahan sesuai kebutuhan, tapi tetap memakai data dasar dari superclass Orang. Disini juga terjadi penambahan override pada class konsultasi.

# Overloading

<img width="809" height="289" alt="image" src="https://github.com/user-attachments/assets/6a14278c-824b-49bf-89e5-fa6eb81253ef" />

konsep overloading disini, yaitu Method searchData() dipakai untuk menerima input pencarian, lalu otomatis menyesuaikan  input berupa angka (ID pasien). Jika data cocok, informasi pasien ditampilkan, jika tidak muncul pesan “data tidak ditemukan”. Dengan overloading, program jadi lebih fleksibel dan mudah digunakan.




# PENJELASAN ALUR PROGRAM

## Menu Utama 
<img width="524" height="187" alt="image" src="https://github.com/user-attachments/assets/07a1e31c-6d10-4486-9aed-33d3ed9ea80c" />



Ketika program dijalankan, pengguna akan langsung masuk ke menu utama. 


<img width="561" height="212" alt="image" src="https://github.com/user-attachments/assets/09d3322c-3844-4c96-8252-c6a313d1d7d6" />

 Selanjutnya, pengguna diminta memasukkan angka sesuai dengan menu yang ingin dipilih seperti menambah, menampilkan, memperbarui, menghapus atau bahkan mencari data secara cepat.


<img width="523" height="244" alt="image" src="https://github.com/user-attachments/assets/e408d67c-06ff-41d4-9bbc-11ee3ec573aa" />


 Program meminta pengguna memasukkan angka antara 1 sampai 6 sesuai opsi yang ada. Disini pengguna menginput angka 8, sedangkan pilihan tidak ada di daftar menu. Karena itu, program menampilkan pesan "Pilihan tidak ada, coba lagi!". 


<img width="513" height="232" alt="image" src="https://github.com/user-attachments/assets/fd227f7d-9b55-4d7e-a6ed-d5781e3d55d5" />


Pengguna diminta untuk menginputkan ulang dengan benar, setelah itu akan masuk ke dalam daftar menu yang dipilih.

## 1. Tambah Data Konsultasi 

📝 Data 1
<img width="696" height="367" alt="image" src="https://github.com/user-attachments/assets/221c9659-903e-4ed8-9c7a-7403894d0444" />






📝 Data 2
<img width="729" height="379" alt="image" src="https://github.com/user-attachments/assets/69dcbd2d-445d-46d0-9db6-2dcf0bf1aef4" />




📝Data 3
<img width="740" height="403" alt="image" src="https://github.com/user-attachments/assets/54f5a7b0-91e1-4e3a-8eb0-b77870280cdf" />






Setelah memilih menu Tambah Data Konsultasi(menu 1), pengguna memasukkan data pasien, psikolog, serta jadwal konsultasi. Data tersebut disimpan ke sistem dan ditampilkan kembali sebagai konfirmasi, lalu muncul pesan “Data berhasil ditambahkan!” sebagai tanda bahwa penyimpanan berhasil.


## 2. Tampilkan Data Konsultasi 
<img width="703" height="192" alt="image" src="https://github.com/user-attachments/assets/e62de00a-4e59-4301-9190-04cbd5d91880" />





Disini pengguna menginput angka 2, maka akan menampilkan  seluruh data konsultasi yang ada dalam sistem. 



<img width="726" height="631" alt="image" src="https://github.com/user-attachments/assets/5aa72326-4c01-48c3-a909-866a4f232906" />





Pada menu Tampilkan Data Konsultasi, program menampilkan semua data yang tersimpan, mulai dari ID, nama dan umur pasien, keluhan, nama dan umur psikolog, spesialisasi, hingga jadwal konsultasi. Data ditampilkan satu per satu agar lebih jelas dan mudah dibaca.


## 3. Perbarui Data Konsultasi
<img width="692" height="260" alt="image" src="https://github.com/user-attachments/assets/ce883b9f-32f2-43b4-acdb-25736d535d93" />





Pada menu Perbarui Data Konsultasi, data dengan ID 3 milik pasien Dewi Lestari diperbaiki jadwalnya  karna terdapat kesalahan input sebelumnya dari 29-02025 menjadi 29-09-2025, lalu sistem menampilkan pesan “Data diupdate” sebagai konfirmasi bahwa proses pembaruan data berhasil dilakukan.


Sebelum Data  ke-3  diperbarui:

<img width="516" height="214" alt="image" src="https://github.com/user-attachments/assets/c99fd800-6b59-4971-8cc0-a86390a21536" />




Setelah Data ke-3 diperbarui:

<img width="529" height="232" alt="image" src="https://github.com/user-attachments/assets/d8a47857-60ff-4583-94ea-063b32dd1d20" />







## 4. Hapus Data Konsultasi 
<img width="477" height="233" alt="image" src="https://github.com/user-attachments/assets/b9eaad80-117b-402f-82b8-60829be1a5ef" />




Disini pengguna memilih menu program hapus data konsultasi (menu 4). Setelah memasukkan ID 2,  program akan menghapus data konsultasi pada urutan tersebut dari sistem. Setelah proses selesai, program menampilkan pesan konfirmasi bahwa data nomor 2 berhasil dihapus.


<img width="656" height="588" alt="image" src="https://github.com/user-attachments/assets/6a25bb39-0ca5-48a3-a1ee-d2cb36d98ae2" />




Pengguna ingin memastikan data benar terhapus atau tidak. Dan pada tampilan diatas data dengan ID 2  berhasil dihapus dari sistem.


## 5. Cari Data Konsultasi 

<img width="655" height="399" alt="image" src="https://github.com/user-attachments/assets/78fa0095-2d8e-41e2-bc6f-191c4e4e93e4" />



Didalam sistem konsultasi psikolog  terdapat fitur cari data pasien. Pada tampilan diatas pengguna ingin mencari data pasien dengan ID 2 ,maka otomatis hanya data dengan ID 2 dengan nama Siti Rahma yang akan ditampilkan. Proses pencarian data menjadi lebih cepat dan mudah dengan ID.

## 6. Keluar
<img width="673" height="346" alt="image" src="https://github.com/user-attachments/assets/6c7f3be0-9ba0-4407-88a9-3a4fea94f06e" />




Jika user memilih menu program 6 yaitu keluar, maka seluruh kegiatan program akan berhenti dan program selesai digunakan.









