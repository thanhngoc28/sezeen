import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def info = WebUI.callTestCase(findTestCase('PrepareDataFromExcelFiles/PrepareDataForLogin'), [:], FailureHandling.STOP_ON_FAILURE)

def url = info.url

def username = info.username

def password = info.password

WS.comment('Open browser and navigate to https://sezeen.saritasa-hosting.com')

WebUI.openBrowser(url)

WebUI.maximizeWindow()

WS.comment('Close Get Started popup')

WebUI.click(findTestObject('Page_Sezeen/button_GET STARTED'))

WS.comment('Open Login page')

WebUI.click(findTestObject('Page_Sezeen/a_LOGIN'))

WS.comment('Fill in username')

WebUI.setText(findTestObject('Page_Sezeen/input_email'), username)

WS.comment('Fill in password')

WebUI.setText(findTestObject('Page_Sezeen/input_password'), password)

WS.comment('Click Login button')

WebUI.click(findTestObject('Page_Sezeen/button_Login'))

WS.comment('Verify if login is successful or not')

WebUI.verifyElementNotPresent(findTestObject('Page_Sezeen/a_LOGIN'), 0)

WS.comment('Login was successful')

