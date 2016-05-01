package employee;
public class Employee {
    private String nama, id, jabatan, istri;
    private int anak, thmasuk, lamakerja;
    private double tunjangan, bonus, gaji;
    public Employee(String nama, String id, String jabatan, double gaji, int thmasuk) {
        this.nama = nama;
        this.id = id;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.thmasuk = thmasuk;
        lamakerja = 2016 - thmasuk;
    }
    public String getNama() {
        return nama;
    }
    public String getID() {
        return id;
    }
    public String getJabatan() {
        return jabatan;
    }
    public String getIstri() {
        return istri;
    }
    public int getAnak() {
        return anak;
    }
    public int getTahunMasuk() {
        return thmasuk;
    }
    public int getLamaKerja() {
        return lamakerja;
    }
    public double getTunjangan() {
        return tunjangan;
    }
    public double getBonus() {
        return bonus;
    }
    public double getGaji() {
        return gaji;
    }
    public void setTunjanganBonus() {
        if (lamakerja >= 1 && lamakerja < 5) {
            this.tunjangan = 0;
            this.bonus = 0;
        } else if (lamakerja > 5 && lamakerja <= 10) {
            this.tunjangan = 0;
            this.bonus = 0.05 * lamakerja;
        } else if (lamakerja > 10) {
            this.tunjangan = 0.1 * lamakerja;
            this.bonus = 0.1 * lamakerja;
        }
    }
    public double tunjangIstri(String istri) {
        this.istri = istri;
        double tIstri;
        if (istri.equalsIgnoreCase("ada")) {
            tIstri = 0.1 * (gaji + lamakerja + tunjangan);
        } else {
            tIstri = 0;
        }
        return tIstri;
    }
    public double tunjangAnak(int anak) {
        this.anak = anak;
        double tAnak;
        if (anak >= 0 || anak <= 3) {
            tAnak = anak * (0.15 * (gaji + lamakerja + tunjangan));
        } else {
            tAnak = 3 * (0.15 * (gaji + lamakerja + tunjangan));
        }
        return tAnak;
    }
    public void display() {
        System.out.println("=============================================");
        System.out.println("           Rincian Data Karyawan : ");
        System.out.println("=============================================");
        System.out.println("Nama        : " + getNama());
        System.out.println("Jabatan     : " + getJabatan());
        System.out.println("Id Kerja    : " + getID());
        System.out.println("Istri       : " + getIstri());
        System.out.println("Jumlah Anak : " + getAnak());
        System.out.println("Tahun Masuk : " + getTahunMasuk());
        System.out.println("Lama Kerja  : " + getLamaKerja());
        System.out.println("=============================================");
        System.out.println("           Rincian Gaji Karyawan : ");
        System.out.println("=============================================");
        System.out.printf("%s%.2f\n", "Gaji              : Rp. ", getGaji());
        System.out.printf("%s%.2f\n", "Bonus             : RP. ", getBonus());
        System.out.printf("%s%.2f\n", "Tunjangan         : Rp. ", getTunjangan());
        System.out.printf("%s%.2f\n", "Tunjangan Anak    : Rp. ", tunjangAnak(anak));
        System.out.printf("%s%.2f\n", "Tunjangan Istri   : Rp. ", tunjangIstri(istri));
    }
}

