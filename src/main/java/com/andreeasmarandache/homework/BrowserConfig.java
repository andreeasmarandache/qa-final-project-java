package com.andreeasmarandache.homework;

public class BrowserConfig {

    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    public BrowserConfig (BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    public BrowserConfig(BrowserType browser) {
        this(browser, "latest", false);
    }
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    public void afiseazaConfig() {
        System.out.println(
                "───────────────────────────────\n" +
                " Browser Configuration Details:\n" +
                " - Browser:  " + this.browser + "\n" +
                " - Version: " + this.version + "\n" +
                " - Headless: " + this.isHeadless + "\n"
        );
    }

}
