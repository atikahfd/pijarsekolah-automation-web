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

'User click Data Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User set text untuk find guru \'Jo\''
WebUI.setText(findTestObject('admin/Page_Daftar Guru - PIJAR/input_Tambah Data_search'), 'Jo')

'User click icon "trash box"'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_btnDelete'))

'Menampilkan pop-up Anda yakin mau hapus?'
WebUI.verifyElementText(findTestObject('admin/Page_Daftar Guru - PIJAR/p_Anda yakin mau hapus'), 'Anda yakin mau hapus?')

'User click button "Hapus"'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Hapus'))

'User verifikasi \'Sukses!\''
WebUI.verifyElementText(findTestObject('admin/Page_Daftar Guru - PIJAR/h3_Sukses'), 'Sukses!')

'User verifikasi \'Data Berhasil Dihapus\''
WebUI.verifyElementText(findTestObject('admin/Page_Daftar Guru - PIJAR/p_Data Berhasil Dihapus'), 'Data Berhasil Dihapus')

'User click button "OK"'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Ok'))

