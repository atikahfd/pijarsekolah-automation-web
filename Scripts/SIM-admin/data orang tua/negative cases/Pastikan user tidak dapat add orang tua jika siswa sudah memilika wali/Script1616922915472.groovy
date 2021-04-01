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

'User click \'Masukan Data Manual\''
WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/div_Input Data  Memasukkan data Orang Tua secara manual'))

'User set text input Nama Ayah'
WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__fatherName'), 'Koko QA')

'User set text input Nama Ibu'
WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__motherName'), 'Kiki QA')

'User set text input Pekerjaan Ayah'
WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__fatherWork'), 'Esport')

'User set text input Pekerjaan Ibu'
WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__motherWork'), 'PNS')

'User set text input No telpon 1'
WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/input__phoneNumber1'), '082211334455')

'User set text input Alamat'
WebUI.setText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/textarea__address'), 'Jalan Cemerlang')

'User click cari anak untuk menampilkan list data siswa'
WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/div_Cari Anak'))

'User click siswa yang menjadi anak dari orang tua tersebut'
WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/div_Kaka QA'))

'User click button "Simpan"'
WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/button_Simpan'))

'User verify text : \'Siswa Telah Memiliki Perwakilan\''
WebUI.verifyElementText(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/span_Siswa Telah Memiliki Perwakilan'), 
    'Siswa Telah Memiliki Perwakilan')

'User mengganti anak atau click button batal'
WebUI.delay(2)

'User click button Batal'
WebUI.click(findTestObject('admin/Page_Tambah Orang Tua - Pijar Sekolah/a_Batal'))

