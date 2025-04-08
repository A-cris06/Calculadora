package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Calculadora calculadora = new Calculadora(4, 6);
        System.out.println(calculadora.suma());
    }
}
