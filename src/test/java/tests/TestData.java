package tests;

import com.github.javafaker.Faker;

import java.util.Map;

public class TestData {

    static Faker faker = new Faker();
    static Map<String, String[]> mapStateWithCity = Map.of(
            "NCR", new String[]{"Delhi", "Gurgaon", "Noida"},
            "Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"},
            "Haryana", new String[]{"Karnal", "Panipat"},
            "Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            hobbies = faker.options().option("Reading", "Sports", "Music"),
            phoneNumber = faker.phoneNumber().subscriberNumber(10).toString(),
            userDayOfBirth = String.format("%02d", faker.number().numberBetween(1, 28)),
            userMonthOfBirth = faker.options().option("January","February","March","April","May","June","July","August","September","October","November","December"),
            userYearOfBirth = String.valueOf(faker.number().numberBetween(1900, 2100)),
            subject = faker.options().option("Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
                    "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology"),
            filePath = "Img.png",
            address = faker.address().fullAddress(),
             submitMessage = "Thanks for submitting the form",
            state = faker.options().option(mapStateWithCity.keySet().toArray()).toString(),
            city = faker.options().option(mapStateWithCity.get(state));


}
