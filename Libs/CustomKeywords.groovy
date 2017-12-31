
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "com.helper.navigate.NavigationHelper.navigateToMenuItem"(
    	String menuName	) {
    (new com.helper.navigate.NavigationHelper()).navigateToMenuItem(
        	menuName)
}

def static "com.helper.grid.GridHelper.GetValueFromGrid"(
    	TestObject baseTestObject	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.helper.grid.GridHelper()).GetValueFromGrid(
        	baseTestObject
         , 	rowIndex
         , 	colIndex)
}

def static "com.helper.grid.GridHelper.getValueOrClickOnColumn"(
    	TestObject baseTestObject	
     , 	int rowIndex	
     , 	int colIndex	
     , 	String type	) {
    (new com.helper.grid.GridHelper()).getValueOrClickOnColumn(
        	baseTestObject
         , 	rowIndex
         , 	colIndex
         , 	type)
}

def static "com.helper.login.LoginHelper.loginIntoApplication"(
    	String applicationUrl	
     , 	String Username	
     , 	String Password	) {
    (new com.helper.login.LoginHelper()).loginIntoApplication(
        	applicationUrl
         , 	Username
         , 	Password)
}

def static "com.helper.login.LoginHelper.loginIntoApplicationWith"() {
    (new com.helper.login.LoginHelper()).loginIntoApplicationWith()
}

def static "com.helper.login.LoginHelper.logoutFromApplication"() {
    (new com.helper.login.LoginHelper()).logoutFromApplication()
}

def static "com.helper.excel.ExcelHelper.writeTOExcelFile"(
    	String excelPath	
     , 	String sheetName	
     , 	String value	
     , 	int rowNo	
     , 	int colNo	) {
    (new com.helper.excel.ExcelHelper()).writeTOExcelFile(
        	excelPath
         , 	sheetName
         , 	value
         , 	rowNo
         , 	colNo)
}

def static "com.helper.javascript.JavaScriptHelper.executeScript"(
    	String script	) {
    (new com.helper.javascript.JavaScriptHelper()).executeScript(
        	script)
}

def static "com.helper.javascript.JavaScriptHelper.executeScriptOnTestObject"(
    	String string	
     , 	TestObject testObject	) {
    (new com.helper.javascript.JavaScriptHelper()).executeScriptOnTestObject(
        	string
         , 	testObject)
}

def static "com.helper.javascript.JavaScriptHelper.executeAndReturnValue"(
    	String script	
     , 	TestObject testObject	) {
    (new com.helper.javascript.JavaScriptHelper()).executeAndReturnValue(
        	script
         , 	testObject)
}

def static "com.helper.browserhelper.CustomBrowser.openBrowser"() {
    (new com.helper.browserhelper.CustomBrowser()).openBrowser()
}

def static "com.helper.browserhelper.CustomBrowser.openBrowserWithUrl"(
    	String url	) {
    (new com.helper.browserhelper.CustomBrowser()).openBrowserWithUrl(
        	url)
}

def static "com.helper.browserhelper.CustomBrowser.closeBrowser"() {
    (new com.helper.browserhelper.CustomBrowser()).closeBrowser()
}

def static "com.question.UniqueSelection.SelectCheckBox"() {
    (new com.question.UniqueSelection()).SelectCheckBox()
}