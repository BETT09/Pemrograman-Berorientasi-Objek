public class car {
    private String tipe;
    private int kilometer; // Changed from String to int
    private String merek;

    // Default constructor
    public car() {
    }

    // Parameterized constructor
    public car(String tipe, int kilometer, String merek) {
        this.tipe = tipe;
        this.kilometer = kilometer;
        this.merek = merek;
    }

    // Getter and Setter methods
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek; // Fixed the assignment
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "car{" +
                "tipe='" + tipe + '\'' +
                ", kilometer=" + kilometer +
                ", merek='" + merek + '\'' +
                '}';
    }

}
