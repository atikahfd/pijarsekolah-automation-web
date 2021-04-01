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

'User click button edit'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_btnEdit'))

'User admin input password baru guru'
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input_Password Baru_password'), '123456')

'User admin input konfirmasi password baru guru'
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input_Konfirmasi Password Baru_konfirmasiPassword'), '123456')

'User click button Simpan'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Simpan'))

'User verifikasi pop-up Sukses!'
WebUI.verifyElementText(findTestObject('admin/Page_Edit Guru - PIJAR/h3_Sukses'), 'Sukses!')

'User click button OK'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_OK'))

