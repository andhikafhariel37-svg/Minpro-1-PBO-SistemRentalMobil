/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author User
 */

public class Mobil extends Kendaraan {

    int jumlahKursi;

    public Mobil(String merk, String nomorPlat, int hargaSewa, int jumlahKursi) {
        super(merk, nomorPlat, hargaSewa);
        this.jumlahKursi = jumlahKursi;
    }

    public void tampilkanData() {
        System.out.println("Merk         : " + merk);
        System.out.println("Nomor Plat   : " + nomorPlat);
        System.out.println("Harga Sewa   : Rp" + hargaSewa);
        System.out.println("Jumlah Kursi : " + jumlahKursi);
    }
}