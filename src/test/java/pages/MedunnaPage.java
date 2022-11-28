
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {
    public MedunnaPage() {PageFactory.initElements(Driver.getDriver(), this);  }
    @FindBy(id = "account-menu")   public WebElement accountMenu;
    @FindBy(xpath = "//*[text()='Register']")   public WebElement register;
    @FindBy(xpath = "//input[@name='ssn']")   public WebElement ssnBox;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")   public WebElement SSNFeedback;
    @FindBy(xpath = "//*[.='Your SSN is required.']")   public WebElement SSNRequiredFeedback;
    @FindBy(xpath = "//*[.='Your FirstName is required.']")   public WebElement firstNameRequiredFeedback;
    @FindBy(xpath = "//*[.='Your LastName is required.']")   public WebElement lastNameRequiredFeedback;
    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")   public WebElement SSNValidFeedback;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement firstNameBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")   public WebElement firstNameFeedback;
    @FindBy(xpath = "//input[@name='lastName']")      public WebElement lastNameBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")     public WebElement lastNameFeedback;
    @FindBy(xpath = "//input[@name='username']")    public WebElement userNameBox;
    @FindBy(xpath = "//*[.='Your username is required.']")   public WebElement userNameRequiredFeedback;
    @FindBy(xpath = "//input[@name='email']")    public WebElement emailBox;
    @FindBy(xpath = "//*[.='Your email is required.']")   public WebElement emailRequiredFeedback;
    @FindBy(xpath = "//*[@id=\"register-form\"]/div[5]/div")   public WebElement emailInvalidFeedback;
    @FindBy(xpath = "//*[@id='firstPassword']")   public WebElement newPasswordBox;
    @FindBy(xpath = "//*[.='Your password is required to be at least 4 characters.']")
    public WebElement invalidPasswordFeedback;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement newPasswordFirstColor;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement newPasswordSecondColor;
    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement newPasswordFourthColor;
    public WebElement newPasswordFifthColor;
    @FindBy(xpath = "//input[@name='firstPassword']") public WebElement newPasswordSec;
    @FindBy(xpath = "//input[@id='username']") public WebElement username;

    @FindBy(xpath = "//*[@type='password']") public WebElement password;
    @FindBy(xpath = "//*[text()='Sign in']") public WebElement signIn;
    @FindBy(xpath = "//*[text()='Administration']") public WebElement girisText;
    @FindBy(xpath = "//*[@id='rememberMe']") public WebElement rememberMe;
    @FindBy(xpath = "//*[text()='Did you forget your password?']") public WebElement didYouForget;
    @FindBy(xpath = "//*[text()='Enter the email address you used to register']") public WebElement resetPassword;
    @FindBy(xpath = "//*[text()='Register a new account']") public WebElement accountGo;
    @FindBy(xpath = "//*[text()='Cancel']") public WebElement cancel;
    @FindBy(xpath = "//*[@id='app-view-container']") public WebElement anaSayfa;
    @FindBy(xpath = "Sign out") public WebElement signOut;
    // son eklenenler 24. US için
    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']") public WebElement myPages;
    @FindBy(xpath = "(//*[@class='bx bx-chevron-right'])[6]") public WebElement makeAnAppointment;
    @FindBy(xpath = "//h2") public WebElement makeAnAppointmentHead;

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]") public WebElement myAppointments;
    @FindBy(xpath = "(//*[@href='/patient-appointment'])[2]") public WebElement myAppointment;

    @FindBy(xpath = "(//*[@href='/patient-appointment'])[2]") public WebElement firstName;
    @FindBy(xpath = "//*[@name='phone']") public WebElement phone;
    @FindBy(xpath = "//*[@id='register-submit']") public WebElement sendRequest;
    @FindBy(xpath = "//*[@style='pointer-events: none;']") public WebElement onay;
    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-pencil-alt fa-w-16 '])[1]") public WebElement showTests;
    @FindBy(xpath = "(//*[@class='btn btn-warning btn-sm'])[1]") public WebElement showinvoice;
    @FindBy(xpath = "//*[@style='font-size: 45px;']") public WebElement invoice;
    @FindBy(xpath = "//*[@style='font-size: 45px;']") public WebElement fatura;
    @FindBy(xpath = "//tbody//tr[1]//td[7]") public WebElement viewTest;
    @FindBy(xpath = "//*[@class='jh-card card']") public WebElement testResult;
    @FindBy(xpath = "//*[text()='onuray']") public WebElement hastaPage;






}
