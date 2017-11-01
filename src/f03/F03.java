/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f03;

import java.util.Scanner;

/**
 *
 * @author NunoFerreira
 */
public class F03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        ArrayStack<Integer> ar1 = new ArrayStack<>();
//        
//        ar1.push(2);
//        ar1.push(3);
//        ar1.pop();
//        System.out.println(ar1.peek());
//        LinkedStack<Integer> ls1 = new LinkedStack<>();
//        ls1.push(1);
//        ls1.push(2);
//        ls1.push(3);
////        ls1.push(4);
////        ls1.push(5);
////        ls1.pop();
//        
//       System.out.println(ls1.size());
//
////        ls1.displayList();
        Calculator cl1 = new Calculator();
        
        System.out.println(cl1.calcular("1 4 + 2 +"));

    }

}
