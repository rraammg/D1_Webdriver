package b5_Xpath;

public class A54_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	/html/body/div[2]/div/div[3]/div[2]/form/input[1]//AbsoluteXpath
				//*[@id="sb_form_q"]//RelativeXpath
				//****************************//
		//contains,starts with,ends with
	//syntax	//tagname[contains(@attribute,'attribute value')]
		//input[contains(@id,'sb_form_q')]	
		//*********************************//
				//starts with
	//syntax //tagname[starts-with(@attribute,'attribute value')]
				//input[starts-with(@id,'sb_form_q')]
				//*****************************//
				//ends with
	//syntax //tagname[ends-with(@attribute,'attribute value')]
				//*****************************//
				//text
	//syntax //tagname[text()='visible text']
			//span[text()='languages']
		//**********************************//
				//and
	//syntax //tagname[@attribute1='value1'	and @attribute2='value2'] 
		//input[@id='sb_form_q' and @name='q']
		//***********************************//
		//OR
	//syntax //tagname[@attribute1='value1'	or @attribute2='value2'] 
		//input[@id='sb_form_q' or @name='q']
		//*********************************//
		//following
	//syntax //tagname[@attribute='value']/following::tagname
		//span[text()='Languages:]'/following::a
		//**********************************//
		//preceding
	//syntax //tagname[@attribute='value']/preceding::tagname
		//span[text()='Languages:']/preceding::a
		//*********************************//
		//ancestor(Grand father)
	//syntax //tagname[@attribute='value']/ancestor::tagname
	//input[@id='sb_form_q']/ancestor::input
		//********************************//
		//child
	//syntax //tagname[@attribute='value']/child::tagname
		//*********************************//
		//following-sibling
	//syntax //tagname[@attribute='value']/following-sibling::tagname
	//***************************//
		//preceding-sibling
	//syntax //tagname[@attribute='value']/preceding-sibling::tagname
		
		
	
		
		
		
	}

}
