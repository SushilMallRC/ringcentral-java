package com.ringcentral.definitions;


    /**
* Query parameters for operation listEmergencyLocations
*/
public class ListEmergencyLocationsParameters
{
    /**
     * Internal identifier of a site for filtering. To indicate company main
    * site `main-site` value should be specified. Supported only if multi-site feature
    * is enabled for the account. Multiple values are supported.
     */
    public String[] siteId;
    public ListEmergencyLocationsParameters siteId(String[] siteId)
    {
        this.siteId = siteId;
        return this;
    }

    /**
     * Filters entries containing the specified substring in &#039;address&#039;
    * and &#039;name&#039; fields. The character range is 0-64; not case-sensitive.
    * If empty then the filter is ignored
     */
    public String searchString;
    public ListEmergencyLocationsParameters searchString(String searchString)
    {
        this.searchString = searchString;
        return this;
    }

    /**
     * Enum: Valid, Invalid, Provisioning
     */
    public String addressStatus;
    public ListEmergencyLocationsParameters addressStatus(String addressStatus)
    {
        this.addressStatus = addressStatus;
        return this;
    }

    /**
     * Enum: Active, Inactive
     */
    public String usageStatus;
    public ListEmergencyLocationsParameters usageStatus(String usageStatus)
    {
        this.usageStatus = usageStatus;
        return this;
    }

    /**
     */
    public String domesticCountryId;
    public ListEmergencyLocationsParameters domesticCountryId(String domesticCountryId)
    {
        this.domesticCountryId = domesticCountryId;
        return this;
    }

    /**
     * Comma-separated list of fields to order results, prefixed by
    * plus sign &#039;+&#039; (ascending order) or minus sign &#039;-&#039; (descending order)
     * Default: +address
     * Enum: +name, +siteName, +address, +addressStatus, +usageStatus, -name, -siteName, -address, -addressStatus, -usageStatus
     */
    public String orderBy;
    public ListEmergencyLocationsParameters orderBy(String orderBy)
    {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Indicates a page size (number of items). The values
    * supported: `Max` or numeric value. If not specified,
    * 100 records are returned per one page
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    public ListEmergencyLocationsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Indicates the page number to retrieve. Only positive number values
    * are supported
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListEmergencyLocationsParameters page(Long page)
    {
        this.page = page;
        return this;
    }
}