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

WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Navigate to URL SIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SIM-admin/login/positive cases/TC001-Pastikan admin bisa login'), [('username') : 'pijarsekolahv2@gmail.com'
        , ('password') : 'password'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Pengumuman'))

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halman Pengumuman'))

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_Tambah Pengumuman'))

WebUI.click(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/Select_Pilih_Ke'))

WebUI.click(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/div_Semua'))

WebUI.setText(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/input__judul'), 'Mencoba Data Pengumuman')

WebUI.setText(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/input__tanggal'), '15/03/2021')

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/input_detail_kegiatan'))

WebUI.setText(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/input_detail_kegiatan'), 'Mencoba test pengumuman menambah data')

WebUI.focus(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/upload file'))

WebUI.uploadFile(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/upload file pengumuman'), file)

WebUI.delay(2)

WebUI.click(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/button_Simpan_pengumuman'))

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Tambah Pengumuman - PIJAR/button_OK'))

