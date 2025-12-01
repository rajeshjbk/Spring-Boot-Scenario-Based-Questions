package com.raj;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.controller.ProductController;
import com.raj.model.Product;

@SpringBootApplication
public class ProductManagementSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(ProductManagementSystemApplication.class, args);
				Scanner sc = new Scanner(System.in);){
			
			ProductController controller = ctx.getBean(ProductController.class);
			
			while(true) {
				
				System.out.println("\n***** WELCOME TO PRODUCT MANAGEMENT SYSTEM *****");
				System.out.println("Press 1 For Adding New Product. ");
				System.out.println("Press 2 For Showing All Product. ");
				System.out.println("Press 3 For Updating Product Price. ");
				System.out.println("Press 4 For Deleting Product. ");
				System.out.println("Press 5 For Exit from Application.");
				
				System.out.print("\nEnter Your Choice: ");
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice) {
				
				case 1:
					System.out.print("Enter Product Name: ");
					String name = sc.nextLine();
					
					System.out.print("Enter Product Price: ");
					double price = Double.parseDouble(sc.nextLine());
					
					System.out.print("Enter Product Category: ");
					String cate = sc.nextLine().toUpperCase();
					
					Product product = new Product(name, price, cate);					
					
					String msg = controller.addProduct(product);
					System.out.println(msg);
					break;
					
				case 2:
					System.out.println("\nAll Product Details: ");
					
					List<Product> allProducts = controller.getAllProducts();
					allProducts.forEach(System.out::println);
					break;
					
				case 3:	
					System.out.print("Enter PID of Product: ");
					int pId = Integer.parseInt(sc.nextLine());
					
					System.out.print("Enter New Price: ");
					price = Double.parseDouble(sc.nextLine());
					
					msg = controller.updateProduct(pId, price);
					System.out.println(msg);
					break;
					
				case 4:
					System.out.print("Enter PID of Product: ");
				    pId = Integer.parseInt(sc.nextLine());
				    
				    msg = controller.deleteProduct(pId);
				    System.out.println(msg);
				    break;
				    
				case 5:
					System.exit(0);
					
				default:
					System.err.println("Invalid Choice...");
				}
				System.out.println("\n");
			}
			
		}catch (Exception e) {
			
			System.out.println("Internal Problem..: "+e.getMessage());
			e.printStackTrace();
		}
	}
}
