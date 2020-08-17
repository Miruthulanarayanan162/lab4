/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packdemo;
import pack1.*;
import pack1.subpackage.third;
/**
 *
 * @author DELL
 */
public class accesspack {
    public static void main(String[] args){
        first s=new first();
        s.display();
        second r=new second();
        r.display();
        third t=new third();
        t.display();
        rupeesconversion e=new rupeesconversion();
        e.display();
    }
    
}
