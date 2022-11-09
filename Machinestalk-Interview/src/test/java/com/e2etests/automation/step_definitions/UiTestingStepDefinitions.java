package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.UiTestingPageObjects;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UiTestingStepDefinitions {
	
	private UiTestingPageObjects uiTestingPageObjects;

	public UiTestingStepDefinitions() {
		this.uiTestingPageObjects = new UiTestingPageObjects();

	}
	

	@Given("I access the demoqa application")
	public void i_access_the_demoqa_application() {
		uiTestingPageObjects.goToUrl();
	    
	}

	@When("I enter First Name  {string}")
	public void i_enter_first_name(String string) {
		uiTestingPageObjects.fillFirstName(string);
	   
	}

	@When("I enter name {string}")
	public void i_enter_name(String string) {
		uiTestingPageObjects.fillLastName(string);
	    
	}

	@When("I enter Email {string}")
	public void i_enter_email(String string) {
		uiTestingPageObjects.fillEmail(string);
	    
	}

	@When("I enter the genre {string}")
	public void i_enter_the_genre(String string) {
		uiTestingPageObjects.fillGendre(string);
	   
	}

	@When("I enter Phone number {string}")
	public void i_enter_phone_number(String string) {
		uiTestingPageObjects.fillPhoneNumber(string);
	    
	}

	@When("I enter date of birth {string}")
	public void i_enter_day_of_birth(String string) {
		uiTestingPageObjects.filldaybirth(string);
	    
	}
	

	@When("I enter the subject {string}")
	public void i_enter_the_subject(String string) {
		uiTestingPageObjects.fillSubject(string);
	    
	}

	@When("I enter hobbies {string}")
	public void i_enter_hobbies(String string) {
		uiTestingPageObjects.fillHobbies(string);
	   
	}

	@When("I select an image {string}")
	public void i_select_an_image(String string) {
		uiTestingPageObjects.selectImage();
		uiTestingPageObjects.uploadImageWithRobot(string);
	    
	}

	@When("I enter Address {string}")
	public void i_enter_address(String string) {
		uiTestingPageObjects.fillAdress(string);
	    
	}

	@When("I enter the status {string}")
	public void i_enter_the_status(String string) {
		uiTestingPageObjects.fillStatus(string);
	    
	}

	@When("I enter the city {string}")
	public void i_enter_the_city(String string) {
		uiTestingPageObjects.fillCity(string);
	   
	}

	@When("I click on the submit button")
	public void i_click_on_the_submit_button() {
		uiTestingPageObjects.clickOnBtnSubmit();
	    
	}

	@Then("I am redirecting to the register {string}")
	public void i_am_redirecting_to_the_register(String text) {
		String message =  Setup.getDriver().getCurrentUrl();
		Assert.assertEquals(message,text );
	  
	}




}
