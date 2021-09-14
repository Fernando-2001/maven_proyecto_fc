package produbanco;

import java.util.Scanner;

public class SistemaProdubanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String clave = "85AB";
		String cla = "-1";
		String c;
		boolean respuesta;
		
		do {
			
		System.out.println("Ingrese una clave: ");
		c = in.next();
		respuesta = clave.equals(c);
		if (respuesta == false) {
			System.out.println("La clave ingresada no es correcta!");
			
		}
		boolean r = cla.equals(c);
		if(r == true) {
			System.out.println("Gracias por preferirnos");
		}
		
		}while(respuesta != true);
		int op;
		do {
		System.out.println("#################################");
		System.out.println("BANCO PRODUBANCO");
		System.out.println("1. Realizar transferencia");
		System.out.println("2. Consultar transacciones");
		System.out.println("3. SALIR");
		System.out.println("#################################");
		System.out.print("Seleccione una opcion: ");
		op = in.nextInt();
		
		if (op == 1) {
			System.out.println("ingrese la cuenta de destino de la transferencia:");
			String cuenta = in.next();
			System.out.println("Ingrese el monto a transferir: ");
			int m = in.nextInt();
			if(m>1000) {
				System.out.println("su saldo es ensuficiente");
			}else {
				int saldo = 1000-m;
				System.out.println("Su nuevo saldo es de: "+saldo);
			}
		}else if(op == 2) {
			System.out.println("En este momento se están procesando las transacciones, intente más tarde");
		}
		}while(op!=3);
		System.out.println("Fin del programa");
	}

}
