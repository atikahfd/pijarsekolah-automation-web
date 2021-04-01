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

'User click Akademik on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Akademik'))

'User click Daftar Pelajaran on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Daftar Pelajaran'))

'User set text input search untuk find mata pelajaran : Ilmu Pengetahuan Alam'
WebUI.setText(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/input_search mata pelajaran'), 'Ilmu pengetahuan alam')

'User click icon "trash box"\r\n'
WebUI.click(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/DUD/button_btnDelete'))

'User verifikasi nama mata pelajaran yang ingin di hapus'
WebUI.verifyElementText(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/Hapus Mapel/p_namaMapel Hapus'), 'Ilmu Pengetahuan Alam Bagian 2')

'User verifikasi pop-up Anda yakin mau hapus?'
WebUI.verifyElementText(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/Hapus Mapel/b_Anda yakin mau hapus'), 'Anda yakin mau hapus?')

'User click button Ya, Hapus'
WebUI.click(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/button_Hapus'))

'User verifikasi pop-up \'Sukses!\''
WebUI.verifyElementText(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/Hapus Mapel/h1_Sukses'), 'Sukses!')

'User verifikasi pop-up \'Daftar Pelajaran berhasil terhapus\''
WebUI.verifyElementText(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/Hapus Mapel/p_Daftar Pelajaran berhasil terhapus'), 
    'Daftar Pelajaran berhasil terhapus.')

'User click button OK'
WebUI.click(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/Hapus Mapel/button_OK'))

