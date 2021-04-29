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

WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Navigate to URL SIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin/Forgot Password/a_Lupa password'))

WebUI.verifyElementText(findTestObject('admin/Forgot Password/h1_Lupa Password'), 'Lupa Password?')

WebUI.verifyElementText(findTestObject('admin/Forgot Password/h2_Lupa Password Admin'), 'Lupa Password Admin')

WebUI.setText(findTestObject('admin/Forgot Password/input_Lupa Password Admin_email'), GlobalVariable.usernameAdmin)

WebUI.click(findTestObject('admin/Forgot Password/button_Kirim'))

WebUI.verifyElementText(findTestObject('admin/Forgot Password/h1_Email telah dikirim'), 'Email telah dikirim!')

WebUI.click(findTestObject('admin/Forgot Password/button_OK'))

