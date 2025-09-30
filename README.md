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


<img width="1154" height="551" alt="image" src="https://github.com/user-attachments/assets/34cd32cd-c655-4919-9d91-51923dbdbc3b" />


<img width="1131" height="518" alt="image" src="https://github.com/user-attachments/assets/d5180a96-a53e-4b70-93cd-fccdb6050b0e" />





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
   
Pada class Pasien dan Psikolog, method info() menggunakan Override untuk menambahkan data khusus masing-masing, seperti keluhan pada Pasien dan spesialis untuk Psikolog. Dengan override, subclass bisa menampilkan informasi tambahan sesuai kebutuhan, tapi tetap memakai data dasar dari superclass Orang.



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
<img width="554" height="365" alt="image" src="https://github.com/user-attachments/assets/562f9e16-afea-4423-8070-6cc9387260fe" />



📝 Data 2
<img width="721" height="373" alt="image" src="https://github.com/user-attachments/assets/05c05a2e-1ec1-4b4d-a98e-599c2505d5fa" />


📝Data 3
<img width="752" height="359" alt="image" src="https://github.com/user-attachments/assets/b22f9991-0c7d-44db-b1ad-9cf14fef71c5" />



Setelah memilih menu Tambah Data Konsultasi(menu 1), pengguna memasukkan data pasien, psikolog, serta jadwal konsultasi. Data tersebut disimpan ke sistem dan ditampilkan kembali sebagai konfirmasi, lalu muncul pesan “Data berhasil ditambahkan!” sebagai tanda bahwa penyimpanan berhasil.


## 2. Tampilkan Data Konsultasi 
<img width="457" height="188" alt="image" src="https://github.com/user-attachments/assets/f8882d1a-a22b-4bf6-b82b-32de33c8e690" />


Disini pengguna menginput angka 2, maka akan menampilkan  seluruh data konsultasi yang ada dalam sistem. 



<img width="596" height="798" alt="image" src="https://github.com/user-attachments/assets/8027d86f-ff63-417d-9bb2-18c09576ee2d" />



Pada menu Tampilkan Data Konsultasi, program menampilkan semua data yang tersimpan, mulai dari ID, nama dan umur pasien, keluhan, nama dan umur psikolog, spesialisasi, hingga jadwal konsultasi. Data ditampilkan satu per satu agar lebih jelas dan mudah dibaca.


## 3. Perbarui Data Konsultasi
<img width="519" height="255" alt="image" src="https://github.com/user-attachments/assets/6ddafa5b-6412-4418-904d-ca51188910c3" />




Pada menu Perbarui Data Konsultasi, data dengan ID 3 milik pasien Dewi Lestari diperbaiki jadwalnya  karna terdapat kesalahan input sebelumnya dari 29-02025 menjadi 29-09-2025, lalu sistem menampilkan pesan “Data diupdate” sebagai konfirmasi bahwa proses pembaruan data berhasil dilakukan.


Sebelum Data  ke-3  diperbarui:

<img width="496" height="211" alt="image" src="https://github.com/user-attachments/assets/e1ed6100-cfde-42df-b0c2-1d1c34cc9d18" />



Setelah Data ke-3 diperbarui:

<img width="492" height="216" alt="image" src="https://github.com/user-attachments/assets/cf133d9f-9acc-421c-beb8-810d998b7f09" />






## 4. Hapus Data Konsultasi 
<img width="608" height="237" alt="image" src="https://github.com/user-attachments/assets/f3b4ed43-faaf-449c-bb25-790a5e64e47a" />



Disini pengguna memilih menu program hapus data konsultasi (menu 4). Setelah memasukkan ID 3,  program akan menghapus data konsultasi pada urutan tersebut dari sistem. Setelah proses selesai, program menampilkan pesan konfirmasi bahwa data nomor 3 berhasil dihapus.


<img width="575" height="601" alt="image" src="https://github.com/user-attachments/assets/aa865048-2d47-4a25-a1c7-ec1172719484" />



Pengguna ingin memastikan data benar terhapus atau tidak. Dan pada tampilan diatas data dengan ID 3  berhasil dihapus dari sistem.


## 5. Cari Data Konsultasi 

<img width="561" height="246" alt="image" src="https://github.com/user-attachments/assets/bc23b755-869f-4d7a-aeb1-9bb7554e6d24" />

Pengguna memilih Cari Data Konsultasi (menu 5 ). Kemudian pengguna memasukkan nama pasien "Inar". Setelah sistem melakukan pencarian, tidak ada data pasien dengan nama tersebut yang tersimpan. Karena itu, program menampilkan pesan "Data tidak ditemukan".


<img width="608" height="403" alt="image" src="https://github.com/user-attachments/assets/18e2072f-feb1-45c8-8de5-ea6af8f58d0c" />


Disini sistem terdapat fitur cari data pasien. Pada tampilan diatas pengguna ingin mencari data pasien yang bernama Danie tetapi pengguna hanya menginputkan Dan,maka otomatis hanya data dengan nama Danie yang akan ditampilkan. Proses pencarian data menjadi lebih cepat dan mudah.

## 6. Keluar
<img width="770" height="340" alt="image" src="https://github.com/user-attachments/assets/e0e91fef-6efd-4dca-ac2e-f8630f05cd68" />




Jika user memilih menu program 6 yaitu keluar, maka seluruh kegiatan program akan berhenti dan program selesai digunakan.









