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

'User click Akademik on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Akademik'))

'User click Daftar Pelajaran on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Daftar Pelajaran'))

'User click button Tambah Pelajaran'
WebUI.click(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/button_Tambah Pelajaran'))

'User set text input Kode Pelajaran '
WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/input_Kode Pelajaran_kodePelajaran'), 'Sejarah sains adalah studi tentang sejarah perkembangan sains dan pengetahuan ilmiah, termasuk ilmu alam dan ilmu sosial. (sejarah seni dan humaniora disebut sebagai sejarah filologi) Dari abad ke-18 sampai akhir abad ke-20, sejarah sains, khususnya ilmu fisika dan biologi, sering disajikan dalam narasi progresif yang mana teori yang benar menggantikan keyakinan yang salah. [1] Interpretasi sejarah yang lebih baru, seperti dari Thomas Kuhn, menggambarkan sejarah sains dalam istilah yang lebih bernuansa, seperti paradigma-paradigma yang saling bersaing atau sistem konseptual dalam matriks yang lebih luas yang mencakup tema intelektual, budaya, ekonomi dan politik di luar sains.')

'User set text input mata pelajaran '
WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/input_Mata Pelajaran_mataPelajaran'), 'Sains adalah sekumpulan pengetahuan empiris, teoretis, dan pengetahuan praktis tentang dunia alam, yang dihasilkan oleh para ilmuwan yang menekankan pengamatan, penjelasan, dan prediksi dari fenomena di dunia nyata. Historiografi dari sains, sebaliknya, sering kali mengacu pada metode historis dari sejarah intelektual dan sejarah sosial. Namun, kata scientist dalam bahasa Inggris relatif baru—pertama kali diciptakan oleh William Whewell pada abad ke-19. Sebelumnya, orang yang menyelidiki alam menyebut diri mereka sendiri sebagai filsuf alam.')

'User set text deskripsi mata pelajaran '
WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/textarea_Deskripsi_deskripsi'), 'Sementara investigasi empiris dari dunia alam telah diuraikan sejak Era Klasik (misalnya, oleh Thales, Aristoteles, dan lain-lain), dan metode ilmiah telah digunakan sejak Abad Pertengahan (misalnya, oleh Ibn al-Haytham, dan Roger Bacon ), munculnya sains modern terkadang ditelusuri kembali ke periode modern awal, selama masa yang dikenal sebagai Revolusi Ilmiah yang terjadi pada abad ke-16 dan ke-17 di Eropa. Metode ilmiah dianggap begitu mendasar bagi sains modern sehingga beberapa orang menganggap penyelidikan-penyelidikan alam sebelumnya sebagai pra-ilmiah. [3] Secara tradisional, sejarawan sains telah mendefinisikan sains cukup luas untuk mencakup penyelidikan-penyelidikan tersebut.')

WebUI.click(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/span_Kode Mata Pelajaran harus berisi Maksimal 10 Karakter'))

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/span_Kode Mata Pelajaran harus berisi Maksimal 10 Karakter'), 
    'Kode Mata Pelajaran harus berisi Maksimal 10 Karakter.')

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/span_Nama Mata Pelajaran harus berisi Maksimal 50 Karakter'), 
    'Nama Mata Pelajaran harus berisi Maksimal 50 Karakter.')

WebUI.verifyElementText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/span_Deskripsi Mata Pelajaran harus berisi Maksimal 250 Karakter'), 
    'Deskripsi Mata Pelajaran harus berisi Maksimal 250 Karakter.')

WebUI.click(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/button_Batal'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Akademik'))

