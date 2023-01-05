package com.ringcentral.definitions;


    /**
* Notification payload body
*/
public class AccountPresenceEventBody
{
    /**
     * Internal identifier of an extension. Optional parameter
     */
    public String extensionId;
    public AccountPresenceEventBody extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Telephony presence status. Returned if telephony status is changed.
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    public AccountPresenceEventBody telephonyStatus(String telephonyStatus)
    {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     * Order number of a notification to state the chronology
     * Format: int32
     */
    public Long sequence;
    public AccountPresenceEventBody sequence(Long sequence)
    {
        this.sequence = sequence;
        return this;
    }

    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;
    public AccountPresenceEventBody presenceStatus(String presenceStatus)
    {
        this.presenceStatus = presenceStatus;
        return this;
    }

    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    public AccountPresenceEventBody userStatus(String userStatus)
    {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Extended DnD (Do not Disturb) status
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly
     */
    public String dndStatus;
    public AccountPresenceEventBody dndStatus(String dndStatus)
    {
        this.dndStatus = dndStatus;
        return this;
    }

    /**
     * If &#039;True&#039; enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
    public AccountPresenceEventBody allowSeeMyPresence(Boolean allowSeeMyPresence)
    {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     * If &#039;True&#039; enables to ring extension phone, if any user monitored by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;
    public AccountPresenceEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall)
    {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /**
     * If &#039;True&#039; enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;
    public AccountPresenceEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold)
    {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    public AccountPresenceEventBody ownerId(String ownerId)
    {
        this.ownerId = ownerId;
        return this;
    }
}