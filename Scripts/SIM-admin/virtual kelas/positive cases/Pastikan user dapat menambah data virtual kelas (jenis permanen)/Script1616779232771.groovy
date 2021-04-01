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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Kelas Virtual'))

WebUI.click(findTestObject('admin/Page_Class Virtual - PIJAR/button_Tambah Jadwal'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Pilih Jenis Kelas'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Permanen'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__agenda'), 'Test Virtual Kelas 100 MTK')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Pilih Kelas (Bisa lebih dari 1 kelas)'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_V-A'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__link_kelas_virtual'), 'https://zoom.us/')

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input_Password_password'), 'password')

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/p_Kelas Virtual'), 'Kelas Virtual?')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Buat Jadwal'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/p_Jadwal kelas BERHASIL dibuat'), 'Jadwal kelas BERHASIL dibuat!')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Lihat Jadwal'))

WebUI.setText(findTestObject('admin/Page_Class Virtual - PIJAR/input_Tambah Jadwal_search'), 'Test Virtual Kelas 100')

