import java.util.Scanner;

public class Game {
    private Hero[] heroes;

    public Game(Hero[] heroes) {
        this.heroes = heroes;
    }

    public void tampilkanNamaHero() {
        for (int i = 0; i < heroes.length; i++) {
            System.out.println((i + 1) + ". " + heroes[i].getNama());
        }
    }

    public Hero pilihHero(int index) {
        if (index < 1 || index > heroes.length) {
            System.out.println("Indeks hero tidak valid.");
            return null;
        }
        return heroes[index - 1];
    }

    public void mulaiPertempuran() {
        Scanner scanner = new Scanner(System.in);

        // Tampilkan urutan hero
        tampilkanNamaHero();

        // User memilih hero
        System.out.println("Pilih hero Anda dengan memasukkan nomor yang sesuai:");
        int heroIndex = scanner.nextInt();
        Hero userHero = pilihHero(heroIndex);
        if (userHero == null) return;

        // User memilih lawan
        System.out.println("Pilih hero yang ingin Anda lawan:");
        tampilkanNamaHero();
        int opponentIndex = scanner.nextInt();
        Hero opponentHero = pilihHero(opponentIndex);
        if (opponentHero == null) return;

        // User memilih skill untuk menyerang
        while (true) {
            System.out.println("Pilih skill untuk menyerang (1, 2, 3):");
            for (int i = 0; i < userHero.getSkills().length; i++) {
                System.out.println((i + 1) + ". " + userHero.getSkills()[i].getNama());
            }
            int skillIndex = scanner.nextInt() - 1;
            userHero.gunakanSkill(skillIndex, opponentHero);

            // Berhenti jika darah lawan habis
            if (opponentHero.getDarah() <= 0) {
                System.out.println(opponentHero.getNama() + " telah dikalahkan!");
                break;
            }

            // Tampilkan kondisi saat ini
            System.out.println("Kondisi saat ini:");
            System.out.println(userHero);
            System.out.println(opponentHero);

            // Tanyakan kepada pengguna apakah ingin menyerang lagi atau mengakhiri permainan
            System.out.println("Apakah Anda ingin menyerang lagi atau mengakhiri permainan? (serang/selesai):");
            String pilihan = scanner.next();
            if (pilihan.equalsIgnoreCase("selesai")) {
                System.out.println("Permainan selesai.");
                break;
            }
        }

        scanner.close();
    }
}