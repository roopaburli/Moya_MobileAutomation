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


/*## Get Request Test
* Click Button "Get"
* Wait for Reach Testbed
* Check rules working with "CHANGED-PARAMETER OK"*/

//TestCase 4: Verify CHANGED-PARAMETER OK message

if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/buttonGet'), 10) == true)
{
	WebUI.click(findTestObject('TestReachReplacementTests/ReachTestBedPage/buttonGet'))
	WebUI.delay(5)
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/textChangedParameterOk'), 10) == true)
		{
			println WebUI.getText(findTestObject('TestReachReplacementTests/ReachTestBedPage/textChangedParameterOk'))
			WebUI.delay(5)
			KeywordUtil.markPassed("TestCase_CHANGED-PARAMETER OK message_Check - Test Passed")
			
		}
	else
		{
			KeywordUtil.markFailed("TestCase_CHANGED-PARAMETER OK message_Check - Test Failed")
			
		}
}
else
{
	KeywordUtil.markFailed("TestCase_CHANGED-PARAMETER OK message_Check - GET button is not Present- Test Failed")
	
}


/*## Open All Cards
* Click Button "Open All Cards"*/

if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/buttonOpenAllCards'), 10) == true)
{
	WebUI.click(findTestObject('TestReachReplacementTests/ReachTestBedPage/buttonOpenAllCards'))
	WebUI.delay(5)
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/buttonCloseAllCards'), 10) == true)
		{
			KeywordUtil.markPassed("TestCase_Click-Open All Cards button check - Test Passed")
			
		}
	else
		{
			KeywordUtil.markFailed("TestCase_Click-Open All Cards button Check - Test Failed")
			
		}
}
else
{
	KeywordUtil.markFailed("TestCase_Open All Cards button is not Present- Test Failed")
	
}

/*## Check Headers
* Check header "Access-Control-Allow-Origin" is set to "dave.masters.dev0.binu.net => reachtestbed-dev.systest.datafree.co"
* Check header "Access-Control-Allow-Origin" is set to "img-src static.bi.nu => img-src static-bi-nu-reachtestbed-dev.systest.datafree.co"
* Check header "Link" is set to "http://www.youtube.com => http://www-youtube-com-reachtestbed-dev.systest.datafree.co"*/
//1
if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/header1AccessControlAllowOrigin'), 10) == true)
{
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/header1dave.masters.dev1.bi.nuText'), 10) == true)
		{
			def header1Text1 = WebUI.getText(findTestObject('TestReachReplacementTests/ReachTestBedPage/header1dave.masters.dev1.bi.nuText')).trim()
			def header1Text2 = WebUI.getText(findTestObject('TestReachReplacementTests/ReachTestBedPage/header1_reach1-dev.systest.datafree.coText')).trim()
			
			if ((header1Text1 == GlobalVariable.header1Text1_Expected) && (header1Text2 == GlobalVariable.header1Text2_Expected))
			{
				KeywordUtil.markPassed("TestCase_Access-Control-Allow-Origin is set to dev1.bi.nu => reach1-dev.systest.datafree.co - Test Passed")
			}
		}
	else
		{
			KeywordUtil.markFailed("TestCase_Access-Control-Allow-Origin is Not set to dev1.bi.nu => reach1-dev.systest.datafree.co - Test Failed")
			
		}
}
else
{
	KeywordUtil.markFailed("TestCase_Header AccessControlAllowOrigin is not Present- Test Failed")
	
}

//2

if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/header2Content-Security-Policy'), 10) == true)
{
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/header2img-src static.bi.nu'), 10) == true)
		{
			def header2Text1 = WebUI.getText(findTestObject('TestReachReplacementTests/ReachTestBedPage/header2img-src static.bi.nu')).trim()
			def header2Text2 = WebUI.getText(findTestObject('TestReachReplacementTests/ReachTestBedPage/header2 img-src static-bi-nu-reachtestbed-dev.systest.d')).trim()
			
			if ((header2Text1 == GlobalVariable.header2Text1_Expected) && (header2Text2 == GlobalVariable.header2Text2_Expected))
			{
				KeywordUtil.markPassed("TestCase_Access-Control-Allow-Origin is set to img-src static.bi.nu => img-src static-bi-nu-reachtestbed-dev.systest.datafree.co check - Test Passed")
			}
		}
	else
		{
			KeywordUtil.markFailed("TestCase_Access-Control-Allow-Origin is set to img-src static.bi.nu => img-src static-bi-nu-reachtestbed-dev.systest.datafree.co check - Test Failed")
			
		}
}
else
{
	KeywordUtil.markFailed("TestCase_Header Access-Control-Allow-Origin img-src static.bi.nu is not Present- Test Failed")
	
}

//3

if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/header3Link'), 10) == true)
{
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/header3Link'), 10) == true)
		{
			def header3Text1 = WebUI.getText(findTestObject('TestReachReplacementTests/ReachTestBedPage/header3httpwww.youtube.com')).trim()
			def header3Text2 = WebUI.getText(findTestObject('TestReachReplacementTests/ReachTestBedPage/header3httpwww-youtube-com-reachtestbed-dev.systest')).trim()
			
			if ((header3Text1 == GlobalVariable.header3Text1_Expected) && (header3Text2 == GlobalVariable.header3Text2_Expected))
			{
				KeywordUtil.markPassed("TestCase_Link is set to http://www.youtube.com => http://www-youtube-com-reachtestbed-dev.systest.datafree.co check - Test Passed")
			}
		}
	else
		{
			KeywordUtil.markFailed("TestCase_Link is set to http://www.youtube.com => http://www-youtube-com-reachtestbed-dev.systest.datafree.co check - Test Failed")
			
		}
}
else
{
	KeywordUtil.markFailed("TestCase_Header Link is set to http://www.youtube.com is not Present- Test Failed")
	
}

/*## Redirect to Paid
* Click Button "Redirect To Apple"
* Check Redirect
* Click Button "Back"
* Wait for Reach Testbed
* Click Button "Open All Cards"*/

if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/RedirectToPaid/buttonRedirectToApple'), 10, FailureHandling.CONTINUE_ON_FAILURE ) == true)

{
	WebUI.click(findTestObject('TestReachReplacementTests/RedirectToPaid/buttonRedirectToApple'))
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/RedirectToPaid/textWarningOwnData'), 10, FailureHandling.CONTINUE_ON_FAILURE ) == true)
		{
			KeywordUtil.markPassed("TestCase_Redirect to Paid - Redirect and Own data usage Warning - Test Passed")
			WebUI.click(findTestObject('TestReachReplacementTests/RedirectToPaid/buttonBack'))
			WebUI.delay(5)
			WebUI.click(findTestObject('TestReachReplacementTests/RedirectToPaid/buttonOpenAllCards_afterPaidRedirect'))
			WebUI.delay(5)
		}
	else
		{
			KeywordUtil.markFailed("TestCase_Redirect to Paid - Redirect and Own data usage Warning - Test Failed")
		
		}
	
}
else
{
	KeywordUtil.markFailed("TestCase_Redirect to Paid - Test Failed")
	WebUI.click(findTestObject('TestReachReplacementTests/RedirectToPaid/buttonOpenAllCards_afterPaidRedirect'))
	WebUI.delay(5)
	
}


/*## Check Video Replaced and Exit Page
* Check video
* Click Button " Go to Youtube"
* Check Video Custom Exit Page
* Click Button "BACK"
* Wait for Reach Testbed
* Click Button "Open All Cards"*/


if ((WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/ReachTestBedPage/buttonCloseAllCards'), 5, FailureHandling.CONTINUE_ON_FAILURE)) == true)

{
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckVideoReplacedExitPage/videoObject'), 10) == true)
		{
			
			if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckVideoReplacedExitPage/buttonGoToYouTubeAndExit'), 5) == true)
			{
				WebUI.click(findTestObject('TestReachReplacementTests/CheckVideoReplacedExitPage/buttonGoToYouTubeAndExit'))
				WebUI.delay(5)
				
				if ((WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckVideoReplacedExitPage/textWarningOwnData_CheckVideoPage'), 5, FailureHandling.STOP_ON_FAILURE)== true))
					{
						KeywordUtil.markPassed("TestCase_Go To YouTube And Exit button check : Warning - is not #datafree It will use your own data - Test Passed")
						WebUI.click(findTestObject('TestReachReplacementTests/CheckVideoReplacedExitPage/buttonBackCheckVideoPage'))
						WebUI.delay(7)
						WebUI.click(findTestObject('TestReachReplacementTests/CheckVideoReplacedExitPage/buttonOpenAllCards_afterCheckVideo'))
						WebUI.delay(3)
					}
				else
					{
						KeywordUtil.markPassed("TestCase_Go To YouTube And Exit button check : Warning - is not #datafree It will use your own data - is not Present - Test Failed")
						WebUI.click(findTestObject('TestReachReplacementTests/CheckVideoReplacedExitPage/buttonBackCheckVideoPage'))
						WebUI.delay(7)
						WebUI.click(findTestObject('TestReachReplacementTests/CheckVideoReplacedExitPage/buttonOpenAllCards_afterCheckVideo'))
						WebUI.delay(3)
					}
			}
			else
			{
				KeywordUtil.markFailed("TestCase_Go To YouTube And Exit button check - Test Failed")
			}
			
		}
	else
		{
			KeywordUtil.markFailed("TestCase_Video object check - Test Failed")
			
		}
}
else
{

	KeywordUtil.markWarning("TestCase_Close All Cards button was not Present - please validate the results")
	
}

/*## Check Cookies
* Click Button " Server Sets Cookies"
* Click Button " Server Sets Cookies"
* Check Cookies set by Server*/

if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckCookies/buttonServerSetsCookies'), 5, FailureHandling.CONTINUE_ON_FAILURE))
{
	WebUI.click(findTestObject('TestReachReplacementTests/CheckCookies/buttonServerSetsCookies'))
	WebUI.delay(5)
	WebUI.click(findTestObject('TestReachReplacementTests/CheckCookies/buttonServerSetsCookies'))
	WebUI.delay(5)
	
	if (WebUI.verifyElementPresent(findTestObject('TestReachReplacementTests/CheckCookies/textNopath-DotDomain'), 5, FailureHandling.CONTINUE_ON_FAILURE))
		{
			KeywordUtil.markPassed("TestCase_NOPATH-DOTDOMAIN text check - Test Passed")
		}
	else
		{
			
			KeywordUtil.markFailed("TestCase_NOPATH-DOTDOMAIN text check - Test Failed")
		}
	
		
}
else
{
	KeywordUtil.markFailed("TestCase_NOPATH-DOTDOMAIN text check - Server Sets Cookies button is Not Present - Test Failed")
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

	