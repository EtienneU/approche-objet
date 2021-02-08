package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		// Constructeur deprecie
		Date d1 = new Date(120, 6, 7, 12, 25, 30);
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date d1 : " + f1.format(d1));
		
		// Attention : Si j'ecris hh a la place de HH, les heures ne depassent pas 12
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Date d2 : " + f2.format(d2));
		
		// Date actuelle du système
		Date d3 = new Date();
		SimpleDateFormat f3 = new SimpleDateFormat("EEEE d MMMM yyyy à HH'h'mm");
		System.out.println("Date d3 : " + f3.format(d3));		
	}

}
