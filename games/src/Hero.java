public class Hero {
    private String nama;
    private int darah;
    private int mana;
    private Skill[] skills;

    public Hero(String nama, int darah, int mana, Skill[] skills) {
        this.nama = nama;
        this.darah = darah;
        this.mana = mana;
        this.skills = skills;
    }

    public String getNama() {
        return nama;
    }

    public int getDarah() {
        return darah;
    }

    public int getMana() {
        return mana;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void gunakanSkill(int skillIndex, Hero target) {
        if (skillIndex < 0 || skillIndex >= skills.length) {
            System.out.println("Indeks skill tidak valid.");
            return;
        }

        Skill skill = skills[skillIndex];
        if (mana < skill.getManaCost()) {
            System.out.println(nama + " tidak memiliki cukup mana untuk menggunakan " + skill.getNama());
            return;
        }

        mana -= skill.getManaCost();
        target.darah -= skill.getDamage();
        System.out.println(nama + " menggunakan " + skill.getNama() + " pada " + target.getNama() +
                ", menyebabkan " + skill.getDamage() + " kerusakan. " + target.getNama() +
                " sekarang memiliki " + target.getDarah() + " darah.");
    }

    @Override
    public String toString() {
        return nama + " (Darah: " + darah + ", Mana: " + mana + ")";
    }

    public static class Skill {
        private String nama;
        private int damage;
        private int manaCost;

        public Skill(String nama, int damage, int manaCost) {
            this.nama = nama;
            this.damage = damage;
            this.manaCost = manaCost;
        }

        public String getNama() {
            return nama;
        }

        public int getDamage() {
            return damage;
        }

        public int getManaCost() {
            return manaCost;
        }

        @Override
        public String toString() {
            return nama + " (Damage: " + damage + ", Biaya Mana: " + manaCost + ")";
        }
    }
}