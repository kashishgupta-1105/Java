package JavaProblemsweek1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//9. Count how many times lowercase vowels occurred in a String by reading a .txt file.
public class LowercaseVowelsCount {
    public static void main(String args[]) throws FileNotFoundException {
                String myfile = "C:\\Users\\Coditas-Admin\\IdeaProjects\\Practice\\src\\main\\resources\\input.txt";
               File file = new File(myfile);
               Scanner text = new Scanner(file);
                int c = 0;
                       while(text.hasNext()) {

                           String t = text.nextLine();
                           for (int i = 0; i < t.length(); i++) {
                               char ch = t.charAt(i);
                               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                                   c++;
                           }
                       }
        text.close();
        System.out.println("The lowercase vowel count is " +  c);
          }

}
