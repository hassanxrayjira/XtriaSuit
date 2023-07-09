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

//WebUI.callTestCase(findTestCase('Login Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/lightning-primitive-icon'))

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/span_Delegated Cycle'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/h2_Delegated QR Cycle'), 
    0)

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/svg_Status_slds-icon slds-icon_x-small slds_cb963e'))

WebUI.delay(4)

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/label_Product'), 
    0)

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'))

WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'), '0')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C1'))

WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C1'), '0')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R2'))

WebUI.delay(4)


WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R2'), '0')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C2'))

WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C2'), '0')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R3'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R3'), '0')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C3'))

WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C3'), '0')


WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R4'))

WebUI.delay(4)
WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R4'), '0')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C4'))

WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C4'), '0')


WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R5'))
WebUI.delay(4)


WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R5'), '0')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C5'))

WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/C5'), '0')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R5'))

WebUI.delay(4)

//
//WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/use'))
//
//WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'), 
//    '1000')
//
//WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'), 
//    '')
//
//WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/lightning-spinner_Showing 1-5 of 9 records__8ca8ca'))
//
//WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'), 
//    '')
//
//WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/lightning-spinner_Showing 1-5 of 9 records__8ca8ca'))
//
//WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'), 
//    '')
//
//WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/lightning-spinner_Showing 1-5 of 9 records__8ca8ca'))
//
//WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'), 
//    '')
//
//WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/lightning-spinner_Showing 1-5 of 9 records__8ca8ca'))
//
//WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'), 
//    '0')
//
//WebUI.delay(4)
//
//WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/R1'), 
//    '1')
not_run: WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/div_Quota RefinementQuota_Refinement  Ap202_582c08'))
//WebUI.refresh()
WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/button_Close'))

WebUI.delay(4)

WebUI.click(findTestObject('Approvals/Page_Lightning Experience  Salesforce/button_Submit - Copy'))

WebUI.delay(10)
println('Name Of Test' +GlobalVariable.Nameof)

//WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/lightning-primitive-icon'))

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/dropdown'))
//WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/lightning-primitive-icon'))
WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/span_RefineReview'))



WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/span_Approvals1'))

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/input_Status_radio'))

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/button_Select Action'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/span_Approved'))

WebUI.setText(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/textarea_Comment_comment-textarea'), 
    'test')

WebUI.click(findTestObject('Object Repository/Approvals/Page_Lightning Experience  Salesforce/button_Submit'))

