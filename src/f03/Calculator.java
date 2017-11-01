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
public class Calculator {

    public Calculator() {
    }

    public int calcular(String expression) {

//        ArrayStack<Integer> stack = new ArrayStack<>(50);
        LinkedStack<Integer> stack = new LinkedStack<>();

        int value;
        String operador;

        int operando1;
        int operando2;

        int result = 0;

        Scanner stringScan = new Scanner(expression);

        while (stringScan.hasNext()) {

            if (stringScan.hasNextInt()) {

                value = stringScan.nextInt();

                stack.push(value);

            } else {

                operador = stringScan.next();

                operando2 = stack.pop();

                operando1 = stack.pop();

                if (operador.equals("/")) {

                    result = operando1 / operando2;

                } else if (operador.equals("*")) {

                    result = operando1 * operando2;

                } else if (operador.equals("+")) {

                    result = operando1 + operando2;

                } else if (operador.equals("-")) {

                    result = operando1 - operando2;

                } else {
                    System.out.println("Unknown operator");

                }

                stack.push(result);

            }

        }

        result = stack.peek();
        stack.pop();

        return result;
    }
}
