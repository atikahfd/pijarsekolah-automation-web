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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Siswa'))

WebUI.setText(findTestObject('admin/Page_Profil Siswa - PIJAR/input_Tambah Data_Search'), 'Fadly Surya')

WebUI.delay(2)

WebUI.click(findTestObject('admin/Page_Profil Siswa - PIJAR/button_btnHapusSiswa'))

WebUI.verifyElementText(findTestObject('admin/Page_Profil Siswa - PIJAR/b_Kamu yakin mau hapus'), 'Kamu yakin mau hapus?')

WebUI.click(findTestObject('admin/Page_Profil Siswa - PIJAR/button_Hapus'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('admin/Page_Profil Siswa - PIJAR/input_Tambah Data_Search'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.DELETE))

