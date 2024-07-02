public class Jurusan {
    private final int Size = 100;
    private Mahasiswa[] mhs;
    private String namaJurusan;
    private int jumlahMahasiswa;

    // Constructor
    public Jurusan() {
        mhs = new Mahasiswa[Size];
        jumlahMahasiswa = 0;
    }

    public Jurusan(int ukuran) {
        if (ukuran > 0) {
            mhs = new Mahasiswa[ukuran];
        } else {
            mhs = new Mahasiswa[Size];
        }
        jumlahMahasiswa = 0;
    }

    public boolean addMahasiswa(Mahasiswa mahasiswa) {
        if (jumlahMahasiswa == mhs.length) {
            System.out.println("Slot penuh");
            return false;
        }
        mhs[jumlahMahasiswa] = mahasiswa;
        jumlahMahasiswa++;
        return true;
    }

    public Mahasiswa findMahasiswa(String nama) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (mhs[i].getNama().equalsIgnoreCase(nama)) {
                return mhs[i];
            }
        }
        return null;
    }

    public double calcTotalIpk() {
        double jumlah = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            jumlah += mhs[i].getIpk();
        }
        return jumlah;
    }

    public String allMhs() {
        String msg = new String("Data Seluruh Mahasiswa\n");
        for (int i = 0; i < jumlahMahasiswa; i++)
            msg += mhs[i].toString()+"\n";
        return msg;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

}