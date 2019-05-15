import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable as GlobalVariable

try {
    
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsManage.readAgreementPDFParking'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumFour)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsManage.deleteFile'(BaseClass.ServiceAgreement)
 
 }  catch (ArrayIndexOutOfBoundsException t) {
	KeywordUtil.markWarning('Agreement file not found/able to read')
	// Error e1 = new Error(t.getMessage())
	 //e1.setStackTrace(t.getStackTrace())
	 //e1.printStackTrace()
 }
