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

WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Navigate to URL SIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SIM-admin/login/positive cases/TC001-Pastikan admin bisa login'), [('username') : 'pijarsekolahv2@gmail.com'
        , ('password') : 'password'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Pengumuman'))

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halman Pengumuman'))

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Button - PIJAR/button_hapus'))

WebUI.verifyElementText(findTestObject('admin/Page_Pengumuman - PIJAR/p_Anda yakin mau hapus'), 'Anda yakin mau hapus?')

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_Hapus_p'))

WebUI.verifyElementText(findTestObject('admin/Page_Pengumuman - PIJAR/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_Ok'))

WebUI.refresh()

