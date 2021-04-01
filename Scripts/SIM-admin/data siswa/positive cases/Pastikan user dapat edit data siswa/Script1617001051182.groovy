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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Siswa'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Siswa'))

WebUI.setText(findTestObject('admin/Page_Profil Siswa - PIJAR/input_Tambah Data_Search'), 'Fadly Surya')

WebUI.delay(2)

WebUI.click(findTestObject('admin/Page_Profil Siswa - PIJAR/button_btnEditSiswa'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/input__fullName'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/input__fullName'), 'Fadly Surya Alam')

WebUI.click(findTestObject('admin/Page_Tambah Profil Siswa - PIJAR/div_Pilih Jenis Kelamin'))

WebUI.click(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/div_Laki-laki'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/input__birthPlace'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/input__birthPlace'), 'Kalimantan')

WebUI.sendKeys(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/input__birth'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/input__birth'), '10/11/2010')

WebUI.click(findTestObject('admin/Page_Tambah Profil Siswa - PIJAR/div_10'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/input__nis'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/input__nis'), '46464646')

WebUI.click(findTestObject('admin/Page_Tambah Profil Siswa - PIJAR/div_Pilih Agama'))

WebUI.click(findTestObject('admin/Page_Tambah Profil Siswa - PIJAR/div_Kristen'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/textarea__address'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Profil Siswa - PIJAR/textarea__address'), 'Jalan Semangka')

WebUI.click(findTestObject('admin/Page_Tambah Profil Siswa - PIJAR/div_Pilih Kelas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin/Page_Tambah Profil Siswa - PIJAR/div_V-B'))

WebUI.click(findTestObject('admin/Page_Tambah Profil Siswa - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Profil Siswa - PIJAR/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Profil Siswa - PIJAR/button_OK'))

