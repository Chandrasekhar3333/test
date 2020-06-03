package com.springboot.productdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootfirstApplication {

	public static void main(String[] args)   {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootfirstApplication.class, args);
		ProductsDataReader productDataReader=context.getBean(ProductsDataReader.class);
		List<Product> productsCollection=null;
		try {
			productsCollection=productDataReader.readData();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ProductDataWriter productDateWriter =context.getBean(ProductDataWriter.class);
		
		try {
			productDateWriter.writeData(productsCollection);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
