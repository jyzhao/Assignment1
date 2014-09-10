/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author zhaojiyuan
 */
public class Product {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String socialSecurityNumber;
    private String addressStreetName;
    private String addressTownCity;
    private String addressState;
    private String addressCountry;
    private int addressZipCode;

    
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getAddressStreetName() {
        return addressStreetName;
    }

    public void setAddressStreetName(String addressStreetName) {
        this.addressStreetName = addressStreetName;
    }

    public String getAddressTownCity() {
        return addressTownCity;
    }

    public void setAddressTownCity(String addressTownCity) {
        this.addressTownCity = addressTownCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public int getAddressZipCode() {
        return addressZipCode;
    }

    public void setAddressZipCode(int addressZipCode) {
        this.addressZipCode = addressZipCode;
    }
    
    @Override
    public String toString() {
        return productName;
    }
}
