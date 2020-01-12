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

//Mobile.tap(findTestObject('biNu_AndroidApp_StartupPage/android.widget.TextView0 - ENV Dropdown',[('production') : production]), 0)
/*
Mobile.tap(findTestObject('biNu_AndroidApp_StartupPage/android.widget.TextView0 - PRODUCTION - Option'), 0)

Mobile.setText(findTestObject('biNu_AndroidApp_StartupPage/android.widget.EditText0 - biNuAppId'), appId, 0)

Mobile.setText(findTestObject('biNu_AndroidApp_StartupPage/android.widget.TextView0 - StartURL'), appURL, 0)

Mobile.tap(findTestObject('biNu_AndroidApp_StartupPage/android.widget.Button0 - START'), 0*/

CustomKeywords.'common.Common_lib.logInMainApp'(Env, appId, appURL)

