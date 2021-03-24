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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Siswa'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Kelas'))

WebUI.click(findTestObject('admin/Page_Data Kelas - PIJAR/button_Tambah Data'))

WebUI.focus(findTestObject('admin/Page_Data Kelas - PIJAR/Upload file/div___25JKTDiGAsl_gfWaijz06K'))

WebUI.uploadFile(findTestObject('admin/Page_Data Kelas - PIJAR/Upload file/upload data class'), file)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('admin/Page_Data Kelas - PIJAR/Success import data kelas/h3_Success'), 'Success')

WebUI.click(findTestObject('admin/Page_Data Kelas - PIJAR/Success import data kelas/button_exit'))

