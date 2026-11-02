
public class CommitCafe {

    private static String barista = "Krish";
    private static String nickname = "Master Barista";
    private static String title = "[Lead Barista]";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println(barista + " brewed a " + drink + ".");
        System.out.println("Enjoy your fresh " + drink + "!");

        // Preserve CoffeeBot's additional check
        System.out.println("[BOT CHECK] drink length = " + drink.length());
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + title + " " + nickname
                + " " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
