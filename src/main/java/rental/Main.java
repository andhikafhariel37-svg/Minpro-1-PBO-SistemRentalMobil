/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. Panggil RentalService & RiwayatTransaksi
        RentalService rental = new RentalService();
        RiwayatTransaksi riwayat = new RiwayatTransaksi();

        int pilihan;

        // Perulangan program
        do {
            System.out.println("\n==============================");
            System.out.println("       RENTAL MOBIL");
            System.out.println("==============================");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Lihat Mobil");
            System.out.println("3. Ubah Mobil");
            System.out.println("4. Hapus Mobil");
            System.out.println("5. Tambah Penyewa");
            System.out.println("6. Lihat Penyewa");
            System.out.println("7. Tambah Transaksi");
            System.out.println("8. Lihat Riwayat Transaksi");
            System.out.println("9. Keluar");
            System.out.println("==============================");

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan enter

            // Percabangan switch
            switch (pilihan) {

                // ----------------------------------------------------
                // 1. CREATE MOBIL (Pakai Class Mobil & Kendaraan)
                // ----------------------------------------------------
                case 1:
                    System.out.println("\n--- TAMBAH MOBIL ---");
                    System.out.print("Merk mobil: ");
                    String merk = input.nextLine();

                    System.out.print("Nomor plat: ");
                    String plat = input.nextLine();

                    System.out.print("Harga sewa per hari: ");
                    int harga = input.nextInt();

                    System.out.print("Jumlah kursi: ");
                    int kursi = input.nextInt();
                    input.nextLine();

                    // Bikin objek Mobil (otomatis memanggil constructor Kendaraan via super)
                    Mobil mobil = new Mobil(merk, plat, harga, kursi);
                    
                    // Simpan ke RentalService
                    rental.tambahMobil(mobil);
                    break;

                // ----------------------------------------------------
                // 2. READ MOBIL
                // ----------------------------------------------------
                case 2:
                    System.out.println("\n--- DAFTAR MOBIL ---");
                    rental.tampilkanMobil();
                    break;

                // ----------------------------------------------------
                // 3. UPDATE MOBIL
                // ----------------------------------------------------
                case 3:
                    System.out.println("\n--- UBAH MOBIL ---");
                    rental.tampilkanMobil();

                    if (!rental.daftarMobil.isEmpty()) {
                        System.out.print("\nPilih nomor mobil yang diubah: ");
                        int nomor = input.nextInt();
                        input.nextLine();

                        System.out.print("Merk baru: ");
                        String merkBaru = input.nextLine();

                        System.out.print("Nomor plat baru: ");
                        String platBaru = input.nextLine();

                        System.out.print("Harga sewa baru: ");
                        int hargaBaru = input.nextInt();

                        System.out.print("Jumlah kursi baru: ");
                        int kursiBaru = input.nextInt();
                        input.nextLine();

                        Mobil mobilBaru = new Mobil(merkBaru, platBaru, hargaBaru, kursiBaru);
                        rental.ubahMobil(nomor - 1, mobilBaru);
                    }
                    break;

                // ----------------------------------------------------
                // 4. DELETE MOBIL
                // ----------------------------------------------------
                case 4:
                    System.out.println("\n--- HAPUS MOBIL ---");
                    rental.tampilkanMobil();

                    if (!rental.daftarMobil.isEmpty()) {
                        System.out.print("\nPilih nomor mobil yang dihapus: ");
                        int nomorHapus = input.nextInt();
                        input.nextLine();

                        rental.hapusMobil(nomorHapus - 1);
                    }
                    break;

                // ----------------------------------------------------
                // 5. TAMBAH PENYEWA (Pakai Class Penyewa)
                // ----------------------------------------------------
                case 5:
                    System.out.println("\n--- TAMBAH PENYEWA ---");
                    System.out.print("Nama penyewa: ");
                    String nama = input.nextLine();

                    System.out.print("No HP: ");
                    String noHp = input.nextLine();

                    // Bikin objek Penyewa
                    Penyewa penyewa = new Penyewa(nama, noHp);
                    
                    // Simpan ke RentalService
                    rental.tambahPenyewa(penyewa);
                    break;

                // ----------------------------------------------------
                // 6. LIHAT PENYEWA
                // ----------------------------------------------------
                case 6:
                    System.out.println("\n--- DAFTAR PENYEWA ---");
                    rental.tampilkanPenyewa();
                    break;

                // ----------------------------------------------------
                // 7. TRANSAKSI (Menghubungkan Mobil + Penyewa + Transaksi + Riwayat)
                // ----------------------------------------------------
                case 7:
                    System.out.println("\n--- TAMBAH TRANSAKSI ---");

                    if (rental.daftarMobil.isEmpty()) {
                        System.out.println("Belum ada data mobil. Tambahkan mobil dulu!");
                    } else if (rental.daftarPenyewa.isEmpty()) {
                        System.out.println("Belum ada data penyewa. Tambahkan penyewa dulu!");
                    } else {
                        System.out.println("\nDaftar Mobil:");
                        rental.tampilkanMobil();
                        System.out.print("\nPilih nomor mobil: ");
                        int pilihMobil = input.nextInt();

                        System.out.println("\nDaftar Penyewa:");
                        rental.tampilkanPenyewa();
                        System.out.print("\nPilih nomor penyewa: ");
                        int pilihPenyewa = input.nextInt();

                        System.out.print("Lama sewa (hari): ");
                        int lamaSewa = input.nextInt();
                        input.nextLine();

                        // Ambil objek Mobil dan Penyewa yang dipilih dari ArrayList
                        Mobil mobilDipilih = rental.daftarMobil.get(pilihMobil - 1);
                        Penyewa penyewaDipilih = rental.daftarPenyewa.get(pilihPenyewa - 1);

                        // Gabungkan menjadi objek Transaksi
                        Transaksi transaksi = new Transaksi(mobilDipilih, penyewaDipilih, lamaSewa);
                        
                        // Simpan ke RiwayatTransaksi
                        riwayat.tambahTransaksi(transaksi);
                    }
                    break;

                // ----------------------------------------------------
                // 8. LIHAT RIWAYAT TRANSAKSI
                // ----------------------------------------------------
                case 8:
                    System.out.println("\n--- RIWAYAT TRANSAKSI ---");
                    riwayat.tampilkanTransaksi();
                    break;

                // ----------------------------------------------------
                // 9. KELUAR
                // ----------------------------------------------------
                case 9:
                    System.out.println("\nProgram selesai. Mantap!");
                    break;

                default:
                    System.out.println("\nMenu tidak tersedia!");
            }

        } while (pilihan != 9);

        input.close();
    }
}