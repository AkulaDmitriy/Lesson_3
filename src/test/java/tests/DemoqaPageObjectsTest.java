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
                .setGender()
                .setPhoneNumber(phoneNumber)
                .setDateOfBirth(dateOfBirth)
                .setSubject(subject)
                .setHobbies()
                .uploadFile(filePath)
                .setAddress(address)
                .setState()
                .setChoseState()
                .setCity()
                .choseCity()
                .submitForm()
                .checkSubmitMsg(submitMessage)
                .verifyResultModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email);


    }
}
