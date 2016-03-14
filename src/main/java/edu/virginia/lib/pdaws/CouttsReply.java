
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CouttsReply {
 
    private String environment = "";
    private int code = 0;
    private String message = "";
    private String orderNumber = "";

	public CouttsReply() {
	}

	public CouttsReply(int code, String message) {
		this.setCode(code);
		this.setMessage(message);
	}

	@JsonIgnore
	public String getEnvironment() {
	  return this.environment;
	}
	
	@JsonProperty("Environment")
	public void setEnvironment(String environment) {
		if (environment != null) {
			this.environment = environment;
		}
	}
	

	@JsonProperty("Code")
	public int getCode() {
	  return this.code;
	}

	public void setCode(int code) {
		this.code =  code;
	}

	public String getMessage() {
	  return this.message;
	}
	
	@JsonProperty("Message")
	public void setMessage(String message) {
		if (message != null) {
			this.message = message;
		}
	}	
	
	public String getOrderNumber() {
	  return this.orderNumber;
	}

	@JsonProperty("OrderNumber")
	public void setOrderNumber(String orderNumber) {
		if (orderNumber != null) {
			this.orderNumber =  orderNumber;
		}
	}



}




