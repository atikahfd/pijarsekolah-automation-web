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

'User click Akademik on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Akademik'))

'User click Daftar Pelajaran on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Daftar Pelajaran'))

'User set text input search untuk find mata pelajaran : Ilmu Pengetahuan Alam'
WebUI.setText(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/input_search mata pelajaran'), 'Ilmu pengetahuan alam')

'User click icon "pencil"'
WebUI.click(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/DUD/button_btnEdit'))

'User hapus text mata pelajaran'
WebUI.sendKeys(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/Validasi Karakter - PIJAR/input__mataPelajaran'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set text input mata pelajaran '
WebUI.setText(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/Validasi Karakter - PIJAR/input__mataPelajaran'), 
    'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains.')

WebUI.click(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/Validasi Karakter - PIJAR/textarea_Ilmu Pengetahuan Alam'))

WebUI.verifyElementText(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/span_Nama Mata Pelajaran harus berisi Maksimal 50 Karakter'), 
    'Nama Mata Pelajaran harus berisi Maksimal 50 Karakter.')

'User hapus text deskripsi mata pelajaran'
WebUI.sendKeys(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/Validasi Karakter - PIJAR/textarea_Ilmu Pengetahuan Alam'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set text deskripsi mata pelajaran '
WebUI.setText(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/Validasi Karakter - PIJAR/textarea_Ilmu Pengetahuan Alam'), 
    'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains.')

WebUI.click(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/Validasi Karakter - PIJAR/input__mataPelajaran'))

WebUI.verifyElementText(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/span_Deskripsi Mata Pelajaran harus berisi Maksimal 250 Karakter'), 
    'Deskripsi Mata Pelajaran harus berisi Maksimal 250 Karakter.')

WebUI.delay(2)

WebUI.click(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/img_back'))

