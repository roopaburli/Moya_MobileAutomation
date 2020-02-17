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
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.txtAppApkPathEmulator, true)

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

//verify the image
//verify navigation to different tabs
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 5)

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire jokes Menu option'), 5)

def txtYorkShireJokesTitle = Mobile.getText(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - Yorkshire Jokes Page title'), 
    3)

//Dog statue joke
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 5)

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire jokes Menu option'), 10)

Mobile.tap(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - Dogstatue text'), 10)

def txtDogStatueJoke = Mobile.getText(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - DogStatueJoke'), 
    10)

println(txtDogStatueJoke)

//Tom cat joke
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire jokes Menu option'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - Tom cat text'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.ImageView0 - TomCatJokeImage'), 3)

def isImagePresentTomJoke = Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.ImageView0 - TomCatJokeImage'), 
    3)

println(isImagePresentTomJoke)

//Tombstone joke
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire jokes Menu option'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - Tombstone text'), 3)

def txtTombStoneJoke = Mobile.getText(findTestObject('TestBed_MaxApp_YorkshireJokesPage/android.widget.TextView0 - TombStoneJokeText'), 
    3)

println(txtTombStoneJoke)

//
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 3)
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire pictures Menu option'), 3)

//
def txtYorkshirePicturesTitle = Mobile.getText(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.TextView0 - Yorkshire Pictures'), 
    3)

//
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 3)
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire pictures Menu option'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.TextView0 - Burnsall text'), 3)

def isImagePresentBurnsall_unloaded = Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Burnsall Sheep Staithes Image'),
	3)
println(isImagePresentBurnsall_unloaded)

if (isImagePresentBurnsall_unloaded == true){
	Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Burnsall Sheep Staithes Image'), 10)
}

def isImagePresentBurnsall_loaded = Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Burnsall Sheep Staithes Image'),
	3)
println(isImagePresentBurnsall_loaded)

if (isImagePresentBurnsall_loaded == true){
	println "Burnsall image verified"
}


//
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 3)
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire pictures Menu option'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.TextView0 - Staithes text'), 3)

def isImagePresentStaithes_unloaded = Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Staithes image'),
	3)
println(isImagePresentStaithes_unloaded)

if (isImagePresentStaithes_unloaded == true){
	Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Staithes image'), 10)
}

def isImagePresentStaithes_loaded = Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Staithes image'),
	3)
println(isImagePresentStaithes_loaded)

if (isImagePresentStaithes_loaded == true){
	println "Staithes image verified"
}


//
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 3)
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Yorkshire pictures Menu option'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.TextView0 - Sheep text'), 3)

def isImagePresentSheep_unloaded = Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Sheep image'),
	3)
println(isImagePresentSheep_unloaded)

if (isImagePresentSheep_unloaded == true){
	Mobile.tap(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Sheep image'), 10)
}

def isImagePresentSheep_loaded = Mobile.verifyElementExist(findTestObject('TestBed_MaxApp_Yorkshire_PicturesPage/android.widget.ImageView0 - Sheep image'),
	3)
println(isImagePresentSheep_loaded)

if (isImagePresentSheep_loaded == true){
	println "Sheep image verified"
}


// Famous folk

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - Famous Yorkshire folk Menu option'), 
    3)

def txtYorkshirePeopleTitle = Mobile.getText(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Famous Yorkshire People title'), 
    3)



//


Mobile.tap(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Captain James Cook text'), 3)

def txtCptnJamesDescription = Mobile.getText(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Captain James Description'),
	3)
println txtCptnJamesDescription

//
Mobile.tap(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Michael Palin text'), 3)

def txtMichaelDescription = Mobile.getText(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Sir Michael Edward Palin Description'),
	3)
println txtMichaelDescription

//
Mobile.tap(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Guy Fawkes text'), 3)
def txtGuyFawkesDescription = Mobile.getText(findTestObject('TestBed_MaxApp_FamousYorkshirePeople_Page/android.widget.TextView0 - Guy Fawkes Description'),
	3)
println txtGuyFawkesDescription

/*//
Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.ImageButton0 - Hamburger icon'), 3)

Mobile.tap(findTestObject('TestBed_MaxApp_Home_Page/android.widget.CheckedTextView0 - bahNu Context Menu option'), 3)*/

