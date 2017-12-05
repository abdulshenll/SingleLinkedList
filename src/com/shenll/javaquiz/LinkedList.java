package com.shenll.javaquiz;
class linkedList
	{
	    protected Node start;
	    protected Node end ;
	    public int size ;
	 
	    /*  Constructor  */
	    public linkedList()
	    {
	        start = null;
	        end = null;
	        size = 0;
	    }
	    /*  Function to check if list is empty  */
	    public boolean isEmpty()
	    {
	        return start == null;
	    }
	    /*  Function to get size of list  */
	    public int getSize()
	    {
	        return size;
	    }    
	    /*  Function to insert an element at begining  */
	    public void insertAtStart(int val)
	    {
	        Node nptr = new Node(val, null);    
	            
	        if(start == null) 
	        {
	            start = nptr;
	            end = start;
	        }
	        else 
	        {
	            nptr.setLink(start);
	            start = nptr;
	        }
	        size++ ;
	    }
	    /* Function to delete an element at last*/
	    public void deleteLast() {
	    	int k = size;
	    	do{
	    		Node s = start;
	            Node t = start;
	            while (s != end)
	            {
	                t = s;
	                s = s.getLink();
	            }
	            end = t;
	            end.setLink(null);
	           
	            size --;
	            return;
	    	}
			while(k==size); 
	    }
	    /* Function delete greater than target value*/
	    public void deleteContinue(int pos) {
	        
	        if(size == 1 && pos == 1) {
	        	start = null;
	        	end = null;
	        }
	        
	        Node current = start;
	        
	        int cursor = 1;
	        Node previous = null;
	        while(cursor <= size)
	        {
	            if (cursor >= pos) { 	
	            	System.out.print("t=>"+current.getData());	
	            	end = previous;
		            end.setLink(null);	
		            break;
	            }   	
	            previous = current;
	            current = current.getLink();	            
	            cursor++;
	        }	
	        
	        size=pos-1;
	        
	        System.out.print("Size=>"+size);
	        
	    }
	    /*  Function to display elements  */
	    public void display()
	    {
	        System.out.print("\nSingle Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }    
	        if (start.getLink() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.getData()+ "->");
	        ptr = start.getLink();
	        while (ptr.getLink() != null)
	        {
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
	}

