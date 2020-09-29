package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFile {
	 Properties prop =new Properties();
	 String projPath =System.getProperty("user.dir");
public static void main(String[] args) throws IOException {

}
public  String browser() throws IOException {
    InputStream input = new FileInputStream(projPath +"/src/main/java/config/ config.properties");
	prop.load(input);
	String browser=prop.getProperty("browser");
	return browser;
}
public  String url() throws IOException {
    InputStream input = new FileInputStream(projPath +"/src/main/java/config/ config.properties");
	prop.load(input);
	String url=prop.getProperty("url");
	return url;
}
}
