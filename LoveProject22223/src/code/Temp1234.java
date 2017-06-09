package code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Temp1234 {
   public static ArrayList<String> pro = new ArrayList<String>();
   public static ArrayList<String> plist = new ArrayList<String>();
   public static ArrayList<String> ans = new ArrayList<String>();
   public static int P=0;

   public void make() {

      try {
         BufferedReader br = new BufferedReader(new FileReader("Problem.txt"));
         BufferedReader br2 = new BufferedReader(new FileReader("Answer.txt"));
         BufferedReader br3 = new BufferedReader(new FileReader("Problem.txt"));
         for(int i=0;true;i++) {
            String line = br.readLine();
            String line2 = br2.readLine();
            if (line == null)
               break;
            if(i%5==0)
            {
               pro.add(line);
               P++;
            }
            else plist.add(line);
            ans.add(line2);
         }
         br.close();
         br2.close();
      } catch (IOException a) {
         System.out.println("Can't Read");
      }
   }
}