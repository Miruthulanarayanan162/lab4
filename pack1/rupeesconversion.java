/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class rupeesconversion {
    public void display(){
        Scanner obj=new Scanner(System.in);
        double a,b,c,d,e,f;
        System.out.println("Enter the amount in dollar:");
        a=obj.nextDouble();
        System.out.println("The value of given dollar in Indian rupees is:Rs."+(a*74.85));
        b=obj.nextDouble();
        System.out.println("The value of given rupees in Dollar is:$"+(b*0.013));
        System.out.println("Enter the amount Yen:");
        c=obj.nextDouble();
        System.out.println("The value of given Yen in Indian rupees is:Rs."+(c*0.70));     
        System.out.println("Enter the amount in Indian rupees");
        d=obj.nextDouble();
        System.out.println("The value of given Indian rupees in Yen is: "+(d*1.42)+"Yen");
        System.out.println("Enter the amount in Euro:");
        e=obj.nextDouble();
        System.out.println("The value of given Euro in Indian rupees is:Rs."+(e*88.65));
        System.out.println("Enter the amount in Indian rupees");
        f=obj.nextDouble();
        System.out.println("The value of given Indian rupees in Euro is: "+(f*0.011)+"Euro");
        
        
        
    }
    
}
