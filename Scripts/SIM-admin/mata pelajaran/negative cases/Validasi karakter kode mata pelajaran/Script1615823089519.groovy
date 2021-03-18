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

'User click button Tambah Pelajaran'
WebUI.click(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/button_Tambah Pelajaran'))

'User set text input Kode Pelajaran : IPA2'
WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/input_Kode Pelajaran_kodePelajaran'), 'IPA2')

'User set text input mata pelajaran : Ilmu Pengetahuan Alam'
WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/input_Mata Pelajaran_mataPelajaran'), 'Ilmu Pengetahuan Alam')

'User set text deskripsi mata pelajaran : Ilmu Pengetahuan Alam'
WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/textarea_Deskripsi_deskripsi'), 'Ilmu Pengetahuan Alam')

'User click button Simpan'
WebUI.click(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/button_Simpan'))

