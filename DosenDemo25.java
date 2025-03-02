import java.util.Scanner;

public class DosenDemo25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine(); 

        Dosen25[] dosenArray = new Dosen25[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kelamin (true untuk Pria, false untuk Wanita): ");
            Boolean jenisKelamin = scanner.nextBoolean();
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 

            dosenArray[i] = new Dosen25(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\nInformasi Dosen:");
        for (Dosen25 dosen : dosenArray) {
            dosen.displayInfo();
        }

        DataDosen25 dataDosen = new DataDosen25();

        dataDosen.jumlahDosenPerJenisKelamin(dosenArray);
        dataDosen.rerataUsiaDosenPerJenisKelamin(dosenArray);
        dataDosen.infoDosenPalingTua(dosenArray);
        dataDosen.infoDosenPalingMuda(dosenArray);

        scanner.close();
    }
}
