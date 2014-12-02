package com.epam.testexternalpart.core;

import org.testng.Reporter;



public class TestReporter {
	public static final String HEADER = "<br /><b><font size = 2 color = #000000>%s</font></b><br/>";     // Test Case title	
	public static final String HEADER_BLUE = "<br /><b><font size = 2 color = #000099>%s</font></b><br/>";     // Test Case title
	public static final String STEP = "<br><b><font size = 2 color = #000000>%s</font></b><br>";     // Test Case title
	public static final String TITLE = "<br /><font size = 2 color = #000000>%s</font>";             // Check point	
	public static final String TITLE_MARKED = "<font size = 2 color = #0000FF>%s</font>";            // Essential point
    public static final String POSITIVE = "<br /><font size = 2 color = #347C17>&nbsp;&nbsp;%s</font>";   // Positive flow
	public static final String NEGATIVE = "<br /><font size = 2 color = #FF0000>%s</font>";   // Negative flow
	public static final String BOLD = "<b><font size = 2 color = #000000><i>&nbsp;&nbsp;&nbsp;%s</i></b></font>";
	public static final String BLUE_SMALL = "<font color = #0000FF>&nbsp;&nbsp;&nbsp;%s</font>";
		

    
    public static void writeToReportStep(String message) {
        Reporter.log(String.format(STEP, message));
        System.out.println(message);
    }

    public static void writeToReportHeader(String message) {
        Reporter.log(String.format(HEADER_BLUE, message));
        System.out.println(message);
    }

    public static void writeToReportPositiveResult(String message) {
    	 Reporter.log(String.format(POSITIVE, message));
        System.out.println(message);
    }

    public static void writeToReportNegativeResult(String message) {
    	 Reporter.log(String.format(NEGATIVE, message));
        System.out.println(message);
    }

    public static void writeToReportTitle(String message) {
        Reporter.log(String.format(TITLE, message));
        System.out.println(message);

    }


//    public static void testCaseStepReporter(Number step, String desc) {
//        testCaseStepReporter(step, desc, "");
//    }
//
//    public static void testCaseStepReporter(Number step, String description,
//                                            String expectedResult) {
//        String logMessage = String.format(STEP, "STEP-" + step + ": " + description);
//        Reporter.log(logMessage);
//
//        if (!expectedResult.equals("")) {
//            Reporter.log(String.format(STEP, "Expected results:"));
//            Reporter.log(expectedResult);
//        }
//    }


}