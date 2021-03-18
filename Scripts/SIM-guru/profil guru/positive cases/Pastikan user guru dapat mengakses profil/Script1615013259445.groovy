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

'User click Data Guru on side menu\r'
WebUI.click(findTestObject('guru/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu\r'
WebUI.click(findTestObject('guru/Page_Beranda - PIJAR/span_Profil Guru'))

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_Jono'), 'Jono')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_121312131213'), '121312131213')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_Jakarta'), 'Jakarta')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_Laki-laki'), 'Laki-laki')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_jonogmailcom'), 'jono@gmail.com')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_1990020109920004'), '1990020109920004')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_Jalan perjuangan'), 'Jalan perjuangan')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_081213124547'), '081213124547')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_Matematika'), 'Matematika')

WebUI.refresh()

