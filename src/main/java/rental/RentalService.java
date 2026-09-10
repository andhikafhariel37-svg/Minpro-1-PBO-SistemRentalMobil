/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

import java.util.ArrayList;

/**
 *
 * @author User
 */

public class RentalService {

    ArrayList<Mobil> daftarMobil;
    ArrayList<Penyewa> daftarPenyewa;
    RiwayatTransaksi riwayat;

    public RentalService() {
        daftarMobil = new ArrayList<>();
        daftarPenyewa = new ArrayList<>();
        riwayat = new RiwayatTransaksi();
    }

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
        System.out.println("Mobil berhasil ditambahkan!");
    }

    public void tampilkanMobil() {

        if (daftarMobil.isEmpty()) {
            System.out.println("Belum ada data mobil.");
        } else {

            for (int i = 0; i < daftarMobil.size(); i++) {
                System.out.println("\nMobil ke-" + (i + 1));
                daftarMobil.get(i).tampilkanData();
            }
        }
    }

    public void ubahMobil(int nomor, Mobil mobilBaru) {

        if (nomor >= 0 && nomor < daftarMobil.size()) {
            daftarMobil.set(nomor, mobilBaru);
            System.out.println("Mobil berhasil diubah!");
        } else {
            System.out.println("Nomor mobil tidak ditemukan.");
        }
    }

    public void hapusMobil(int nomor) {

        if (nomor >= 0 && nomor < daftarMobil.size()) {
            daftarMobil.remove(nomor);
            System.out.println("Mobil berhasil dihapus!");
        } else {
            System.out.println("Nomor mobil tidak ditemukan.");
        }
    }

    public void tambahPenyewa(Penyewa penyewa) {
        daftarPenyewa.add(penyewa);
        System.out.println("Penyewa berhasil ditambahkan!");
    }

    public void tampilkanPenyewa() {

        if (daftarPenyewa.isEmpty()) {
            System.out.println("Belum ada data penyewa.");
        } else {

            for (int i = 0; i < daftarPenyewa.size(); i++) {
                System.out.println("\nPenyewa ke-" + (i + 1));
                daftarPenyewa.get(i).tampilkanData();
            }
        }
    }
}