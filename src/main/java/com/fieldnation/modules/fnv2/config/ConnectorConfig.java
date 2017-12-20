package com.fieldnation.modules.fnv2.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	/**
     * base_url
     */
    @Configurable
    @Default("https://api.fieldnation.com")
    private String baseUrl;
    
    /**
     * base_path
     */
    @Configurable
    @Default("/api/rest/v2")
    private String basePath;
    
	/**
     * grant_type
     */
    @Configurable
    @Default("password")
    private String grantType;
    
    /**
     * client_id
     */
    @Configurable
    @Default("demoapp")
    private String clientId;
    
    /**
     * client_secret
     */
    @Configurable
    @Default("demopass")
    @Password
    private String clientSecret;
    
    /**
     * username
     */
    @Configurable
    @Default("buyer.admin")
    private String username;
    
    /**
     * password
     */
    @Configurable
    @Password
    @Default("buyer.admin")
    private String password;
    
    /**
     * Set base_url	
     *
     * @param base_url
     */
    public void setBaseUrl(String base_url) {
        this.baseUrl = base_url;
    }
    
    /**
     * Get base_url	
     *
     * @return baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }
    
    /**
     * Set base_path	
     *
     * @param base_path
     */
    public void setBasePath(String base_path) {
        this.basePath = base_path;
    }
    
    /**
     * Get base_path
     *
     *
     */
    public String getBasePath() {
        return basePath;
    }
    
    /**
     * Get api_url
     *
     *
     */
    public String getApiUrl() {
        return getBaseUrl() + getBasePath();
    }
    
    /**
     * Set grant_type
     *
     * @param grant_type
     */
    public void setGrantType(String grant_type) {
        this.grantType = grant_type;
    }
    
    /**
     * Set client_id
     *
     * @param client_secret
     */
    public void setClientSecret(String client_secret) {
        this.clientSecret = client_secret;
    }

    /**
     * Set client_secret
     *
     * @param client_id
     */
    public void setClientId(String client_id) {
        this.clientId = client_id;
    }
    
    /**
     * Set username
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * Set client_id
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Get grant_type
     */
    public String getGrantType() {
        return this.grantType;
    }
    
    /**
     * Get client_id
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Get client_secret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }
    
    /**
     * Get username
     */
    public String getUsername() {
        return this.username;
    }
    
    /**
     * Get client_secret
     */
    public String getPassword() {
        return this.password;
    }

}