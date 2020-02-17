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

//Content size
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 5)

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Content Size Test Menu Option'), 15)

def txtContentText = Mobile.getText(findTestObject('TestBed_MaxApp_ContextText_Page/android.widget.TextView() - Content Test Text'), 10, FailureHandling.CONTINUE_ON_FAILURE).trim()
println txtContentText

def txtSize = txtContentText.length()
println txtSize








