package employee;

public class PegawaiTetap extends Employee {
    double total;
    private String istri;
    private int anak;
    public PegawaiTetap(String nama, String id, String jabatan, double gaji, int thmasuk) {
        super(nama, id, jabatan, gaji, thmasuk);
        super.setTunjanganBonus();
    }
    public void PT(String istri, int anak) {
        this.istri = istri;
        this.anak = anak;
    }
    public void total() {
        total = super.getGaji() + super.tunjangIstri(istri) + super.tunjangAnak(anak)
                + super.getBonus() + super.getTunjangan();
    }
    public void display() {
        super.display();
        System.out.println("---------------------------------------------");
        System.out.printf("%s%.2f\n", "Total Gaji : Rp.", total);
    }
}