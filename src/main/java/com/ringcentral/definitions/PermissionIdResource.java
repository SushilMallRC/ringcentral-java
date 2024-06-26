package com.ringcentral.definitions;


public class PermissionIdResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public String id;
    /**
     * Site compatibility flag set for permission
     * Enum: Compatible, Incompatible, Independent
     */
    public String siteCompatible;
    /**
     * Specifies if the permission is editable on UI (if set to `true`) or not (if set to `false`)
     */
    public Boolean readOnly;
    /**
     * Specifies if the permission can be assigned by the account administrator
     */
    public Boolean assignable;
    /**
     *
     */
    public PermissionsCapabilities permissionsCapabilities;

    public PermissionIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PermissionIdResource id(String id) {
        this.id = id;
        return this;
    }

    public PermissionIdResource siteCompatible(String siteCompatible) {
        this.siteCompatible = siteCompatible;
        return this;
    }

    public PermissionIdResource readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public PermissionIdResource assignable(Boolean assignable) {
        this.assignable = assignable;
        return this;
    }

    public PermissionIdResource permissionsCapabilities(PermissionsCapabilities permissionsCapabilities) {
        this.permissionsCapabilities = permissionsCapabilities;
        return this;
    }
}
