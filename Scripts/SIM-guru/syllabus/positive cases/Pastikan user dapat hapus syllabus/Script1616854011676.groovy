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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Akademik'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_SyllabusRPP'))

WebUI.setText(findTestObject('admin/Page_Syllabus - Pijar Sekolah/input_Semua Kelas_search'), 'Piano')

WebUI.click(findTestObject('admin/Page_Syllabus - Pijar Sekolah/button_hapusSetelahEdit'))

WebUI.verifyElementText(findTestObject('admin/Page_Syllabus - Pijar Sekolah/p_Kamu yakin mau hapus'), 'Kamu yakin mau hapus?')

WebUI.click(findTestObject('admin/Page_Syllabus - Pijar Sekolah/button_Hapus'))

WebUI.verifyElementText(findTestObject('admin/Page_Syllabus - Pijar Sekolah/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Syllabus - Pijar Sekolah/button_OK'))

