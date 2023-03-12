package tests;

import org.junit.jupiter.api.Test;

public class DemoqaPageObjectsTest extends TestBase {


    @Test
    void studentRegistrationFormTest() {
        String firstName = "Dima",
                lastName = "Akula",
                email = "Dima_Akula@gmail.com",
                phoneNumber = "999999999999",
                dateOfBirth = "03 Aug 1985",
                subject = "Math",
                filePath = "src/test/resources/Img.png",
                address = "Current Address",
                submitMessage = "Thanks for submitting the form";

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
                .verifyResult("Student Email", email)
                .verifyResult("Mobile", phoneNumber)
                .verifyResult("Date of Birth", dateOfBirth)
                .verifyResult("Subjects", subject)
                .verifyResult("Address", address);

    }
}
