public class job {
    // Variabel nama dan jamKerja
    String nama;
    int jamKerja;

    // Konstruktor untuk inisialisasi variabel
    public job(String nama, int jamKerja) {
        this.nama = nama;
        this.jamKerja = jamKerja;
    }

    // Method untuk menampilkan informasi job
    public void displayJobInfo() {
        System.out.println("Nama Pekerjaan: " + nama);
        System.out.println("Jam Kerja: " + jamKerja + " jam");
    }

    public static void main(String[] args) {
        // Membuat objek pertama dari job
        job job1 = new job("Marketing", 3);
        // Membuat objek kedua dari job
        job job2 = new job("HRD", 5);

        // Menampilkan informasi dari job1
        job1.displayJobInfo();
        System.out.println();

        // Menampilkan informasi dari job2
        job2.displayJobInfo();
    }
}
