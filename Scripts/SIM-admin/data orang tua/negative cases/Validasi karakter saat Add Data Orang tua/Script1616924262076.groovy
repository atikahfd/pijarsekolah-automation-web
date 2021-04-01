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

'User click Data Siswa on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Siswa'))

'User click Orang Tua on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Orang Tua'))

WebUI.delay(1)

'User click button Tambah Data'
WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_Tambah Data'))

'User click Masukan Data Manual'
WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/div_Input Data  Memasukkan data Orang Tua secara manual'))

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__fatherName'), 'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__motherName'), 'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__fatherWork'), 'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__motherWork'), 'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__phoneNumber1'), '08')

WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/textarea__address'), 'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains')

WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/div_Cari Anak'))

WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/div_Kaka QA'))

WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/button_Simpan'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/span_Panjang Nama Ayah tidak boleh melebihi 60 karakter'), 
    'Panjang Nama Ayah tidak boleh melebihi 60 karakter')

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/span_Panjang Nama Ibu tidak boleh melebihi 60 karakter'), 
    'Panjang Nama Ibu tidak boleh melebihi 60 karakter')

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/span_Panjang Profesi Ayah tidak boleh melebihi 40 karakter'), 
    'Panjang Profesi Ayah tidak boleh melebihi 40 karakter')

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/span_Panjang Profesi Ibu tidak boleh melebihi 40 karakter'), 
    'Panjang Profesi Ibu tidak boleh melebihi 40 karakter')

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/span_Panjang nomor telepon minimal 5 karakter dan maksimal 14 karakter'), 
    'Panjang nomor telepon minimal 5 karakter dan maksimal 14 karakter')

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/span_Panjang Alamat tidak boleh melebihi 200 karakter'), 
    'Panjang Alamat tidak boleh melebihi 200 karakter')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/a_Batal'), 5)

WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/a_Batal'))

