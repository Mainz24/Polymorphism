package HalfLife;

public class Player {
    private Weapon[] weaponSlots;
    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new Ak47(),
                new Shotgun(),
        };
    }
    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
