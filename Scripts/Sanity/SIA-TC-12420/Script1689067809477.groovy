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

WebUI.callTestCase(findTestCase('Sanity/SIQ-TC-12402'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_View Full Hierarchy'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/label_Product'), 
    30)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_Submit'))

WebUI.delay(6)

WebUI.scrollToElement(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_12345'), 
    0)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_12345'))

//
WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Quota Refinement'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Quota Refinement'), 
    0)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/DeleteDrop'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/DeleteDrop'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/Delet'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/Confirm'))

//Delete
WebUI.scrollToElement(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/Selectside2'), 
    0)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/Selectside2'))

//
//WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Quota Refinement'),
//	0)
//
//WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Quota Refinement'),
//	0)
WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/dropdown - Copy'))

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/dropdown - Copy'))

//WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/Delet'))
WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/DeleteItem'))

//WebUI.click(findTestObject('Object Repository/New Folder/Deligate HO/Page_Lightning Experience  Salesforce/DeleteItem'))
WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/Confirm'))

WebUI.delay(16)

//Delete Folder
WebUI.scrollToElement(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_12345'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_12345'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/DeletFolder'))
//
//WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Quota Refinement'), 
//s   0)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/DeleteConfirmation'))


