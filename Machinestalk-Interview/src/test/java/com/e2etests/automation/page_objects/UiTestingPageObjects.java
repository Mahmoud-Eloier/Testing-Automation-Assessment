package com.e2etests.automation.page_objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class UiTestingPageObjects {
	
private ConfigFileReader configFileReader;
	
	/*@FindBy*/
	@FindBy(how = How.ID, using = "firstName")
	public static WebElement fName ;
	@FindBy(how = How.ID, using = "lastName")
	public static WebElement lName ;
	@FindBy(how = How.ID, using = "userEmail")
	public static WebElement email ;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Male')]")
	public static WebElement gendre ;
	@FindBy(how = How.ID, using = "userNumber")
	public static WebElement phone ;
	@FindBy(how = How.XPATH, using = "//div[@aria-label='Choose Thursday, July 28th, 1994']")
	public static WebElement date ;
	@FindBy(how = How.XPATH, using = "//*[@id=\"subjectsContainer\"]/div/div")
	public static WebElement subject ;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Sports')]")
	public static WebElement hobbies ;
	@FindBy(how = How.ID, using = "uploadPicture")
	public static WebElement picture ;
	@FindBy(how = How.ID, using = "currentAddress")
	public static WebElement adress ;
	@FindBy(how = How.ID, using = "react-select-3-option-1")
	public static WebElement status ;
	@FindBy(how = How.ID, using = "react-select-4-option-0")
	public static WebElement city ;
	@FindBy(how = How.ID, using = "submit")
	public static WebElement btnSubmit ;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Thanks for submitting the form')]")
	public static WebElement homeMessage ;
	
	
	public UiTestingPageObjects () {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Method*/
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	public void fillFirstName(String name)  {
		
		fName.sendKeys(name);
	}
	
	public void fillLastName(String lastName) {
		lName.sendKeys(lastName);
	}
	
	public void fillEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void fillGendre(String gendr) {
		gendre.sendKeys(gendr);
	}
	public void fillPhoneNumber(String phoneNumber) {
		phone.sendKeys(phoneNumber);
	}
	
	public void filldaybirth(String day) {
		date.sendKeys(day);
	}
	
	public void fillSubject(String sub) {
		subject.sendKeys(sub);
	}
	
	public void fillHobbies(String hobbie) {
		hobbies.sendKeys(hobbie);
	}
	
	public void selectImage() {
		picture.click();
	}
	
	public void uploadImageWithRobot(String imagePath) {
		
			StringSelection stringSelection = new StringSelection(imagePath);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);

			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
			}

			robot.delay(250);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(150);
			robot.keyRelease(KeyEvent.VK_ENTER);

		}
	
	public void fillAdress(String adresse) {
		adress.sendKeys(adresse);
	}
	
	public void fillStatus(String hobbie) {
		status.sendKeys(hobbie);
	}
	
	public void fillCity(String city1) {
		city.sendKeys(city1);
	}
	
	public void clickOnBtnSubmit() {
		btnSubmit.click();
	}
	

	

}



