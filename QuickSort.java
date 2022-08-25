package ibu.edu.Homework5;
import java.util.Random;

public class QuickSort {
	public static void sort(Comparable[] elements) {
		shuffle(elements);
		sort(elements, 0, elements.length - 1);
		}
	private static void shuffle(Comparable[] elements) {
	    Random rand = new Random();                             
	    for (int i = 0; i < elements.length; i++) {             
	        int r = i + rand.nextInt(elements.length - i);      
	        IPaddress.swap(elements, i, r);                               
	    }
	}
	private static void sort(Comparable[] elements, int low, int high) {
	    if (high > low) {                              
	    int j = partition(elements, low, high);         
	    sort(elements, low, j - 1);                     
	    sort(elements, j + 1, high);                    
	    }
	}
	private static int partition(Comparable[] elements, int low, int high) {
	    int i = low;                                            
	    int j = high + 1;                                       
	    while (true) {                                          
	        while (elements[++i].compareTo(elements[low])<0) {        
	            if (i == high) {                                
	                break;                                      
	            }
	        }
	        while (elements[low].compareTo(elements[--j])<0) {        
	            if (j == low) {                                 	                break;                                      
	            }
	        }
	        if (i >= j) {                                       
	            break;                                          
	        }
	        IPaddress.swap(elements, i, j);                               
	    }
	    IPaddress.swap(elements, low, j);                                 
	    return j;                                               
	}
	
	
}
	

