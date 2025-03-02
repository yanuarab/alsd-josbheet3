public class DataDosen25 {

    public void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen25 dosen : arrayOfDosen) {
            dosen.displayInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("\nJumlah Dosen Per Jenis Kelamin:");
        System.out.println("Pria: " + jumlahPria);
        System.out.println("Wanita: " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, jumlahPria = 0, jumlahWanita = 0;

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        double rerataPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("\nRata-rata Usia Dosen Per Jenis Kelamin:");
        System.out.println("Pria: " + rerataPria);
        System.out.println("Wanita: " + rerataWanita);
    }

    public void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        Dosen25 dosenTua = arrayOfDosen[0];

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("\nInformasi Dosen Paling Tua:");
        dosenTua.displayInfo();
    }

    public void infoDosenPalingMuda(Dosen25[] arrayOfDosen) {
        Dosen25 dosenMuda = arrayOfDosen[0];

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }

        System.out.println("\nInformasi Dosen Paling Muda:");
        dosenMuda.displayInfo();
    }
}
