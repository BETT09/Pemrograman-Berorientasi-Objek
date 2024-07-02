public class Main {
    public static void main(String[] args) {
        // Create a CarInformation object
        car mobil1 = new car("SUV", 12000, "Toyota");
        car mobil2 = new car("Mobil Listrik", 20000, "Hyundai");
        car mobil3 = new car("Sport",100000, "Lambo");
        car mobil4 = new car("Off Road",30000, "Jeep");
        car mobil5 = new car("Convertible",60000,"BMW");

        System.out.println("INFORMASI MOBIL !!");
        System.out.println("MOBIL 1 : " + mobil1);
        System.out.println("MOBIL 2 : " + mobil2);
        System.out.println("MOBIL 3 : " + mobil3);
        System.out.println("MOBIL 4 : " + mobil4);
        System.out.println("MOBIL 5 : " + mobil5);
    }
}
