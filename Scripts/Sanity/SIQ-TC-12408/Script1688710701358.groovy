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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'), 
    10)

WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/a_Quota Refinement'))
WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Download/Page_Lightning Experience  Salesforce/button_Show All'), 
    10)

WebUI.click(findTestObject('Object Repository/Download/Page_Lightning Experience  Salesforce/button_12345'))

WebUI.click(findTestObject('Object Repository/Download/Page_Lightning Experience  Salesforce/lightning-primitive-icon'))

WebUI.click(findTestObject('Object Repository/Download/Page_Lightning Experience  Salesforce/span_View'))

WebUI.click(findTestObject('Object Repository/Download/Page_Lightning Experience  Salesforce/use'))
     


 