# CS 310 Midterm Exam Instructions

This README provides instructions for the CS 310 Midterm Exam. All rules specified below must be followed for the exam.

## Gitflow Rules:
1. No direct commits to either the main or develop branch
2. Only the develop branch may be merged into the main branch
3. Only a feature branch may branch off or be merged into the develop branch
4. Only the develop branch may be merged into the feature branch.
5. Branches may only be merged via a Pull Request.

## Specific Rules:
1. It is prohibited to modify any of the classes in the source folder (`src/main`) or build file (`pom.xml`)
2. The ProhibitedResource class must be mocked and no actual invocations of the class are permitted
3. It is prohibited to use code that you did not write or to seek assistance directly or indirectly from any other person

## Steps for Completing the Exam
1. For the class *c* in the `subjects` package
    1. Create a branch from the develop branch titled "feature/*c*" 
    2. On the feature branch, create a test class named "*c*Test" in the correct package (sub-folder) in the maven test folder (`src/test`)
    3. For each method *m* of *c*
        1. Repeat
            1. In the test class, create a test method *t*
            1. Test *m* by invoking *m* from within *t* 
            1. Verify the response of *m* is correct by including an assertion in *t*
        2. Until *m* has 100% statement and 100% branch coverage per the coverage report. Note that the coverage requirement applies to *all* methods in *c*
    4. Commit all tests to the feature branch and merge the branch to the develop branch via a pull request.
2. Ensure that all test code has been merged via a pull request to the main branch of your repository

## Reminders
1. Carefully follow the naming conventions or the grading system will not be able to locate your test classes and methods. 
2. Note that all tests must run and pass with the *mvn test* command in order to receive credit full credit.
3. Don't forget to commit and push your code prior to the exam end time, be safe and commit ahead of time!

