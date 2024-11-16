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

WebUI.setText(findTestObject('Register Page/input_Password'), password)

WebUI.setText(findTestObject('Register Page/input_Repeat Password'), repeatPassword)

WebUI.click(findTestObject('Register Page/span_Show password advice'))

WebUI.callTestCase(findTestCase('Blocks/Show Password Advice - Done'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register Page/div_Security Question'))

WebUI.click(findTestObject('Register Page/span_Security Question'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Page/input_Security Answer'), securityAnswer)

WebUI.click(findTestObject('Register Page/button_Register'))

WebUI.verifyElementPresent(findTestObject('Login Page/h1_Login'), 0)

WebUI.setText(findTestObject('Login Page/input_Email'), email)

WebUI.setText(findTestObject('Login Page/input_Password'), password)

WebUI.click(findTestObject('Login Page/svg_Show Password'))

WebUI.click(findTestObject('Login Page/button_Login'))

WebUI.click(findTestObject('Product/span_Add to Basket'))

WebUI.click(findTestObject('Navbar/span_Your Basket'))

WebUI.verifyElementPresent(findTestObject('Basket/h1_Your Basket'), 0)

WebUI.click(findTestObject('Basket/button_Checkout'))

WebUI.verifyElementPresent(findTestObject('Address/Address Select/h1_Select an address'), 0)

WebUI.click(findTestObject('Address/Address Select/span_Add New Address'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Address/Address Create/h1_Add New Address'), 0)

WebUI.setText(findTestObject('Address/Address Create/input_Country'), country)

WebUI.setText(findTestObject('Address/Address Create/input_Name'), name)

WebUI.setText(findTestObject('Address/Address Create/input_Mobile Number'), mobileNumber)

WebUI.setText(findTestObject('Address/Address Create/input_Zip Code'), zipCode)

WebUI.setText(findTestObject('Address/Address Create/textarea_Address'), address)

WebUI.setText(findTestObject('Address/Address Create/input_City'), city)

WebUI.setText(findTestObject('Address/Address Create/input_State'), state)

WebUI.click(findTestObject('Address/Address Create/span_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Address/Address Select/h1_Select an address'), 0)

WebUI.click(findTestObject('Address/Address Select/mat-cell_Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Address/Address Select/span_Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Delivery Method/h1_Delivery Address'), 0)

WebUI.verifyElementPresent(findTestObject('Delivery Method/h1_Choose a delivery speed'), 0)

WebUI.click(findTestObject('Delivery Method/mat-cell_Fast Delivery'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Delivery Method/span_Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Payment/Shop/h1_My Payment Options'), 0)

WebUI.click(findTestObject('Payment/Shop/mat-panel-description_Add a credit or debit card'))

WebUI.setText(findTestObject('Payment/Shop/input_Name Card Number'), nameCardNumber)

WebUI.setText(findTestObject('Payment/Shop/input_Card Number'), cardNumber)

WebUI.selectOptionByValue(findTestObject('Payment/Shop/select_Expiry Month'), expiryMonth, false)

WebUI.selectOptionByValue(findTestObject('Payment/Shop/select_Expiry Year'), expiryYear, false)

WebUI.click(findTestObject('Payment/Shop/span_Submit'))

WebUI.click(findTestObject('Payment/Shop/span_My Payment Options_mat-radio-container'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payment/Shop/span_Continue'))

WebUI.verifyElementPresent(findTestObject('Order Summary/div_Order Summary'), 0)

WebUI.click(findTestObject('Order Summary/span_Place your order and pay'))

WebUI.verifyElementPresent(findTestObject('Order Completion/h1_Thank you for your purchase'), 0)

