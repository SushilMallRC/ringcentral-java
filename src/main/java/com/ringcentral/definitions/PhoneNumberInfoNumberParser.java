package com.ringcentral.definitions;


public class PhoneNumberInfoNumberParser
{
    /**
     * Original phone number string as it was passed in the request
     * Example: (650) 722-1621
     */
    public String originalString;
    public PhoneNumberInfoNumberParser originalString(String originalString)
    {
        this.originalString = originalString;
        return this;
    }

    /**
     */
    public GetCountryInfoNumberParser country;
    public PhoneNumberInfoNumberParser country(GetCountryInfoNumberParser country)
    {
        this.country = country;
        return this;
    }

    /**
     * Area code of location. The portion of the [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
    * number that identifies a specific geographic region/numbering area of
    * the national numbering plan (NANP); that can be summarized as `NPA-NXX-xxxx`
    * and covers Canada, the United States, parts of the Caribbean Sea, and
    * some Atlantic and Pacific islands.
    * See [North American Numbering Plan](https://en.wikipedia.org/wiki/North_American_Numbering_Plan)
    * for details
     * Example: 650
     */
    public String areaCode;
    public PhoneNumberInfoNumberParser areaCode(String areaCode)
    {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Dialing format of a phone number
     */
    public String dialable;
    public PhoneNumberInfoNumberParser dialable(String dialable)
    {
        this.dialable = dialable;
        return this;
    }

    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String e164;
    public PhoneNumberInfoNumberParser e164(String e164)
    {
        this.e164 = e164;
        return this;
    }

    /**
     * The formatted phone number string in international format
     */
    public String formattedInternational;
    public PhoneNumberInfoNumberParser formattedInternational(String formattedInternational)
    {
        this.formattedInternational = formattedInternational;
        return this;
    }

    /**
     * The formatted phone number string in domestic format
     */
    public String formattedNational;
    public PhoneNumberInfoNumberParser formattedNational(String formattedNational)
    {
        this.formattedNational = formattedNational;
        return this;
    }

    /**
     * Indicates if the number is in a special format (for example N11 code)&#039;
     */
    public Boolean special;
    public PhoneNumberInfoNumberParser special(Boolean special)
    {
        this.special = special;
        return this;
    }

    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format without plus sign (&#039;+&#039;)
     */
    public String normalized;
    public PhoneNumberInfoNumberParser normalized(String normalized)
    {
        this.normalized = normalized;
        return this;
    }

    /**
     * Indicates if the number is toll free
     */
    public Boolean tollFree;
    public PhoneNumberInfoNumberParser tollFree(Boolean tollFree)
    {
        this.tollFree = tollFree;
        return this;
    }

    /**
     * Sub-Address. The portion of the number that identifies a subscriber into the subscriber internal (non-public) network.
     */
    public String subAddress;
    public PhoneNumberInfoNumberParser subAddress(String subAddress)
    {
        this.subAddress = subAddress;
        return this;
    }

    /**
     * Subscriber number. The portion of the [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) number that identifies a subscriber in a network or numbering area.
     */
    public String subscriberNumber;
    public PhoneNumberInfoNumberParser subscriberNumber(String subscriberNumber)
    {
        this.subscriberNumber = subscriberNumber;
        return this;
    }

    /**
     * DTMF (Dual Tone Multi-Frequency) postfix
     */
    public String dtmfPostfix;
    public PhoneNumberInfoNumberParser dtmfPostfix(String dtmfPostfix)
    {
        this.dtmfPostfix = dtmfPostfix;
        return this;
    }
}