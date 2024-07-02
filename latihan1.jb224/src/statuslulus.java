public class statuslulus {
    public static void main(String[] args) {
        int nilai = 65; // Contoh nilai, bisa diganti sesuai inputan
        String status = statusNilai(nilai);
        System.out.println("Status: " + status);
    }

    public static String statusNilai(int nilai) {
        if (nilai < 50) {
            return "Fail";
        } else if (nilai < 60) {
            return "Remidi";
        } else if (nilai < 70) {
            return "Cukup";
        } else {
            return "Lulus";
        }
    }
}
