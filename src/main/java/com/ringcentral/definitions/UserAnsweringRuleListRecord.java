package com.ringcentral.definitions;


public class UserAnsweringRuleListRecord {
    /**
     * Canonical URI to an answering rule resource
     * Format: uri
     * Example: https://platform.ringcentral.com/restapi/v1.0/account/240913004/extension/240972004/answering-rule/business-hours-rule
     */
    public String uri;
    /**
     * Internal identifier of an answering rule
     * Example: business-hours-rule
     */
    public String id;
    /**
     * Type of an answering rule
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
    /**
     * Name of an answering rule specified by user
     */
    public String name;
    /**
     * Specifies if an answering rule is active or inactive
     */
    public Boolean enabled;
    /**
     *
     */
    public SharedLinesInfo sharedLines;

    public UserAnsweringRuleListRecord uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserAnsweringRuleListRecord id(String id) {
        this.id = id;
        return this;
    }

    public UserAnsweringRuleListRecord type(String type) {
        this.type = type;
        return this;
    }

    public UserAnsweringRuleListRecord name(String name) {
        this.name = name;
        return this;
    }

    public UserAnsweringRuleListRecord enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public UserAnsweringRuleListRecord sharedLines(SharedLinesInfo sharedLines) {
        this.sharedLines = sharedLines;
        return this;
    }
}
