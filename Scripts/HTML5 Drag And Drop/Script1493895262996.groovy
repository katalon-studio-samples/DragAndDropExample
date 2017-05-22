import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.w3schools.com/html/html5_draganddrop.asp')

CustomKeywords.'html5.dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Page_HTML5 Drag and Drop/img_drag1'), findTestObject(
        'Page_HTML5 Drag and Drop/div_div2'))

WebUI.verifyElementAttributeValue(findTestObject('Page_HTML5 Drag and Drop/div_div2'), 'innerHTML', '<img src=\"img_w3slogo.gif\" draggable=\"true\" ondragstart=\"drag(event)\" id=\"drag1\" alt=\"W3Schools\">', 
    0)

WebUI.closeBrowser();