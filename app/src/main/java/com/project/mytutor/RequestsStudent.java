package com.project.mytutor;

/**
 * Created by ac on 1/28/2018.
 */

public class RequestsStudent {
    private String reqType;

    public RequestsStudent(String reqType) {
        this.reqType = reqType;
    }

    public RequestsStudent() {

    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }
}
