package com.nasir.transactions;
import java.util.Scanner; 
public class Transaction {

	public static void main(String[] args)   
	{  
	int n;
	int ttarget;
	int targetv;
	//int flag;
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the size of transaction array: ");  
	//reading the number of elements from the that we want to enter  
	n=sc.nextInt();  
	//creates an array in the memory of length n  
	int[] array = new int[n];  
	System.out.println("Enter the values of array: ");  
	for(int i=0; i<n; i++)  
	array[i]=sc.nextInt();  
	//creates the total target  
	System.out.println("Enter the total no of targets that needs to be achieved: ");  
	 		
	//reading the target   
	ttarget=sc.nextInt();  
	for (int i=0;i<ttarget;i++) 
	{  

	System.out.println("Enter the value of the target: ");  
	targetv=sc.nextInt();
	checResult(targetv,array,n);
    }
sc.close();


	}

	private static void checResult(int targetv, int[] array, int n) {
		// TODO Auto-generated method stub
	long sum=0;
	int flag=0;
	int I;
	for(int i=0; i<n; i++) {
	sum += array[i];
	if (sum >= targetv) { System.out.println("Target has been achieved after " +(i+1) + " transaction ");
	flag = 1;
	break;
	}
		
	} 
			
			
	if (flag==0) { System.out.println(" Traget is not acheived");
			
	} 

	}
    }

