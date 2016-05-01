package employee;

public class PegawaiTidakTetap extends Employee{
    private double gajilembur;
    public PegawaiTidakTetap(String nama, String id, String jabatan, double gaji, int thmasuk, int jam) {
        super(nama, id, jabatan, gaji, thmasuk);
        gajiLembur(jam);
    }
    public void gajiLembur(int jam) {
        if (jam <= 10) {
            gajilembur = 0;
        } else {
            gajilembur = (jam - 10) * 10000;
        }
    }
    public void display() {
        System.out.println("=============================================");
        System.out.println("           Rincian Data Karyawan : ");
        System.out.println("=============================================");
        System.out.println("Nama        : " + super.getNama());
        System.out.println("Jabatan     : " + super.getJabatan());
        System.out.println("Id Kerja    : " + super.getID());
        System.out.println("Tahun Masuk : " + super.getTahunMasuk());
        System.out.println("Lama Kerja  : " + super.getLamaKerja());
        System.out.println("=============================================");
        System.out.println("           Rincian Gaji Karyawan : ");
        System.out.println("=============================================");
        System.out.printf("%s%.2f\n", "Gaji         : Rp. ", super.getGaji());
        System.out.printf("%s%.2f\n", "Gaji Lembur  : Rp. ", gajilembur);
        System.out.println("=============================================");
        System.out.printf("%s%.2f\n", "Total Gaji : Rp.", (super.getGaji() + gajilembur));
    }
}
