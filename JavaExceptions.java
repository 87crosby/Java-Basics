import java.util.ArrayList;
public class JavaExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        
        int i = 0;
        while(i<myList.size()){
            try {
                Integer castedValue = (Integer) myList.get(i);
                i++;
            } catch (Exception e) {
                String s= String.valueOf(i);
                String error_message = e.getMessage(); 
                System.out.println("Error: " + error_message + " at index " + s);
                i++;
            }
        }

    }
    
}
