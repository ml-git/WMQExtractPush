package com.connector.qq.model;

import java.io.Serializable;

public class MessagePayload implements Serializable {

    private String messagePayload;

    public String getMessagePayload() {
        return messagePayload;
    }

    public void setMessagePayload(String messagePayload) {
        this.messagePayload = messagePayload;
    }
}
