package com.Calculadora;

import java.io.PrintStream;
import java.util.Scanner;
public class Calculator {
	double OperandOne;
	String Operation; 
	double OperandTwo; 
	double resultado; 
	
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	
	public double performOperation() {
		System.out.println("Escoge el primer Operador");
		OperandOne = sc.nextDouble();
		
		
		return (OperandOne);
	}
	public double getResult() {
		System.out.println("Escoge el Operador Matemático");
		Operation = sc.next();
		switch(Operation) {
			case "+":
				System.out.println("Escoge el segundo Operador");
				OperandTwo = sc2.nextDouble();
				resultado = OperandOne + OperandTwo; 
				System.out.println("El resultado es: " + resultado);
				break; 
			case "-":
				System.out.println("Escoge el segundo Operador");
				OperandTwo = sc2.nextDouble();
				resultado = OperandOne - OperandTwo; 
				System.out.println("El resultado es: " + resultado);
				break;
		}
		return resultado;
		
	}
	
	
}