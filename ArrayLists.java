/**
 * Write a description of class ArrayLists here.
 *
 * @author 
 * @version 
 */
public class ArrayLists
{
    public static void main(String[] args) {   
        /* Do not use any hardcoded String values in the methods below */ 
        /* Uncomment the code in the main method below as you progress throughout the lab */
       
        String scarf = "Scarf";
        String[] items = {"Coat", "Shoes", "Shirt", "Pants"};
        ArrayList al = initList(items);
        System.out.println("\n**Contents of Initialized ArrayList**");
        printArrayList(al); 

        
        String[] biggerArray = addToArray(items, scarf); 
        System.out.println("\n**Contents of Collections After Adding Item**");
        printArray(biggerArray); 
        addToArrayList(al, scarf); 
        printArrayList(al); 
        

        /*  
        System.out.println("\n**Contents of Array After Removal**");
        removeFromArray(biggerArray,"Shoes");
        printArray(biggerArray); 
        */
       
       /*  
        System.out.println("\n**Contents of ArrayList After Removal**");
        removeFromArrayList(al,"Shoes");
        printArrayList(al);  
        */
    }

    public static ArrayList<String> initList(String[] clothing) { 
        // Create an ArrayList

        // Copy contents of clothing array into ArrayList

        // Return the ArrayList
    }

    public static String[] addToArray(String[] clothing, String addItem) {         
        // Create new array and add contents

        // This is a placeholder. You will need to update it. 
        return clothing;
    }

    public static void addToArrayList(ArrayList<String> al, String addItem) {         
        // Add item to ArrayList
    }

    public static void printArray(String[] array) { 
        
    }
    
    public static void printArrayList(ArrayList<String> al) { 
        
    }
    
    public static void removeFromArray(String[] clothing, String removeItem) {         
        
    }

    public static void removeFromArrayList(ArrayList<String> al, String removeItem) {         

    }
}
