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

WebUI.verifyElementPresent(findTestObject('Login Page/h1_Login'), 0)

WebUI.sendKeys(findTestObject('Login Page/a_Forgot your password'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Forgot Password Page/h1_Forgot Password'), 0)

WebUI.verifyElementVisible(findTestObject('Forgot Password Page/input_Email'))

WebUI.verifyElementVisible(findTestObject('Forgot Password Page/input_Security Question'))

WebUI.verifyElementVisible(findTestObject('Forgot Password Page/input_New Password'))

WebUI.verifyElementVisible(findTestObject('Forgot Password Page/em_Password must be 5-40 characters long'))

WebUI.verifyElementVisible(findTestObject('Forgot Password Page/input_Repeat New Password'))

WebUI.verifyElementVisible(findTestObject('Forgot Password Page/span_Show Password Advice'))

WebUI.click(findTestObject('Forgot Password Page/span_Show Password Advice'))

WebUI.verifyElementPresent(findTestObject('Forgot Password Page/Show Password Advice/span_contains at least one lower character'), 
    2)

WebUI.verifyElementPresent(findTestObject('Forgot Password Page/Show Password Advice/span_contains at least one upper character'), 
    2)

WebUI.verifyElementPresent(findTestObject('Forgot Password Page/Show Password Advice/span_contains at least one digit'), 2)

WebUI.verifyElementPresent(findTestObject('Forgot Password Page/Show Password Advice/span_contains at least one special character'), 
    2)

WebUI.verifyElementPresent(findTestObject('Forgot Password Page/Show Password Advice/span_contains at least 8 characters'), 2)

WebUI.verifyElementVisible(findTestObject('Forgot Password Page/button_Change'))

WebUI.closeBrowser()

