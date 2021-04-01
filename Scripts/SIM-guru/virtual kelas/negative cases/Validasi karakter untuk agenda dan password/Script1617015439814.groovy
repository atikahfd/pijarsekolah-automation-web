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

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__agenda'), 'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains. ')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_Pilih Kelas (Bisa lebih dari 1 kelas)'))

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_V-A'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__date'), '04/04/2021')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/div_4'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__timeStart'), '10:00')

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input_-_timeFinish'), '12:00')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/h1_Silakan buat Penjadwalan Kelas Virtual dengan mengisi kolom dibawah ini'))

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input__link_kelas_virtual'), 'https://google.com')

WebUI.setText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/input_Password_password'), 'passworddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd')

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/h1_Silakan buat Penjadwalan Kelas Virtual dengan mengisi kolom dibawah ini'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/span_Panjang agenda tidak boleh melebihi 99 karakter'), 
    'Panjang agenda tidak boleh melebihi 99 karakter.')

WebUI.verifyElementText(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/span_Panjang password tidak boleh melebihi 39 karakter'), 
    'Panjang password tidak boleh melebihi 39 karakter.')

WebUI.delay(2)

WebUI.click(findTestObject('admin/Page_Add Kelas Virtual - PIJAR/button_Batal'))

