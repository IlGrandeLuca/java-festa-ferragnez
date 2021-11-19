package com.ferragnez.party.bonus;

import java.util.Scanner;

public class CheckGuestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bouncer = new Scanner(System.in);
		String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		boolean checked = false;
		int counter = 0;
		
		System.out.print("Enter guest name: ");	
		String guestName = bouncer.nextLine();
		System.out.print("Search for " + guestName + "...\n");
		
		while(!checked && counter < guestList.length) {
			
			if(guestList[counter].equalsIgnoreCase(guestName)) {
				
				System.out.println(guestList[counter] + " can now enter.");
				checked = true;
			} else {
				
				counter++;
			}
		}
		
		if(!checked) {
			
			System.out.println("Go away!");
		}
		
		bouncer.close();
	}

}
