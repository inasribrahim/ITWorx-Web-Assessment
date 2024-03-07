package com.itworx.winjigo.screen.menu;

import com.itworx.winjigo.screen.BaseScreen;
import com.itworx.winjigo.screen.CourseSection;
import org.openqa.selenium.By;

public class LeftMenu extends BaseScreen {
    private final By courseLink = By.xpath("//a[normalize-space(@id)='btnMyCoursesList' and normalize-space(@title)='Courses']");

    public CourseSection clickOnCourseLink()  {
        waitUntilElementUntilIsClickable(courseLink).click();
        return new CourseSection();
    }
}
