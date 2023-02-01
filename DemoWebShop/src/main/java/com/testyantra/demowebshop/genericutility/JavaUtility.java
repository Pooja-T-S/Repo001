package com.testyantra.demowebshop.genericutility;

import java.time.LocalDateTime;

/**
 * It gives the time stamp of the local system in the form of String
 * 
 * @author Pooja TS
 *
 */
public class JavaUtility {
	public String timeStamp() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}

}
