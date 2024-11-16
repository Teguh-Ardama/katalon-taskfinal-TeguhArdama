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

WebUI.click(findTestObject('Navbar/Side Menu/Photo Wall Page/span_Photo Wall'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Navbar/Side Menu/Photo Wall Page/h1_Photo Wall'), 0)

WebUI.mouseOver(findTestObject('Navbar/Side Menu/Photo Wall Page/img_Image'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Navbar/Side Menu/Photo Wall Page/div_Image Name'), 0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Navbar/Side Menu/Photo Wall Page/svg_Twitter'), 0)

WebUI.closeBrowser()

