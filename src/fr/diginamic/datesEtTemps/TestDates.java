package fr.diginamic.datesEtTemps;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		// ==================== les differents Objets Date et formatages ==========================

		// Constructeur deprecie
		Date d1 = new Date(120, 6, 7, 12, 25, 30);
		// Formateur de date natif Java
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date arbitraire formatee (Date) d1 = " + f1.format(d1));
		
		// Attention : Si j'ecris hh a la place de HH, les heures ne depassent pas 12
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Date arbitraire formatee (Date) d2 = " + f2.format(d2));
		
		// Date actuelle du système
		Date d3 = new Date();
		SimpleDateFormat f3 = new SimpleDateFormat("EEEE d MMMM yyyy à HH'h'mm");
		System.out.println("\nDate actuelle du systeme formatee : (Date) d3 = " + f3.format(d3));

		Instant now = Instant.now();
		System.out.println("Date actuelle sans formatage : (Instant) now = " + now);

		// Utilisation de LocalDate et localDateTime
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Date et heure du jour (LocalDateTime) currentTime = " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("Date courante (LocalDate) currentTime = " + date1);

		Month mois = currentTime.getMonth();
		int jour = currentTime.getDayOfMonth();
		int heure = currentTime.getHour();
		System.out.println("\nMois = " + mois +" | jour = " + jour +" | heure = " + heure);

		// Avoir le 25 decembre 2023
		LocalDateTime date2 = currentTime.withDayOfMonth(18).withYear(2023).withMonth(10);
		System.out.println("\nDate initiale modifiee (LocalDateTime) dateModifiee = " + date2);

		// Une autre facon de faire
		LocalDate date3 = LocalDate.of(2023, Month.OCTOBER, 18);
		System.out.println("Meme chose avec LocalDate : (LocalDate) dateModifiee = " + date3);

		// Parser une date a partir d'un String
		LocalTime parsedDate = LocalTime.parse("20:15:30");
		System.out.println("\nDate parsee : (LocalTime) parsedDate = " + parsedDate);

		// =================== Gerer les intervales de temps avec Period et Duration ========================
		LocalDateTime ldt1 = LocalDateTime.of(2016, Month.FEBRUARY, 14, 19, 54, 7);
		LocalDateTime ldt2 = ldt1.plus(10, ChronoUnit.YEARS);
		LocalDateTime ldt3 = ldt1.minusMinutes(2451);

		Period p = Period.between(ldt1.toLocalDate(), ldt2.toLocalDate());
		Duration d = Duration.between(ldt1.toLocalTime(), ldt3.toLocalTime());
		System.out.println("\nPeriode : " + p);
		System.out.println("Duree : " + d.getSeconds());
		System.out.println("Ecart en jour : " + ChronoUnit.DAYS.between(ldt1, ldt2));
	}
}
