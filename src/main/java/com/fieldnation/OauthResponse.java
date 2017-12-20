
package com.fieldnation;

import java.io.Serializable;
import java.util.Calendar;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class OauthResponse implements Serializable
{
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("expires_in")
    @Expose
    private Integer expiresIn;
    @SerializedName("token_type")
    @Expose
    private String tokenType;
    @SerializedName("scope")
    @Expose
    private String scope;
    @SerializedName("refresh_token")
    @Expose
    private String refreshToken;
    @SerializedName("user")
    @Expose
    private User user;
    private final static long serialVersionUID = -6337704323905757010L;

    public Calendar expireOn;
    
    /**
     * No args constructor for use in serialization
     * 
     */
    public OauthResponse() {
    }

    /**
     * 
     * @param scope
     * @param tokenType
     * @param accessToken
     * @param expiresIn
     * @param refreshToken
     * @param user
     */
    public OauthResponse(String accessToken, Integer expiresIn, String tokenType, String scope, String refreshToken, User user) {
        super();
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.tokenType = tokenType;
        this.scope = scope;
        this.refreshToken = refreshToken;
        this.user = user;
        this.expireOn = Calendar.getInstance();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public OauthResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public OauthResponse withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public OauthResponse withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public OauthResponse withScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public OauthResponse withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OauthResponse withUser(User user) {
        this.user = user;
        return this;
    }
    
    public void setExpireOn(){
    	Calendar now = Calendar.getInstance();
    	now.add(Calendar.SECOND, this.expiresIn);
    	this.expireOn = now;
    }
    
    public Boolean isExpired() {
    	if(this.expireOn == null){
    		setExpireOn();
    	}
    	return (Calendar.getInstance().compareTo(this.expireOn) > 0);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accessToken", accessToken).append("expiresIn", expiresIn).append("tokenType", tokenType).append("scope", scope).append("refreshToken", refreshToken).append("user", user).toString();
    }

}
