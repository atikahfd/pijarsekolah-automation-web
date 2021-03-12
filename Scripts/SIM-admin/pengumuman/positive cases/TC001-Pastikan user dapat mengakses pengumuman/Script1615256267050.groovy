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

<<<<<<< HEAD:Scripts/SIM-admin/data guru/positive cases/Pastikan user dapat menambahkan data guru/Script1615012988528.groovy
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))
=======
WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Navigate to URL SIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SIM-admin/login/positive cases/TC001-Pastikan admin bisa login'), [('username') : 'pijarsekolahv2@gmail.com'
        , ('password') : 'password'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Pengumuman'))
>>>>>>> 8c7f5377b6d17e983b52784fcb530bebe783ad9b:Scripts/SIM-admin/pengumuman/positive cases/TC001-Pastikan user dapat mengakses pengumuman/Script1615256267050.groovy

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halman Pengumuman'))

WebUI.setText(findTestObject('admin/Page_Pengumuman - PIJAR/search_pengumuman'), 'Hari Libur')

WebUI.delay(1)

WebUI.refresh()

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_number_page2'))

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halaman Pengumuman Page 2'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_number_page1'))

<<<<<<< HEAD:Scripts/SIM-admin/data guru/positive cases/Pastikan user dapat menambahkan data guru/Script1615012988528.groovy
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Pilih Jenis Kelamin'))
=======
WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halman Pengumuman'))
>>>>>>> 8c7f5377b6d17e983b52784fcb530bebe783ad9b:Scripts/SIM-admin/pengumuman/positive cases/TC001-Pastikan user dapat mengakses pengumuman/Script1615256267050.groovy

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_n'))

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halaman Pengumuman Page 2'))

WebUI.delay(1)

<<<<<<< HEAD:Scripts/SIM-admin/data guru/positive cases/Pastikan user dapat menambahkan data guru/Script1615012988528.groovy
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nik'), '1234567812345678')
=======
WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_p'))
>>>>>>> 8c7f5377b6d17e983b52784fcb530bebe783ad9b:Scripts/SIM-admin/pengumuman/positive cases/TC001-Pastikan user dapat mengakses pengumuman/Script1615256267050.groovy

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halman Pengumuman'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_n_l'))

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halaman Pengumuman Page 2'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/button_p_l'))

WebUI.click(findTestObject('admin/Page_Pengumuman - PIJAR/Halman Pengumuman'))

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/h3_Sukses'), 'Sukses!')

WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/p_Profil Guru berhasil disimpan'), 'Profil Guru berhasil disimpan')

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_OK'))

WebUI.refresh()

