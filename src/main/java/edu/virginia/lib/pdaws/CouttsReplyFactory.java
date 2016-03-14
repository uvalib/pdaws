
/*******************************************************************************
* Copyright 2014 The Rector and Visitors of the University of Virginia
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
******************************************************************************/

package edu.virginia.lib.pdaws;

public class CouttsReplyFactory {
 
/*  codes and messages for dummied up replies generated locally but 
    representing coutts order errors
 */
    private int DUPECODE = 502;  
    private String DUPEMESSAGE = "This item is already on order.";
    private int SQLERRCODE = 602;
    private String SQLERRMESSAGE = "Local database error. Could not create order.";
    private int APIERRCODE = 604;
    private String APIERRMESSAGE = "Non-parsable JSON reply ";

    


	public void makeDupeErrorReply(org.apache.camel.Exchange exchange) {
		exchange.getIn().setBody(new edu.virginia.lib.pdaws.CouttsReply(DUPECODE,DUPEMESSAGE));
	}


	public void makeSQLErrorReply(org.apache.camel.Exchange exchange) {
		exchange.getIn().setBody(new edu.virginia.lib.pdaws.CouttsReply(SQLERRCODE,SQLERRMESSAGE));
	}

	public void makeAPIErrorReply(org.apache.camel.Exchange exchange) {
		exchange.getIn().setBody(new edu.virginia.lib.pdaws.CouttsReply(APIERRCODE,APIERRMESSAGE));
	}

	public void makeDynErrorReply(org.apache.camel.Exchange exchange) {
		Integer newCode = exchange.getIn().<Integer>getHeader("code",0,Integer.class);
		String newMessage = exchange.getIn().<String>getHeader("message","",String.class);
		
		exchange.getIn().setBody(new edu.virginia.lib.pdaws.CouttsReply(newCode.intValue(),newMessage));
	}
    
    
}




