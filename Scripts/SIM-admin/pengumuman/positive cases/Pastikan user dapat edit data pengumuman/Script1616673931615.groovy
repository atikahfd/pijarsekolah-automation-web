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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Pengumuman'))

WebUI.setText(findTestObject('admin/Page_Pengumuman - PIJAR/input_Tambah Pengumuman_search'), 'Auto Test Data Pengumuman')

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_Pengumuman_btnEdit'))

WebUI.focus(findTestObject('admin/Page_Edit Pengumuman - PIJAR/div_Semua'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Pengumuman - PIJAR/input__judul'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Pengumuman - PIJAR/input__judul'), 'Pengumuman Hari Ini Libur')

WebUI.sendKeys(findTestObject('admin/Page_Edit Pengumuman - PIJAR/input__tanggal'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Pengumuman - PIJAR/input__tanggal'), '28/04/2021')

WebUI.click(findTestObject('admin/Page_Edit Pengumuman - PIJAR/div_28'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Pengumuman - PIJAR/textarea__detail'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Pengumuman - PIJAR/textarea__detail'), 'Detail Pengumuman Hari Ini Libur')

WebUI.click(findTestObject('admin/Page_Edit Pengumuman - PIJAR/img-deteteFile'))

WebUI.uploadFile(findTestObject('admin/Page_Edit Pengumuman - PIJAR/upload file pengumuman'), file)

WebUI.click(findTestObject('admin/Page_Edit Pengumuman - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Edit Pengumuman - PIJAR/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Edit Pengumuman - PIJAR/button_Ok'))

