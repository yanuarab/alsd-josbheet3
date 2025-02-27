public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Mahasiswa25[] arrayOfMahasiswa = new Mahasiswa25[3];
        
        arrayOfMahasiswa[0] = new Mahasiswa25();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa25();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa25();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("===================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("NIM    : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama   : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas  : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK    : " + arrayOfMahasiswa[i].ipk);
            System.out.println("-----------------------------------");
        }
    }
}
