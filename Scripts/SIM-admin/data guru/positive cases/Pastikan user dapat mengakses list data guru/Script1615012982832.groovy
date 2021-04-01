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

'User click button page 2'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_2'))

'User click button previous'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_last-btn'))

'User click button Last Page'
WebUI.click(findTestObject('admin/Page_Syllabus - Pijar Sekolah/button_Genap_last-btn'))

'User click button First Page'
WebUI.click(findTestObject('admin/Page_Syllabus - Pijar Sekolah/button_first'))

'User click button next'
WebUI.click(findTestObject('admin/Page_Syllabus - Pijar Sekolah/button_Genap_next-btn'))

