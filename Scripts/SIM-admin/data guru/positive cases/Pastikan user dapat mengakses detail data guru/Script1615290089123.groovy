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

'User click Data Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User set text untuk find guru dengan nama \'Jono\''
WebUI.setText(findTestObject('admin/Page_Daftar Guru - PIJAR/input_Tambah Data_search'), 'Jono')

'User click icon "Eye" untuk melihat detail guru Jono'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_btnDetail'))

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_Jono'), 'Jono')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_121312131213'), '121312131213')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_Jakarta'), 'Jakarta')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_Laki-laki'), 'Laki-laki')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_jonogmailcom'), 'jono@gmail.com')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_1990020109920004'), '1990020109920004')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_Jalan perjuangan'), 'Jalan perjuangan')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_081213124547'), '081213124547')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Guru - PIJAR/Page_Detail Guru - Jono/td_Matematika'), 'Matematika')

WebUI.scrollToElement(findTestObject('admin/Page_Detail Guru - PIJAR/button_Kembali'), 5)

'User click button "Kembali"'
WebUI.click(findTestObject('admin/Page_Detail Guru - PIJAR/button_Kembali'))

