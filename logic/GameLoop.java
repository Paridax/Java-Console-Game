package logic;

import java.util.Scanner;

class GameLoop {
    public static Boolean gameLoop = true;
    public static Scanner input = new Scanner(System.in);
    
    public static void loop() {
        while(gameLoop) {
            System.out.println(input.next());
        }
    }
}