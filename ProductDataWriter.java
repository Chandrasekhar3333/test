package com.springboot.productdata;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
@Component 
public class ProductDataWriter {
	 
public void writeData(List productsCollection) throws IOException 
{
	List<Product> products=new ArrayList<Product>();
	List<Product> filteredProducts=products.stream().filter(p->p.getProductPrice()>5000).collect(Collectors.toList());
	 for (Product product : filteredProducts) {
	        System.out.println(product.toString());
	 }

	/*List<Product> filteredProducts=product.stream().filter(p->p.getProductPrice()>5000).collect(Collectors.toList());
	System.out.println(filteredProducts.toString());
	//FileWriter writer =new FileWriter("src/main/resources/output.txt");
	try{
        FileOutputStream writeData = new FileOutputStream("src/main/resources/output.txt");
        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

        writeStream.writeObject(filteredProducts);
        writeStream.flush();
        writeStream.close();

    }catch (IOException e) {
        e.printStackTrace();
	
		
		
	}*/
	 
}




}