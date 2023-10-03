package com.ringcentral.definitions;


public class EmergencyLocationResourceAddress {
    /**
     * Country name
     */
    public String country;
    /**
     * Internal identifier of a country
     */
    public String countryId;
    /**
     * ISO code of a country
     */
    public String countryIsoCode;
    /**
     * Full name of a country
     */
    public String countryName;
    /**
     * State/Province name. Mandatory for the USA, the UK and Canada
     */
    public String state;
    /**
     * Internal identifier of a state
     */
    public String stateId;
    /**
     * ISO code of a state
     */
    public String stateIsoCode;
    /**
     * Full name of a state
     */
    public String stateName;
    /**
     * City name
     */
    public String city;
    /**
     * The name of the street (The field is utilised as &#039;streetName&#039; field for FR addresses)
     */
    public String street;
    /**
     * Second line address (apartment, suite, unit, building, floor,
     * etc.)
     */
    public String street2;
    /**
     * Postal (Zip) code
     */
    public String zip;
    /**
     * Customer name
     */
    public String customerName;
    /**
     * Company name
     */
    public String companyName;
    /**
     * (Optional) Building name
     */
    public String buildingName;
    /**
     * Street type
     */
    public String streetType;
    /**
     * Building/street number
     */
    public String buildingNumber;

    public EmergencyLocationResourceAddress country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyLocationResourceAddress countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public EmergencyLocationResourceAddress countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public EmergencyLocationResourceAddress countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public EmergencyLocationResourceAddress state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyLocationResourceAddress stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyLocationResourceAddress stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public EmergencyLocationResourceAddress stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public EmergencyLocationResourceAddress city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyLocationResourceAddress street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyLocationResourceAddress street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyLocationResourceAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyLocationResourceAddress customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyLocationResourceAddress companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public EmergencyLocationResourceAddress buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public EmergencyLocationResourceAddress streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public EmergencyLocationResourceAddress buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}