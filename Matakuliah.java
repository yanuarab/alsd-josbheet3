public class Matakuliah {
    String kode;
    String nama;
    int sks, jumlahJam;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void cetakInfo() {
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("SKS   : " + sks);
        System.out.println("--------------------------");
    }
}
