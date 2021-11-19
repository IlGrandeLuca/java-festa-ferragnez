package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bouncer = new Scanner(System.in);
		String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		boolean checked = false;
		
		System.out.print("Enter guest name: ");	
		String guestName = bouncer.nextLine();
		System.out.print("Search for " + guestName + "...\n");
		
		for(int i = 0; i < guestList.length; i++) {
			
			guestList[i] = guestList[i].toLowerCase();
			guestName = guestName.toLowerCase();	
			
			if(guestList[i].equals(guestName)) {
				
				System.out.println(guestName + " can now enter.");
				checked = true;
				
				break;
			}
		}
		
		if(!checked) {
			
			System.out.println("Go away!");
		}
		
		bouncer.close();
	}

}
