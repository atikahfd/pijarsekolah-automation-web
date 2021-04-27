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

WebUI.click(findTestObject('admin/Page_Kelas - Pijar Sekolah/button_Tambah Data'))

WebUI.click(findTestObject('admin/Page_Data Kelas - PIJAR/div_Input Data  Memasukan data siswa secara manual'))

WebUI.setText(findTestObject('admin/Page_Tambah Kelas - Pijar Sekolah/input__namaKelas'), 'V-Z')

WebUI.click(findTestObject('admin/Page_Data Kelas - PIJAR/div_Pilih Wali Kelas'))

WebUI.click(findTestObject('admin/Page_Tambah Kelas - Pijar Sekolah/div_Rahmat'))

WebUI.click(findTestObject('admin/Page_Data Kelas - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Data Kelas - PIJAR/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Data Kelas - PIJAR/button_OK'))

