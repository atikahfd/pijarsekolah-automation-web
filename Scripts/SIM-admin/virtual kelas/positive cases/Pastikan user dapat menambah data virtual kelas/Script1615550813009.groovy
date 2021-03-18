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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Kelas Virtual'))

WebUI.click(findTestObject('admin/Page_Class Virtual - PIJAR/Halaman Kelas Virtual'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Class Virtual - PIJAR/button_Tambah Jadwal'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/Halaman Form Tambah Virtual Kelas'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/Jenis Kelas'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Permanen'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__agenda'), 'Mencoba Menambah Virtual Tugas Dengan Automatic Test')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/Kelas'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_I-A'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__link_kelas_virtual'), 'https://google.com')

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input_Password_password'), 'password')

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/p_Kelas Virtual'), 'Kelas Virtual?')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Buat Jadwal'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/p_Jadwal kelas BERHASIL dibuat'), 'Jadwal kelas BERHASIL dibuat!')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Lihat Jadwal'))

