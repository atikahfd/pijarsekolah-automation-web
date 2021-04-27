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

WebUI.callTestCase(findTestCase('CustomKeyword/Full Login Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Siswa'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Orang Tua'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_Tambah Data'))

WebUI.focus(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/div_Unggah Data Memasukkan data Orang Tua yang sudah diketik pada Ms Excel sesuai format - Unduh format disini'))

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/a_Unduh format disini'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/Upload Data Orang Tua'), file)

WebUI.verifyElementText(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/h3_Success'), 'Success')

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_exit'))

