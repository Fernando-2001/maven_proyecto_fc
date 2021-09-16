package prueba;

import java.util.Scanner;

public class MainPrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String claveIngresada;
		String opcionMenu;
		int saldoInicial = 2500;
		do {
		System.out.println("Ingrese clave: ");
		Scanner in = new Scanner(System.in);
		 
		claveIngresada = in.next();
		 
		if (claveIngresada.equals("85AB")) {
			
			do {
			System.out.println("BANCO PRODUBANCO");
			System.out.println("1. Consultar pagos");
			System.out.println("2. Realizar transferencia");
			System.out.println("3. SALIR");
			opcionMenu = in.next();
			
			if(opcionMenu.equals("1")) {
				System.out.println("No tiene nimgún pago pendiente");
			}else if (opcionMenu.equals("2")) {
				System.out.println("Ingrese la cuenta de destino: ");
				String cuentaDestino = in.next();
				System.out.println("Ingrese el monto a transferir: ");
				int montoTransferir = in.nextInt();
				saldoInicial = saldoInicial - montoTransferir;
				System.out.println("Su nuevo saldo es de: "+saldoInicial);
				
			}
			}while(!opcionMenu.equals("3"));
			claveIngresada = "0";
		}else {
			System.out.println("La clave no es correcta");
		}
		}while (!claveIngresada.equals("-1"));
		System.out.println("Gracias por preferirnos");
	}

}
