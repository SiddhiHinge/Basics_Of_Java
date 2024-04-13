package week3.assignments.pkg3;

public class Automation {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        chromeDriver.get();
        chromeDriver.openDevTools();
        firefoxDriver.get();
        firefoxDriver.openInspect();
    }
}
