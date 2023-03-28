package com.ringcentral.paths.teammessaging.chats.favorite;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.chats.Index parent;

    public Index(com.ringcentral.paths.teammessaging.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/favorite";
    }

    /**
     * Adds the specified chat to the users&#039;s list of favorite chats.
     * HTTP Method: post
     * Endpoint: /team-messaging/{version}/chats/{chatId}/favorite
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
