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

WebUI.callTestCase(findTestCase('Blocks/Navbar Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Login Page/h1_Login'))

WebUI.click(findTestObject('Login Page/a_Not yet a customer'))

WebUI.verifyElementPresent(findTestObject('Register Page/h1_User Registration'), 0)

WebUI.setText(findTestObject('Register Page/input_Email'), email)

WebUI.sendKeys(findTestObject('Register Page/input_Email'), Keys.chord(Keys.TAB))

WebUI.verifyElementPresent(findTestObject('Register Page/Error Message/mat-error_Please provide an email address'), 0)

WebUI.setText(findTestObject('Register Page/input_Password'), email)

WebUI.sendKeys(findTestObject('Register Page/input_Password'), Keys.chord(Keys.TAB))

WebUI.verifyElementPresent(findTestObject('Register Page/Error Message/mat-error_Please provide a password'), 0)

WebUI.setText(findTestObject('Register Page/input_Repeat Password'), email)

WebUI.sendKeys(findTestObject('Register Page/input_Repeat Password'), Keys.chord(Keys.TAB))

WebUI.verifyElementPresent(findTestObject('Register Page/Error Message/mat-error_Please repeat your password'), 0)

WebUI.click(findTestObject('Register Page/span_Show password advice'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Blocks/Show Password Advice - Error'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Page/input_Security Answer'), email)

WebUI.sendKeys(findTestObject('Register Page/input_Security Answer'), Keys.chord(Keys.TAB))

WebUI.verifyElementPresent(findTestObject('Register Page/Error Message/mat-error_Please provide an answer to your security question'), 
    0)

WebUI.verifyElementNotClickable(findTestObject('Register Page/button_Register'))

WebUI.closeBrowser()

