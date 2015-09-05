import java.util.Arrays;
import java.util.Scanner;
/**
*
*/

abstract interface ArrayListADT<E>
{
   
   public void add(E element);
   
   public void removeIndex(int index);
   
   public void removeElement(E element);
   
   public void read(int index);
   
   public void modifyIndex(int index, E element);
   
   public void modifyElement(E oldElement, E newElement);
}

class MyArrayListADT<E> implements ArrayListADT<E> {
    
    E[] arrayObject;
    int count;
    @SuppressWarnings("unchecked")

    MyArrayListADT() {
        arrayObject =(E[])new Object[10];
        count = 0;
    }

    public void add(E element) {
        arrayObject[count++] = element;
        expand();
    }
  @SuppressWarnings("unchecked")
	public void expand() {
		E[] newArrayObject = (E[])new Object[arrayObject.length * 2];
		System.arraycopy(arrayObject, 0, newArrayObject, 0, arrayObject.length);
		arrayObject = newArrayObject;		
	}

	public void display()
	{
		if(count == 0){
			System.out.println("List is empty");
		}
		int i;
		for(i=0;i<count;i++) {
			if(arrayObject[i] == null) {
				int flag = 0;
			} else 
			System.out.println(arrayObject[i]);
		}
	}

    public void removeElement(E element) {
    	for(int i = 0; i < count; i++) {
			if(arrayObject[i].equals(element)){
				for(int j = i; j < count; j++) {
					arrayObject[j] = arrayObject[j+1];
				}
			count--;
			i--;
			} else {
				System.out.println("Element is not found");
				break;
			}	 
		}
    }

    public void removeIndex(int index) {
    	if(count == 0) {
    		System.out.println("List is empty");
    	} else {
			for(int j = index; j < count; j++) {
				arrayObject[j] = arrayObject[j+1];
			}
			count--;	
    	}
    }


    public void modifyIndex(int index, E element) {
    	 arrayObject[index] = element;
    }

    public void read(int index) {
    	System.out.println(arrayObject[index]);
    	
    }

   	public void modifyElement(E oldElement, E newElement) {
   		for(int i = 0; i < count; i++) {
			if(arrayObject[i].equals(oldElement)) {
				arrayObject[i] = newElement;
			}
		}
    }

}

public class GenericArrayList{
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		String inputType;
		String operationToPerform;
		String read1;
		String read2;

		inputType = kb.next();

		switch(inputType) {
			case "I":
			  MyArrayListADT<Integer> intObj = new MyArrayListADT<Integer>();
				while(!(operationToPerform = kb.next()).equals("end")) {
				  switch(operationToPerform) {
					  case "add": 
						  	read1 =kb.next();
							intObj.add(Integer.parseInt(read1));
							break;
						case "removeElement": 
						  	read1 = kb.next();
							intObj.removeElement(Integer.parseInt(read1));
							break;
						case "removeIndex": 
						 	read1 = kb.next();
							intObj.removeIndex(Integer.parseInt(read1));
							break;
						case "read":
						  	read1 = kb.next();
							intObj.read(Integer.parseInt(read1));
							break;																	
						case "modifyIndex" : 
						  	read1 = kb.next();
							read2 = kb.next();
							intObj.modifyIndex(Integer.parseInt(read1),Integer.parseInt(read2));
							break;
						case "modifyElement": 
						  	read1 = kb.next();
							read2 = kb.next();
							intObj.modifyElement(Integer.parseInt(read1),Integer.parseInt(read2));
							break;
						case "print": 
						  	intObj.display();
							break;
						default: System.out.println("Invalid input");																	
					}
				}
			break;
			case "C":
				MyArrayListADT<Character> charObj = new MyArrayListADT<Character>();
				while(!((operationToPerform = kb.next()).equals("end"))) {
				  switch(operationToPerform) {
					  case "add": 
						  	read1 =kb.next();
							charObj.add(read1.charAt(0));
							break;
						case "removeElement": 
							read1 = kb.next();
							charObj.removeElement(read1.charAt(0));
							break;
						case "removeIndex": 
							read1 = kb.next();
							charObj.removeIndex(Integer.parseInt(read1));
							break;
						case "read":
							read1 = kb.next();
							charObj.read(Integer.parseInt(read1));
							break;																	
						case "modifyIndex" : 
							read1 = kb.next();
							read2 = kb.next();
							charObj.modifyIndex(Integer.parseInt(read1), read2.charAt(0));
							break;
						case "modifyElement": 
							read1 = kb.next();
							read2 = kb.next();
							charObj.modifyElement(read1.charAt(0), read2.charAt(0));
							break;
						case "print": 
							charObj.display();
							break;
						default:
						  System.out.println("Invalid input");																	
					}
				}
			break;
			case "S" :
			  MyArrayListADT<String> strObj = new MyArrayListADT<String>();
				while(!(operationToPerform = kb.next()).equals("end")) {
				  switch(operationToPerform) {
					  case "add": 
							read1 =kb.next();
							strObj.add(read1);
							break;
						case "removeElement": 
						  	read1 = kb.next();
							strObj.removeElement(read1);
							break;
						case "removeIndex": 
						  	read1 = kb.next();
							strObj.removeIndex(Integer.parseInt(read1));
							break;
						case "read":
						  	read1 = kb.next();
							strObj.read(Integer.parseInt(read1));
							break;																	
						case "modifyIndex" : 
						  	read1 = kb.next();
							read2 = kb.next();
							strObj.modifyIndex(Integer.parseInt(read1),read2);
							break;
						case "modifyElement": 
						  	read1 = kb.next();
							read2 = kb.next();
							strObj.modifyElement(read1, read2);
							break;
						case "print": 
						  	strObj.display();
							break;
						default:
						  System.out.println("Invalid input");																	
					}
				}
			break;
			case "F":
			  MyArrayListADT<Float> floatObj = new MyArrayListADT<Float>();
				while(!(operationToPerform = kb.next()).equals("end")) {
				  switch(operationToPerform) {
						case "add": 
							read1 =kb.next();
							floatObj.add(Float.parseFloat(read1));
							break;
						case "removeElement": 
							read1 = kb.next();
							floatObj.removeElement(Float.parseFloat(read1));
							break;
						case "removeIndex": 
							read1 = kb.next();
							floatObj.removeIndex(Integer.parseInt(read1));
							break;
						case "read":
							read1 = kb.next();
							floatObj.read(Integer.parseInt(read1));
							break;																	
						case "modifyIndex" : 
							read1 = kb.next();
							read2 = kb.next();
							floatObj.modifyIndex(Integer.parseInt(read1), Float.parseFloat(read1));
							break;
						case "modifyElement": 
							read1 = kb.next();
							read2 = kb.next();
							floatObj.modifyElement(Float.parseFloat(read1), Float.parseFloat(read2));
							break;
						case "print": 
							floatObj.display();
							break;
						default: 
						  System.out.println("Invalid input");																	
					}
				}
			break;
			default:
			  System.exit(0);
		}
	}
}