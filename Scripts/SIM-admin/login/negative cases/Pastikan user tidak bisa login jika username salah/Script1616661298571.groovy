import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Username belum di input'
WebUI.setText(findTestObject('admin/Page_Login/input_Ingat saya_username'), 'salh@gmail.com')

'Password belum di input'
WebUI.setText(findTestObject('admin/Page_Login/input_Ingat saya_password'), '123456')

'User click button "Masuk"'
WebUI.click(findTestObject('admin/Page_Login/button_Masuk'))

WebUI.delay(2)

'User verify text gagal login : \'username / password yang anda masukkan salah\''
WebUI.verifyElementText(findTestObject('admin/Page_Core Tribe Edu/label_username atau password salah'), 'username atau password salah.')

WebUI.refresh()

