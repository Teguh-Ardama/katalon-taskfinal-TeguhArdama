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

WebUI.callTestCase(findTestCase('Blocks/Open Web'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/Side Menu/button_menu'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/Side Menu/Contact Page/h3_Contact'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/Side Menu/Contact Page/span_Customer Feedback'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/Side Menu/Contact Page/h1_Customer Feedback'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/Side Menu/Contact Page/input_Author'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Navbar/Side Menu/Contact Page/textarea_Comment'), comment)

// Default nya 1, Jadi max isi rating = 4
for (int i = 0; i < rating; i++) {
    WebUI.sendKeys(findTestObject('Navbar/Side Menu/Contact Page/mat-slider_Rating Slider'), Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(1)
}

// Ambil teks CAPTCHA
String captchaText = WebUI.getText(findTestObject('Navbar/Side Menu/Contact Page/code_Captcha'))

// Ekstrak angka dari teks CAPTCHA menggunakan regex
String[] numbers = captchaText.split('[^0-9]+')

int num1 = Integer.parseInt((numbers[0]).trim())

int num2 = Integer.parseInt((numbers[1]).trim())

int num3 = Integer.parseInt((numbers[2]).trim())

// Ekstrak operator dari teks CAPTCHA menggunakan regex
String[] operators = captchaText.split('[0-9]+')

String operator1 = (operators[1]).trim( // Operator pertama (misalnya, "*")
    )

String operator2 = (operators[2]).trim( // Operator kedua (misalnya, "+")
    )

int result = 0

// Lakukan perhitungan berdasarkan urutan operator (dengan memperhatikan operator * atau / terlebih dahulu)
if (operator1.equals('*') || operator1.equals('/')) {
    // Hitung operasi pertama terlebih dahulu jika * atau /
    result = operator1.equals('*') ? num1 * num2 : num1 / num2

    // Kemudian hitung dengan operator kedua
    result = operator2.equals('+') ? result + num3 : result - num3 // Jika operator pertama adalah + atau -, hitung operasi kedua terlebih dahulu jika * atau /
    // Kemudian hitung dengan operator pertama
} else {
    int tempResult = operator2.equals('*') ? num2 * num3 : num2 / num3

    result = operator1.equals('+') ? num1 + tempResult : num1 - tempResult
}

// Masukkan hasil ke dalam kotak isian "Result"
WebUI.setText(findTestObject('Navbar/Side Menu/Contact Page/input_Result'), result.toString())

WebUI.click(findTestObject('Navbar/Side Menu/Contact Page/button_Kirim'))

WebUI.closeBrowser()

