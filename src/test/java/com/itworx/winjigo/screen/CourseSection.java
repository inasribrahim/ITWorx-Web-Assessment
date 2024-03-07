package com.itworx.winjigo.screen;

import com.itworx.winjigo.driver.DriverManager;
import com.itworx.winjigo.screen.course_detials.CourseAdditionsDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CourseSection extends BaseScreen{
    private CourseAdditionsDetails courseAdditionsDetails;
    private final By dialogConfirmation = By.id("btnDialogOk");
    private final By sortByCourses = By.id("CoursesOrderBy");

    public CourseSection(){
        courseAdditionsDetails = new CourseAdditionsDetails();
    }
    private final By addCourseButton = By.id("btnListAddCourse");

    public boolean checkCourseName(String courseName){
        boolean courseFound = false;
        waitUntilElementUntilIsVisible(By.id("lnkListCourseSelcted"));
        List<WebElement> courseNameList = DriverManager.getWebDriver().findElements(By.id("lnkListCourseSelcted"));
        for (WebElement course : courseNameList) {
            System.out.println(course.getText());
            if (course.getText().equals(courseName)) {
                courseFound = true;
                break;
            }
        }
        return courseFound;
    }
    public CourseAdditionsDetails clickOnCourseDetails(){
        waitUntilElementUntilIsClickable(addCourseButton).click();
        return new CourseAdditionsDetails();
    }

    public void clickOnDialogOkIfAppear(){
        if(elementIsExisted(dialogConfirmation)){
            waitUntilElementUntilIsClickable(dialogConfirmation).click();
        }
    }
    public CourseAdditionsDetails getCourseAdditionsDetails() {
        return courseAdditionsDetails;
    }

    public void sortedByCourseDesc() {
        new Select(waitUntilElementUntilIsVisible(sortByCourses)).selectByVisibleText("Creation Date Descending");
    }
}
