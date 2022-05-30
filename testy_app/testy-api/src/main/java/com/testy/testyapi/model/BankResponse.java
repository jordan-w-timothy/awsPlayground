package com.testy.testyapi.model;

import java.util.Objects;

public class BankResponse {
    private String response;

    public BankResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankResponse that = (BankResponse) o;
        return Objects.equals(response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }
}
