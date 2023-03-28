package com.ringcentral.definitions;


public class DeviceResource {
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * Canonical URI of a device
     * Format: uri
     */
    public String uri;
    /**
     * Device identification number (stock keeping unit) in the format
     * TP-ID [-AT-AC], where TP is a device type (HP for RC HardPhone, DV for all
     * other devices including SoftPhone); ID - device model ID; AT -addon type
     * ID; AC - addon count (if any). For example &#039;HP-56-2-2&#039;
     */
    public String sku;
    /**
     * Device type
     * Default: HardPhone
     * Enum: BLA, SoftPhone, OtherPhone, HardPhone, WebPhone, Paging, Room, WebRTC
     */
    public String type;
    /**
     * Device name. Mandatory if ordering SoftPhone or OtherPhone.
     * Optional for  HardPhone. If not specified for HardPhone, then
     * a device model is used as a device name
     */
    public String name;
    /**
     * Serial number for HardPhone (is returned only when the phone
     * is shipped and provisioned); endpoint_id for SoftPhone and
     * mobile applications
     */
    public String serial;
    /**
     * Device status
     * Enum: Offline, Online
     */
    public String status;
    /**
     * PC name for softphone
     */
    public String computerName;
    /**
     *
     */
    public ModelInfo model;
    /**
     *
     */
    public ExtensionInfoIntId extension;
    /**
     *
     */
    public DeviceEmergencyInfo emergency;
    /**
     *
     */
    public EmergencyServiceAddressResource emergencyServiceAddress;
    /**
     * Phone lines information
     */
    public PhoneLinesInfo[] phoneLines;
    /**
     *
     */
    public ShippingInfo shipping;
    /**
     * Box billing identifier of a device. Applicable only for HardPhones.
     * It is an alternative way to identify the device to be ordered. Either
     * model  structure, or  boxBillingId  must be specified for HardPhone
     * Format: int64
     */
    public Long boxBillingId;
    /**
     * Supported only for devices assigned to Limited extensions.
     * If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;
    /**
     * Network location status. &#039;True&#039; if the device is located in
     * the configured corporate network (On-Net); &#039;False&#039; for Off-Net location.
     * Parameter is not returned if `EmergencyAddressAutoUpdate` feature is not
     * enabled for the account/user, or if device network location is not determined
     */
    public Boolean inCompanyNet;
    /**
     *
     */
    public DeviceSiteInfo site;
    /**
     * Datetime of receiving last location report in
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, for example *2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastLocationReportTime;
    /**
     * Pooling type of a device:
     * - Host - a device with standalone paid phone line which can be linked to a soft client instance
     * - Guest - a device with a linked phone line
     * - None - a device without a phone line or with specific line (free, BLA, etc.)
     * Enum: Host, Guest, None
     */
    public String linePooling;
    /**
     *
     */
    public BillingStatementInfo billingStatement;

    public DeviceResource id(String id) {
        this.id = id;
        return this;
    }

    public DeviceResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DeviceResource sku(String sku) {
        this.sku = sku;
        return this;
    }

    public DeviceResource type(String type) {
        this.type = type;
        return this;
    }

    public DeviceResource name(String name) {
        this.name = name;
        return this;
    }

    public DeviceResource serial(String serial) {
        this.serial = serial;
        return this;
    }

    public DeviceResource status(String status) {
        this.status = status;
        return this;
    }

    public DeviceResource computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    public DeviceResource model(ModelInfo model) {
        this.model = model;
        return this;
    }

    public DeviceResource extension(ExtensionInfoIntId extension) {
        this.extension = extension;
        return this;
    }

    public DeviceResource emergency(DeviceEmergencyInfo emergency) {
        this.emergency = emergency;
        return this;
    }

    public DeviceResource emergencyServiceAddress(EmergencyServiceAddressResource emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    public DeviceResource phoneLines(PhoneLinesInfo[] phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }

    public DeviceResource shipping(ShippingInfo shipping) {
        this.shipping = shipping;
        return this;
    }

    public DeviceResource boxBillingId(Long boxBillingId) {
        this.boxBillingId = boxBillingId;
        return this;
    }

    public DeviceResource useAsCommonPhone(Boolean useAsCommonPhone) {
        this.useAsCommonPhone = useAsCommonPhone;
        return this;
    }

    public DeviceResource inCompanyNet(Boolean inCompanyNet) {
        this.inCompanyNet = inCompanyNet;
        return this;
    }

    public DeviceResource site(DeviceSiteInfo site) {
        this.site = site;
        return this;
    }

    public DeviceResource lastLocationReportTime(String lastLocationReportTime) {
        this.lastLocationReportTime = lastLocationReportTime;
        return this;
    }

    public DeviceResource linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }

    public DeviceResource billingStatement(BillingStatementInfo billingStatement) {
        this.billingStatement = billingStatement;
        return this;
    }
}
