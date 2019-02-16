package com.padi.locator.landingpage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Landing {
	/*Page Object Elements*/
	static TestObject txtSearch = findTestObject('GUI/Locator/Landing Page/txt_Search')
	static TestObject btnSearch = findTestObject('GUI/Locator/Landing Page/btn_Search')

	public static void searchNearLocation(String location){
		WebUI.sendKeys(txtSearch, location)
		WebUI.waitForElementClickable(btnSearch, 3000)
		WebUI.click(btnSearch)
	}
}
