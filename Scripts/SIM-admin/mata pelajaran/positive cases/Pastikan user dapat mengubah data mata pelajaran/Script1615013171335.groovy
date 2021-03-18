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

'User click Akademik on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Akademik'))

'User click Daftar Pelajaran on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Daftar Pelajaran'))

'User set text input search untuk find mata pelajaran : Ilmu Pengetahuan Alam'
WebUI.setText(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/input_search mata pelajaran'), 'Ilmu pengetahuan alam')

'User click icon "pencil"'
WebUI.click(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/DUD/button_btnEdit'))

'User hapus text mata pelajaran'
WebUI.sendKeys(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/input__mataPelajaran'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

'User set text input mata pelajaran : Ilmu Pengetahuan Alam Bagian 2'
WebUI.setText(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/input__mataPelajaran'), 'Ilmu Pengetahuan Alam Bagian 2')

'User hapus text deskripsi mata pelajaran'
WebUI.sendKeys(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/textarea_Ilmu Pengetahun Alam'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

'User set text deskripsi mata pelajaran : Ilmu Pengetahuan Alam Bagian 2'
WebUI.setText(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/textarea_Ilmu Pengetahun Alam'), 'Ilmu Pengetahun Alam Bagian 2')

'User click button Simpan'
WebUI.click(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/button_Simpan'))

'User verifikasi pop-up \'Sukses!\''
WebUI.verifyElementText(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/h1_Sukses'), 'Sukses!')

'User verifikasi pop-up \'Daftar Pelajaran berhasil disimpan\''
WebUI.verifyElementText(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/p_Daftar Pelajaran berhasil disimpan'), 
    'Daftar Pelajaran berhasil disimpan.')

'User click button OK'
WebUI.click(findTestObject('admin/Page_Edit Daftar Pelajaran - PIJAR/button_OK'))

