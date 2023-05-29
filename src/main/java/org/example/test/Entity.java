package org.example.test;


public class Entity {

    Long testId;
    String testName;
    String TestNumber;

    public Entity(Long testId, String testName, String testNumber) {
        this.testId = testId;
        this.testName = testName;
        TestNumber = testNumber;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestNumber() {
        return TestNumber;
    }

    public void setTestNumber(String testNumber) {
        TestNumber = testNumber;
    }
}
