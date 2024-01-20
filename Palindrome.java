//author :Tendai K Nyevedzanai
import java.io.*;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        ArrayList<String> fileString=new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the name of the file:");
        String filename= scanner.nextLine();
        try{
            File file = new File(filename);
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                fileString.add(scanner.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found ASKIES!!!");

        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        for(String lineStrings: fileString){
            char[] charOfLine=lineStrings.toCharArray();
            int i;
            int charLength=charOfLine.length;
            for(i=0;i<charOfLine.length;i++ ){
                if(charOfLine[i]==charOfLine[charLength-i-1]){
                    
                }
            }
        }
       
    }
    

    
}
