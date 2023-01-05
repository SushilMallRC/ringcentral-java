package com.ringcentral.definitions;


    /**
* Query parameters for operation listContacts
*/
public class ListContactsParameters
{
    /**
     * If specified, only contacts which &#039;First name&#039; or &#039;Last name&#039; start
    * with the mentioned substring will be returned. Case-insensitive
     */
    public String startsWith;
    public ListContactsParameters startsWith(String startsWith)
    {
        this.startsWith = startsWith;
        return this;
    }

    /**
     * Sorts results by the specified property
     * Enum: FirstName, LastName, Company
     */
    public String[] sortBy;
    public ListContactsParameters sortBy(String[] sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * The number of the result set page to display
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    public ListContactsParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * The number of items per page. If provided value in the request
    * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    public ListContactsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Phone number in e.164 format
     */
    public String[] phoneNumber;
    public ListContactsParameters phoneNumber(String[] phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}