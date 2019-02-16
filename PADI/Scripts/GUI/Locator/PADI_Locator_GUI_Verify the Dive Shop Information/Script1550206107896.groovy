import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.padi.locator.landingpage.Landing
import com.padi.locator.resultpage.ResultAction
import com.padi.common.CommonAction as Common


String location = Common.customInputValue()
//println(location)

'Search the near location'
Landing.searchNearLocation(location)

'Verify the location Appearence'
ResultAction.verifyLocationAppearance(location)

'Search for the shop name'
String shopname = Common.customInputValue()
ResultAction.searchForShopName(shopname)

@SetUp
def setup() {
	'Open the browser and access the Locator page'
	WebUI.callTestCase(findTestCase('GUI/Locator/PADI_Locator_GUI_Opening'),[:])
}

@TearDown
def tearDown() {
	'Close the browser'
	sleep(3000);
	//WebUI.closeBrowser()
}