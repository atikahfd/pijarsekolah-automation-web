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

'User click \'Unduh\''
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/div_Unduh'))

'User click button unduh'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Unduh'))

