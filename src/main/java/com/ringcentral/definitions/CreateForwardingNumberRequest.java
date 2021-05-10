package com.ringcentral.definitions;


public class CreateForwardingNumberRequest {
    /**
     * Number assigned to the call flip phone number, corresponds to the shortcut dial number
     */
    public Long flipNumber;
    /**
     * Forwarding/Call flip phone number
     */
    public String phoneNumber;
    /**
     * Forwarding/Call flip number title
     */
    public String label;
    /**
     * Forwarding/Call flip phone type. If specified, 'label' attribute value is ignored. The default value is 'Other'
     * Enum: PhoneLine, Home, Mobile, Work, Other
     */
    public String type;
    /**
     *
     */
    public CreateForwardingNumberDeviceInfo device;

    public CreateForwardingNumberRequest flipNumber(Long flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }

    public CreateForwardingNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CreateForwardingNumberRequest label(String label) {
        this.label = label;
        return this;
    }

    public CreateForwardingNumberRequest type(String type) {
        this.type = type;
        return this;
    }

    public CreateForwardingNumberRequest device(CreateForwardingNumberDeviceInfo device) {
        this.device = device;
        return this;
    }
}
