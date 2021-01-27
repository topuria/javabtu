package nodartopuria.v1;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Payment {

	private static final Logger logger = LogManager.getLogger(Payment.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		Electricity electricity = new Electricity("nika", 123.3);
		Water water = new Water("nika", 23.5);
		pay(water, electricity);
	}

	public static <T, G> void pay(T water, G elect) {
		logger.info("კომუნალური გადახდილია " + water.toString());
		logger.info("კომუნალური გადახდილია " + elect.toString());
	}
}
