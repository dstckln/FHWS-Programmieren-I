package ueb02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Uhrzeit {

    public static void main(String[] args) {
		
	//aktuelles Datum 
	LocalDate nowDate = LocalDate.now();
	//aktuelle Uhrzeit 
	LocalDateTime nowTime = LocalDateTime.now();
	//Start Tag (00:00:00:000001)
	LocalDateTime startDay = nowDate.atStartOfDay();
	//Ende Tag (23:59:59:9999999)
	LocalDateTime endDay = nowDate.atTime(LocalTime.MAX);
	    
	//Zeitspanne - wie viel Zeit seit startDay
	Duration durationStart = Duration.between(startDay, nowTime);
	//Zeitspanne - wie viel Zeit bis endDay
	Duration durationEnd = Duration.between(nowTime, endDay);
	    
	//Duration umwandeln
	//startDay Werte
	double secondsPassed = durationStart.getSeconds();
	double minutesPassed = durationStart.toMinutes();
	double hoursPassed = durationStart.toHours();
	    
	//endDay Werte
	double secondsRemain = durationEnd.getSeconds();
	double MinutesRemain = durationEnd.toMinutes();
	double hoursRemain = durationEnd.toHours();
	   
	//Prozent vergangenen Zeit
	//Formel: 100 * sekunden vergangen / sekunden gesamt am Tag
	double percentage = 100 * secondsPassed / (secondsPassed + secondsRemain);
	    
	//Ausgabe
	//Aufgabe a.)
	System.out.println("Aufgabe a.) Es ist: " + nowTime + "Seit Mitternacht sind: " + hoursPassed + " Stunden, " + 
	    					minutesPassed + " Minuten oder " + secondsPassed + " Sekunden vergangen.");
	//Aufgabe b.)
	System.out.println("Aufgabe b.) Bis zum naechsten Tag dauert es: " + hoursRemain + 
	    				   " Stunden, " + MinutesRemain + " Minuten oder " + secondsRemain + 
	    				   " Sekunden.");
	//Aufgabe c.)
	System.out.println("Aufgabe c.) Es sind " + percentage + "% des Tages vergangen.");
    }
}
