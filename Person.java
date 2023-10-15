import java.util.Random;

public class RandomPersonSelector {
    public static void main(String[] args) {
        // Number of people
        int numberOfPeople = 1000;

        // Generate a random number between 1 and numberOfPeople
        Random random = new Random();
        int randomPersonNumber = random.nextInt(numberOfPeople) + 1;

        // Print the randomly selected person
        System.out.println("Randomly selected person number: " + randomPersonNumber);
    }
}
In this code, random.nextInt(numberOfPeople) + 1 generates a random number between 1 and numberOfPeople (inclusive). This number represents the selected person from the group of thousand people. Each time you run the program, it will select a different random person.





