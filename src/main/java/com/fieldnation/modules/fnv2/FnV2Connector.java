package com.fieldnation.modules.fnv2;

import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.ReconnectOn;
import com.fieldnation.AuthPayload;
import com.fieldnation.OauthResponse_Model;
import com.fieldnation.User;
import com.fieldnation.modules.fnv2.config.ConnectorConfig;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import mx4j.log.*;


@Connector(name="fn-v2", friendlyName="Field Nation V2 Connector")
public class FnV2Connector {
	
    @Config
    ConnectorConfig config;
    static final Logger logger = Log.getLogger("FN_V2_Connector");
    private static String baseUri;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    static OkHttpClient client = new OkHttpClient();
    
    /**
     * get token_details
     *
     * @return Token Details JSON
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String getTokenDetails() throws Exception  {
    	try {
    		Gson gson = new Gson();
    		String token_details_json = gson.toJson(OauthResponse.class); 
    		return token_details_json;
    	} catch (Exception e) {
    		logger.error(e.getMessage());
    		throw e;
    	}
	}
    /**
     * initClient:
     * Initializes the OkHttpClient with specified timeouts
     * @return OkHttpClient
     */
    private OkHttpClient initClient(){
    	return new OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build();
    }
    /**
     * initClientBuilder:
     * Returns okhttp3.Request.Builder with an initialized URL property
     * @param requestPath 
     * @return okhttp3.Request.Builder
     * @throws IOException Comment for Exception
     */
    private Builder initClientBuilder(String requestPath) throws IOException{
    	try{
    		if(initToken()){
    			FnV2Connector.client = initClient();
        		return new Request.Builder().url(baseUri + requestPath + "?access_token=" + OauthResponse.accessToken);
    		}
    	}catch(IOException e){
    		logger.error(e.getMessage());
    		throw e;
    	}
		return null;
    }
    /**
     * InitToken:
     * Returns oAuth token details (also creates an oAuth2 token if needed)
     *
     * @return OauthResponse
     * @throws IOException Comment for Exception
     */
    @ReconnectOn(exceptions = { IOException.class })
    private boolean initToken() throws IOException {
    	try {
    		if(OauthResponse.accessToken == null || OauthResponse.isExpired())
    			generateAccessToken();
    		baseUri = config.getApiUrl();
    		return true;
    	} catch (Exception e) {
    		logger.error(e.getMessage());
    		throw e;
    	}
	}
    
    /**
     * AddWorkorder:
     * Create a work order
     * @param workorder_model JSON
     * @return Workorder Model JSON
     * @throws IOException Comment for IOException
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String addWorkorder(String workorder_model) throws IOException {
    	RequestBody body = RequestBody.create(JSON, workorder_model);
        Request request = initClientBuilder("/workorders")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
  
	} 
    
    /**
     * Publish Workorder:
     * Publishes a work order to the marketplace where it can garner requests.
     * @param long Workorder_ID
     * @param JSON cc model
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String publishWorkorder(long workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/publish")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
	}
    
    /**
     * Route Workorder:
     * Route a work order to a user
     * @param long Workorder_ID
     * @param JSON user model that minimally contains an id
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String routeWorkorder(long workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/route")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
	}
    
    /**
     * AutoDispatch Workorder:
     * Auto-dispatches one or more draft work orders
     * @param long Workorder_ID
     * @param JSON AutoDispatch model which contains the selection rules
     * @return String server message
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String autoDispatchWorkorder(int workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/auto_dispatch")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
	}
    
    /**
     * Update Pay:
     * Updates the pay of a work order, or requests an adjustment
     * @param int workorder_id
     * @param pay_model json_body
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String updatePay(int workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/pay")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
	}
    
    /**
     * Update Schedule:
     * Updates the service schedule or eta of a work order (depending on your role)
     * @param int workorder_id
     * @param schedule model
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String updateSchedule(int workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/schedule")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
	}
    
    /**
     * assignWorkorder:
     * Assigns a user to a work order
     * @param workorder_id
     * @param assignee
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String assignWorkorder(long workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/assignee")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
	}
    
    /**
     * Authenticate
     *
     * @return OAuthResponse<JSON>
     * @throws IOException Comment for IOException
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String generateAccessToken() throws IOException {
    	AuthPayload ap = new AuthPayload(config.getGrantType(), config.getUsername(), config.getPassword(), config.getClientId(), config.getClientSecret());
		Gson gson = new Gson();
		String resource_owner_json = gson.toJson(ap);
		OkHttpClient authClient = initClient();
		RequestBody body = RequestBody.create(JSON, resource_owner_json);
        Request request = new Request.Builder()
        		.url(config.getBaseUrl() + "/authentication/api/oauth/token")
        		.post(body)
        		.build();
        try (Response response = authClient.newCall(request).execute()) {
          String responseBody = response.body().string();
          OauthResponse_Model res = gson.fromJson(responseBody, com.fieldnation.OauthResponse_Model.class);
          if(response.code() == 200){
        	  OauthResponse.populate(res);
        	  return responseBody;
          }else
        	  throw new IOException(response.message());
		}catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
	} 

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    
    public static class OauthResponse{
		
		@SerializedName("access_token")
	    @Expose
	    public static String accessToken;
	    @SerializedName("expires_in")
	    @Expose
	    public static Integer expiresIn;
	    @SerializedName("token_type")
	    @Expose
	    public static String tokenType;
	    @SerializedName("scope")
	    @Expose
	    public static String scope;
	    @SerializedName("refresh_token")
	    @Expose
	    public static String refreshToken;
	    @SerializedName("user")
	    @Expose
	    public static User user;
	    @SuppressWarnings("unused")
		private final static long serialVersionUID = -6337704323905757010L;

	    public static Calendar expireOn;
	    
	    /**
	     * No args constructor for use in serialization
	     * 
	     */
	    public OauthResponse() {
	    }
	    
	    public static void populate(com.fieldnation.OauthResponse_Model response){
	    	accessToken = response.getAccessToken();
	    	expiresIn = response.getExpiresIn();
	    	tokenType = response.getTokenType();
	    	scope = response.getScope();
	    	user = response.getUser();
	    	setExpireOn();
	    }
	    
	    private static void setExpireOn(){
	    	Calendar now = Calendar.getInstance();
	    	now.add(Calendar.SECOND, expiresIn);
	    	expireOn = now;
	    }
	    
	    public static Boolean isExpired() {
	    	if(expireOn == null){
	    		setExpireOn();
	    	}
	    	return (Calendar.getInstance().compareTo(expireOn) > 0);
	    }

	    @Override
	    public String toString() {
	        return new ToStringBuilder(this).append("accessToken", OauthResponse.accessToken).append("expiresIn", OauthResponse.expiresIn).append("tokenType", OauthResponse.tokenType).append("scope", OauthResponse.scope).append("refreshToken", OauthResponse.refreshToken).append("user", OauthResponse.user).toString();
	    }
	}

}