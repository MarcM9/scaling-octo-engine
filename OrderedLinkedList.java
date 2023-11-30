
public class OrderedLinkedList<T extends Comparable<T>>{
	
	private Node<T> head; 
	int size; 
	
	public OrderedLinkedList() { 
		
		this.head = null; 
		this.size = 0; 
		
	}
	
	public void insert(T data) { 
		
		Node<T> newItem = new Node<T>(data, null); 
		
		Node<T> curr = null; 
		
		//If list is empty
		if(size == 0) { 
			
			head = newItem; 
			size++; 
		}
		
	
		//Insert at the front of the list
		if(data.compareTo(head.getData()) > 0 ) {
				
			head.setNext(head);
			
			head = newItem; 
			
			size++;
		}else { 
			
			head.setNext(newItem);
			size++; 
		}
		
		//Insert in the middle of the list
		curr = head; 
		while(curr != null) { 
			
			
			
			if(data.compareTo(curr.getData()) < 0 && data.compareTo(curr.getNext().getData()) > 0) {
				
				newItem.setNext(curr.getNext());
				curr.setNext(newItem);
				
				size++;
				break; 
			}else { 
				
				curr = curr.getNext(); 
			}
				
		}
		
		//Insert at the end of the list
		
		curr = head; 
		
		while (curr != null) { 
			
			if(data.compareTo(curr.getData()) < 0 && curr.getNext().getData() == null) { 
				
				curr.setNext(newItem); 
				size++; 
				
			}else { 
				
				curr = curr.getNext(); 
			}
		}
			
		
	}
	
	public T get(int index) { 
		
		if(index == 0 && size > 0) { 
			
			return head.getData(); 
		}
		
		if(index <= 0 || index >= size || size == 0) { 
			
			throw new IndexOutOfBoundsException("Index out of bounds"); 
		}
		

		
		Node<T> current = head; 
		
		for(int i = 0; i < index; i++) { 
			
			current = current.getNext();
		}
		
		
		return current.getData(); 
	}
	
	public int getSize() { 
		
		return size; 
	}
	
	
	
	
	
}
