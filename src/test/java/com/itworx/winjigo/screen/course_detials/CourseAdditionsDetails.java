package com.itworx.winjigo.screen.course_detials;

import com.itworx.winjigo.screen.BaseScreen;
import com.itworx.winjigo.screen.CourseSection;
import com.itworx.winjigo.waits.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CourseAdditionsDetails extends BaseScreen {

    private final By courseNameTextField = By.id("txtCourseName");
    private final By courseSubjectSelector = By.id("courseSubject");
    private final By courseGradeSelector = By.id("courseGrade");
    private final By courseTeacherSelector = By.xpath("//span[@aria-label='Course Teacher activate']");

    private final By createButton = By.id("btnSaveAsDraftCourse");

    Select subjectSelector;
    Select courseGradeLevelSelector ;

    public void enterCourseName(String courseName){
        WaitUtils.waitUntilElementUntilIsVisible(courseNameTextField).sendKeys(courseName);
    }


    public void selectSubjectName(String subjectName) {
        subjectSelector = new Select(WaitUtils.waitUntilElementUntilIsVisible(courseSubjectSelector));
        subjectSelector.selectByVisibleText(subjectName);
    }

    public void selectGradeLevel(String gradeLevel) {
        courseGradeLevelSelector = new Select(WaitUtils.waitUntilElementUntilIsVisible(courseGradeSelector));
        courseGradeLevelSelector.selectByVisibleText(gradeLevel);
    }

    public void selectCourseTeacherName(String courseTeacherName) {
        WaitUtils.waitUntilElementUntilIsClickable(courseTeacherSelector).click();
        clickOnElementUsingJS(WaitUtils.waitUntilElementIsPresence(By.xpath("//div//h5[@title='"+courseTeacherName+"']")));
    }

    public void selectCourseCompletionCriteria(String courseCompletionCriteria) {
        WaitUtils.waitUntilElementUntilIsClickable(By.xpath("//span[text()='"+courseCompletionCriteria+"']")).click();
    }

    public CourseSection clickOnCreateButton() {
        WaitUtils.waitUntilElementUntilIsClickable(createButton).click();
        return new CourseSection();
    }

}
