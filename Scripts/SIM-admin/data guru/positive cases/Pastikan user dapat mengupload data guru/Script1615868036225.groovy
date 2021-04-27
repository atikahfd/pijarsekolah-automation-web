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

'User click Data Guru on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User click button "Tambah Data"\r'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Tambah Data'))

'User click upload data guru'
WebUI.focus(findTestObject('admin/Page_Daftar Guru - PIJAR/div_Upload Data Memasukkan data Guru yang sudah diketik pada Ms Excel sesuai format - Unduh format disini'))

'User upload data guru file excel'
WebUI.uploadFile(findTestObject('admin/Page_Daftar Guru - PIJAR/upload file/upload data guru'), file)

'User verifikasi alert = Success'
WebUI.verifyElementText(findTestObject('admin/Page_Daftar Guru - PIJAR/h3_SuccessUploadDataGuru'), 'Success')

'User click exit alert success'
WebUI.check(findTestObject('admin/Page_Daftar Guru - PIJAR/button_exitSuccesUploadGuru'))

