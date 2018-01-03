package com.fieldnation;

import java.io.Serializable;

public final class AuthPayload implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6607638166334719338L;
	private String username;
	private String password;
	private String grant_type;
	private String client_id;
	private String client_secret;
	
	public String getUserName(){
		return username;
	}
	
	public void setUserName(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getGrantType(){
		return grant_type;
	}
	
	public void setGrantType(String grant_type){
		this.grant_type = grant_type;
	}
	
	public String getClientId(){
		return client_id;
	}
	
	public void setClientId(String client_id){
		this.client_id = client_id;
	}
	
	public String getClientSecret(){
		return client_secret;
	}
	
	public void setClientSecret(String client_secret){
		this.client_secret = client_secret;
	}
	
	public AuthPayload() {
		
	}
	@Override
    public int hashCode()
    {
        return username.hashCode()^101;
    }

    @Override
    public boolean equals(Object obj)
    {
    	AuthPayload otherKey = (AuthPayload) obj;
        return username.equals(otherKey.username);
    }
	public AuthPayload(String grant_type, String username, String password, String client_id, String client_secret){
		this.grant_type = grant_type;
		this.username = username;
		this.client_id = client_id;
		this.client_secret = client_secret;
		this.password = password;
	}
}
