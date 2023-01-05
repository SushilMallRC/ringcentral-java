package com.ringcentral.definitions;


    /**
* Information on profile image
*/
public class ProfileImageInfo
{
    /**
     * Link to a profile image. If an image is not uploaded for an
    * extension, only uri is returned
     * Required
     * Format: uri
     */
    public String uri;
    public ProfileImageInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Identifier of an image
     */
    public String etag;
    public ProfileImageInfo etag(String etag)
    {
        this.etag = etag;
        return this;
    }

    /**
     * Datetime when an image was last updated, ISO 8601 format,
    * for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModified;
    public ProfileImageInfo lastModified(String lastModified)
    {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * The type of an image
     */
    public String contentType;
    public ProfileImageInfo contentType(String contentType)
    {
        this.contentType = contentType;
        return this;
    }

    /**
     * List of URIs to profile images in different dimensions
     */
    public ProfileImageInfoURI[] scales;
    public ProfileImageInfo scales(ProfileImageInfoURI[] scales)
    {
        this.scales = scales;
        return this;
    }
}