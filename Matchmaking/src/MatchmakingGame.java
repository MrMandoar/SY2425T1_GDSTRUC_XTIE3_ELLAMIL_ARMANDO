import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class MatchmakingGame {

    public static void main(String[] args) {
        // Da Queue
        Queue<String> playerQueue = new LinkedList<>();
        // Rando numbah gen por da players
        Random random = new Random();
        // Scanner para need muna mag input bago may mangyari
        Scanner scanner = new Scanner(System.in);
        // Gaems started
        int gamesCount = 0;
        // Identifayah fo da playahs
        int playerID = 1;

        // Hanggang 1 games lang dapat
        // We making this victorian in dis beetch
        while (gamesCount < 10) {
            System.out.println(drawBox("Prithee, press Enter, and let the fates decide..."));
            // Wait por da input of enter
            scanner.nextLine();

            // Add a rando amount of (playahs 1-7)
            int playersToAdd = random.nextInt(7) + 1;
            for (int i = 0; i < playersToAdd; i++) {
                // Add da playahs to Queue
                playerQueue.add("Player " + playerID++);
            }

            // Display current stats
            System.out.println(drawBox("Turn Summary: " + playersToAdd + " noble souls have joined the queue."));
            System.out.println(drawDialogueBox("In total, there are now " + playerQueue.size() + " souls, awaiting destiny's call."));

            // Check muna kung may 5 na
            if (playerQueue.size() >= 5) {
                System.out.println(drawBox("Hark! A battle shall commence, for the time is ripe!"));

                // Tanggalin sa queue yan, ingame na sila
                System.out.print(drawDialogueBox("These brave souls step forth to meet their fate: "));
                for (int i = 0; i < 5; i++) {
                    System.out.print(playerQueue.poll() + " ");
                }
                System.out.println();

                // Pang ilang game na
                gamesCount++;
                System.out.println(drawDialogueBox("Lo! Game " + gamesCount + " hath begun, with thunderous applause!"));

                // Ilan pa sila
                System.out.println(drawDialogueBox("There remain " + playerQueue.size() + " souls in the queue, still awaiting their moment."));
            } else {
                // gagi kulang pa sila
                System.out.println(drawDialogueBox("Alas! Not enough players hath gathered. The fates demand patience, noble ones."));
            }
        }

        // Pakita naten to pag naka 1 na
        System.out.println(drawBox("Ten battles have been fought. The saga endeth here. The program is no more."));
        scanner.close();
    }

    // gawa tayo box para maganda
    public static String drawBox(String message) {
        StringBuilder border = new StringBuilder("+");
        border.append("-".repeat(Math.max(0, message.length() + 4)));
        border.append("+");

        return border + "\n" +
                "|  " + message + "  |\n" +
                border;
    }

    // diba maganda pag naka box
    public static String drawDialogueBox(String message) {
        return "[ " + message + " ]";
    }
}
