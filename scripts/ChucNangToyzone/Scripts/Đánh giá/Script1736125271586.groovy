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

WebUI.navigateToUrl('https://www.toyzone.vn/collections/hang-moi-ve')

WebUI.click(findTestObject('Object Repository/Page_Hng Mi V  Ca hng Toyzone/img_Thm vo gi_img-loop lazyload image-produ_ad479d'))

WebUI.click(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/button_Vit nh gi mi'))

WebUI.setText(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/input__name'), 'Phạm Trang')

WebUI.setText(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/input__email'), 'ThuTrang1182004@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/input_S in thoi_phone'), 
    '0359695488')

WebUI.setText(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/input_Tiu_title'), 'Sản phẩm tốt')

WebUI.setText(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/textarea__desc'), 'Mô hình Baby Three V3 được thiết kế tinh xảo với chất liệu cao cấp, mang đến vẻ đẹp chân thực và bền bỉ. Các chi tiết sắc nét, màu sắc hài hòa, phù hợp để trưng bày hoặc làm quà tặng. Một lựa chọn tuyệt vời cho người yêu thích sưu tập!')

WebUI.setText(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/input_(Nhp link youtube, VD httpswww.youtub_cc33ba'), 
    'https://www.youtube.com/watch?v=69ZDBWoj5YM&list=RD69ZDBWoj5YM&start_radio=1')

WebUI.click(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/span_Ti ln'))

WebUI.click(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/span_Ti ln_1'))

WebUI.click(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/span_Ti ln_1'))

WebUI.click(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/label_Ti ln'))

WebUI.click(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/svg'))

WebUI.click(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/button_Gi nh gi'))

WebUI.click(findTestObject('Object Repository/Page_M hnh Blind box Mc kha Gu bng Baby Thr_53e30d/span_Gi nh gi thnh cng'))

