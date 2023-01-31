import java.util.Random;
public class Piratagotchi {

	//Atributos
	
	private String nombre;
	private int energia;
	private boolean hambriento;
	private int nivelFelicidad;
	
	//Metodos
	
	public Piratagotchi() {
		this.nombre="Patrisio";
		this.energia=6;
		this.hambriento=false;
		this.nivelFelicidad=1;
	}
	public Piratagotchi(String nombre) {
		Random random=new Random();
		this.nombre=nombre;
		this.energia=(int)Math.floor(Math.random()*(10-1)+1);
		this.hambriento=random.nextBoolean();
		this.nivelFelicidad=(int)Math.floor(Math.random()*(10-1)+1);;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public boolean isHambriento() {
		return hambriento;
	}
	public void setHambriento(boolean hambriento) {
		this.hambriento = hambriento;
	}
	public int getNivelFelicidad() {
		return nivelFelicidad;
	}
	public void setNivelFelicidad(int nivelFelicidad) {
		this.nivelFelicidad = nivelFelicidad;
	}
	
	public void comer() {
		if(this.hambriento==true) {
			this.hambriento=false;
			System.out.println(this.nombre+" ha comido :D");
		}else {
			this.nivelFelicidad-=1;
			System.out.println(this.nombre+" no tenia hambre, como le has obligado a comer ahora te tiene mania");
		}
	}
	public void dormir(int horasDurmiendo) {
		this.energia+=horasDurmiendo;
		if(this.energia<=10) {
		System.out.println(this.nombre+" ha dormido lo necesario y esta listo para jugar");
		}
		else if(this.energia>10) {
			this.nivelFelicidad-=this.nivelFelicidad-10;
			System.out.println(this.nombre+" ha dormido de mas y esta triste por desaprovechar el dia :(");
		}
	}
	public void jugar(int horasJugando) {
		if(this.hambriento==false) {
			this.nivelFelicidad+=horasJugando;
			if(this.nivelFelicidad>10) {
				this.nivelFelicidad=10;
			}
			System.out.println(this.nombre+" ha jugado mucho y tiene mas hambre que el perro de un ciego");
			this.hambriento=true;
		}else {
			this.energia-=horasJugando;
			this.nivelFelicidad-=horasJugando;
			if(this.energia<0) {
				this.energia=0;
			}
			System.out.println(this.nombre+" apenas ha podido jugar porque tenia hambre y ahora esta triste y cansado");
		}
	}
	public String getNecesidades() {
		String respuesta=this.nombre;
		if(this.energia<=3) {
			respuesta+=" necesita dormir";
		}
		if(this.nivelFelicidad<=3) {
			respuesta+=" esta triston (jugar le animara)";
		}
		if(this.hambriento==true) {
			respuesta+=" tiene hambre (dale algo de comer)";
		}
		else {
			System.out.println(this.nombre+" esta contento y no tiene necesidades :D");
		}
		return respuesta;
	}
	public void observar() {
		int opcion;
		opcion=(int)Math.floor(Math.random()*(5)+1);
		switch(opcion) {
		case 1:
			System.out.println("  ┌─┬─┬────┬─┬─┐");
			System.out.println("┌─┤ │*│    │*│ ├─┐");
			System.out.println("└─┤ └─┘    └─┘ ├─┘");
			System.out.println("  │    ┌  ┐    │");
			System.out.println("  │    └──┘    │");
			System.out.println("  ├───┬────┬───┤");
			System.out.println("  └───┘    └───┘");
			System.out.println(this.nombre+" observa con admiracion el codigo que le dio vida :)");
			break;
		case 2:
			System.out.println("  ┌────────────┐");
			System.out.println("┌─┤            ├─┐");
			System.out.println("└─┤ ┌┐      ┌┐ ├─┘");
			System.out.println("  │ └┘ ──── └┘ │");
			System.out.println("  │            │");
			System.out.println("  ├───┬────┬───┤");
			System.out.println("  └───┘    └───┘");
			System.out.println(this.nombre+" te mira de vuelta, pensando: 'Tengo zusto'");
			break;
		case 3:
			System.out.println("       ┌───────────────┐");
			System.out.println("       │ *****  *   *  │");
			System.out.println("       │   *     * *   │");
			System.out.println("       │   *      *    │");
			System.out.println("  ┌────┴───────┬───────┘");
			System.out.println("  │            │");
			System.out.println("┌─┤            ├─┐");
			System.out.println("└─┤            ├─┘ ***");
			System.out.println("  │            │   ***");
			System.out.println("  ├───┬────┬───┤   ***");
			System.out.println("  └───┘    └───┘   ***");
			System.out.println(this.nombre+" esta de chill viendo el programa de Chicote");
			break;
		case 4:
			System.out.println("                 Z");
			System.out.println("  ┌────────────┐Z");
			System.out.println("  │            │ Z");
			System.out.println("┌─┤            ├─┐");
			System.out.println("└─┤ LI      LI ├─┘");
			System.out.println("  │     O      │");
			System.out.println("  ├───┬────┬───┤");
			System.out.println("  └───┘    └───┘");
			System.out.println(this.nombre+" se ha echado una legendaria siesta de 8 horas");
			break;
		case 5:
			System.out.println(" ┌─┐      ┌─┐");
			System.out.println("┌┴─┴──────┴─┴┐");
			System.out.println("│            │");
			System.out.println("│ >>      << │");
			System.out.println("│     O      │");
			System.out.println("│            │");
			System.out.println("├───┬────┬───┤");
			System.out.println("└───┘    └───┘");
			System.out.println(this.nombre+" se esta estirando (estar encerrado en la consola del IDE es agobiante)");
		}
	}
	
}
