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

public class RiwayatTransaksi {

    ArrayList<Transaksi> daftarTransaksi;

    public RiwayatTransaksi() {
        daftarTransaksi = new ArrayList<>();
    }

    public void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public void tampilkanTransaksi() {

        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {

            for (int i = 0; i < daftarTransaksi.size(); i++) {
                System.out.println("\nTransaksi ke-" + (i + 1));
                daftarTransaksi.get(i).tampilkanData();
            }
        }
    }
}