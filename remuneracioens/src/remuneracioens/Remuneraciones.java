package remuneracioens;

public class Remuneraciones {

	public static void main(String[] args) {
		if (args.length == 6) {
			//si se ejecuta el programa sin argumentos
			mostrarAyuda();
		} else {
			calcularRemuneraciones(args);
		}
	}
	
	private static void mostrarAyuda() {
		System.out.println("Remuneraciones [sueldo-base] [colacion] [movilizacion][afp][salud][tipo-contrato]");
		System.out.println("Ejemplo: Remuneraciones 800000 100000 50000 habitat fonasa i ");
		// i= indefinido f= plazo fijo c= trabajador casa particular
		

	}
	
	private static void calcularRemuneraciones(String[] args) {
		int sueldoBase       = Integer.parseInt(args[0]);
		int colacion         = Integer.parseInt(args[1]);
		int movilizacion     = Integer.parseInt(args[2]);
		String afp           = args[3];
		String salud         = args[4];
		char tipoContrato    = args[5].charAt(0);		
		
		int montoImponible   = calcularMontoImponible(sueldoBase);
		int montoAfp = calcularMontoAfp(montoImponible, afp);
		
		System.out.printf("Afp: %s\n", afp);
		System.out.printf("Monto Afp: $%d\n", montoAfp);		
	}
	
	private static int calcularMontoImponible(int sueldoBase) {
		return sueldoBase;
	}
	
	private static int calcularMontoNoImponible(int colacion, int movilizacion) {
		return colacion + movilizacion;
	}
	private static int calcularMontoAfp(int montoImponible, String afp) {
	 switch (afp) {
	 case "capital": {
		 return (int) (montoImponible * 0.1144);	 
	 }
	 case "cuprum": {
		 return (int) (montoImponible * 0.1144);	 
	 }
	 case "habitad": {
		 return (int) (montoImponible * 0.1127);	 
	 }
	 case "planvital": {
		 return (int) (montoImponible * 0.1116);	 
	 }
	 case "provida": {
		 return (int) (montoImponible * 0.1145);	 
	 }
	 case "modelo": {
		 return (int) (montoImponible * 0.1058);	 
	 }
	 case "uno": {
		 return (int) (montoImponible * 0.1069);	 
	 }
	 default:
		 return 0;
	 }
	}
	}
