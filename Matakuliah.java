public class Matakuliah {
    String kode;
    String nama;
    int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    void cetakInfo() {
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("SKS   : " + sks);
        System.out.println("--------------------------");
    }
}
