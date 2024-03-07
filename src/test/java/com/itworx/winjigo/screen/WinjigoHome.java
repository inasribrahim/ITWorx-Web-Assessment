package com.itworx.winjigo.screen;

import com.itworx.winjigo.screen.menu.LeftMenu;


public class WinjigoHome extends BaseScreen{
    LeftMenu leftMenu;
    CourseSection courseSection;
    public WinjigoHome(){
        leftMenu = new LeftMenu();
        courseSection = new CourseSection();
    }

    public LeftMenu getLeftMenu(){
        return leftMenu;
    }

    public CourseSection getCourseSection() {
        return courseSection;
    }
}
