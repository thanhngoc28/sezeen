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

ValidPhotoIDFilePath = WebUI.getAttribute(findTestObject('Page_MyAccount/Page_GeneralInformation/input_BrowseValidPhotoID'), 
    'value')

WebUI.verifyMatch(ValidPhotoIDFilePath, 'C:\\fakepath\\image 1.jpeg', false)

BusinessLicenseFilePath = WebUI.getAttribute(findTestObject('Page_MyAccount/Page_GeneralInformation/input_BrowseBusinessLicense'), 
    'value')

WebUI.verifyMatch(BusinessLicenseFilePath, 'C:\\fakepath\\Sample 1.pdf', false)

ProfilePhotoFilePath = WebUI.getAttribute(findTestObject('Page_MyAccount/Page_GeneralInformation/input_BrowseProfilePhoto'), 
    'value')

WebUI.verifyMatch(ProfilePhotoFilePath, 'C:\\fakepath\\image 3.jpg', false)

