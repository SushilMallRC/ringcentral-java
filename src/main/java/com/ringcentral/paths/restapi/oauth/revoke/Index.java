package com.ringcentral.paths.restapi.oauth.revoke;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.oauth.Index parent;
public Index(com.ringcentral.paths.restapi.oauth.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/revoke";
        }
        /**
         * Revokes previously issued access and refresh token.
 * 
 * Depending on client application type
 * requests to this endpoint may require authentication with HTTP Basic scheme
 * using registered client ID and client secret as login and password, correspondingly.
 * 
         * HTTP Method: post
         * Endpoint: /restapi/oauth/revoke
         * Rate Limit Group: Auth
         */
  public String post(RevokeTokenRequest RevokeTokenRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), RevokeTokenRequest, null, com.ringcentral.ContentType.FORM);
    return rb.string();
    }
}