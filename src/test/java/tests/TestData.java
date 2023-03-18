package tests;

import com.github.javafaker.Faker;

public class TestData {

    static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            phoneNumber = faker.phoneNumber().subscriberNumber(10).toString(),
            dateOfBirth = faker.date().birthday().toString(),
            subject = "Math",
            filePath = "src/test/resources/Img.png",
            address = faker.address().fullAddress(),
            submitMessage = "Thanks for submitting the form";
}
