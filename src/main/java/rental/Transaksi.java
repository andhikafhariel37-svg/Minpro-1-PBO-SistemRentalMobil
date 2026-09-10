package rental;

public class Transaksi {

    Mobil mobil;
    Penyewa penyewa;
    int lamaSewa;
    int totalHarga;

    public Transaksi(Mobil mobil, Penyewa penyewa, int lamaSewa) {
        this.mobil = mobil;
        this.penyewa = penyewa;
        this.lamaSewa = lamaSewa;
        this.totalHarga = mobil.hargaSewa * lamaSewa;
    }

    public void tampilkanData() {
        System.out.println("Penyewa     : " + penyewa.nama);
        System.out.println("Mobil       : " + mobil.merk);
        System.out.println("Nomor Plat  : " + mobil.nomorPlat);
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Total Harga : Rp" + totalHarga);
    }
}