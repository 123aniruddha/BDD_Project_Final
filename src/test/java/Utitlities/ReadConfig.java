package Utitlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import StepDefinition.BaseClass;

public class ReadConfig extends BaseClass {

	Properties properties;

	String path = "config.properties";

	// constructor
	public ReadConfig() {
		try {
			properties = new Properties();

			// to open config .properties file in input mode and load the file
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		String value = properties.getProperty("browser");

		if (value != null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}

	public static void implicitlyWait(long d) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(d));

	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}

}
