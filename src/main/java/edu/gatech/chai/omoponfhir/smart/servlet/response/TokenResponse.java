package edu.gatech.chai.omoponfhir.smart.servlet.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenResponse {
    private String access_token;
    private String token_type = "Bearer";
    private Long expires_in;
    private String scope;
    private String patient;
    private String fname;
    private String lname;
    private String email;
    private String refresh_token;

    public TokenResponse() {
    }

    public TokenResponse(String accessToken, Long expiresIn, String scope) {
        this.access_token = accessToken;
        this.token_type = "Bearer";
        this.expires_in = expiresIn;
        this.scope = scope;
    }

    @JsonProperty("access_token")
    public String getAccessToken() {
        return this.access_token;
    }

    @JsonProperty("access_token")
    public void setAccessToken(String accessToken) {
        this.access_token = accessToken;
    }

    @JsonProperty("refresh_token")
    public String getRefreshToken() {
        return this.refresh_token;
    }

    @JsonProperty("refresh_token")
    public void setRefreshToken(String refreshToken) {
        this.refresh_token = refreshToken;
    }

    @JsonProperty("token_type")
    public String getTokenType() {
        return this.token_type;
    }

    @JsonProperty("token_type")
    public void setTokenType(String tokenType) {
        this.token_type = tokenType;
    }

    @JsonProperty("expires_in")
    public Long getExpiresIn() {
        return this.expires_in;
    }

    @JsonProperty("expires_in")
    public void setExpiresIn(Long expiresIn) {
        this.expires_in = expiresIn;
    }

    @JsonProperty("scope")
    public String getScope() {
        return this.scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("patient")
    public String getPatient() {
        return this.patient;
    }

    @JsonProperty("patient")
    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String toString() {
        return "{"
                + "\"access_token\": \"" + access_token + "\", "
                + "\"token_type\": \"" + token_type + "\", "
                + "\"expires_in\": " + expires_in + ", "
                + "\"scope\": \"" + scope + "\", "
                + "\"patient\": \"" + patient + "\", "
                + "\"fname\": \"" + fname + "\", "
                + "\"lname\": \"" + lname + "\", "
                + "\"email\": \"" + email + "\", "
                + "\"refresh_token\": \"" + refresh_token + "\""
                + "}";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}