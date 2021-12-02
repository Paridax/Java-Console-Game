import entities.Player;

class Main {
    public static Boolean gameLoop;

    public static void main(String[] args) {
        Player player = new Player();
        player.updateHealth(-5, false);
        System.out.println(player.health);
    }
}