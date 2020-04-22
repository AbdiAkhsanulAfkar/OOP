public class data_mahasiswa {

    public data_mahasiswa() {
        NIM = "";
        Nama = "";
        Kelas = "";

    }

    public data_mahasiswa(String NIM, String Nama, String Kelas ) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Kelas = Kelas;

    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String ambilNIM() {
        return NIM;
    }

    public String ambilNama() {
        return Nama;
    }

    public String ambilKelas() {
        return Kelas;
    }

    private String NIM;
    private String Nama;
    private String Kelas;
}