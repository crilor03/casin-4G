/* Progetto del casinò della 4G
 * Programmatori: Cristian Lorenti, Delmonte daniele ....
 * */

import java.util.Scanner; //non lo so sincero lo fa sempre il prof
public class main {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in); //dichiarazione dello scanner 
	 int sceltaGiochi=0; //dichiarzione variabile per la scelta dell'utente
	 
	 System.out.println("Benvenuti nel casinò della 4G"); // stampa del benvenuto 
	 System.out.println("a che gioco vuoi giocare?"); 
	 System.out.println(""); //menu per la selezione dei giochi
	 
	 sceltaGiochi = sc.nextInt();
	 switch (sceltaGiochi) {
	 
	 case 0:
		GiocoDadi.GiocoDADI();
		 break;
	 case 1:
		 break;
	 case 2:
		 break;
		 
	 
	 } //switch della scielta dei giochi  /*delmo puoi aggiungere qualche idea per i giochi da casinò*/
	 
	 
	
 } //main 
} //main class 
