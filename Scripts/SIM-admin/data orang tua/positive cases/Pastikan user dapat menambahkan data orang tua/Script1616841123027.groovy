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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Orang Tua'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_Tambah Data'))

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/div_Input Data  Memasukkan data Orang Tua secara manual'))

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__fatherName'), 'Koko QA')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__motherName'), 'Kiki QA')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__fatherWork'), 'Esport')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__motherWork'), 'PNS')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__phoneNumber1'), '082211334455')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/textarea__address'), 'Jalan Cemerlang')

WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/div_Cari Anak'))

WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/div_Kaka QA'))

WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_OK'))

