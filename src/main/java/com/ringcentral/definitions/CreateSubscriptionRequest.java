package com.ringcentral.definitions;


public class CreateSubscriptionRequest {
    /**
     * Collection of URIs to API resources
     * Required
     */
    public String[] eventFilters;
    /**
     * Required
     */
    public NotificationDeliveryModeRequest deliveryMode;
    /**
     * Subscription lifetime in seconds. Max value is 7 days (604800 sec). For *WebHook* transport type max value might be set up to 630720000 seconds (20 years)
     */
    public Long expiresIn;

    public CreateSubscriptionRequest eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public CreateSubscriptionRequest deliveryMode(NotificationDeliveryModeRequest deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }

    public CreateSubscriptionRequest expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
