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

'User click Ubah Password Saya'
WebUI.click(findTestObject('guru/Page_Beranda - PIJAR/span_Ubah Password Saya'))

'User input password lama'
WebUI.setText(findTestObject('guru/Page_Ubah Password - PIJAR/input__passwordLama'), '160294')

'User input password baru'
WebUI.setText(findTestObject('guru/Page_Ubah Password - PIJAR/input__passwordBaru'), '123456')

'User input konfirmasi password baru'
WebUI.setText(findTestObject('guru/Page_Ubah Password - PIJAR/input__konfirmasiPassword'), '123456')

'User click button Ubah Password'
WebUI.click(findTestObject('guru/Page_Ubah Password - PIJAR/button_Ubah Password'))

'User verifikasi pop-up Sukses!'
WebUI.verifyElementText(findTestObject('guru/Page_Ubah Password - PIJAR/h3_Sukses'), 'Sukses!')

'User verifikasi pop-up Password berhasil diubah'
WebUI.verifyElementText(findTestObject('guru/Page_Ubah Password - PIJAR/p_Password berhasil diubah'), 'Password berhasil diubah')

'User click button OK'
WebUI.click(findTestObject('guru/Page_Ubah Password - PIJAR/button_OK'))

