Andhika Fhariel

NIM : 2509116083

1. Deskripsi Singkat

   Sistem Rental Mobil merupakan program berbasis Java yang berguna untuk mengelola data mobil, data penyewa, serta riwayat transaksi penyewaan mobil. Program ini dijalankan melalui console (terminal) dan memanfaatkan ArrayList untuk menyimpan seluruh data secara dinamis selama program berjalan.

   Sistem rental mobil ini menyediakan 9 pilihan menu utama yang mencakup pengolahan data mobil, penyewa, dan riwayat transaksi, yaitu:

Manajemen Mobil (CRUD)

- Tambah Mobil (Create) — Menambahkan data mobil baru ke sistem.

- Lihat Mobil (Read) — Menampilkan daftar seluruh mobil yang tersedia.

- Ubah Mobil (Update) — Memperbarui informasi data mobil.

- Hapus Mobil (Delete) — Menghapus data mobil dari daftar.

Manajemen Penyewa

- Tambah Penyewa — Mendaftarkan data pelanggan/penyewa baru.

- Lihat Penyewa — Menampilkan daftar pelanggan yang terdaftar.

Manajemen Transaksi

- Tambah Transaksi — Mencatat transaksi sewa mobil dengan menghubungkan data penyewa dan mobil.

- Lihat Riwayat Transaksi — Menampilkan seluruh riwayat transaksi yang pernah dibuat.

Lainnya

9. Keluar — Menghentikan perulangan dan menutup program.

2. Penjelasan Alur Program

   Ketika program dijalankan, sistem akan menampilkan Menu Utama yang terdiri dari pilihan menu pengelolaan Mobil, Penyewa, Transaksi, dan Keluar. Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia.

A. Menu Mobil
Menu Mobil digunakan untuk mengelola data mobil yang tersedia untuk disewa. Terdapat beberapa pilihan:

Tambah Mobil

Pengguna memasukkan merk, nomor plat, harga sewa per hari, dan jumlah kursi. Data kemudian disimpan ke dalam ArrayList.

Lihat Mobil

Sistem menampilkan seluruh data mobil yang telah tersimpan.

Ubah Mobil

Pengguna memilih data mobil yang ingin diubah, kemudian memasukkan data baru berupa merk, nomor plat, harga sewa, dan jumlah kursi.

Hapus Mobil

Pengguna memilih data mobil yang ingin dihapus, kemudian sistem menghapus data tersebut dari daftar.

B. Menu Penyewa
Menu Penyewa digunakan untuk mengelola data pelanggan yang melakukan penyewaan mobil. Terdapat beberapa pilihan:

Tambah Penyewa

Pengguna memasukkan nama penyewa dan nomor HP. Data kemudian disimpan ke dalam ArrayList.

Lihat Penyewa

Sistem menampilkan seluruh data penyewa yang telah tersimpan.

C. Menu Transaksi
Menu Transaksi digunakan untuk mengelola data transaksi penyewaan mobil. Terdapat beberapa pilihan:

Tambah Transaksi

Pengguna memilih mobil dan penyewa dari daftar yang tersedia, lalu memasukkan lama sewa (dalam hari). Sistem otomatis menghitung total biaya sewa dan menyimpannya ke dalam ArrayList riwayat transaksi.

Lihat Riwayat Transaksi

Sistem menampilkan seluruh riwayat penyewaan yang telah tercatat.

3. Dokumentasi Program

Menu Utama

berikut screnshoot tampilan menu utama yang menyediakan fitur untuk menambah, melihat, mengubah, dan menghapus data penyewaan.

   <img width="226" height="100" alt="image" src="https://github.com/user-attachments/assets/a686186f-58fb-4369-9730-7a444e0290df" />

4. Implementasi Program

4.1 Implementasi Menu Tambah Mobil

<img width="410" height="152" alt="image" src="https://github.com/user-attachments/assets/e1263ec9-6ff1-4663-b515-9deafec21217" />

4.2 Implementasi Menu Lihat Mobil

<img width="337" height="163" alt="image" src="https://github.com/user-attachments/assets/ac8e09bd-39ec-494f-b4bd-47e6b163b318" />

4.3 Implementasi Menu Ubah Mobil

<img width="323" height="209" alt="image" src="https://github.com/user-attachments/assets/200c6767-e4d2-4ab3-9d5d-5c1da82ea899" />

4.4 Implementasi Data Hapus Mobil

<img width="272" height="181" alt="image" src="https://github.com/user-attachments/assets/8a8c2bdf-1e22-46ee-9c47-ac912383768f" />

4.5 Implementasi Menu Tambah Penyewa

<img width="299" height="143" alt="image" src="https://github.com/user-attachments/assets/71d597f1-4b06-411a-8c8b-1d3904395a21" />

4.6 Implementasi Menu Lihat Penyewa

<img width="323" height="146" alt="image" src="https://github.com/user-attachments/assets/af7cd3ff-c140-4663-80e7-bb53a6e3f7d1" />

4.7 Implementasi Menu Tambah Transaksi

<img width="349" height="160" alt="image" src="https://github.com/user-attachments/assets/d255b4c2-ec12-479d-88f1-cbaf7e688d9c" />

4.8 Implementasi Menu Riwayat Transaksi

<img width="281" height="167" alt="image" src="https://github.com/user-attachments/assets/2f073d09-d26b-44f4-98b5-8340ed06b67f" />

4.9 Implementasi Menu Keluar

<img width="288" height="136" alt="image" src="https://github.com/user-attachments/assets/d2caa773-f807-4f6e-8794-ac02a91ccc5f" />
