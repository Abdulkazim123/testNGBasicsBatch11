package class3;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("starting the execution with test:" + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("taking the screenshot of the test having the name:" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("failed the execution with the name:" + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped the execution with the name:" + result.getName());
    }

}
