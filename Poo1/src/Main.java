import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
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
				nombre1.dormir(opcion);
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
			}
		}while(opcion!=6);
	}		
}
