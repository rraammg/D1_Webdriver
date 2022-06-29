package b5_Xpath;

public class A55_CSSSelector {

	//*[@id="sb_form_q"]-->RelativeXpath
	//CSS SELECTOR Syntax
	//tagname[attribute=attribute value]
	//ex;input[id=sb_form_q]
	//****************************//
	//contains,starts with,ends with
	//contains=*
	//      tagname[attribute*=attribute value]
	//ex: input[id*=sb_form_q]
	//startswith=^
//  tagname[abttribute^=attribute value]
//ex: input[id^=sb_form_q]
	//endswith=$
//  tagname[abttribute$=attribute value]
//ex: input[id$=sb_form_q]
	//*****************************//
	//and
		//syntax tagname[attribute1='value1'][ attribute2='value2'] 
		//ex:	input[id='sb_form_q'][ name='q']
	//OR
			//syntax tagname[attribute1='value1'],[ attribute2='value2'] 
			//ex:	input[id='sb_form_q'],[ name='q']
	//*************************//
	//FIRST-OF-TYPE,LAST-OF-TYPE,Nth-of-TYPE,Nth-Child
	//for xpath / for CSS >
	//following
		//syntax tagname[attribute='value']>tagname:first-of-type
		//ex:ul[class='overflow_menu']>li:first-of-type
	//syntax tagname[attribute='value']>tagname:last-of-type
	//ex:ul[class='overflow_menu']>li:last-of-type
	//syntax tagname[attribute='value']>tagname:nth-of-type
	//ex:ul[class='overflow_menu']>li:nth-of-type(5)
	//*******************************//
	//++ operator
	//syntax tagname[attribute='value']>tagname:nth-of-type+tagname
	//ex:ul[class='overflow_menu']>li:nth-of-type(5)+li+li
	
	
	
	

}
