// StarMICRTest.java
// This file contains sample code illustrating how to use the MICR class to
// control your MICR.  The basic control and status querying mechanisms
// are used here.  For more advanced usage of the MICR class, see the
// JavaPOS specification.

// usage instructions - Windows
// 1. compile from command line - javac -classpath jpos113-controls.jar;jcl.jar StarMICRTest.java
// 2. execute from command line - java -classpath .;starjavapos.jar;stario.jar;jpos113-controls.jar;jcl.jar;xercesimpl.jar;xml-apis.jar StarMICRTest

// usage instructions - Linux and Mac OS X
// 1. compile from command line - javac -classpath jpos113-controls.jar:jcl.jar StarMICRTest.java
// 2. execute from command line - java -classpath .:starjavapos.jar:stario.jar:jpos113-controls.jar:jcl.jar:xercesimpl.jar:xml-apis.jar StarMICRTest

// NOTE: CHANGE THE MICR NAME IN THE micr.open STATEMENT BELOW TO MATCH YOUR CONFIGURED DEVICE NAME.

import jpos.JposConst;
import jpos.JposException;
import jpos.MICR;
import jpos.MICRConst;

import jpos.events.DataEvent;
import jpos.events.DataListener;
import jpos.events.ErrorEvent;
import jpos.events.ErrorListener;
import jpos.util.JposPropertiesConst;

public class StarMICRTest implements DataListener, ErrorListener {

	// Data Event
	public void dataOccurred(DataEvent dataEvent) {
		String message = "";

		try {
			System.out.println("RawData       = " + micr.getRawData());
			System.out.println("AccountNumber = " + micr.getAccountNumber());
			System.out.println("BankNumber    = " + micr.getBankNumber());
			System.out.println("SerialNumber  = " + micr.getSerialNumber());
			System.out.println("TransitNumber = " + micr.getTransitNumber());

			switch (micr.getCheckType()) {
			case MICRConst.MICR_CT_PERSONAL:
				message = "MICR_CT_PERSONAL";
				break;
			case MICRConst.MICR_CT_BUSINESS:
				message = "MICR_CT_BUSINESS";
				break;
			case MICRConst.MICR_CT_UNKNOWN:
				message = "MICR_CT_UNKNOWN";
				break;
			default:
				message = "MICR_CT_UNKNOWN";
				break;
			}
			System.out.println("CheckType     = " + message);

			switch (micr.getCountryCode()) {
			case MICRConst.MICR_CC_USA:
				message = "MICR_CC_USA";
				break;
			case MICRConst.MICR_CC_CANADA:
				message = "MICR_CC_CANADA";
				break;
			case MICRConst.MICR_CC_MEXICO:
				message = "MICR_CC_MEXICO";
				break;
			case MICRConst.MICR_CC_UNKNOWN:
				message = "MICR_CC_UNKNOWN";
				break;
			default:
				message = "MICR_CC_UNKNOWN";
				break;
			}
			System.out.println("CountryCode   = " + message);
		} catch (JposException je) {
			System.err.println("MICR: dataOccurred: Jpos Exception " + je);
		}
	}

	// Error Event
	public void errorOccurred(ErrorEvent event) {
		System.out.println("The entire input data stream was unreadable. No data is available.\n"
						+ "  error code          = " + event.getErrorCode() + "\n"
						+ "  error code extended = " + event.getErrorCodeExtended());

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		event.setErrorResponse(JposConst.JPOS_ER_RETRY);
	}

	public void runTest(String[] args) {
		/*
		 * If you want to place the jpos.xml file elsewhere on your local file
		 * system then uncomment the following line and specify the full path to
		 * jpos.xml.
		 * 
		 * If you want to place the jpos.xml file on a web server for access over
		 * the internet then uncomment the second System.setProperty line below
		 * and specify the full URL to jpos.xml.
		 */
		System.setProperty(JposPropertiesConst.JPOS_POPULATOR_FILE_PROP_NAME, "jpos.xml");
		// System.setProperty(JposPropertiesConst.JPOS_POPULATOR_FILE_URL_PROP_NAME, "http://some-where-remote.com/jpos.xml");

		try {
			micr.addDataListener(this);
			micr.addErrorListener(this);

			// open the micr object according to the entry names defined in jpos.xml
			micr.open("default");

			// claim exclusive usage of the micr object
			micr.claim(1);

			// enable the device for input and output
			micr.setDeviceEnabled(true);

			// enable the data event for input
			micr.setDataEventEnabled(true);

			// Initiates check insertion processing
			micr.beginInsertion(0);

			// reads magnetic ink characters from a check
			micr.endInsertion();

			// Paper feed
			micr.beginRemoval(-1);

			// Ends check removal processing
			micr.endRemoval();

		} catch (JposException e) {
			// display any errors that come up
			e.printStackTrace();
		} finally {
			// close the micr object
			try {
				micr.close();
			} catch (Exception e) {
			}
		}

		System.out.println("StarMICRTest finished.");
		System.exit(0);
	}

	public static void main(String[] args) {
		new StarMICRTest().runTest(args);
	}

	// instantiate a new jpos.MICR object
	MICR micr = new MICR();
}
