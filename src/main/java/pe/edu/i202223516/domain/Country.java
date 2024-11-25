package pe.edu.i202223516.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private Double SurfaceArea;
    private Integer IndepYear;
    private Integer Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private Integer Capital;
    private String Code2;

    @OneToMany(mappedBy = "pais", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<City> ciudades;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CountryLanguage> idiomas;

    public Country() {
    }

    public Country(String code) {
        Code = code;
    }

    public Country(String code, String name, String continent, String region, Double surfaceArea, Integer indepYear, Integer population, Double lifeExpectancy, Double GNP, Double GNPOld, String localName, String governmentForm, String headOfState, Integer capital, String code2, List<City> ciudades, List<CountryLanguage> idiomas) {
        Code = code;
        Name = name;
        Continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
        this.ciudades = ciudades;
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName='" + LocalName + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2='" + Code2 + '\'' +
                ", ciudades=" + ciudades +
                ", idiomas=" + idiomas +
                '}';
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Double getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(Integer indepYear) {
        IndepYear = indepYear;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }

    public Double getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(Double lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public Double getGNP() {
        return GNP;
    }

    public void setGNP(Double GNP) {
        this.GNP = GNP;
    }

    public Double getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(Double GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public Integer getCapital() {
        return Capital;
    }

    public void setCapital(Integer capital) {
        Capital = capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }

    public List<City> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<City> ciudades) {
        this.ciudades = ciudades;
    }

    public List<CountryLanguage> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<CountryLanguage> idiomas) {
        this.idiomas = idiomas;
    }
}