package com.ringcentral.definitions;


// Request body for operation createFaxMessage
public class CreateFaxMessageRequest {
    /**
     * Resolution of Fax
     * Enum: High, Low
     */
    public String faxResolution;
    /**
     * To Phone Number
     * Required
     */
    public MessageStoreCalleeInfoRequest[] to;
    /**
     * Timestamp to send fax at. If not specified (current or the past), the fax is sent immediately
     * Format: date-time
     */
    public String sendTime;
    /**
     * ISO Code. e.g UK
     */
    public String isoCode;
    /**
     * Cover page identifier. For the list of available cover page identifiers please call the method Fax Cover Pages. If not specified, the default cover page which is configured in 'Outbound Fax Settings' is attached
     * Format: int32
     */
    public Long coverIndex;
    /**
     * Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
     */
    public String coverPageText;
    /**
     * File to upload
     * Required
     * Format: binary
     */
    public Attachment[] attachments;

    public CreateFaxMessageRequest faxResolution(String faxResolution) {
        this.faxResolution = faxResolution;
        return this;
    }

    public CreateFaxMessageRequest to(MessageStoreCalleeInfoRequest[] to) {
        this.to = to;
        return this;
    }

    public CreateFaxMessageRequest sendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public CreateFaxMessageRequest isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public CreateFaxMessageRequest coverIndex(Long coverIndex) {
        this.coverIndex = coverIndex;
        return this;
    }

    public CreateFaxMessageRequest coverPageText(String coverPageText) {
        this.coverPageText = coverPageText;
        return this;
    }

    public CreateFaxMessageRequest attachments(Attachment[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
