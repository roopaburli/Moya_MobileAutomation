
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
import com.kms.katalon.core.util.KeywordUtil
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.testng.Assert

//Launch the app

Mobile.startApplication(GlobalVariable.txtAppApkPath, true)

Mobile.delay(20)

//verify welcome dialog
def txtAyup_WelcomeText1 = Mobile.getText(findTestObject('TestBed_MaxApp_Home_Page/android.widget.TextView0 - Ayup'), 5)

def txtAyup_WelcomeText2 = Mobile.getText(findTestObject('TestBed_MaxApp_Home_Page/android.widget.TextView0 - Welcome t Yorkshire'),
	5)

println(txtAyup_WelcomeText1)

println(txtAyup_WelcomeText2)

//verify welcome page text
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.Button0 - CONTINUE'), 5)

def txtWelcomePageText1 = Mobile.getText(findTestObject('TestBed_MaxApp_Home_Page/android.widget.TextView0 - Na thenWelcome text'),
	5)

//Retrieve test cases from datafiles
def maxRowCount = findTestData('TestBed_MaxApp_ExpectedResults').getRowNumbers()

println(maxRowCount)

//verify the image
//verify navigation to different tabs
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 5)

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire jokes Menu option'), 5)

def txtYorkShireJokesTitle = Mobile.getText(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - Yorkshire Jokes Page title'),
	3)


for (i = 1; i <= maxRowCount; i++) {
   
   		def txtTestCaseType = findTestData('TestBed_MaxApp_ExpectedResults').getValue('TestCaseType', i).trim().toUpperCase()
			def txtTestCaseKey = findTestData('TestBed_MaxApp_ExpectedResults').getValue('TestCaseKey', i).trim().toUpperCase()
			
			switch (txtTestCaseType) {
				case ("JOKE") :
					
					if (txtTestCaseKey == "DOG STATUE"){
						
							//Dog statue joke
							Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 10)
							
							Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire jokes Menu option'), 15)
							println 'dog joke tapped'
							
							Mobile.tap(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - Dogstatue text'), 10)
							
							
							def txtDogStatueText_Expected = findTestData('TestBed_MaxApp_ExpectedResults').getValue('TestCaseValue', i).trim()
							
							def txtDogStatueText_Actual = Mobile.getText(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - DogStatueJoke'), 10).trim()
							
							//Assert.assertTrue(txtDogStatueText_Actual.contains(txtDogStatueText_Expected),"TestCase - Pass - Dog jokes text matching!")
							/*Assert.assertTrue(txtTestCaseKey.contains('TOM CAT'), "")
							Assert.assertTrue(txtDogStatueText_Expected, txtDogStatueText_Expected)*/
							
						
							if 	(txtDogStatueText_Actual.contains(txtDogStatueText_Expected))
									{
										//Assert.fail("Dog jokes text not matching!")
										//Assert.assertTrue(txtDogStatueText_Actual.contains(txtDogStatueText_Expected), "TestCase - Pass - Dog jokes text matching!")
										KeywordUtil.markPassed("TestCase - Pass - Dog jokes text - matching!")
										println "TestCase - Pass - Dog jokes text - matching!"
									}
							else
									{
										KeywordUtil.markFailed("TestCase - Fail - Dog jokes text - not matching!")
										println "TestCase - Fail - Dog jokes text - not matching!"
									}
							
							}
								
					
						else if (txtTestCaseKey == "TOM CAT"){
						
								Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 10)
								
								Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire jokes Menu option'), 15)
								
								Mobile.tap(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - Tom cat text'), 10)
								
								Mobile.tap(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.ImageView0 - TomCatJokeImage'), 7)
								
								def isImagePresentTomJoke = Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.ImageView0 - TomCatJokeImage'),
									7)
								
								println (isImagePresentTomJoke)
								
								if (isImagePresentTomJoke == true)
									{
										KeywordUtil.markPassed("TestCase - Pass - Tom Cat text - matching!")
										println "TestCase - Pass - Tom Cat text - matching!"
									}
								else
									{
										KeywordUtil.markFailed("TestCase - Fail - Tom Cat text - not matching!")
										println "TestCase - Fail - Tom Cat text - not matching!"
									}
								
								
							}
						else if (txtTestCaseKey == "TOMBSTONE"){
							
								Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
								
								Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire jokes Menu option'), 7)
								
								Mobile.tap(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - Tombstone text'), 7)
								
								def txtTombStoneText_Actual = Mobile.getText(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - TombStoneJokeText'), 10).trim()
								
								
								println(txtTombStoneText_Actual)
							
								def txtTombStoneText_Expected = findTestData('TestBed_MaxApp_ExpectedResults').getValue('TestCaseValue', i).trim()
								
								if 	(txtTombStoneText_Actual.contains(txtTombStoneText_Expected))
										{
											KeywordUtil.markPassed("TestCase - Pass - Tombstone text - matching!")	
											println "TestCase - Pass - Tombstone text - matching!"
										}
								else
										{
											KeywordUtil.markFailed("TestCase - Fail - Tombstone text - not matching!")
											println "TestCase - Fail - Tombstone text - not matching!"
										}
							}
									
					else
					{
						//no match
						KeywordUtil.markFailed("TestCase - Fail - no Joke matched!")
						println "TestCase - Fail - no Joke matched!"
					}
					
				break;
				
				
				case ("PICTURE") :
				
				if (txtTestCaseKey == "BURNSALL"){
					
						//Burnsall image
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 5)
						
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire pictures Menu option'), 15)
						
						Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.TextView0 - Burnsall text'), 20)
						
						if (Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Burnsall image'), 20, FailureHandling.CONTINUE_ON_FAILURE))
							{
								KeywordUtil.markPassed("TestCase - Pass - Burnsall image is present!")
							}
						else
							{
								KeywordUtil.markFailed("TestCase - Fail - Burnsall image is Not present!")
							}
						
						}
							
				
					else if (txtTestCaseKey == "STAITHES"){
							
							//Staithes image
							Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
							
							Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire pictures Menu option'), 15)
							
							Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.TextView0 - Staithes text'), 15)
							
							if (Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Staithes image'), 15, FailureHandling.CONTINUE_ON_FAILURE))
								{
									KeywordUtil.markPassed("TestCase - Pass - Staithes image is present!")
								}
							else
								{
									KeywordUtil.markFailed("TestCase - Fail - Staithes image is Not present!")
								}
							
							
						}
					else if (txtTestCaseKey == "SHEEP"){
							
							//Sheet image
							Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
							
							Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire pictures Menu option'), 15)
							
							Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.TextView0 - Sheep text'), 15)
							
							if (Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Sheep image'), 15, FailureHandling.CONTINUE_ON_FAILURE))
								{
									KeywordUtil.markPassed("TestCase - Pass - Sheep image is present!")
								}
							else
								{
									KeywordUtil.markFailed("TestCase - Fail - Sheep image is Not present!")
								}
						}
								
				else
				{
					//no match
					KeywordUtil.markFailed("TestCase - Fail - no Joke matched!")
					println "TestCase - Fail - no Joke matched!"
				}
				
			break;
				
				
				
				case ("FAMOUSFOLK") :
					if (txtTestCaseKey == "CAPTAIN JAMES COOK"){
						
					
						//Verify the text - Captain James cook
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Famous Yorkshire folk Menu option'), 10)
						Mobile.tap(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Captain James Cook text'), 10)
						
						def txtCaptJamesCookText_Actual = Mobile.getText(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Captain James Description'), 10)
						def txtCaptJamesCookText_Expected = findTestData('TestBed_MaxApp_ExpectedResults').getValue('TestCaseValue', i).trim()
						
						println txtCaptJamesCookText_Actual
						
						if 	(txtCaptJamesCookText_Actual.contains(txtCaptJamesCookText_Expected))
							{
								println "TestCase - Pass - Captain James Cook text - matching!"
							}
						else
							{
								println "TestCase - Fail - Captain James Cook text - not matching!"
							}
					}
						
					else if (txtTestCaseKey == "MICHAEL PALIN"){
						
						//Verify the text - Michael Palin
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Famous Yorkshire folk Menu option'), 7)
						Mobile.tap(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Michael Palin text'), 10)
						
						def txtMichaelPalinText_Actual = Mobile.getText(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Sir Michael Edward Palin Description'), 10)
						def txtMichaelPalinText_Expected = findTestData('TestBed_MaxApp_ExpectedResults').getValue('TestCaseValue', i).trim()
						
						println txtMichaelPalinText_Actual
						
						if 	(txtMichaelPalinText_Actual.contains(txtMichaelPalinText_Expected))
							{
								println "TestCase - Pass - Michael Palin text - matching!"
							}
						else
							{
								println "TestCase - Fail - Michael Palin text - not matching!"
							}
						
						}
					else if (txtTestCaseKey == "GUY FAWKES")
						{
							
							//Verify the text - Guy Fawkes
							Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
							Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Famous Yorkshire folk Menu option'), 7)
							Mobile.tap(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Guy Fawkes text'), 10)
							
							def txtGuyFawkesText_Actual = Mobile.getText(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Guy Fawkes Description'), 10)
							def txtGuyFawkesText_Expected = findTestData('TestBed_MaxApp_ExpectedResults').getValue('TestCaseValue', i).trim()
							
							
							println txtGuyFawkesText_Actual
							
							if 	(txtGuyFawkesText_Actual.contains(txtGuyFawkesText_Expected))
								{
									println "TestCase - Pass - Guy Fawkes text - matching!"
								}
							else
								{
									println "TestCase - Fail - Guy Fawkes text - not matching!"
								}
						}
				else
					{
						println "Test Case - Fail - Test Case Key - not matched!"
					}
				
				break;
				
				
				case ("CONTENTSIZE") :
				
				if (txtTestCaseKey == "CONTENTSIZE"){
					

						//Content size
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 5)
						
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Content Size Test Menu Option'), 15)
						
						def txtContentText = Mobile.getText(findTestObject('TestBed_MaxApp_ContextText_Page/android.widget.TextView() - Content Test Text'), 15, FailureHandling.CONTINUE_ON_FAILURE).trim()
						println txtContentText
						
						def txtSize = txtContentText.length()
						println txtSize
						
						if (txtSize > 9000)
							{
								KeywordUtil.markPassed("TestCase - Pass - Content Size is more than 9000!")
							}
						else
							{
								KeywordUtil.markFailed("TestCase - Fail - Not all the content is displayed!")
							}
						
						}
				
								
				else
				{
					//no match
					KeywordUtil.markFailed("TestCase - Fail - No Test Case matched!")
					println "TestCase - Fail - No Test Case matched!"
				}
				
			break;
			
			
			case ("WEBTEST") :
			
			if (txtTestCaseKey == "NATIVE TEST WHITE LISTED IMAGE"){
				
					//White Listed image
					Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 5)
					
					Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Web Test Menu Option'), 15)
					
					Mobile.tap(findTestObject('TestBed_MaxApp_WebTestPage/android.widget.TextView0 - Native test - White listed image'), 15)
					
					if (Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_WebTest_Page/android.widget.Image0 - 1 staithes Native Test White Listed Image'), 15, FailureHandling.CONTINUE_ON_FAILURE))
						{
							KeywordUtil.markPassed("TestCase - Pass - Native Test White Listed Image is present!")
						}
					else
						{
							KeywordUtil.markFailed("TestCase - Fail - Native Test White Listed Image is Not present!")
						}
					
					}
						
			
				else if (txtTestCaseKey == "NATIVE TEST NOT WHITE LISTED IMAGE"){
						
						//Not White Listed image
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
						
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Web Test Menu Option'), 15)
						
						Mobile.tap(findTestObject('TestBed_MaxApp_WebTest_Page/android.widget.TextView0 - Native test - Not white listed image'), 15)
						
						if (Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_WebTest_Page/android.view.View0 - 2 Webpage not available'), 15, FailureHandling.CONTINUE_ON_FAILURE))
							{
								def txtErrorWebPageUnavailable = Mobile.getText(findTestObject('TestBed_MaxApp_WebTest_Page/android.view.View0 - 2 The webpage at httpsi.ytimg.com'), 15, FailureHandling.STOP_ON_FAILURE)
								if (txtErrorWebPageUnavailable.contains('The webpage at https://i.ytimg.com/vi/ItRUSNO_Hh4'))
								{
									KeywordUtil.markPassed("TestCase - Pass - Not White Listed Image is Not displayed!")
								}
								
								KeywordUtil.markPassed("TestCase - Pass - Not White Listed Image is Not displayed!")
							}
						else
							{
								KeywordUtil.markFailed("TestCase - Fail - Not White Listed Image is displayed!")
							}
						
						
					}
				else if (txtTestCaseKey == "NATIVE TEST VIDEO"){
						
						//Video test
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
						
						Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Web Test Menu Option'), 15)
						
						Mobile.tap(findTestObject('TestBed_MaxApp_WebTest_Page/android.widget.TextView0 - Native test - Video'), 15)
						
						if (Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_WebTest_Page/android.view.View0 - video - 3'), 15, FailureHandling.CONTINUE_ON_FAILURE))
							{
								KeywordUtil.markPassed("TestCase - Pass - Native Video is present!")
							}
						else
							{
								KeywordUtil.markFailed("TestCase - Fail - Native Video is Not present!")
							}
					}
				
				else if (txtTestCaseKey == "DIRECT TEST NOT WHITE LISTED IMAGE"){
					
					//Direct test Not White Listed Image
					Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
					
					Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Web Test Menu Option'), 15)
					
					Mobile.tap(findTestObject('TestBed_MaxApp_WebTest_Page/android.widget.TextView0 - Direct test - Not white listed image'), 15)
					
					if (Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_WebTest_Page/android.view.View0 - Direct Not White Listed Image Expected'), 15, FailureHandling.CONTINUE_ON_FAILURE))
						{
							KeywordUtil.markPassed("TestCase - Pass - Direct Test Not White Listed Image is Not present!")
							Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)
						}
					else
						{
							KeywordUtil.markFailed("TestCase - Fail - Direct Test Not White Listed Image is present!")
							Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)
						}
				}
				
				
				else if (txtTestCaseKey == "EXTERNAL TEST NOT WHITE LISTED IMAGE"){
					
					//External test Not White Listed Image
					Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 7)
					
					Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Web Test Menu Option'), 15)
					
					Mobile.tap(findTestObject('TestBed_MaxApp_WebTest_Page/android.widget.TextView0 - External test - Not white listed image'), 15)
					
					if (Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_WebTest_Page/android.view.View0 - 5 Direct Test Not White Listed Image'), 15, FailureHandling.CONTINUE_ON_FAILURE))
						{
							KeywordUtil.markPassed("TestCase - Pass - External test - Not white listed Image is Not present!")
							Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)
						}
					else
						{
							KeywordUtil.markFailed("TestCase - Fail - External test - Not white listed is present!")
							Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)
						}
				}
				
							
			else
			{
				//no match
				KeywordUtil.markFailed("TestCase - Fail - no Joke matched!")
				println "TestCase - Fail - no Joke matched!"
			}
			
		break;
			
				default:
					println 'Test Case - Fail - No Execution - Test Case Type - not matching!'
				break;
				
		}
		
			
	}		
			
Mobile.closeApplication()
        
    








