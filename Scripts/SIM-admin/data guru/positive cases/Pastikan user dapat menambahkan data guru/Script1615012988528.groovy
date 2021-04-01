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

'User click Data Guru on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User click button "Tambah Data"\r'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Tambah Data'))

'User click Input Data'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/div_Input Data  Memasukan data Guru secara manual'))

'User set text nama guru : \'Jono\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nama'), 'Jono')

'User set number nip guru : \'121312131213\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nip'), '121312131213')

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
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__email'), 'jono@gmail.com')

'User click Pilih Mata Pelajaran untuk memilih mata pelajaran guru'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Pilih Mata Pelajaran'))

'User click mata pelajaran \'Matematika\''
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Matematika'))

'1990020109920004'
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nik'), '1990020109920004')

'User set textarea alamat guru : \'Jalan Perjuangan\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/textarea__alamat'), 'Jalan perjuangan')

'User set number no telp guru : \'081213124547\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__noTelp'), '081213124547')

'User click button "Simpan" untuk menyimpan data guru yang sudah di input'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Simpan'))

'User verifikasi pop-up \'Sukses!\''
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/h3_Sukses'), 'Sukses!')

'User verifikasi pop-up \'Profil Guru berhasil disimpan\''
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/p_Profil Guru berhasil disimpan'), 'Profil Guru berhasil disimpan')

'User click button "OK"'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_OK'))

