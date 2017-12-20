
package com.fieldnation;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
   
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("w2")
    @Expose
    private Boolean w2;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("correlation_id")
    @Expose
    private String correlationId;
  
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("about")
    @Expose
    private String about;

    @SerializedName("email_verification")
    @Expose
    private Boolean emailVerification;
   
    @SerializedName("worked_with")
    @Expose
    private Boolean workedWith;
    @SerializedName("has_request")
    @Expose
    private Boolean hasRequest;
   
    @SerializedName("managed")
    @Expose
    private Boolean managed;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("actions")
    @Expose
    private List<String> actions = null;
    @SerializedName("react")
    @Expose
    private Boolean react;
    @SerializedName("elevate")
    @Expose
    private Boolean elevate;
     @SerializedName("is_end_client")
    @Expose
    private Boolean isEndClient;
    @SerializedName("is_screening_administrator")
    @Expose
    private Boolean isScreeningAdministrator;
    @SerializedName("home")
    @Expose
    private String home;
    private final static long serialVersionUID = -7654749328845109120L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

}
