Feature: E2E
  As a User of the Winjigo website,
  I aim to craft engaging courses for our platform. Through Winjigo,
  I intend to curate comprehensive course content that will seamlessly integrate into our course sections,
  allowing users to access valuable information easily.

  Scenario Outline: E2E for creation basics course and displayed in course section
    Given  user enter a username "<username>" and password "<password>" and login in winjigo page
    When click on course link in menu in winjigo home page
    And  click on add course button in course details page
    And  enter course name "<courseName>" in course additions page
    And  select subject name "<subjectName>" in course additions page
    And  select grade level "<gradeLevel>" in course additions page
    And  select course teacher "<courseTeacher>" in course additions page
    And  select course completion criteria "<courseCompletionCriteria>" in course additions page
    And  click on create button in course additions page
    And  go to course list
    Then validate that course name "<courseName>" should be displayed

    Examples:
      | username | password  | courseName           |subjectName            | gradeLevel       | courseTeacher  |courseCompletionCriteria |
      | username | password  | Test Automation 101  |Technology Information |Higher Education |  Test Teacher   | Final Assessment        |