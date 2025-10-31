package com.andreeasmarandache.homework;

public class TestConfigRunner {

    public static void main(String[] args){

        BrowserConfig browserConfig1 = new BrowserConfig(BrowserType.CHROME, "142.00", true);
        BrowserConfig browserConfig2 = new BrowserConfig(BrowserType.EDGE, "141.00");
        BrowserConfig browserConfig3 = new BrowserConfig(BrowserType.FIREFOX);

        BrowserConfig defaultChrome = BrowserConfig.createDefaultChromeConfig();

        browserConfig1.afiseazaConfig();
        browserConfig2.afiseazaConfig();
        browserConfig3.afiseazaConfig();

        defaultChrome.afiseazaConfig();

    }
}
