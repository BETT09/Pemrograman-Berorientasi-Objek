public class Main {
    public static void main(String[] args) {
        Jurusan kampus = new Jurusan(10);

        Mahasiswa mahasiswa1 = new Mahasiswa("90901", "Satya", "Manajemen", 3.0);
        Mahasiswa mahasiswa2 = new Mahasiswa("90902", "Resti", "Bisnis Digital", 3.5);
        Mahasiswa mahasiswa3 = new Mahasiswa("90903", "Andi", "Teknologi Informasi", 4.0);

        kampus.addMahasiswa(mahasiswa1);
        kampus.addMahasiswa(mahasiswa2);
        kampus.addMahasiswa(mahasiswa3);

        System.out.println(kampus.allMhs());
    }
}