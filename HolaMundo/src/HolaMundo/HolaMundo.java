package HolaMundo;

public class HolaMundo { 
	public static void main(String[] args){
		
		if( args.length == 0 ){
			System.out.println("Hola a todos");
		} else if( args.length == 1){
			System.out.println("Hola "+args[0]);
		} else if ( args.length == 2 ){
			System.out.println(" Buenas tardes se�or(a) "+args[0]+" "+args[1]);
		}
	}

}
