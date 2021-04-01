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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Siswa'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Orang Tua'))

WebUI.delay(1)

WebUI.setText(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/input_Tambah Data_search'), 'Kaka QA')

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_Kaka QA_btnEditFile'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__fatherName'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__fatherName'), 'Koko Putra QA')

WebUI.sendKeys(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__motherName'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__motherName'), 'Kiki Putri QA')

WebUI.sendKeys(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__fatherWork'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__fatherWork'), 'Pegawai Swasta')

WebUI.sendKeys(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__motherWork'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__motherWork'), 'Pegawai Negeri Sipil')

WebUI.sendKeys(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__phoneNumber1'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input__phoneNumber1'), '0890909090')

WebUI.sendKeys(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/textarea__address'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/textarea__address'), 'Jalan Cemerlang no100 ,Cerdas , Bangsa')

WebUI.setText(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/input_Password_password'), '123456')

WebUI.click(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Edit Orang Tua - Pijar Sekolah/button_OK'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('admin/Page_Detail Orang Tua - Pijar Sekolah/a_Kembali'), 5)

WebUI.click(findTestObject('admin/Page_Detail Orang Tua - Pijar Sekolah/a_Kembali'))

