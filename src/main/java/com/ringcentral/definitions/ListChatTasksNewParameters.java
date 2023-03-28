package com.ringcentral.definitions;


/**
 * Query parameters for operation listChatTasksNew
 */
public class ListChatTasksNewParameters {
    /**
     * The end datetime for resulting records in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, e.g. 2019-03-10T18:23:45Z
     * Default: now
     */
    public String creationTimeTo;
    /**
     * The start datetime for resulting records in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, e.g. 2016-02-23T00:00:00
     */
    public String creationTimeFrom;
    /**
     * Internal identifier of a task creator
     */
    public String[] creatorId;
    /**
     * Task execution status
     * Enum: Pending, InProgress, Completed
     */
    public String[] status;
    /**
     * Task assignment status
     * Enum: Unassigned, Assigned
     */
    public String assignmentStatus;
    /**
     * Internal identifier of a task assignee
     */
    public String[] assigneeId;
    /**
     * Task execution status by assignee(-s) specified in assigneeId
     * Enum: Pending, Completed
     */
    public String assigneeStatus;
    /**
     * Token of the current page. If token is omitted then the first
     * page should be returned
     */
    public String pageToken;
    /**
     * Number of records to be returned per screen
     * Maximum: 250
     * Minimum: 1
     * Format: int32
     * Default: 30
     */
    public Long recordCount;

    public ListChatTasksNewParameters creationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }

    public ListChatTasksNewParameters creationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }

    public ListChatTasksNewParameters creatorId(String[] creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public ListChatTasksNewParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public ListChatTasksNewParameters assignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
        return this;
    }

    public ListChatTasksNewParameters assigneeId(String[] assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    public ListChatTasksNewParameters assigneeStatus(String assigneeStatus) {
        this.assigneeStatus = assigneeStatus;
        return this;
    }

    public ListChatTasksNewParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListChatTasksNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
}
