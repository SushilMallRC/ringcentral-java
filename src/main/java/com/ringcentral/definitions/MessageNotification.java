package com.ringcentral.definitions;

public class MessageNotification {
    // Universally unique identifier of a notification
    public String uuid;
    // Event filter URI
    public String event;
    // Internal identifier of a subscription
    public String subscriptionId;
    // Datetime of sending a notification in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String timestamp;
    // Notification payload body
    public MessageEvent body;

    public MessageNotification uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public MessageNotification event(String event) {
        this.event = event;
        return this;
    }

    public MessageNotification subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public MessageNotification timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public MessageNotification body(MessageEvent body) {
        this.body = body;
        return this;
    }
}
