package com.ringcentral.definitions;


public class TMAddTeamMembersRequestMembers
{
    /**
     * Internal identifier of a person
     */
    public String id;
    public TMAddTeamMembersRequestMembers id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Email of a person
     * Format: email
     */
    public String email;
    public TMAddTeamMembersRequestMembers email(String email)
    {
        this.email = email;
        return this;
    }
}