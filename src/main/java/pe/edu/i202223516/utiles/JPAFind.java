package pe.edu.i202223516.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import pe.edu.i202223516.domain.City;
import pe.edu.i202223516.domain.Country;

import java.util.List;

public class JPAFind {
    @Transactional
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ex1");
        EntityManager em = emf.createEntityManager();

        Country country = em.find(Country.class, "PER");
        List<City> ciudades = country.getCiudades();

        ciudades.forEach(city -> { // <-- Funcion lambda
            if (city.getPopulation() > 700000){
                System.out.println(city.getName());
            }
        });
        em.close();
        emf.close();
    }
}
