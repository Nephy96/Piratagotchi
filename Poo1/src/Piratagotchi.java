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
	public Piratagotchi(String n) {
		Random random=new Random();
		this.nombre=n;
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
		if(this.hambriento=true) {
			this.hambriento=false;
			System.out.println(this.nombre+" ha comido :D");
		}else {
			this.nivelFelicidad-=1;
			System.out.println(this.nombre+" no tenia hambre, como le has obligado a comer ahora te tiene mania");
		}
	}
	public void dormir(int horasDurmiendo) {
		this.energia+=horasDurmiendo;
		System.out.println(this.nombre+" ha dormido lo necesario y esta listo para jugar");
		if(this.energia>10) {
			this.nivelFelicidad-=this.nivelFelicidad-10;
			System.out.println(this.nombre+" ha dormido de mas y esta triste por desaprovechar el dia :(");
		}
	}
	public void jugar(int horasJugando) {
		if(this.hambriento=false) {
			this.nivelFelicidad+=horasJugando;
			if(this.nivelFelicidad>10) {
				this.nivelFelicidad=10;
			}
			this.hambriento=true;
			System.out.println(this.nombre+" ha jugado mucho y tiene mas hambre que el perro de un ciego");
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
		if(this.hambriento=true) {
			respuesta+=" tiene hambre (dale algo de comer)";
		}
		return respuesta;
	}
	
}
