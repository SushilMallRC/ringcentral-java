package com.ringcentral.definitions;


public class MeetingsTimezoneResource
{
    /**
     * Format: uri
     */
    public String uri;
    public MeetingsTimezoneResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String id;
    public MeetingsTimezoneResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String name;
    public MeetingsTimezoneResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String description;
    public MeetingsTimezoneResource description(String description)
    {
        this.description = description;
        return this;
    }
}