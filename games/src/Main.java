public class Main {
    public static void main(String[] args) {
        // Definisikan skill untuk setiap hero
        Hero.Skill bolaApiHero1 = new Hero.Skill("Bola Api", 30, 20);
        Hero.Skill ledakanEsHero1 = new Hero.Skill("Ledakan Es", 25, 15);
        Hero.Skill seranganPetirHero1 = new Hero.Skill("Serangan Petir", 35, 25);

        Hero.Skill tebasanPedangHero2 = new Hero.Skill("Tebasan Pedang", 20, 10);
        Hero.Skill panahApiHero2 = new Hero.Skill("Panah Api", 40, 30);
        Hero.Skill perisaiMagisHero2 = new Hero.Skill("Perisai Magis", 0, 20);

        Hero.Skill tombakPetirHero3 = new Hero.Skill("Tombak Petir", 50, 35);
        Hero.Skill hantamanTanahHero3 = new Hero.Skill("Hantaman Tanah", 45, 25);
        Hero.Skill seruanPerangHero3 = new Hero.Skill("Seruan Perang", 0, 15);

        // Definisikan hero dengan skill masing-masing
        Hero.Skill[] skills1 = {bolaApiHero1, ledakanEsHero1, seranganPetirHero1};
        Hero hero1 = new Hero("Hero1", 100, 50, skills1);

        Hero.Skill[] skills2 = {tebasanPedangHero2, panahApiHero2, perisaiMagisHero2};
        Hero hero2 = new Hero("Hero2", 90, 60, skills2);

        Hero.Skill[] skills3 = {tombakPetirHero3, hantamanTanahHero3, seruanPerangHero3};
        Hero hero3 = new Hero("Hero3", 110, 40, skills3);

        // Buat game dengan hero
        Hero[] heroes = {hero1, hero2, hero3};
        Game game = new Game(heroes);

        // Mulai pertempuran
        game.mulaiPertempuran();
    }
}