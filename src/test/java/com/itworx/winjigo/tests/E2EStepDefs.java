package com.itworx.winjigo.tests;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class E2EStepDefs extends BaseTest {
    @When("user enter a username {string} and password {string} and login in winjigo page")
    public void userEnterUsernameAndPasswordAndLogin(String username, String password){
        browser.winjigo.loginPage.Login(configProperties.getProperty("username"),
                configProperties.getProperty("password"));
    }
    @When("click on course link in menu in winjigo home page")
    public void clickOnCourseLinkInMenuInWinjigoHomePage() {
        browser.winjigo.home.getLeftMenu().clickOnCourseLink();
    }

    @When("click on add course button in course details page")
    public void clickOnAddCourseButtonInCourseDetailsPage() {
        browser.winjigo.home.getCourseSection().clickOnCourseDetails();
    }

    @When("enter course name {string} in course additions page")
    public void enterCourseNameInCourseAdditionsPage(String courseDetails) {
        browser.winjigo.home.getCourseSection().getCourseAdditionsDetails().enterCourseName(courseDetails);
    }

    @When("select subject name {string} in course additions page")
    public void selectSubjectNameInCourseAdditionsPage(String subjectName) {
        browser.winjigo.home.getCourseSection().getCourseAdditionsDetails().selectSubjectName(subjectName);
    }

    @When("select grade level {string} in course additions page")
    public void selectgradeLevelInCourseAdditionsPage(String gradeLevel) {
        browser.winjigo.home.getCourseSection().getCourseAdditionsDetails().selectGradeLevel(gradeLevel);
    }

    @When("select course teacher {string} in course additions page")
    public void selectCourseTeacherCourseTeacherInCourseAdditionsPage(String courseTeacherName) {
        browser.winjigo.home.getCourseSection().getCourseAdditionsDetails().selectCourseTeacherName(courseTeacherName);
    }

    @When("select course completion criteria {string} in course additions page")
    public void selectCourseCompletionCriteriaInCourseAdditionsPage(String courseCompletionCriteria) {
        browser.winjigo.home.getCourseSection().getCourseAdditionsDetails().selectCourseCompletionCriteria(courseCompletionCriteria);
    }

    @When("click on create button in course additions page")
    public void clickOnCreateButtonInCourseAdditionsPage() {
        browser.winjigo.home.getCourseSection().getCourseAdditionsDetails().clickOnCreateButton();
    }

    @When("go to course list")
    public void clickOnBackBrowser() throws InterruptedException {
        browser.winjigo.home.sleep(3000);
        browser.winjigo.home.getCourseSection().clickOnDialogOkIfAppear();
        browser.winjigo.home.getCourseSection().getCourseAdditionsDetails().goTo(configProperties.getProperty("winjigoUrl").concat("/Course#!/list/"));
    }

    @Then("validate that course name {string} should be displayed")
    public void validateThatCourseNameShouldBeDisplayed(String courseName) {
        browser.winjigo.home.getCourseSection().clickOnDialogOkIfAppear();
        browser.winjigo.home.getCourseSection().sortedByCourseDesc();
        Assert.assertTrue(browser.winjigo.home.getCourseSection().checkCourseName(courseName));
    }

}
