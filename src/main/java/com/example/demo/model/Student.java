package com.example.demo.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    
    private String firstName;
    @NotNull
    private String lastName;
    private String Country;
    private String favoriteLanguage;
    
    private String[] operatingSystems;
    
    public Student() {
        
        /*
         *  colocamos las opciones para el select button
         *  pueden ser cualquier cosa incluso opciones de una bd
         */
        
        /*
         * countryOptions = new LinkedHashMap<>();
         * 
         * countryOptions.put("BR", "Brazil");
         * countryOptions.put("FR", "France");
         * countryOptions.put("GR", "Germany");
         * countryOptions.put("IR", "India");
         */
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }  
    
    
    
}
