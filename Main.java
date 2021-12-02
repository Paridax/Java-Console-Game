import entities.Player;
import entities.Zombie;
import utils.Utilities;

class Main {
    public static Boolean gameLoop;

    public static void main(String[] args) {
        Utilities.clear();
        Player player = new Player();
        Zombie enemy = new Zombie();
        player.updateHealth(-5, false);

        System.out.println(player.health);
    }
}