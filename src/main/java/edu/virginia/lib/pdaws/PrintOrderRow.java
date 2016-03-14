
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

public class PrintOrderRow {
 
private String catkey;
private String isbn;

public void setCatkey (String catkey) {
	this.catkey = catkey;
}
public void setIsbn (String isbn) {
	this.isbn = isbn;
}

public String getCatkey() {
	if (catkey.startsWith("u")) {
	 	return catkey.substring(1);
	} else {
		return catkey;
	}
}
public String getIsbn() {
	return isbn;
}
    
}




