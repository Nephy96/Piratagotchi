import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion = 0;
		String nombre;
		
	/*
		Cuadrado piquitos=new Cuadrado(3);
		int area=piquitos.getArea();
		System.out.println("Area del cuadrado: "+area);
		piquitos.printCuadrado(); */
		
	/*	
		Persona1 Luis=new Persona1();
		Luis.Saludar(); */
	
		System.out.println("BIENVENIDO A PIRATAGOTCHI!!!\nNombra a tu mascota virtual superdependiente!!!");
		nombre=sc.nextLine();
		Piratagotchi nombre1=new Piratagotchi(nombre);
		do {
			try {
			System.out.println("Que quieres hacer?");
			System.out.println("1. Jugar con "+nombre1.getNombre()+"\n2. Darle de comer\n3. Hacer que haga la dormicion\n4. Comprobar necesidades\n5. Mirar a "+nombre1.getNombre()+"\n6. Salir");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				int horas;
				System.out.println("Cuantas horas quiere que juegue "+nombre1.getNombre()+"?");
				horas=sc.nextInt();
				nombre1.jugar(horas);
				break;
			case 2:
				nombre1.comer();
				break;
			case 3:
				int suenio;
				System.out.println("Cuantas horas quieres que duerma "+nombre1.getNombre()+"?");
				suenio=sc.nextInt();
				nombre1.dormir(suenio);
				break;
			case 4:
				String respuesta;
				respuesta=nombre1.getNecesidades();
				System.out.println(respuesta);
				break;
			case 5:
				nombre1.observar();
				break;
			case 6:
				System.out.println("Gracias por jugar! Nos vemos :3");
				break;
			default:
				System.out.println("Hmm, ese valor no es correcto");
			}
			
			}catch(InputMismatchException ex) {
				System.out.println("Has introducido un valor incorrecto, solo numeros enteros del 1 al 6");
				sc.next();
			}
		}while(opcion!=6);
	}		
}
