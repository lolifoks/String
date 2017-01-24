/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
import java.lang.*;
/**
 *
 * @author azrap
 */
public class TesterText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Text t1 = new Text("  this iS sOMe  texT...  teSt   your code!does it work ?");
        
        t1.Equals("testTest");
        t1.Equals("  this iS sOMe  texT.  teSt   your code!does it work ?");
        t1.Add("it woRks  !");
        
        System.out.println("Number of dots in text: "+ t1.CountDots());
        System.out.println("Number of words in text: "+ t1.CountWords());
        
        String words[] = t1.Words();
        
        for(int i=0; i<words.length; i++){
            
            System.out.print(words[i]+",");
        }
        System.out.println();
        System.out.print("Erasing multiple spaces: " + t1.TrimSpaces());
        System.out.println();
        System.out.print("Capital and lower cases correction: " + t1.CapitalLeters());
        System.out.println();
        //Changing text
        System.out.println("Change text: ");
        t1.setS(t1.TrimSpaces());
        t1.setS(t1.CapitalLeters());
        System.out.println(t1.getS());
    }
    
}
