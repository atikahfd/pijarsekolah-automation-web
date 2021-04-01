import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'User click button "Tambah Data"\r'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Tambah Data'))

'User click Input Data'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/div_Input Data  Memasukan data Guru secara manual'))

'User set text nama guru : \'Jono\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nama'), 'Sains adalah sekumpulan pengetahuan empiris, teoretis, dan pengetahuan praktis tentang dunia alam, yang dihasilkan oleh para ilmuwan yang menekankan pengamatan, penjelasan, dan prediksi dari fenomena di dunia nyata. Historiografi dari sains, sebaliknya, sering kali mengacu pada metode historis dari sejarah intelektual dan sejarah sosial. Namun, kata scientist dalam bahasa Inggris relatif baru—pertama kali diciptakan oleh William Whewell pada abad ke-19. Sebelumnya, orang yang menyelidiki alam menyebut diri mereka sendiri sebagai filsuf alam.')

'User set number nip guru : \'121312131213\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nip'), '1213')

'User set text tempat lahir guru : \'Jakarta\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__tempatLahir'), 'Jakarta')

'User set tanggal lahir guru : \'16/02/1994\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__tanggalLahir'), '16/02/1994')

'User click tanggal 16 pada kalender'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_16'))

'User click Pilih Jenis Kelamin untuk memilih jenis kelamin'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Pilih Jenis Kelamin'))

'User click \'Laki-Laki\''
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Laki-laki'))

'User set email guru : \'jono@gmail.com'
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__email'), 'jono')

'User click Pilih Mata Pelajaran untuk memilih mata pelajaran guru'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Pilih Mata Pelajaran'))

'User click mata pelajaran \'Matematika\''
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Matematika'))

'1990020109920004'
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nik'), '1990')

'User set textarea alamat guru : \'Jalan Perjuangan\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/textarea__alamat'), 'Sains adalah sekumpulan pengetahuan empiris, teoretis, dan pengetahuan praktis tentang dunia alam, yang dihasilkan oleh para ilmuwan yang menekankan pengamatan, penjelasan, dan prediksi dari fenomena di dunia nyata. Historiografi dari sains, sebaliknya, sering kali mengacu pada metode historis dari sejarah intelektual dan sejarah sosial. Namun, kata scientist dalam bahasa Inggris relatif baru—pertama kali diciptakan oleh William Whewell pada abad ke-19. Sebelumnya, orang yang menyelidiki alam menyebut diri mereka sendiri sebagai filsuf alam.')

'User set number no telp guru : \'081213124547\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__noTelp'), '0812')

'User click button "Simpan" '
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Simpan'))

'User verifikasi text : Email tidak valid'
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/span_Email tidak valid'), 'Email tidak valid')

'User verifikasi text : Nama maksimal 128 karakter'
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/span_Nama maksimal 128 karakter'), 'Nama maksimal 128 karakter')

'User verifikasi text : Nik minimal 16 karakter'
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/span_Nik minimal 16 karakter'), 'Nik minimal 16 karakter')

'User verifikasi text : Alamat maksimal 128 karakter'
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/span_Alamat maksimal 128 karakter'), 'Alamat maksimal 128 karakter')

'User verifikasi text : No telp minimal 10 karakter'
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/span_No telp minimal 10 karakter'), 'No telp minimal 10 karakter')

'User memperbaiki text input atau click button batal'
WebUI.delay(4)

'User click button batal'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Batal'))

