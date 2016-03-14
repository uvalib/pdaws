package edu.virginia.lib.pdaws;

import java.util.Map;
 
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
 
public class RowProcessor implements Processor {
 
    public void process(Exchange exchange) throws Exception {
        Map<String, Object> row = exchange.getIn().getBody(Map.class);
	PrintOrderRow printOrderRow = new PrintOrderRow();
	printOrderRow.setCatkey((String)row.get("catalog_key"));
	printOrderRow.setIsbn((String)row.get("isbn"));
         
         
        exchange.getOut().setBody(printOrderRow);
    }
 
}
