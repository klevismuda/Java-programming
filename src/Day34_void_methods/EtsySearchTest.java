package Day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting ETSY Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy Search Smoke Test completed - Pass -");
    }

    public static void openBrowser() {
        System.out.println("1. Open google chrome browser to search the web");
        System.out.println("\tActual result: Browser is opened successfully");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("2. Click on the search bar and navigate to etsy URL(https://www.etsy.com/)");
        System.out.println("\tActual result: Etsy website is opened successfully");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("3. Click on the search bar in etsy and search for \"wooden spoon\"");
        System.out.println("\tActual result: Search functionality successfully executed");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("4. Verify that you received results of wooden spoons on the page");
        System.out.println("\tActual result: Results of wooden spoons is being displayed on the screen");
    }
}
