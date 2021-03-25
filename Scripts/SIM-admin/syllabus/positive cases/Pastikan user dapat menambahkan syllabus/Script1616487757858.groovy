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

WebUI.click(findTestObject('admin/Page_Syllabus - Pijar Sekolah/a_Tambah Data'))

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/div_Isi Mata Pelajaran'))

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/div_Matematika'))

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/div_Pilih Kelas (Bisa Pilih Lebih Dari 1 Kelas)'))

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/div_V-A'))

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/div_Pilih Nama Wali Kelas'))

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/div_Rahmat'))

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/div_Pilih Semester'))

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/div_Genap'))

WebUI.uploadFile(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/input file'), file)

WebUI.click(findTestObject('admin/Page_Tambah Syllabus - Pijar Sekolah/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Syllabus - Pijar Sekolah/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Syllabus - Pijar Sekolah/button_OK'))

