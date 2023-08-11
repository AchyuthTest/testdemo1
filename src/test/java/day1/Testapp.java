package day1;

import java.io.FileOutputStream;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.net.SMTPAppender;

public class Testapp {
	private static Logger log = Logger.getLogger(Testapp.class);
	public static void main(String[] args) throws Exception {

		
		Layout layout = new PatternLayout(" %d %p - [%M ->%m] %l %L %n");
		Appender appender = new ConsoleAppender(layout);
		//SMTP Appender
		//Appender appendersmtp = new SMTPAppender();
		FileOutputStream g = new FileOutputStream("E:\\\\Practice\\\\RestAssured\\\\Testapp.log");
		Appender appender1 = new FileAppender(layout, "E:\\Practice\\RestAssured\\Testapp.log");
		log.addAppender(appender);
		log.addAppender(appender1);
		Testapp t1= new Testapp();
		t1.m1();
		
		log.info("info messahe");
		log.debug("debug message");
		log.error("jaGXJh");
		
	}
	
	
	public void m1() {
		System.out.println("hi");
		log.error("m1111");
	}
	
	
	

}
