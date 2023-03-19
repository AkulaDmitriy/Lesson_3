package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    RegistrationResultModal registrationResultModal = new RegistrationResultModal();
    private SelenideElement lastNameInput = $("#lastName"),
            firstNameInput = $("#firstName"),
            emailInput = $("#userEmail"),
            genderValue = $("#genterWrapper"),
            phoneNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            fileUpload = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            state = $("#react-select-3-input"),

            choseCity = $("#react-select-4-input"),
            submitForm = $("#submit"),
            submitMsg = $("#example-modal-sizes-title-lg"),
            resultForm = $(".modal-body");

    public RegistrationPage openPage() {

        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage removeBanner() {

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {

        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {

        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {

        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {

        genderValue.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setPhoneNumber(String value) {

        phoneNumberInput.clear();
        phoneNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month,String year) {

        dateOfBirthInput.click();
        CalendarComponent.setDate(day,month,year);
        return this;
    }

    public RegistrationPage setSubject(String value) {

        subjectInput.setValue(value).pressEnter();
        return this;

    }

    public RegistrationPage setHobbies(String value) {

        hobbiesInput.$(byText(value)).click();
        return this;

    }

    public RegistrationPage uploadFile(String value) {

        fileUpload.uploadFromClasspath(value);
        return this;

    }

    public RegistrationPage setAddress(String value) {

        addressInput.setValue(value);
        return this;

    }

    public RegistrationPage setState(String value) {

        state.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setCity(String value) {

        choseCity.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage submitForm() {

        submitForm.click();
        return this;
    }

    public RegistrationPage checkSubmitMsg(String value) {

        submitMsg.shouldHave(text(value));
        return this;
    }

    public RegistrationPage verifyResultModalAppears() {

        registrationResultModal.verifyModalAppears();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {

        registrationResultModal.verifyResult(key, value);

        return this;
    }
}
