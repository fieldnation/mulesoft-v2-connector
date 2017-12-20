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
import com.fieldnation.AuthPayload;
import com.fieldnation.OauthResponse;
import com.fieldnation.modules.fnv2.config.ConnectorConfig;
import com.google.gson.Gson;


@Connector(name="fn-v2", friendlyName="Field Nation V2 Connector")
public class FnV2Connector {

    @Config
    ConnectorConfig config;
   
    private static String baseUri;
    public volatile static OauthResponse token_details = new OauthResponse();
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
    public String getTokenDetails() throws IOException {
    	try {
    		Gson gson = new Gson();
    		String token_details_json = gson.toJson(token_details); 
    		return token_details_json;
    	} catch (Exception e) {
    		e.printStackTrace();
    		throw e;
    	}
	}
    
    private OkHttpClient initClient(){
    	return new OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build();
    }
    private Builder initClientBuilder(String basePath) throws IOException{
    	String access_token = initToken().getAccessToken();
    	client = initClient();
    	return new Request.Builder().url(baseUri + basePath + "?access_token=" + access_token);
    }
    /**
     * get token_details
     *
     * @return OauthResponse
     * @throws IOException Comment for Exception
     */
    @ReconnectOn(exceptions = { Exception.class })
    private OauthResponse initToken() throws IOException {
    	try {
    		if(token_details.getAccessToken() == null || token_details.isExpired())
    			generateAccessToken();
    		baseUri = config.getApiUrl();
    		return token_details;
    	} catch (Exception e) {
    		e.printStackTrace();
    		throw e;
    	}
	}
    
    /**
     * Add Workorder
     *
     * @return JSON Workorder Model 
     * @throws Exception 
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String addWorkorder(String workorder_model) throws IOException {
    	RequestBody body = RequestBody.create(JSON, workorder_model);
        Request request = initClientBuilder("/workorders")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }
	} 
    
    /**
     * Publish Workorder
     *
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String publishWorkorder(long workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/publish")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }
	}
    
    /**
     * Route Workorder
     *
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String routeWorkorder(long workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/route")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }
	}
    
    /**
     * AutoDispatch Workorder
     *
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String autoDispatchWorkorder(long workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/auto_dispatch")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }
	}
    
    /**
     * Update Pay
     *
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String updatePay(int workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/pay")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }
	}
    
    /**
     * Update Schedule
     *
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String updateSchedule(int workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/schedule")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }
	}
    
    /**
     * Assign Workorder
     *
     * @return JSON Workorder Model 
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    public String assignWorkorder(long workorder_id, String json_body) throws IOException {
    	RequestBody body = RequestBody.create(JSON, json_body);
        Request request = initClientBuilder("/workorders/" + workorder_id + "/assignee")
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }
	}
    
    /**
     * Authenticate
     *
     * @return OAuthResponse<JSON>
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
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
          token_details = gson.fromJson(responseBody, OauthResponse.class);
          return responseBody;
        }
	} 

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}