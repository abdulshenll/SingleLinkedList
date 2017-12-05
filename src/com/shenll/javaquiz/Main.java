package com.shenll.javaquiz;
import java.util.Scanner; 
public class Main
{    
    public static void main(String[] args)
    {             
    	Scanner scan = new Scanner(System.in);   
        /* Creating object of class linkedList */
        linkedList list = new linkedList(); 
        System.out.println("Singly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert");
            System.out.println("2. delete at end");
            System.out.println("3. delete at position above target value");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtStart( scan.nextInt() );                     
                break;
            case 2 : 
            	list.deleteLast();
                System.out.println("Delete at end"+ list.getSize());
                break;       
            case 3 : 
                System.out.println("Enter position");
                int s = scan.nextInt() ;
                if (s < 1 || s > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteContinue(s);
                break;
                
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
}