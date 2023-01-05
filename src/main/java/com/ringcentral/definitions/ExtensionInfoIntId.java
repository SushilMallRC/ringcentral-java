package com.ringcentral.definitions;


    /**
* This attribute can be omitted for unassigned devices
*/
public class ExtensionInfoIntId
{
    /**
     * Internal identifier of an extension
     * Format: int64
     */
    public Long id;
    public ExtensionInfoIntId id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of an extension
     */
    public String uri;
    public ExtensionInfoIntId uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Number of extension
     */
    public String extensionNumber;
    public ExtensionInfoIntId extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension
     */
    public String partnerId;
    public ExtensionInfoIntId partnerId(String partnerId)
    {
        this.partnerId = partnerId;
        return this;
    }
}