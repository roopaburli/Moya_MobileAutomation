package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


public class Common_lib {
	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */
	@Keyword
	def isElementPresent_Mobile(TestObject to, int timeout){
		try {
			KeywordUtil.logInfo("Finding element with id:" + to.getObjectId())

			WebElement element = MobileElementCommonHelper.findElement(to, timeout)
			if (element != null) {
				KeywordUtil.markPassed("Object " + to.getObjectId() + " is present")
			}
			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Object " + to.getObjectId() + " is not present")
		}
		return false;
	}

	/**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */
	@Keyword
	def WebDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}


	@Keyword
	def logInMainApp(String envType, String appId, String appURL){

		Mobile.tap(findTestObject('biNu_AndroidApp_StartupPage/android.widget.TextView0 - ENV Dropdown'), 5)

		//Mobile.tap(findTestObject('biNu_AndroidApp_StartupPage/android.widget.TextView0 - ENV Dropdown', [('env') : envType]), 0)

		Mobile.tap(findTestObject('biNu_AndroidApp_StartupPage/android.widget.TextView0 - PRODUCTION - Option', [('env') : envType]), 5)

		//Mobile.tap(findTestObject('biNu_AndroidApp_StartupPage/android.widget.TextView0 - PRODUCTION - Option'), 0)

		Mobile.setText(findTestObject('biNu_AndroidApp_StartupPage/android.widget.EditText0 - biNuAppId'), appId, 5)

		Mobile.setText(findTestObject('biNu_AndroidApp_StartupPage/android.widget.TextView0 - StartURL'), appURL, 5)

		Mobile.tap(findTestObject('biNu_AndroidApp_StartupPage/android.widget.Button0 - START'), 5)
		
		Mobile.delay(60)
		
		/*def isGoalHomePageDisp = CustomKeywords.'common.Common_lib.isElementPresent_Mobile'(findTestObject('biNu_GoalApp_HomePage/android.widget.TextView0 - Showing 7 days fixtures - full text', 5))

		if (isGoalHomePageDisp == true)
		{
			KeywordUtil.markPassed(envType + " : " + appId + " : " + appURL + " : " + "Login Successful")
		}
		else
		{
			KeywordUtil.markFailedAndStop(envType + " : " + appId + " : " + appURL + " : " + "Login Failed")
		}*/

	}

	@Keyword
	def biNu_MultiApps_homePageVerification(){
		
		println "inside home page"

		
		
		/*println isHomePageTextDisp
		
		if (isHomePageTextDisp == true){
			
			KeywordUtil.markPassed("Home page validation is Successful")
			
		}
		else
		{
			KeywordUtil.markFailedAndStop("Home page validation is Failed")
			
		}*/
		
	}
}
