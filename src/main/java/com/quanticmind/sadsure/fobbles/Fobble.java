package com.quanticmind.sadsure.fobbles;

import com.quanticmind.sadsure.Identifiable;

public class Fobble implements Identifiable {
    private String clientId;
    private String uuid;

    Fobble(String clientId, String uuid) {
        this.clientId = clientId;
        this.uuid = uuid;
    }

    @Override
    public String getIdentity() {
        return String.format("client ID %s and request ID %s", clientId, uuid);
    }

    void submit() {
        // Submit this fobble to some service
    }
}
