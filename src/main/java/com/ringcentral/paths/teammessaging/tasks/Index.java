package com.ringcentral.paths.teammessaging.tasks;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.TMTaskInfo;
import com.ringcentral.definitions.TMTaskList;
import com.ringcentral.definitions.TMUpdateTaskRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;
    public String taskId;

    public Index(com.ringcentral.paths.teammessaging.Index parent, String taskId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.taskId = taskId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && taskId != null) {
            return parent.path() + "/tasks/" + taskId;
        }
        return parent.path() + "/tasks";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns information about the specified task(s) by ID(s).
     * HTTP Method: get
     * Endpoint: /team-messaging/{version}/tasks/{taskId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMTaskInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (taskId == null) {
            throw new IllegalArgumentException("Parameter taskId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMTaskInfo.class);
    }

    /**
     * Deletes the specified task.
     * HTTP Method: delete
     * Endpoint: /team-messaging/{version}/tasks/{taskId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (taskId == null) {
            throw new IllegalArgumentException("Parameter taskId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Updates the specified task by ID.
     * HTTP Method: patch
     * Endpoint: /team-messaging/{version}/tasks/{taskId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMTaskList patch(TMUpdateTaskRequest tMUpdateTaskRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (taskId == null) {
            throw new IllegalArgumentException("Parameter taskId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), tMUpdateTaskRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMTaskList.class);
    }

    public com.ringcentral.paths.teammessaging.tasks.complete.Index complete() {
        return new com.ringcentral.paths.teammessaging.tasks.complete.Index(this);
    }

}
