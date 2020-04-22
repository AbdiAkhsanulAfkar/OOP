import java.util.List;
import java.util.Scanner;

public class mainApp {

    public void hapus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Urutan data yang dihapus: ");
        int index = Integer.parseInt(scan.nextLine());
        Method.hapus(index - 1);
    }

    public void ubah() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Data keberapa yang akan diubah: ");
        int index = Integer.parseInt(scan.nextLine());
        System.out.println("==========================");
        System.out.print("Nim       : ");
        String nim = scan.nextLine();
        System.out.print("Nama      : ");
        String nama = scan.nextLine();
        System.out.print("Kelas     : ");
        String kelas = scan.nextLine();
        Method.ubah(new data_mahasiswa(nim, nama, kelas), index - 1);
    }

    public void lihat() {
        List<data_mahasiswa> result = Method.ambilList();
        if (result.isEmpty()) {
            System.out.println("\nTidak Ada Data yang direkam");
        } else {
            for (int i = 0; i < result.size(); i++) {
                System.out.println();
                System.out.println("Data ke-" + (i + 1));
                System.out.println("  Nim       : " + result.get(i).ambilNIM());
                System.out.println("  Nama      : " + result.get(i).ambilNama());
                System.out.println("  Kelas     : " + result.get(i).ambilKelas());

            }
        }

    }

    public void tambah() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Nim : ");
        String nim = scan.nextLine();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        Method.tambah(new data_mahasiswa(nim, nama, kelas));
    }

    public void Menu() {
        System.out.println("==========================");
        System.out.println("Aplikasi Data Mahasiswa");
        System.out.println("==========================");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Ubah Data Mahasiswa");
        System.out.println("3. Hapus Data Mahasiswa");
        System.out.println("4. Lihat Data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        mainApp app = new mainApp();
        for (int i = 1; i >= 1; i++) {
            app.Menu();
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("tambah Data");
                    app.tambah();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Ubah Data");
                    app.ubah();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Hapus Data");
                    app.hapus();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Lihat Data");
                    app.lihat();
                    System.out.println("");
                    break;
                case 5:
                    return;
            }
        }
    }

}
