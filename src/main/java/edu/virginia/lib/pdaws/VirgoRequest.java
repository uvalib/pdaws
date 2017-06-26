
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
public class VirgoRequest{
 
    private String isbn = "";
    private String catkey = "";
    private String computingID = "";
    private String loc = "NONE";

	public VirgoRequest() {
	}

	public VirgoRequest(String isbn, String catkey, String computingID, String loc) {
		this.setIsbn(isbn);
		this.setCatkey(catkey);
		this.setComputingID(computingID);
		this.setLoc(loc);
	}


	@JsonProperty("isbn")
	public String getIsbn() {
	  return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn =  isbn;
	}

	public String getCatkey() {
	  return this.catkey;
	}
	
	@JsonProperty("catkey")
	public void setCatkey(String catkey) {
		if ((catkey != null) && !catkey.isEmpty()) {
			if  (catkey.charAt(0) == 'u') {
				this.catkey = catkey.substring(1);
			} else {
				this.catkey = catkey;
			}
		} 
	}	
	
	public String getComputingID() {
	  return this.computingID;
	}

	@JsonProperty("computingID")
	public void setComputingID(String computingID) {
		if (computingID != null) {
			this.computingID =  computingID;
		}
	}

	@JsonProperty("loc")
	public String getLoc() {
	  return this.loc;
	}

	public void setLoc(String loc) {
		this.loc =  loc;
	}

}




