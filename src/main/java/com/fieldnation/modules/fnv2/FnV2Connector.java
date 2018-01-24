package com.fieldnation.modules.fnv2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.ReconnectOn;
import org.mule.api.annotations.licensing.RequiresEnterpriseLicense;
import org.mule.api.store.ObjectStore;
import org.mule.api.store.ObjectStoreManager;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import com.fieldnation.AuthPayload;
import com.fieldnation.OAuthTokenDetails;
import com.fieldnation.modules.fnv2.config.ConnectorConfig;
import com.google.gson.Gson;
import mx4j.log.*;


@Connector(name="fn-v2", friendlyName="Field Nation V2 Connector")
@RequiresEnterpriseLicense(allowEval = true)
public class FnV2Connector {
	 
	@Inject
	protected ObjectStoreManager objectStoreManager;
	ObjectStore<String> os = null;
	OAuthTokenDetails token_details = null;  
    @Config
    ConnectorConfig config;
    
    private Gson gson = new Gson();
    private static final Logger logger = Log.getLogger("FN_V2_Connector");
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    static OkHttpClient client = new OkHttpClient();
   
    
    /**
     * AddWorkorder:
     * Create a work order
     * @param workorder_model JSON
     * @return com.fieldnation.models.WorkOrder
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public com.fieldnation.models.WorkOrder addWorkorder(String workorder_model) throws Exception {
    	RequestBody body = RequestBody.create(JSON, workorder_model);
        Request request = initClientBuilder("/workorders")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return gson.fromJson(response.body().string(), com.fieldnation.models.WorkOrder.class);
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
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public com.fieldnation.models.WorkOrder publishWorkorder(long workorder_id, String json_body) throws Exception {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/publish")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return gson.fromJson(response.body().string(), com.fieldnation.models.WorkOrder.class);
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
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public com.fieldnation.models.WorkOrder routeWorkorder(long workorder_id, String json_body) throws Exception {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/route")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return gson.fromJson(response.body().string(), com.fieldnation.models.WorkOrder.class);
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
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public String autoDispatchWorkorder(int workorder_id, String json_body) throws Exception {
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
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public com.fieldnation.models.WorkOrder updatePay(int workorder_id, String json_body) throws Exception {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/pay")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return gson.fromJson(response.body().string(), com.fieldnation.models.WorkOrder.class);
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
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public com.fieldnation.models.WorkOrder updateSchedule(int workorder_id, String json_body) throws Exception {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/schedule")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return gson.fromJson(response.body().string(), com.fieldnation.models.WorkOrder.class);
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
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public com.fieldnation.models.WorkOrder assignWorkorder(long workorder_id, String json_body) throws Exception {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/assignee")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return gson.fromJson(response.body().string(), com.fieldnation.models.WorkOrder.class);
        }catch(IOException e){
        	logger.error(e.getMessage());
        	throw e;
        }
	}
    
    /**
     * initClientBuilder:
     * Returns okhttp3.Request.Builder with an initialized URL property
     * @param requestPath 
     * @return okhttp3.Request.Builder
     * @throws Exception 
     */
    private Builder initClientBuilder(String requestPath) throws Exception{
    	try{
    		if(token_details == null || token_details.isExpired()){
    			token_details = getTokenFromStore();
    		}
    		FnV2Connector.client = initClient();
    		return new Request.Builder().url(config.getApiUrl() + requestPath + "?access_token=" + token_details.getAccessToken());
    		
    		
    	}catch(Exception e){
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
     * getTokenJSON
     *
     * @return Token Details JSON
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String getTokenJSON() throws Exception  {
    	try {
    		return gson.toJson(OAuthTokenDetails.class);
    	} catch (Exception e) {
    		logger.error(e.getMessage(), e);
    		throw e;
    	}
	}
    
    /**
     * getTokenFromStore
     *
     * @return OAuthTokenDetails
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { IOException.class })
    public OAuthTokenDetails getTokenFromStore() throws Exception {
    	initObjectStore();  //initialize persistent store
    	if(!os.contains(config.getUsername())){ //token for username not found
    		return getNewToken();
    	}
    	
    	String stored_body = os.retrieve(config.getUsername());
    	logger.info("found token: " + stored_body);
    	
    	token_details = gson.fromJson(stored_body, OAuthTokenDetails.class);
    	if(token_details == null || token_details.isExpired()){
    		token_details = getNewToken();
    	}
    	
    	return token_details;
	}
    
    public ObjectStoreManager getObjectStoreManager() {
        return objectStoreManager;
    }
    
    public void setObjectStoreManager(ObjectStoreManager objectStoreManager) {
        this.objectStoreManager = objectStoreManager;
    }
    
    
	private OAuthTokenDetails getNewToken() throws Exception {
		AuthPayload ap = new AuthPayload(config.getGrantType(), config.getUsername(), config.getPassword(), config.getClientId(), config.getClientSecret());
		Gson gson = new Gson();
		String resource_owner_json = gson.toJson(ap);
		String responseBody;
		OkHttpClient authClient = initClient();
		RequestBody body = RequestBody.create(JSON, resource_owner_json);
		Request request = new Request.Builder()
				.url(config.getAuthUrl())
				.post(body)
				.build();
		try (Response response = authClient.newCall(request).execute()) {
			if(response.code() == 200){
				responseBody = response.body().string();
				logger.info("storing new token");
			    os.store(ap.getUserName(), responseBody);
			  	return gson.fromJson(responseBody, OAuthTokenDetails.class);
			}
			else{
				IOException ex = new IOException(response.body().string());
				throw ex;
			}
			
		}catch(IOException e){
			logger.error(e.getMessage(), e);
			throw e;
		}
	} 

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    
    @PostConstruct
    public void initObjectStore() {
    	if (os == null) {
        	os = objectStoreManager.getObjectStore("fn-tokens", true, 300000, 3600000, 1500);
    	}
    }

}