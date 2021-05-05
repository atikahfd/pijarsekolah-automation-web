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

WebUI.callTestCase(findTestCase('siswa/login/positive cases/Login Siswa'), [('username') : '9797979797', ('password') : 'password'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('siswa/Page_Beranda - PIJAR/span_Data Siswa'))

WebUI.click(findTestObject('siswa/Page_Beranda - PIJAR/span_Profil Siswa'))

WebUI.delay(2)

WebUI.click(findTestObject('siswa/Page_Profil Siswa - PIJAR/button_Edit'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('siswa/Page_Profil Siswa - PIJAR/input file'), fileFoto)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('siswa/Page_Profil Siswa - PIJAR/span_Format Gambar salah'), 'Format Gambar salah!')

