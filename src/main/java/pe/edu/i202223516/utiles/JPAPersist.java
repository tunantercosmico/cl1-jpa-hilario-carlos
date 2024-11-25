package pe.edu.i202223516.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import pe.edu.i202223516.domain.City;
import pe.edu.i202223516.domain.Country;
import pe.edu.i202223516.domain.CountryLanguage;
import pe.edu.i202223516.domain.LanguagePk;

import java.util.Arrays;

public class JPAPersist {

    @Transactional
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ex1");
        EntityManager em = emf.createEntityManager();

        Country country = new Country("XYZ","Wakanda","South America","South America",55000.00,1550,35000,99.0,630.0,616.0,"Wakanda","Republic","Carlos Hilario",4080,"XY",null,null);

        City city1 = new City(4080,"Chosica","Ciudad1",32000,country);
        City city2 = new City(4081,"Campoy","Ciudad2",36000,country);
        City city3 = new City(4082,"Bayovar","Ciudad3",5000,country);

        // Creamos las 2 lenguas para el país imaginario
        LanguagePk langPk1 = new LanguagePk("Spanish", "XYZ");
        LanguagePk langPk2 = new LanguagePk("English", "XYZ");

        CountryLanguage language1 = new CountryLanguage(langPk1,"T",88.0,country);
        CountryLanguage language2 = new CountryLanguage(langPk2,"T",53.0,country);

        //Referenciamos ciudades en paises
        country.setCiudades(Arrays.asList(city1,city2,city3));

        //Referenciamos lenguajes en paises
        country.setIdiomas(Arrays.asList(language1,language2));

        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
