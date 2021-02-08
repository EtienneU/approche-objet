package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		// Attention, le n° du mois est décallé de 1. Ici '4' désigne le mois de Mai
		cal1.set(2016, 4, 19, 23, 59, 30);
		Date d1 = cal1.getTime();
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date d1 = " + f1.format(d1));
		
		Calendar cal2 = Calendar.getInstance();
		Date currentDate = new Date();
		Date d2 = cal2.getTime();
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Current date : d2 = " + f2.format(d2));
		
		Locale france 		= new Locale("fr", "FR"); // ou Locale.FRANCE (sans "new")
		Locale russie 		= new Locale("ru", "RU");
		
		SimpleDateFormat f2FR = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", france);
		System.out.println("Current date FR : d2 = " + f2FR.format(d2));
		SimpleDateFormat f2RU = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", russie);
		System.out.println("Current date RU : d2 = " + f2RU.format(d2));
		SimpleDateFormat f2CH = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
		System.out.println("Current date CH : d2 = " + f2CH.format(d2));
		SimpleDateFormat f2DE = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
		System.out.println("Current date DE : d2 = " + f2DE.format(d2));




	}

}
