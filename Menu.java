import java.util.*;

// Manages all the functionality of student management  
class StudentManager
{
	//variables used in full project
	int studentID;	
	String name;
    	int age;
    	String course;
    	String email;
    	String phone;
    	int semester;

// function used for add student in list
	public StudentManager addStudent()
	{
        	Scanner add = new Scanner(System.in);
	        StudentManager s = new StudentManager(); 

        	System.out.print("Enter Student ID: ");
	        s.studentID = add.nextInt();
        	add.nextLine(); 
	        System.out.print("Enter Name: ");
        	s.name = add.nextLine();
	        System.out.print("Enter Age: ");
        	s.age = add.nextInt();
	        add.nextLine();
        	System.out.print("Enter Course: ");
	        s.course = add.nextLine();
        	System.out.print("Enter E-mail: ");
	        s.email = add.nextLine();
        	System.out.print("Enter Phone: ");
	        s.phone = add.nextLine();
        	System.out.print("Enter Semester Number: ");
	        s.semester = add.nextInt();
        	System.out.println("===================================");
	        System.out.println("\tSTUDENT DETAILS ADDED SUCCESSFULLY");
		System.out.println();
		System.out.println();

	        return s; 
    	}

// function that display the vales of all the variables
	public void display()
	{
        	System.out.println("Student ID  : " + studentID);
	        System.out.println("Name        : " + name);
	        System.out.println("Age         : " + age);
        	System.out.println("Course      : " + course);
	        System.out.println("E-mail      : " + email);
        	System.out.println("Phone       : " + phone);
	        System.out.println("Semester    : " + semester);
        	System.out.println("-----------------------------------");
		System.out.println();
    	}

// function used for view Details of all students
    	public void viewStudent(ArrayList<StudentManager> students)
	{
        	if (students.isEmpty())
            		System.out.println("No Student Found.");		
		else
		{
            		for (int i=0;i<students.size();i++)
			{
                		students.get(i).display();             	
			}
        	}
    	}

// function used for search the student with id, name, course, semester
	public void search(ArrayList<StudentManager> students)
	{
		int choice;
		int searchEle;
		String searchElem;
		Scanner ch=new Scanner(System.in);
		System.out.println("=========================");
		while(true)
		{
			boolean found=false;
			System.out.println("1. Search by ID");
			System.out.println("2. Search by Name");
			System.out.println("3. Search by Course");
			System.out.println("4. Search by Semester");
			System.out.println("5. BACK TO THE MENU");
			System.out.print("enter your choice:");
			choice=ch.nextInt();
			ch.nextLine();
			switch(choice)
			{
				case 1:
					System.out.print("enter Student ID you want to search:");
					searchEle=ch.nextInt();
					for(int i=0;i<students.size();i++)
					{
						if(students.get(i).studentID==searchEle)
						{
							found=true;
							students.get(i).display();
						}
					}
					if(found==false)
						System.out.println("SORRY..!! No Student is found with this ID");
					break;
				case 2:
					System.out.print("enter Student Name you want to search:");
					searchElem=ch.nextLine();
					for(int i=0;i<students.size();i++)
					{
						if(students.get(i).name.equalsIgnoreCase(searchElem)==true)
						{
							found=true;
							students.get(i).display();
						}
					}
					if(found==false)
						System.out.println("SORRY..!! No Student is found with this Name");
					break;
				case 3:
					System.out.print("enter Student Course you want to search:");
					searchElem=ch.nextLine();
					for(int i=0;i<students.size();i++)
					{
						if(students.get(i).course.equalsIgnoreCase(searchElem)==true)
						{
							found=true;
							students.get(i).display();
						}
					}
					if(found==false)
						System.out.println("SORRY..!! No Student is found with this Course");
					break;
				case 4:
					System.out.print("enter Student semester you want to search:");
					searchEle=ch.nextInt();
					for(int i=0;i<students.size();i++)
					{
						if(students.get(i).semester==searchEle)
						{
							found=true;
							students.get(i).display();
						}
					}
					if(found==false)
						System.out.println("SORRY..!! No Student is found with this Semester no.");
					break;
				case 5:
					return;
				default:
					System.out.println("Please..!! enter correct option");
			}
		}
	}

// function used for update vales(id, name, course, age, semester, email, phone) in selected Student(using Student ID)
	public void update(ArrayList<StudentManager> students)
	{
		if(students.isEmpty())
			System.out.println("NO Student is Found");
		else
		{
			int ID;
			int index=-1,choice,update;
			String upd;
			Scanner up=new Scanner(System.in);

			System.out.print("enter Student ID in which you want to UPDATE:");
			ID=up.nextInt();
			for(int i=0;i<students.size();i++)
			{
				if(students.get(i).studentID==ID)
				{
					index=i;
				}
			}
			if(index==-1)
				System.out.println("No student is found with this id");
			else
			{
				while(true)
				{
					System.out.println("Changing Index");
					System.out.println("1. ID");
					System.out.println("2. Name");	
					System.out.println("3. Age");
					System.out.println("4. Course");
					System.out.println("5. email");
					System.out.println("6. Phone");
					System.out.println("7. Semester");
					System.out.println("8. BACK TO THE MENU");
					System.out.print("enter your choice:");
					choice=up.nextInt();
					switch(choice)
					{
						case 1:
							System.out.print("enter New ID:");
							update=up.nextInt();
							up.nextLine();
							students.get(index).studentID=update;
							break;
						case 2:
							System.out.print("enter New Name:");
							upd=up.nextLine();
							students.get(index).name=upd;
							break;
						case 3:
							System.out.print("enter New Age:");
							update=up.nextInt();
							up.nextLine();
							students.get(index).age=update;
							break;
						case 4:
							System.out.print("enter New Course:");
							upd=up.nextLine();
							students.get(index).course=upd;
							break;
						case 5:
							System.out.print("enter New email:");
							upd=up.nextLine();
							students.get(index).email=upd;
							break;
						case 6:
							System.out.print("enter New Phone:");
							upd=up.nextLine();
							students.get(index).phone=upd;
							break;
						case 7:	
							System.out.print("enter New Semester:");
							update=up.nextInt();
							up.nextLine();
							students.get(index).semester=update;
							break;
						case 8:
							return;
						default:
							System.out.println("Please..!! enter valid choice");
					}	
				}
			}
		}
	}

// function used for delete the details of a student from students list
	public void delete(ArrayList<StudentManager> students)
	{
		if(students.isEmpty())
			System.out.println("NO Student is Found");
		else
		{
			int delete;
			Scanner del=new Scanner(System.in);
			boolean found=false;
			System.out.print("enter Student ID which you want to delete:");
			delete=del.nextInt();
			for(int i=0;i<students.size();i++)
			{
				if(students.get(i).studentID==delete)
				{
					students.remove(i);
					i--;
					found=true;
				}		
			}
			if(found==false)
				System.out.println("No Student is found with this Student ID");
		}
	}

// function used for the count of the students present in the list 
	public void count(ArrayList<StudentManager> students)
	{
		if(students.isEmpty())
			System.out.println("NO student is inserted yet");
		else
			System.out.println("There are "+students.size()+" students are added in the list");
	}
}

// class of Menu that shows Menu driven program for student management
public class Menu extends StudentManager
{
	public static void main(String args[])
	{
        	int choice;
        	Scanner Q = new Scanner(System.in);
        	Menu obj = new Menu();
        	ArrayList<StudentManager> students = new ArrayList<>();// creating a arraylist of studentManager object for storing students details
        	while (true)
		{
            		System.out.println("=======================================");
            		System.out.println("\tSTUDENT MANAGEMENT SYSTEM");
            		System.out.println("=======================================");
	    		System.out.println("1. Add Student");
            		System.out.println("2. View All Students");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. count of Students");
            		System.out.println("7. Exit");
            		System.out.print("Enter Your Choice: ");
            		choice = Q.nextInt();
			System.out.println("----------------------------------");
            		switch (choice)
			{
                		case 1:
                    			students.add(obj.addStudent()); //calls add students and return the details of the student and store it in students (arraylist)
                    			break;
                		case 2:
                   	 		obj.viewStudent(students); //calls view student function to see the detail list of students
                    			break;
				case 3:
					obj.search(students);// calls search function to find the students by there id, name, course, semester
					break;
				case 4:
					obj.update(students);//calls update function to update the details of the particular student
					break;
				case 5:
					obj.delete(students);//calls delete function to delete the student details from the list
					break;
				case 6:
					obj.count(students);// calls count function to find the no. of the students present in list
					break;
                		case 7:
                    			System.out.println("Thank you for using us!");
                    			System.exit(0);
                		default:
                    			System.out.println("Please Enter a Valid Choice!");
            		}
        	}
    	}
}