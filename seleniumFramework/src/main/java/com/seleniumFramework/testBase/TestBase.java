package com.seleniumFramework.testBase;

public class TestBase {
	
	public void getBrowser(String browser) {
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").contains("Window")) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				
			}
		}
	}

}
