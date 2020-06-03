package com.springboot.productdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;
@Component
public class ProductsDataReader {
	//int productId=0;
 
	/*public List<String> readData() throws FileNotFoundException
	{  
		List<String> products=new ArrayList<String>();
		BufferedReader br= new BufferedReader(new FileReader("src/main/resources/productdata.txt"));
		try
		{
		   String product=br.readLine();
		    while(product!=null)
		      {
		    	
		    	products.add(product);
		    	System.out.println(product);
		    	product=br.readLine();
		    	}
		   br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(products.size());
		System.out.println(products);
		return products;
		*/
	public List<Product> readData() throws FileNotFoundException
	{  
		int productId=0;
		String productName=null;
        double productPrice=0.0;
		List<Product> products=new ArrayList<Product>();
		
	Scanner input = new Scanner(new File("src/main/resources/productdata.txt"));
    input.useDelimiter(",|\n");
   
    while(input.hasNext()) {
    	
    	 productId = input.nextInt();
         productName = input.next();
         productPrice = Double.valueOf(input.next());  
        
Product newProduct = new Product(productId,productName,productPrice);
        products.add(newProduct);
    }
	input.close();	

    for (Product product : products) {
        System.out.println(product);
    }
		System.out.println(products.size());
    return products;
   
	}
}

