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

WebUI.click(findTestObject('Navbar/Side Menu/span_About Us'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Navbar/Side Menu/About Us Page/h1_About Us'), 0)

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/h3_Corporate History  Policy'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/p_Description'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/span_Customer Feedback'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/span_Follow us on Social Media'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/a_Slide Image'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/button_Twitter'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/button_Facebook'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/button_Slack'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/button_Reddit'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/button_Press Kit'))

WebUI.verifyElementVisible(findTestObject('Navbar/Side Menu/About Us Page/button_NFT'))

WebUI.closeBrowser()

