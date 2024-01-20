//author :Tendai K Nyevedzanai
import java.io.*;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the name of the file:");
        String filename= scanner.nextLine();
        try{
            File file = new File(filename);
            scanner=new Scanner(file);
        }catch(FileNotFoundException e){
            
        }
       
    }
    

    
}
