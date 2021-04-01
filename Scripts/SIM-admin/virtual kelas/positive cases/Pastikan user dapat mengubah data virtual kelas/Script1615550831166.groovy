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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Kelas Virtual'))

WebUI.delay(1)

WebUI.setText(findTestObject('admin/Page_Class Virtual - PIJAR/input_Tambah Jadwal_search'), 'Test Virtual Kelas 100 Sementara Add')

WebUI.click(findTestObject('admin/Page_Class Virtual - PIJAR/button_menuTitik3'))

WebUI.click(findTestObject('admin/Page_Class Virtual - PIJAR/button_Edit'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input__agenda'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input__agenda'), 'Test Virtual Kelas 100 Sementara Edit')

WebUI.click(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/div_V-A_css-xb97g8 select___multi-value__remove'))

WebUI.click(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/div_Pilih Kelas (Bisa lebih dari 1 kelas)'))

WebUI.click(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/div_V-B'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input__date'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input__date'), '06/04/2021')

WebUI.click(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/div_6'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input__timeStart'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input__timeStart'), '13:00')

WebUI.sendKeys(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input_-_timeFinish'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input_-_timeFinish'), '15:00')

WebUI.click(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/h1_Silakan buat Penjadwalan Kelas Virtual dengan mengisi kolom dibawah ini'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input__link'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input__link'), 'https://www.youtube.com/')

WebUI.sendKeys(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input_Password_password'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/input_Password_password'), '1234567890')

WebUI.click(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/button_Simpan'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/Simpan - PIJAR/button_Simpan'))

WebUI.click(findTestObject('admin/Page_Edit Kelas Virtual - PIJAR/button_Lihat Jadwal'))

WebUI.setText(findTestObject('admin/Page_Class Virtual - PIJAR/input_Tambah Jadwal_search'), 'Test Virtual Kelas 100 Sementara Edit')

WebUI.delay(2)

