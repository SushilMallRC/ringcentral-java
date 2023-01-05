package com.ringcentral.definitions;


public class LocationInfo
{
    /**
     * Canonical URI of a location
     * Format: uri
     */
    public String uri;
    public LocationInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Area code of the location
     */
    public String areaCode;
    public LocationInfo areaCode(String areaCode)
    {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Official name of the city, belonging to the certain state
     */
    public String city;
    public LocationInfo city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * Area code of the location (3-digit usually), according to the
    * NANP number format, that can be summarized as NPA-NXX-xxxx and covers
    * Canada, the United States, parts of the Caribbean Sea, and some Atlantic
    * and Pacific islands. See for details North American Numbering Plan
     */
    public String npa;
    public LocationInfo npa(String npa)
    {
        this.npa = npa;
        return this;
    }

    /**
     * Central office code of the location, according to the NANP
    * number format, that can be summarized as NPA-NXX-xxxx and covers Canada,
    * the United States, parts of the Caribbean Sea, and some Atlantic and Pacific
    * islands. See for details North American Numbering Plan
     */
    public String nxx;
    public LocationInfo nxx(String nxx)
    {
        this.nxx = nxx;
        return this;
    }

    /**
     */
    public LocationStateInfo state;
    public LocationInfo state(LocationStateInfo state)
    {
        this.state = state;
        return this;
    }
}