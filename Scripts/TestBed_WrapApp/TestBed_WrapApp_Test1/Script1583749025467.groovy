import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.testng.Assert

Mobile.startApplication(GlobalVariable.txtAppApkPath, true)
Mobile.delay(20)

//Mobile.swipe(0, 0, 0, 0, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject("TestBed_WrapApp_HomePage/HomePage_Navigation2/android.view.View0 - Wrap Testbed-bannerText"), 5, FailureHandling.CONTINUE_ON_FAILURE))
{

	KeywordUtil.markPassed("Test case - Pass - Wrap app opened successfully")	



	// Test 302 Refresh page button
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - 302 Refresh PageButton'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - 302 Refresh PageButton'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
		if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - 302 Refresh PageButton'), 5, FailureHandling.CONTINUE_ON_FAILURE))
		{
			
			KeywordUtil.markPassed("Test case - Pass - 302 Refresh Page is successful")
				
		}
		else
		{
			KeywordUtil.markFailed("Test case - Fail - 302 Refresh Page is Not successful")
		}
		
	}
	else
	{
	
		KeywordUtil.markFailed("Test case - Fail - 302 Refresh Page button is not found")
		
	}
	
	
	//Test - 302 Valid Redirect
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - 302 Valid Redirect-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - 302 Valid Redirect-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
		if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/WebSocket/android.view.View0-PageRedirected-302 Valid Redirect-Text'), 5, FailureHandling.CONTINUE_ON_FAILURE))
		{
			
			Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - 302 Refresh PageButton'), 5, FailureHandling.CONTINUE_ON_FAILURE)
			KeywordUtil.markPassed("Test case - Pass - 302 Valid Redirect is successful")
				
		}
		else
		{
			KeywordUtil.markFailed("Test case - Fail - 302 Valid Redirect is Not successful")
		}
		
	}
	else
	{
	
		KeywordUtil.markFailed("Test case - Fail - 302 Valid Redirect button is not found")
		
	}
	
	// Test Web Sockets
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - Web Sockets-button'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - Web Sockets-button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
		if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/WebSocket/android.webkit.WebView0 - WebSocket Test'), 5, FailureHandling.CONTINUE_ON_FAILURE))
			{
				def txtWebSocketConnected = Mobile.getText(findTestObject('TestBed_WrapApp_HomePage/WebSocket/android.view.View0 - CONNECTEDText'), 5, FailureHandling.CONTINUE_ON_FAILURE)
				def txtWebSocketResponse = Mobile.getText(findTestObject('TestBed_WrapApp_HomePage/WebSocket/android.view.View0 - RESPONSEText'), 5, FailureHandling.CONTINUE_ON_FAILURE)
				def txtWebSocketSent = Mobile.getText(findTestObject('TestBed_WrapApp_HomePage/WebSocket/android.view.View0 - SENTText'), 5, FailureHandling.CONTINUE_ON_FAILURE)
				
				Mobile.pressBack(FailureHandling.CONTINUE_ON_FAILURE)
				
				KeywordUtil.markPassed("Test case - Pass - WebSocket redirect is successful: " + txtWebSocketConnected + " : " + txtWebSocketResponse + " : " + txtWebSocketSent)
				
			}
		else
			{
				
				KeywordUtil.markFailed("Test case - Fail - WebSocket redict is Not successful")
			}
	}
	else
	{
		KeywordUtil.markFailed("Test case - Fail - WebSocket button is not found")
	}
	
	
	// Test Go to Apple button
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - Go To Apple-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - Go To Apple-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
			if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.TextView0-GoToApple-Custom Exit Message-Text'), 5, FailureHandling.CONTINUE_ON_FAILURE))
			{
				Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.Button0-GoToApple-CANCEL'), 5, FailureHandling.CONTINUE_ON_FAILURE)
				KeywordUtil.markPassed("Test case - Pass - Go to Apple - display of Custom Exit message is successful")
			}
			else
			{
				KeywordUtil.markFailed("Test case - Fail - Go to Apple - display of Custom Exit message is Not successful")
			}
	}
	else
	{
		
		KeywordUtil.markFailed("Test case - Fail - Go to Apple button is not found")
	}
	
	// Test 302 Redirect to Apple button
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - 302 Redirect To Apple-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - 302 Redirect To Apple-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
			if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.TextView0-GoToApple-Custom Exit Message-Text'), 5, FailureHandling.CONTINUE_ON_FAILURE))
			{
				Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.Button0-GoToApple-CANCEL'), 5, FailureHandling.CONTINUE_ON_FAILURE)
				KeywordUtil.markPassed("Test case - Pass - 302 Redirect Go to Apple - display of Custom Exit message is successful")
			}
			else
			{
				KeywordUtil.markFailed("Test case - Fail - 302 Redirect Go to Apple - display of Custom Exit message is Not successful")
			}
	}
	else
	{
		
		KeywordUtil.markFailed("Test case - Fail - 302 Redirect Go to Apple button is not found")
	}
	
	// Test Youtube via Exit message to Apple button
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - YouTube via EXIT Msg-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - YouTube via EXIT Msg-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
			if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.TextView0-GoToApple-Custom Exit Message-Text'), 5, FailureHandling.CONTINUE_ON_FAILURE))
			{
				Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.Button0-GoToApple-CANCEL'), 5, FailureHandling.CONTINUE_ON_FAILURE)
				KeywordUtil.markPassed("Test case - Pass - Youtube via Exit - display of Custom Exit message is successful")
			}
			else
			{
				KeywordUtil.markFailed("Test case - Fail - Youtube via Exit - display of Custom Exit message is Not successful")
			}
	}
	else
	{
		
		KeywordUtil.markFailed("Test case - Fail - Youtube via Exit button is not found")
	}

	
	// Test YouTube video player
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.view.View0 - YouTube Video Player'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.view.View0 - YouTube Video Player'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
			if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - PlayButton'), 5, FailureHandling.CONTINUE_ON_FAILURE))
			{
				
				KeywordUtil.markPassed("Test case - Pass - Youtube video player - display of Custom Exit message is successful")
			}
			else
			{
				KeywordUtil.markFailed("Test case - Fail - Youtube video player - display of Custom Exit message is Not successful")
			}
	}
	else
	{
		
		KeywordUtil.markFailed("Test case - Fail - Youtube video player is not found")
	}
	
	
	// Test Go to binu blocked message
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - Go To biNu - BLOCKED Msg-Button (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - Go To biNu - BLOCKED Msg-Button (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
			if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.TextView0-GoToApple-Custom Exit Message-Text'), 5, FailureHandling.CONTINUE_ON_FAILURE))
			{
				
				KeywordUtil.markPassed("Test case - Pass - Binu blocked message - display of Custom message is successful")
			}
			else
			{
				KeywordUtil.markFailed("Test case - Fail - Binu blocked message - display of Custom message is Not successful")
			}
	}
	else
	{
		
		KeywordUtil.markFailed("Test case - Fail - Binu blocked message button - is not found")
	}
	
	// Test Upload/Download
	
	//Download Get Method
	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.Button0 - Get Method Download button'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.Button0 - Get Method Download button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.Button0-Choose File-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
		if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.TextView0 - 1.70 MB'), 5, FailureHandling.CONTINUE_ON_FAILURE))
		{
			def txtFileSize = Mobile.getText(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.TextView0 - 1.70 MB'), 5, FailureHandling.CONTINUE_ON_FAILURE)
			if (txtFileSize > 0)
			{
				KeywordUtil.markPassed("Test case - Pass - Get download file size is: " + txtFileSize)
				Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.LinearLayout0 - Tank bin file path'), 5, FailureHandling.CONTINUE_ON_FAILURE)
			}
			else
			{
				KeywordUtil.markFailed("Test case - Fail - Get download file is Not successful. File size is: " + txtFileSize)		
				Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.LinearLayout0 - Tank bin file path'), 5, FailureHandling.CONTINUE_ON_FAILURE)
			}
			
		}
		else
		{
			KeywordUtil.markFailed("Test case - Fail - Download file size object is not found")	
		}
		
		
	}
	else
	{
		
		KeywordUtil.markFailed("Test case - Fail - Upload/Download button - is not found")
	}
	
	//Upload	
	if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - UploadDownload-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE))
	{
		
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/HomePage_Navigation2/android.widget.Button0 - UploadDownload-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.Button0-Choose File-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.LinearLayout0 - Tank bin file path'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.widget.Button0 - Upload-Button'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		
		if (Mobile.verifyElementExist(findTestObject('TestBed_WrapApp_HomePage/Navigations/android.view.View0 - The file tank.binhas been uploaded.'), 5, FailureHandling.CONTINUE_ON_FAILURE))
			{
				
				KeywordUtil.markPassed("Test case - Pass - Upload File is successful")
			}
		else
			{
				KeywordUtil.markFailed("Test case - Fail - Upload File is Not successful")
			}
	}
	else
	{
		
		KeywordUtil.markFailed("Test case - Fail - Upload/Download button - is not found")
	}
	
}

else
{
	KeywordUtil.markPassed("Test case - Fail - Wrap app didn't open successfully")
	
}


