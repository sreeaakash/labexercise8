/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenate.string;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ConcatenateString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name,pwd;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter username:");
        name=obj.next();
        System.out.println("Enter password:");
        pwd=obj.next();
        if(name.equals(pwd))
        {
            System.out.println("Concatenated String is:");
            System.out.println(name+pwd);
        }
        else
        {
            System.out.println("The name and password are inequal:");
        }
        
    }
    
}
