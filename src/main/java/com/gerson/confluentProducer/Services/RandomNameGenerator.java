package com.gerson.confluentProducer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomNameGenerator {


    static String[] firstNames = {
            "John", "Alice", "Bob", "Emma", "Liam", "Olivia", "Noah", "Ava", "Isabella", "Sophia",
            "Ethan", "Mia", "Oliver", "Amelia", "Aiden", "Aria", "Caden", "Grace", "Mason", "Charlotte",
            "Lily", "Logan", "Ella", "Elijah", "Avery", "Jackson", "Scarlett", "Lucas", "Chloe", "Aiden",
            "Zoe", "Harper", "Levi", "Evelyn", "Abigail", "Henry", "Madison", "Liam", "Peyton", "Ella"
    };

    static String[] lastNames = {
            "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
            "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
            "Clark", "Lewis", "Walker", "Hall", "Young", "Allen", "Hernandez", "King", "Wright", "Lopez",
            "Hill", "Green", "Adams", "Nelson", "Baker", "Carter", "Fisher", "Hudson", "Russell", "Stewart"
    };








    // Generate a random name using the provided arrays
    public  String generateRandomName() {
        Random random = new Random();
        String randomFirstName = getRandomElement(firstNames, random);
        String randomLastName = getRandomElement(lastNames, random);
        return randomFirstName + " " + randomLastName;
    }

    // Get a random element from an array
    private static String getRandomElement(String[] array, Random random) {
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }
}
