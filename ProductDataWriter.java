package com.springboot.productdata;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
@Component 
public class ProductDataWriter {
	 
public void writeData(List<Product> productCollection) throws IOException 
{
List<Product> filteredProducts=productCollection.stream().filter(p->p.getProductPrice()>5000).collect(Collectors.toList());
System.out.println("number of products after filetered "+ ' '+ filteredProducts.size() ); 
  for (Product product : filteredProducts) {
		 
	        System.out.println(product.toString());
	   }

	try {
		FileWriter writer =new FileWriter("src/main/resources/filteredProducts.txt");
        writer.write(filteredProducts.toString());
        writer.close();
	}
	catch (IOException e) {
        e.printStackTrace();
	
}
	 
}

}
