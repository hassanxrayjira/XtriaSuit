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

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/dropdown'))

not_run: WebUI.callTestCase(findTestCase('Login Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'), 
    10)

not_run: WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'), 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/a_Quota Refinement'))
not_run: WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'))

not_run: WebUI.click(findTestObject('Object Repository/New Folder/Copy QR/Page_Lightning Experience  Salesforce/lightning-primitive-icon'))

WebUI.click(findTestObject('New Folder/Copy QR/Page_Lightning Experience  Salesforce/span_Copy'))

WebUI.click(findTestObject('Object Repository/New Folder/Copy QR/Page_Lightning Experience  Salesforce/input_Copy_slds-button slds-button_brand'))

WebUI.delay(5)

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Copy QR/Page_Lightning Experience  Salesforce/label_Name'), 
    0)

def now = new Date()

String val = now.format('yyyy-mm-dd HH:mm:s')

println('Test' + val)

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/input_Name_quotaName'), 
    val)

WebUI.click(findTestObject('Object Repository/New Folder/Copy QR/Page_Lightning Experience  Salesforce/lightning-spinner_Loading'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Next'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Next_1'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Generate Cycle'))

WebUI.delay(20)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_View Full Hierarchy'), 
    10)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/label_Product'), 
    10)

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/button_Submit'))

WebUI.delay(6)

