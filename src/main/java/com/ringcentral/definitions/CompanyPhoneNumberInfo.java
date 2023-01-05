package com.ringcentral.definitions;


public class CompanyPhoneNumberInfo
{
    /**
     * Link to a company phone number resource
     * Format: uri
     */
    public String uri;
    public CompanyPhoneNumberInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a phone number
     * Format: int64
     */
    public Long id;
    public CompanyPhoneNumberInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public CountryInfoBasicModel country;
    public CompanyPhoneNumberInfo country(CountryInfoBasicModel country)
    {
        this.country = country;
        return this;
    }

    /**
     */
    public ExtensionInfo extension;
    public CompanyPhoneNumberInfo extension(ExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Custom user name of a phone number, if any
     */
    public String label;
    public CompanyPhoneNumberInfo label(String label)
    {
        this.label = label;
        return this;
    }

    /**
     * Location (City, State). Filled for local US numbers
     */
    public String location;
    public CompanyPhoneNumberInfo location(String location)
    {
        this.location = location;
        return this;
    }

    /**
     * Payment type. &#039;External&#039; is returned for forwarded numbers
    * which are not terminated in the RingCentral phone system
     * Enum: External, TollFree, Local, BusinessMobileNumberProvider, ExternalNumberProvider
     */
    public String paymentType;
    public CompanyPhoneNumberInfo paymentType(String paymentType)
    {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Phone number
     */
    public String phoneNumber;
    public CompanyPhoneNumberInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Status of a phone number. If the value is &#039;Normal&#039;, the phone
    * number is ready to be used. If the value is &#039;Pending&#039; it is an
    * external number not yet ported to RingCentral.
     * Enum: Normal, Pending, PortedIn, Temporary
     */
    public String status;
    public CompanyPhoneNumberInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Phone number type
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;
    public CompanyPhoneNumberInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Usage type of a phone number. Usage type of a phone number.
    * Numbers of &#039;NumberPool&#039; type wont&#039;t be returned for phone number list
    * requests
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, NumberPool, BusinessMobileNumber, IntegrationNumber
     */
    public String usageType;
    public CompanyPhoneNumberInfo usageType(String usageType)
    {
        this.usageType = usageType;
        return this;
    }

    /**
     */
    public TemporaryNumberInfo temporaryNumber;
    public CompanyPhoneNumberInfo temporaryNumber(TemporaryNumberInfo temporaryNumber)
    {
        this.temporaryNumber = temporaryNumber;
        return this;
    }

    /**
     */
    public ContactCenterProvider contactCenterProvider;
    public CompanyPhoneNumberInfo contactCenterProvider(ContactCenterProvider contactCenterProvider)
    {
        this.contactCenterProvider = contactCenterProvider;
        return this;
    }

    /**
     * Vanity pattern for this number. Returned only when vanity search option is requested. Vanity pattern corresponds to request parameters nxx plus line or numberPattern
     */
    public String vanityPattern;
    public CompanyPhoneNumberInfo vanityPattern(String vanityPattern)
    {
        this.vanityPattern = vanityPattern;
        return this;
    }
}