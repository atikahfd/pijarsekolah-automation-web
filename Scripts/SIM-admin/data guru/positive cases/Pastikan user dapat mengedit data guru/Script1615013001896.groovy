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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'User click Data Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User set text untuk find guru dengan nama \'Jono\''
WebUI.setText(findTestObject('admin/Page_Daftar Guru - PIJAR/input_Tambah Data_search'), 'Jono')

'Menampilkan list guru'
WebUI.delay(1)

'User click icon edit pada guru jono'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_btnEdit'))

'User delete nama guru'
WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nama'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set text input nama : \'Jona\''
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nama'), 'Jona')

'User delete nip guru'
WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nip'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set number input : \'141514151415\''
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nip'), '141514151415')

WebUI.doubleClick(findTestObject('admin/Page_Add Guru - PIJAR/div_Laki-laki'))

'User delete tempat lahir guru'
WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__tempatLahir'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set text input tempat lahir : \'Makassar\''
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__tempatLahir'), 'Makassar')

'User delete email guru'
WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__email'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set text input email : \'jona@gmail.com\''
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__email'), 'jona@gmail.com')

'User delete nik guru'
WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nik'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set number input nik : \'1991929192919394\''
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nik'), '1991929192919394')

'User delete alamat guru'
WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/textarea_Jalan perjuangan'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set text input alamat : \'Jalan cemara durikosambi cengkareng jakarta barat\''
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/textarea_Jalan perjuangan'), 'Jalan cemara durikosambi cengkareng jakarta barat')

'User delete no telpon guru'
WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__noTelp'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'User set number no telpon : \'082233112211\''
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__noTelp'), '082233112211')

'User click button "Simpan"'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Simpan'))

'User verifikasi pop-up \'Sukses!\''
WebUI.verifyElementText(findTestObject('admin/Page_Edit Guru - PIJAR/h3_Sukses'), 'Sukses!')

'User click button "OK"'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_OK'))

WebUI.delay(1)

