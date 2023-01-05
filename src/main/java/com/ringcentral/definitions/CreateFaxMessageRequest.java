package com.ringcentral.definitions;


    /**
* Request body for operation createFaxMessage
*/
public class CreateFaxMessageRequest
{
    /**
     * Resolution of Fax
     * Enum: High, Low
     */
    public String faxResolution;
    public CreateFaxMessageRequest faxResolution(String faxResolution)
    {
        this.faxResolution = faxResolution;
        return this;
    }

    /**
     * To Phone Number
     * Required
     */
    public MessageStoreCalleeInfoRequest[] to;
    public CreateFaxMessageRequest to(MessageStoreCalleeInfoRequest[] to)
    {
        this.to = to;
        return this;
    }

    /**
     * Timestamp to send fax at. If not specified (current or the past), the fax is sent immediately
     * Format: date-time
     */
    public String sendTime;
    public CreateFaxMessageRequest sendTime(String sendTime)
    {
        this.sendTime = sendTime;
        return this;
    }

    /**
     * ISO Code. e.g UK
     */
    public String isoCode;
    public CreateFaxMessageRequest isoCode(String isoCode)
    {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * Cover page identifier. If coverIndex is set to &#039;0&#039; (zero) cover page is not attached. For the list of available cover page identifiers (1-13) please call the Fax Cover Pages method. If not specified, the default cover page is attached (which is configured in &#039;Outbound Fax Settings&#039;)
     * Format: int32
     */
    public Long coverIndex;
    public CreateFaxMessageRequest coverIndex(Long coverIndex)
    {
        this.coverIndex = coverIndex;
        return this;
    }

    /**
     * Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
     */
    public String coverPageText;
    public CreateFaxMessageRequest coverPageText(String coverPageText)
    {
        this.coverPageText = coverPageText;
        return this;
    }

    /**
     * File to upload
     * Required
     * Format: binary
     */
    public Attachment[] attachments;
    public CreateFaxMessageRequest attachments(Attachment[] attachments)
    {
        this.attachments = attachments;
        return this;
    }
}