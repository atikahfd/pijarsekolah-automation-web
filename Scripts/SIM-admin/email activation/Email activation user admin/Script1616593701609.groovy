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

'User verify text : Daftarkan Email Aktif Kamu!'
WebUI.verifyElementText(findTestObject('admin/Page_Beranda - PIJAR (notifikasi email)/h1_Daftarkan Email Aktif Kamu'), 'Daftarkan Email Aktif Kamu!')

'User set text input email'
WebUI.setText(findTestObject('admin/Page_Beranda - PIJAR (notifikasi email)/input_Daftarkan Email Aktif Kamu_swal2-input'), 
    GlobalVariable.usernameAdmin)

'User click button Kirim'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR (notifikasi email)/button_Kirim'))

'User verify text : Hore! email anda berhasil didaftarkan'
WebUI.verifyElementText(findTestObject('admin/Page_Beranda - PIJAR (notifikasi email)/h2_Hore email anda berhasil didaftarkan'), 
    'Hore! email anda berhasil didaftarkan')

'User verify text : Selanjutnya, silakan melakukan Aktivasi di Email Anda. Cek Email dari tim Pijar Sekolah ya.'
WebUI.verifyElementText(findTestObject('admin/Page_Beranda - PIJAR (notifikasi email)/p_Selanjutnya silakan melakukan Aktivasi di Email Anda Cek Email dari tim Pijar Sekolah ya'), 
    'Selanjutnya, silakan melakukan Aktivasi di Email Anda. Cek Email dari tim Pijar Sekolah ya.')

'User click button Kembali'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR (notifikasi email)/button_Kembali (1)'))

urlBeranda = WebUI.getUrl()

