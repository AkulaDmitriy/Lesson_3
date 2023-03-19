package tests;

import org.junit.jupiter.api.Test;

import static tests.TestData.*;

public class DemoqaPageObjectsTest extends TestBase {


    @Test
    void studentRegistrationFormTest() {


        registrationPage.openPage()
                .removeBanner()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
                .setDateOfBirth(userDayOfBirth,userMonthOfBirth,userYearOfBirth)
                .setSubject(subject)
                .setHobbies(hobbies)
                .uploadFile(filePath)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .submitForm()
                .checkSubmitMsg(submitMessage)
                .verifyResultModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile",phoneNumber)
                .verifyResult("Date of Birth", userDayOfBirth + " " + userMonthOfBirth + "," + userYearOfBirth)
                .verifyResult("Subjects",subject)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", filePath)
                .verifyResult("Address", address)
                .verifyResult("State and City" , state + " " + city);


    }
}
