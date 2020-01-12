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

Mobile.startApplication(GlobalVariable.txtAppApkPath, true)

Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 - PRODUCTION'), 0)

Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 - PRODUCTION (1)'), 0)

Mobile.setText(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.EditText0 - 1472'), String appId, 0)

Mobile.setText(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.EditText0 - httpbinuhosting.bi.nucontentprod34_1472_598binuappnode.xml'), 
    String url, 0)

Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.Button0 - START'), 0)

Mobile.getText(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 - Matches'), 0)


Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.ImageView0_MoreOptions'), 0)

Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 - About'), 0)

Mobile.getText(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 - DataUsageText'), 
    0)

Mobile.getText(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 - biNu MultiAppsVerBuild'), 
    0)

Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.Button0 - OK'), 0)

Mobile.getText(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.LinearLayout0'), 0)

Mobile.getText(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 -    Showing 7 days fixtures for all popular competitions   Click here to select favourite competitions'), 
    0)

Mobile.getText(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 - Wi-Fi'), 0)

Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.TextView0 - Matches (1)'), 0)

Mobile.tap(findTestObject('biNu_AndroidApp_MatchesPage/android.widget.ImageView0 (2)'), 0)

Mobile.closeApplication()

