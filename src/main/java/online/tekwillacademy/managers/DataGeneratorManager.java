package online.tekwillacademy.managers;

import com.github.javafaker.Faker;

public class DataGeneratorManager {
    private static Faker fakerObject = new Faker ();

    public static String getRandomEmail(){
        return fakerObject.internet().emailAddress();
    }
    public static String getRandomName (){
        return fakerObject.name().name();
    }
}
