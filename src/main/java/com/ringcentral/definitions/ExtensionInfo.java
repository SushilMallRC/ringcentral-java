package com.ringcentral.definitions;


    /**
* Information on the extension, to which the phone number is assigned.
* Returned only for the request of Account phone number list
* 
*/
public class ExtensionInfo
{
    /**
     * Internal identifier of an extension
     */
    public String id;
    public ExtensionInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of an extension
     * Format: uri
     */
    public String uri;
    public ExtensionInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Extension name
     */
    public String name;
    public ExtensionInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Number of extension
     */
    public String extensionNumber;
    public ExtensionInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * For partner applications. Internal identifier of an extension
    * created by partner. The RingCentral supports the mapping of accounts and
    * stores the corresponding account ID/extension ID for each partner ID of
    * a client application. In request URIs partner IDs are accepted instead
    * of regular RingCentral native IDs as path parameters using pid = XXX clause.
    * Though in response URIs contain the corresponding account IDs and extension
    * IDs. In all request and response bodies these values are reflected via
    * partnerId attributes of account and extension
     */
    public String partnerId;
    public ExtensionInfo partnerId(String partnerId)
    {
        this.partnerId = partnerId;
        return this;
    }
}