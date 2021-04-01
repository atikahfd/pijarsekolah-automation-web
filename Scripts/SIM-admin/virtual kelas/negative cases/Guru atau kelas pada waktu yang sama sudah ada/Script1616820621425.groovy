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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Kelas Virtual'))

WebUI.click(findTestObject('admin/Page_Class Virtual - PIJAR/button_Tambah Jadwal'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Pilih Jenis Kelas'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Sementara'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__agenda'), 'Test Virtual Kelas 100')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Pilih Kelas (Bisa lebih dari 1 kelas)'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_V-A'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__date'), '04/04/2021')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_4'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__timeStart'), '10:00')

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input_-_timeFinish'), '12:00')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/h1_Silakan buat Penjadwalan Kelas Virtual dengan mengisi kolom dibawah ini'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__link_kelas_virtual'), 'https://google.com')

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input_Password_password'), 'password')

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/p_Kelas Virtual'), 'Kelas Virtual?')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Buat Jadwal'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/span_Kelas V-A sudah memiliki jadwal kelas virtual pada waktu tersebut'), 
    'Kelas V-A sudah memiliki jadwal kelas virtual pada waktu tersebut')

WebUI.delay(2)

'Remove dan ganti kelas'
WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_V-A_css-xb97g8 select___multi-value__remove'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Pilih Kelas (Bisa lebih dari 1 kelas)'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_V-B'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/p_Kelas Virtual'), 'Kelas Virtual?')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Buat Jadwal'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/span_Guru memiliki jadwal kelas virtual pada waktu tersebut'), 
    'Guru Admin 2 memiliki jadwal kelas virtual pada waktu tersebut')

WebUI.delay(2)

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Batal'))

