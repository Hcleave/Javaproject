import java.util.Random;

public class PositiveThoughts {
    public static void main(String[] args) {
        // Initialize array of positive thoughts
        String[] thoughts = {
            "Today is a new day and anything is possible.",
            "You are capable of achieving your goals and making your dreams a reality.",
            "Believe in yourself and your abilities.",
            "You are strong and capable of overcoming any challenges that come your way.",
            "Each day is an opportunity to learn and grow.",
            "You are worthy of love and happiness.",
            "It is okay to make mistakes, everyone does. Learn from them and keep moving forward.",
            "You are capable of making a positive impact in the world.",
            "You are beautiful and unique, just the way you are.",
            "Stay true to yourself and your values, and you will always be on the right path."
        };

        // Initialize random number generator
        Random rng = new Random();

        // Generate and output a positive thought every hour
        while (true) {
            // Wait one hour
            try {
                Thread.sleep(60 * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Generate and output a random positive thought
            int index = rng.nextInt(thoughts.length);
            System.out.println(thoughts[index]);
        }
    }
}
