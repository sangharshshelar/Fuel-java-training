package com.example.crudapp;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class CrudappApplication {

	public static void main(String[] args) {
		
		 ApplicationContext context;
		 context =  SpringApplication.run(CrudappApplication.class, args);
		 
		 StudentRepository stud = context.getBean(StudentRepository.class);
		 
		System.out.println("-----------------------------------------------");
		System.out.println("\t\t JPA CRUD Application :");
		System.out.println("-----------------------------------------------");
		do {
			
			System.out.println("\t 1.Save Record \n"+
			"\t 2.Update Record \n"+
			"\t 3.Delete Record \n" +
			"\t 4.Search Record \n" +
			"\t 5.Exit \n"
			);
			
			System.out.println("Enter your choice : ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt(); 
			
			if(choice == 1)
			{
				Scanner sc1 = new Scanner(System.in);
				System.out.print("\t  Enter the id : ");
				int id = sc1.nextInt();
				System.out.print("\t  Enter the name : ");
				String name = sc1.next();
				Student st = new Student(id,name);
				stud.save(st);
        		System.out.println("Record Saved Successfully ! ");
				
			}else if(choice == 2)
			{
				
			}else if(choice == 3)
			{
				
			}else if(choice == 4)
			{
				List<Student> studlist;
				studlist = stud.findAll();
				System.out.println(" ID "+"  : "+" NAME ");
				for(Student st3 : studlist)
     			{
						
					System.out.println(st3.getId() +" : "+ st3.getName());
    					
    					
				}
				
				System.out.println("\t Search Query Successfully");
				System.out.println();
				
			}
			else if(choice == 5)
			{
				System.exit(0);
			}
			
		}while(true);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("\t  Enter the id : ");
//		int id = sc.nextInt();
//		System.out.print("\t  Enter the name : ");
//		String name = sc.next();
//		Student st = new Student(id,name);
//		stud.save(st);
//		System.out.println("Record Saved ");
//		
//		// update 
//		
//	
//	Optional<Student> op;
//	op = stud.findById(8745);
//		Student st2 = op.get();
//		System.out.println(st2.getId());
//    	System.out.println(st2.getName());
//    	st2.setName("demo123");
//    	stud.save(st2);
//	
//	
//		
		
		
		// select 
		
		
		// delete 
	
	
	
//	    Optional<Student> op1;
//		op1 = stud.findById(300);
//		Student st21 = op1.get();
//		stud.delete(st21);
//		
		
		// search
//		List<Student> studlist;
//		studlist = stud.findAll();
//		
//		for(Student st3 : studlist)
//		{
//			System.out.println(st3.getId());
//			System.out.println(st3.getName());
//			
//		}
//		
	
	
		
		
	}

}
