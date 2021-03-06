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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('My Account/General Information/OpenGeneralInformationPage'), [:], FailureHandling.STOP_ON_FAILURE)

def info = WebUI.callTestCase(findTestCase('PrepareDataFromExcelFiles/PrepareDataForGeneralInfoFileUpload'), [:], FailureHandling.STOP_ON_FAILURE)

def localVPID = info.localVPID

def fakeVPID = info.fakeVPID

def localBL = info.localBL

def fakeBL = info.fakeBL

def localPP = info.localPP

def fakePP = info.fakePP

WebUI.callTestCase(findTestCase('My Account/General Information/New Folder/UploadValidPhotoID - Copy'), [('LocalPath') : localVPID], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('My Account/General Information/New Folder/UploadBusinessLicense - Copy'), [('LocalPath') : localBL], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('My Account/General Information/New Folder/UploadProfilePhoto - Copy'), [('LocalPath') : localPP], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MyAccount/Page_GeneralInformation/button_save'))

WebUI.click(findTestObject('Page_MyAccount/Page_GeneralInformation/button_OK_SaveSuccessfully'))

WebUI.callTestCase(findTestCase('My Account/General Information/VerifyFilesAfterUpload'), [('ValidPhotoIDFilePath') : ''
        , ('BusinessLicenseFilePath') : '', ('ProfilePhotoFilePath') : ''], FailureHandling.STOP_ON_FAILURE)

