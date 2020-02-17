import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.txtReachPlacementUrl)
WebUI.delay(5)
WebUI.maximizeWindow()

// # Reach Replacement Tests

/* ## Check rules
* Goto Reach Testbed page at "http://reachtestbed-dev.systest.datafree.co/testbed/index.php"
* Click Button "Continue"
* Check rules working with "working on this domain"*/

//TestCase 1: Verify Continue button is present
Assert.assertTrue(WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckRulesPage/buttonContinue'), 5))

def isButtonContinuePresent =  WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckRulesPage/buttonContinue'), 5)

if (isButtonContinuePresent == true)
{
	def isHeaderWelcomeRuleAppliedPresent =  WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckRulesPage/headerTextWelcomeRuleApplied'), 5)
	
	if (isHeaderWelcomeRuleAppliedPresent == true)
	{
		KeywordUtil.markPassed("TestCase_WelcomeRuleApplied_Header_Check - Test Passed")
	}
	else
	{
		KeywordUtil.markFailed("TestCase_WelcomeRuleApplied_Header_Check - is not present - Test Failed")
	}
	
	WebUI.click(findTestObject('TestReachReplacementTests/CheckRulesPage/buttonContinue'))
	WebUI.delay(10)
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/textRulesWorkingGreen'), 10))
		{
			println WebUI.getText(findTestObject('TestReachReplacementTests/ReachTestBedPage/textRulesWorkingGreen'))
			KeywordUtil.markPassed("TestCase_Rules are working on this domain Text is present - Test Passed")
			
		}
	else
		{
			KeywordUtil.markFailed("TestCase_Rules are working on this domain Text is Not present - Test Failed")
		}
}
else
{
	KeywordUtil.markFailed("TestCase_Continue_Button_Check is Not present - Test Failed")
}




/*## Forwarded App
* Click Button " Forwarded App"
* Check Forward
* Click Button "Back"
* Wait for Reach Testbed*/
WebUI.delay(5)
if ((WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ForwardedApp/buttonForwardedApp'), 10, FailureHandling.CONTINUE_ON_FAILURE) == true))

{	
		WebUI.click(findTestObject('TestReachReplacementTests/ForwardedApp/buttonForwardedApp'))
		WebUI.delay(5)
			
			if ((WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ForwardedApp/textWarningYourOwnData'), 5, FailureHandling.CONTINUE_ON_FAILURE)== true))
				{
					KeywordUtil.markPassed("TestCase_Forwarded App check : Warning - is not #datafree It will use your own data - Test Passed")
					WebUI.click(findTestObject('TestReachReplacementTests/ForwardedApp/buttonBack_afterForwardApp'))
					WebUI.delay(7)
					WebUI.click(findTestObject('TestReachReplacementTests/ReachTestBedPage/buttonOpenAllCards'))
					WebUI.delay(3)
				}
			else
				{
					KeywordUtil.markFailed("TestCase_Forwarded App check : Warning - is not #datafree It will use your own data - is not Present - Test Failed")
					WebUI.click(findTestObject('TestReachReplacementTests/ForwardedApp/buttonBack_afterForwardApp'))
					WebUI.delay(7)
					WebUI.click(findTestObject('TestReachReplacementTests/ReachTestBedPage/buttonOpenAllCards'))
					WebUI.delay(3)
				}

}
else
	{

		KeywordUtil.markFailed("TestCase_Forwarded App button is Not Present - Test Failed")
	
	}


/*## Check Websockets
* Goto Reach Testbed page at "http://websocket-org-reachtestbed-dev.systest.datafree.co/echo.html"
* Wait for Reach Testbed
* Click Button "Connect"
* Wait for response text "CONNECTED"
* Click Button "Send"
* Wait for response text "RECEIVED"*/
	
WebUI.openBrowser('http://websocket-org-reachtestbed-dev.systest.datafree.co/echo.html', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(10)
WebUI.maximizeWindow()
WebUI.delay(3)

	WebUI.click(findTestObject('TestReachReplacementTests/CheckWebsockets/buttonConnect'))
	WebUI.delay(2)
	
	WebUI.click(findTestObject('TestReachReplacementTests/CheckWebsockets/buttonConnect'))
	WebUI.delay(2)
	
	WebUI.click(findTestObject('TestReachReplacementTests/CheckWebsockets/buttonSend'))
	WebUI.delay(2)
	
	WebUI.click(findTestObject('TestReachReplacementTests/CheckWebsockets/buttonSend'))
	WebUI.delay(2)
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckWebsockets/textCONNECTED'), 3, FailureHandling.CONTINUE_ON_FAILURE) == true)
		{
			KeywordUtil.markPassed("TestCase_Web Sockets CONNECT check - Test Passed")
			
		}
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckWebsockets/textSENT'), 3, FailureHandling.CONTINUE_ON_FAILURE) == true)
		{
			KeywordUtil.markPassed("TestCase_Web Sockets SEND check - Test Passed")
			
		}
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckWebsockets/textRECEIVED'), 3, FailureHandling.CONTINUE_ON_FAILURE) == true)
		{
			KeywordUtil.markPassed("TestCase_Web Sockets RECEIVE check - Test Passed")
			
		}

WebUI.closeBrowser()

	