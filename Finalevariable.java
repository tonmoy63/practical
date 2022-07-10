package javaprogram;

public class Finalevariable {
	//final void run (){
		//System.out.println("Working");
		}
			class Finalclass extends Finalevariable{
				void run(){
					System.out.println("Working safely");
				}
				public static void main(String[]args) {
					Finalclass b = new Finalclass();
					
				b.run();
				}
			}
