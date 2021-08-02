package HalfLife;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                        player.getSlotsCount());
        int slot;

        while (true){
            slot = scanner.nextInt() -1;
            if (slot <= -3 || slot >= 4 || slot == -1){
                System.out.println("Неверный номер оружия");
                continue;
            }
            if (slot == -2) {
                    break;
            }
            player.shotWithWeapon(slot);
        }
        System.out.println("Game over!");
    }
}
