package com.quanticmind.sadsure.widgets;

import com.quanticmind.sadsure.Identifiable;

public class Widget implements Identifiable {
    private String clientId;
    private String requestId;

    Widget(String clientId, String requestId) {
        this.clientId = clientId;
        this.requestId = requestId;
    }

    @Override
    public String getIdentity() {
        return String.format("client ID %s and request ID %s", clientId, requestId);
    }

    void submit() {
        // Submit to something
    }
}
