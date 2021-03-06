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

'User click "Data Siswa" on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Siswa'))

'User click "Data Kelas" on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Kelas'))

'User click button Last Page'
WebUI.click(findTestObject('admin/Page_Kelas - Pijar Sekolah/button_Boby_last-btn'))

'User click button page 2'
WebUI.click(findTestObject('admin/Page_Kelas - Pijar Sekolah/button_2'))

'User click button previous'
WebUI.click(findTestObject('admin/Page_Kelas - Pijar Sekolah/button_Boby_previous-btn'))

'User click button next'
WebUI.click(findTestObject('admin/Page_Kelas - Pijar Sekolah/button_Boby_next-btn'))

'User click button First Page'
WebUI.click(findTestObject('admin/Page_Kelas - Pijar Sekolah/button-first'))

