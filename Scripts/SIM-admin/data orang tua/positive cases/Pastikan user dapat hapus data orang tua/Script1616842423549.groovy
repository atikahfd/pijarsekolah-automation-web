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

'User click Data Siswa on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Siswa'))

'User click Data Orang Tua on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Orang Tua'))

WebUI.delay(1)

'User set text input Search Data'
WebUI.setText(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/input_Tambah Data_search'), 'Kaka QA')

'User click icon '
WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_Kaka QA_btnHapusKelas'))

WebUI.verifyElementText(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/p_Anda yakin mau hapus'), 'Anda yakin mau hapus?')

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_Hapus'))

WebUI.verifyElementText(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/button_OK'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('admin/Page_Orang Tua - Pijar Sekolah/input_Tambah Data_search'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

