package reports;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.Reporter;

public class Loggers {

	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void logTheTest(String msg) {
		logger.log(Level.INFO, msg);
		Reporter.log(msg + "<br>");

	}

}
