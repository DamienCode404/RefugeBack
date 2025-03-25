package refuge.test;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import refuge.model.Animal;

public class App {
    public static void main(String[] args) {
        // Create Animal objects without setting the ID if it's auto-generated
        Animal chien1 = new Animal("Bento", "Shiba", LocalDate.parse("2025-01-01"), "Si vous lui donnez la main, il vous prendra le bras");
        Animal chien2 = new Animal("Léon", "Bulldog", LocalDate.parse("2022-11-09"), "Aussi gros que gentil");
        Animal chien3 = new Animal("Pepper", "Fox", LocalDate.parse("2020-08-03"), "Brave bête");
        Animal chat1 = new Animal("Nugget", "chat", LocalDate.parse("2018-05-23"), "Un chat quoi");
        Animal chat2 = new Animal("Misty", "Maine Coon", LocalDate.parse("2019-03-14"), "Majestueux et câlin");
        Animal chat3 = new Animal("Oreo", "Siamois", LocalDate.parse("2021-07-11"), "Toujours curieux");
        Animal chien4 = new Animal("Rocky", "Labrador", LocalDate.parse("2020-06-30"), "Fidèle et joueur");
        Animal chien5 = new Animal("Luna", "Husky", LocalDate.parse("2023-02-19"), "Énergique et têtue");
        Animal perroquet1 = new Animal("Coco", "Perroquet Ara", LocalDate.parse("2015-09-10"), "Parle trop mais attachant");
        Animal lapin1 = new Animal("Fluffy", "Lapin Nain", LocalDate.parse("2022-04-28"), "Petit mais plein d’énergie");
        Animal tortue1 = new Animal("Tartuffe", "Tortue Hermann", LocalDate.parse("2010-12-05"), "Toujours en balade tranquille");
        Animal cheval1 = new Animal("Éclair", "Pur-sang", LocalDate.parse("2016-09-01"), "Rapide comme le vent");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contextJPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Persist the entities
        em.persist(chien1);
        em.persist(chien2);
        em.persist(chien3);
        em.persist(chien4);
        em.persist(chien5);
        em.persist(chat1);
        em.persist(chat2);
        em.persist(chat3);
        em.persist(perroquet1);
        em.persist(lapin1);
        em.persist(tortue1);
        em.persist(cheval1);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
