package refuge.test;

import java.time.LocalDate;

import refuge.model.Animal;

public class App {
	
	public static void main(String[] args) {
		Animal chien1 = new Animal(1, "Bento", "Shiba", LocalDate.parse("2025-01-01"), "Si vous lui donnez la main, il vous prendra le bras");
		Animal chien2 = new Animal(2, "Léon", "Bulldog", LocalDate.parse("2022-11-09"), "Aussi gros que gentil");
		Animal chien3 = new Animal(3, "Pepper", "Fox", LocalDate.parse("2020-08-03"), "Brave bête");
		Animal chat1 = new Animal(4, "Nugget", "chat", LocalDate.parse("2018-05-23"), "Un chat quoi");
		Animal chat2 = new Animal(5, "Misty", "Maine Coon", LocalDate.parse("2019-03-14"), "Majestueux et câlin");
		Animal chat3 = new Animal(6, "Oreo", "Siamois", LocalDate.parse("2021-07-11"), "Toujours curieux");
		Animal chien4 = new Animal(7, "Rocky", "Labrador", LocalDate.parse("2020-06-30"), "Fidèle et joueur");
		Animal chien5 = new Animal(8, "Luna", "Husky", LocalDate.parse("2023-02-19"), "Énergique et têtue");
		Animal perroquet1 = new Animal(9, "Coco", "Perroquet Ara", LocalDate.parse("2015-09-10"), "Parle trop mais attachant");
		Animal lapin1 = new Animal(10, "Fluffy", "Lapin Nain", LocalDate.parse("2022-04-28"), "Petit mais plein d’énergie");
		Animal tortue1 = new Animal(11, "Tartuffe", "Tortue Hermann", LocalDate.parse("2010-12-05"), "Toujours en balade tranquille");
		Animal cheval1 = new Animal(12, "Éclair", "Pur-sang", LocalDate.parse("2016-09-01"), "Rapide comme le vent");
	}
}