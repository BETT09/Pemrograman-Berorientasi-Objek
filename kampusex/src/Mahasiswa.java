public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getJurusan() {
        return jurusan;
    }
    public double getIpk() {
        return ipk;
    }

    // add IPK
    public boolean addIpk(double amount) {
        if (amount > 0) {
            ipk += amount;
            if (ipk > 4.0) {
                ipk = 4.0;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "NIM : "+ nim +
                "\nNama : " + nama +
                "\nJurusan : " + jurusan +
                "\nIpk : " + ipk +
                "\n";
    }
}