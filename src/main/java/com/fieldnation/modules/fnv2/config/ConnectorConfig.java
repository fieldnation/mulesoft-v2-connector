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
    private String base_url;
    
    /**
     * base_path
     */
    @Configurable
    @Default("/api/rest/v2")
    private String base_path;
    
	/**
     * grant_type
     */
    @Configurable
    @Default("password")
    private String grant_type;
    
    /**
     * client_id
     */
    @Configurable
    @Default("demoapp")
    private String client_id;
    
    /**
     * client_secret
     */
    @Configurable
    @Default("demopass")
    @Password
    private String client_secret;
    
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
    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }
    
    /**
     * Get base_url	
     *
     *
     */
    public String getBase_url() {
        return base_url;
    }
    
    /**
     * Set base_path	
     *
     * @param base_url
     */
    public void setBase_path(String base_path) {
        this.base_path = base_path;
    }
    
    /**
     * Get base_path
     *
     *
     */
    public String getBase_path() {
        return base_path;
    }
    
    /**
     * Get api_url
     *
     *
     */
    public String getApi_url() {
        return getBase_url() + getBase_path();
    }
    
    /**
     * Set grant_type
     *
     * @param grant_type
     */
    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
    
    /**
     * Set client_id
     *
     * @param client_id
     */
    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    /**
     * Set client_secret
     *
     * @param client_secret
     */
    public void setClient_id(String client_id) {
        this.client_id = client_id;
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
    public String getGrant_type() {
        return this.grant_type;
    }
    
    /**
     * Get client_id
     */
    public String getClient_id() {
        return this.client_id;
    }

    /**
     * Get client_secret
     */
    public String getClient_secret() {
        return this.client_secret;
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