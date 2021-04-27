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

'Pop-Up Kehadiran'
WebUI.verifyElementText(findTestObject('guru/Page_Absensi Guru - PIJAR/h2_Isi kehadiran yuk'), 'Isi kehadiran yuk!')

'User click button Isi Kehadiran'
WebUI.click(findTestObject('guru/Page_Beranda - PIJAR/button_Isi kehadiran'))

'Verify text Silahkan Isi Kehadiran'
WebUI.verifyElementText(findTestObject('guru/Page_Absensi Guru - PIJAR/h1_Silahkan Isi Kehadiran'), 'Silahkan Isi Kehadiran')

'User click button Simpan Kehadiran'
WebUI.click(findTestObject('guru/Page_Absensi Guru - PIJAR/button_Simpan Kehadiran'))

'Verify text sukses simpan kehadiran "Terima Kasih!"'
WebUI.verifyElementText(findTestObject('guru/Page_Absensi Guru - PIJAR/Page_Absensi Guru - PIJAR/h1_Terima Kasih'), 'Terima Kasih!')

'Verify text sukses simpan kehadiran "Anda Berhasil Isi Kehadiran"'
WebUI.verifyElementText(findTestObject('guru/Page_Absensi Guru - PIJAR/Page_Absensi Guru - PIJAR/p_Anda Berhasil Isi Kehadiran'), 
    'Anda Berhasil Isi Kehadiran')

'User click button OK'
WebUI.click(findTestObject('guru/Page_Absensi Guru - PIJAR/Page_Absensi Guru - PIJAR/button_OK'))

