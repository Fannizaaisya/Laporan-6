package employee;

public class Manager extends Employee{
    private double total, tunjanganjabatan;
    private String istri;
    private int anak;

    public Manager(String nama, String id, String jabatan, double gaji, int thmasuk) {
        super(nama, id, jabatan, gaji, thmasuk);
        super.setTunjanganBonus();
    }
    public void manager(String istri, int anak) {
        this.istri = istri;
        this.anak = anak;
    }

    public double tunjanganJabatan() {
        tunjanganjabatan = 0.1 * (super.getTunjangan() + super.getGaji() + super.getLamaKerja());
        return tunjanganjabatan;
    }

    public void total() {
        total = super.getGaji() + super.tunjangIstri(istri) + super.tunjangAnak(anak) + super.getBonus() + super.getTunjangan();
        tunjanganJabatan();
    }

    ;
    public void display() {
        super.display();
        System.out.printf("%s%.2f\n", "Tunjangan Jabatan : Rp. ", tunjanganJabatan());
        System.out.println("=============================================");
        System.out.printf("%s%.2f\n", "Total Gaji : Rp.", total);
    }
}
