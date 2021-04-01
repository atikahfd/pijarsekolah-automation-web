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

'Username belum di input'
WebUI.setText(findTestObject('siswa/Login/input_Ingat saya_username'), '56856658568')

'Password belum di input'
WebUI.setText(findTestObject('siswa/Login/input_Ingat saya_password'), '32532523532')

'User click button Masuk'
WebUI.click(findTestObject('siswa/Login/button_Masuk'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('siswa/Page_Core Tribe Edu/div_Data Not Found'), 'Data Not Found !')

'Hapus username'
WebUI.sendKeys(findTestObject('siswa/Login/input_Ingat saya_username'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'Hapus Password'
WebUI.sendKeys(findTestObject('siswa/Login/input_Ingat saya_password'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'Username belum di input'
WebUI.setText(findTestObject('siswa/Login/input_Ingat saya_username'), '1213141516')

'Password belum di input'
WebUI.setText(findTestObject('siswa/Login/input_Ingat saya_password'), '22222222222')

'User click button Masuk'
WebUI.click(findTestObject('siswa/Login/button_Masuk'))

'User verify text gagal login : \'username / password yang anda masukkan salah\''
WebUI.verifyElementText(findTestObject('siswa/Page_Core Tribe Edu/div_username atau password salah'), 'username atau password salah !')

