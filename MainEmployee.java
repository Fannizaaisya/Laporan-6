package employee;
import java.util.Scanner;
public class MainEmployee {
     private static String nama,id, jabatan, istri, x;
    private static int anak, thmasuk, jam;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilian;
        do {
            System.out.println("=============================================");
            System.out.println("                 Rincian Gaji                ");
            System.out.println("=============================================");
            System.out.println("1. Manager");
            System.out.println("2. Pegawai Tetap");
            System.out.println("3. Pegawai Tidak Tetap");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilian = in.nextInt();
            switch (pilian) {
                case 1:
                    System.out.println("=============================================");
                    System.out.println("                  Manager                    ");
                    System.out.println("=============================================");
                    inputPNS();
                    Manager m = new Manager(nama, id, "Manager", 5000000, thmasuk);
                    m.manager(istri, anak);
                    m.total();
                    m.display();
                    System.out.println("=============================================");
                    break;
                case 2:
                    System.out.println("=============================================");
                    System.out.println("                 Pegawai Tetap               ");
                    System.out.println("=============================================");
                    inputPNS();
                    PegawaiTetap pt = new PegawaiTetap(nama, id, "Pegawai Tetap/PNS", 3000000, thmasuk);
                    pt.PT(istri, anak);
                    pt.total();
                    pt.display();
                    System.out.println("=============================================");
                    break;
                case 3:
                    System.out.println("=============================================");
                    System.out.println("             Pegawai Tidak Tetap             ");
                    System.out.println("=============================================");
                    inputNonPns();
                    PegawaiTidakTetap ptt = new PegawaiTidakTetap(nama, id, "Pegawai Tidak Tetap/Non PNS", 
                            3000000, thmasuk, jam);
                    ptt.display();
                    System.out.println("=============================================");
                    break;
                case 4:
                    break;
                default:
                    System.err.println("Menu tidak tersedia!");
            }
        } while (pilian != 4);
    }
    private static void inputPNS() {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.print("Masukkan Nama          : ");
        nama = in.nextLine();
        System.out.print("Masukkan ID Kerja      : ");
        id = in.nextLine();
        System.out.print("Mempunyai Istri? (y/n) : ");
        istri = in.nextLine();
        if (istri.equalsIgnoreCase("y")) {
            System.out.print("Mempunyai Anak? (y/n)  : ");
            x = in.nextLine();
            if (x.equalsIgnoreCase("y")) {
            System.out.print("Masukkan Jumlah Anak   : ");
                anak = in1.nextInt();
            } else {
                anak = 0;
            }
        }else{
            anak =0;
        }
        System.out.print("Tahun Masuk Kerja?     : ");
        thmasuk = in1.nextInt();
        System.out.println("=============================================");
    }
    private static void inputNonPns() {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.print("Masukkan Nama      : ");
        nama = in.nextLine();
        System.out.print("Masukkan ID Kerja  : ");
        id = in.nextLine();
        System.out.print("Masukkan Jam Kerja : ");
        jam = in1.nextInt();
        System.out.print("Tahun Masuk Kerja? : ");
        thmasuk = in1.nextInt();
        System.out.println("=============================================");
    }
}