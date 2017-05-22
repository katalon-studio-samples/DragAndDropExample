import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://jqueryui.com/droppable/#default')

WebUI.dragAndDropToObject(findTestObject('Page_Droppable  jQuery UI/div_draggable'), findTestObject('Page_Droppable  jQuery UI/div_droppable'))

droppable_text = WebUI.getText(findTestObject('Page_Droppable  jQuery UI/div_droppable'))

WebUI.verifyEqual(droppable_text, 'Dropped!')

WebUI.closeBrowser()