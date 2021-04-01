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

WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Navigate to URL SIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SIM-guru/login/positive cases/Pastikan guru bisa login'), [('username') : 'susiqa@gmail.com'
        , ('password') : '100500'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_ModulTugas'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Daftar ModulTugas'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/button_Tambah ModulTugas'))

WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_Pilih Mata Pelajaran'))

WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_Matematika'))

WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input__judul'), 'Tugas 1')

WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_Pilih Kelas bisa lebih dari 1'))

WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_V-A'))

WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_Pilih Kelas bisa lebih dari 1'))

WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_V-B'))

WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input__tglPengerjaan'), '01/04/2021')

WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/tanggal'))

WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input__waktuPengerjaan'), '10:30')

