package com.project.mytutor;

/**
 * Created by ac on 1/27/2018.
 */

public class RequestsTutor {
    private String reqType;

    public RequestsTutor(String reqType) {
        this.reqType = reqType;
    }

    public RequestsTutor() {
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }
}
