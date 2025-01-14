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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.toyzone.vn/account/login')

WebUI.setText(findTestObject('Object Repository/Page_Ti khon  Ca hng Toyzone/input_ng nhp_customeremail'), 'ThuTrang1182004@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ti khon  Ca hng Toyzone/input_ng nhp_customerpassword'), 'F13Pm6jak0GU2qtcsvfNEg==')

WebUI.click(findTestObject('Object Repository/Page_Ti khon  Ca hng Toyzone/input_ng nhp_btn btn-signin'))

WebUI.click(findTestObject('Object Repository/Page_Ti khon  Ca hng Toyzone/a_Cp nht thng tin'))

WebUI.click(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/i_(a ch mc nh)_fa fa-pencil-square-o'))

WebUI.setText(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/input_S in thoi_addresslast_name'), 'Phạm')

WebUI.setText(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/input_S in thoi_addressfirst_name'), 'Trang')

WebUI.setText(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/input_S in thoi_addresscompany'), 'ABC')

WebUI.setText(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/input_S in thoi_addressaddress1'), 'Mỹ Hào Hưng Yên')

WebUI.setText(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/input_S in thoi_addressaddress2'), 'Trung Nghĩa, Hưng Yên')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/select_H Ch MinhH Ni NngAn GiangB Ra - Vng _687e44'), 
    'Hưng Yên', true)

WebUI.setText(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/input_S in thoi_addressphone'), '0359695488')

WebUI.click(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/input_t lm a ch mc nh_addressdefault'))

WebUI.click(findTestObject('Object Repository/Page_a ch  Ca hng Toyzone/input_t lm a ch mc nh_btn bt-primary'))

