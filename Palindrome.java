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
            while(scanner.hasNextLine()){}
        }catch(FileNotFoundException e){
            System.out.println("File not found ASKIES!!!");

        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
       
    }
    

    
}
