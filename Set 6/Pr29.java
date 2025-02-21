
// import java.io.BufferedReader;

//  import java.io.BufferedReader;
//  import java.io.FileReader;
//  import java.io.IOException;

//  public class Pr29 {
//      public static void main(String[] args) {
//          if (args.length < 2) {
//              System.out.println("Usage: java P29 <word> <filename>");
//              return;
//         }
//          String searchWord = args[0];
//          String fileName = args[1];
//          Integer count = 0;
//          try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//              String line;
//              while ((line = reader.readLine()) != null) {
//                  String[] words = line.split("\\W+");
//                  for (String word : words) {
//                      if (word.equalsIgnoreCase(searchWord)) {
//                          count++;
//                      }
//                  }
//              }
//              System.out.println("The word '" + searchWord + "' appears " + count + " times in " + fileName);
//          } catch (IOException e) {
//              System.out.println("Error reading " + fileName + ": " + e.getMessage());
//          }
//          System.out.println("23DCS076 Jay Patel");
//      }
//  }
import java.io.BufferedReader;
import java.io.FileReader;
public class Pr29
{
public static void main(String[] args) {
    if(args.length<2)
    System.out.println("Invalid input");

    String word=args[0];
    String Filename=args[1];
    String j;
    int count=0;
    try(BufferedReader fr=new BufferedReader(new FileReader(Filename))) {
        while((j=fr.readLine())!=null)
        {
            String[] words=j.split("\\W+");
            for(String s:words)
            {
                if(word.equalsIgnoreCase(s))
                {
                   count++;
                }
            }
        }
        System.out.println(count);
    } catch (Exception e) {
        System.out.println("file error");
    }
}
}