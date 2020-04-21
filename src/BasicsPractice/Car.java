package BasicsPractice;

import java.util.Scanner;

public class Car {
	String address;
	String brand;
	Double price;
	int year;
	
	
	public Car() {
		System.out.println("hellow to our car shop");
		
	}
	
	public Car(String address) {
		this.address=address;
		System.out.println("The car shop address is "+address);
	}

	
	public Car(String brand,Double price,int year){
		this.brand=brand;
		this.price=price;
		this.year=year;
		System.out.println("this car is "+brand+year +"the Price is" +price );
	}
	

	
	
	
	
	
	



	public static void main(String[] args) {
	
		
		Scanner brand=new Scanner("BMW");
		Scanner price=new Scanner();
		Scanner year=new Scanner();
		
		
		}
	}
		




