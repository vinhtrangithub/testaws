package com.padi.locator.resultpage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ResultAction {
	/*Page Object Element*/
	static TestObject txtNear = findTestObject('GUI/Locator/Result Page/txt_Near')
	static TestObject btnSearch = findTestObject('GUI/Locator/Result Page/btn_Search')
	static TestObject txtSearchFor = findTestObject('GUI/Locator/Result Page/txt_SearchFor')

	public static void verifyLocationAppearance(String location){
		String value = WebUI.getAttribute(txtNear, "value")
		Assert.assertEquals(location, value)
	}

	public static void searchForShopName(String shopname){
		WebUI.sendKeys(txtSearchFor, shopname)
		WebUI.waitForElementClickable(btnSearch, 3)
		WebUI.click(btnSearch)
	}
}
