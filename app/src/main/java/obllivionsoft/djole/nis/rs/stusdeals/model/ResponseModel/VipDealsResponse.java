package obllivionsoft.djole.nis.rs.stusdeals.model.ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class VipDealsResponse {

    @Expose
    @SerializedName("premium")
    public List<Premium> premium;
    @Expose
    @SerializedName("premiumPrice")
    public String premiumPrice;
    @Expose
    @SerializedName("message")
    public String message;
    @Expose
    @SerializedName("status")
    public int status;

    public static class Premium {
        @Expose
        @SerializedName("legal")
        public String legal;
        @Expose
        @SerializedName("type")
        public int type;
        @Expose
        @SerializedName("type_city")
        public String type_city;
        @Expose
        @SerializedName("isVIP")
        public boolean isVIP;
        @Expose
        @SerializedName("featured")
        public boolean featured;
        @Expose
        @SerializedName("sortnum")
        public int sortnum;
        @Expose
        @SerializedName("photo")
        public String photo;
        @Expose
        @SerializedName("coverPhoto")
        public String coverPhoto;
        @Expose
        @SerializedName("code")
        public String code;
        @Expose
        @SerializedName("price")
        public int price;
        @Expose
        @SerializedName("price_original")
        public int price_original;
        @Expose
        @SerializedName("limitTotal")
        public int limitTotal;
        @Expose
        @SerializedName("redeemType")
        public String redeemType;
        @Expose
        @SerializedName("limitByStudent")
        public int limitByStudent;
        @Expose
        @SerializedName("isEvent")
        public boolean isEvent;
        @Expose
        @SerializedName("isActive")
        public boolean isActive;
        @Expose
        @SerializedName("ratings")
        public double ratings;
        @Expose
        @SerializedName("views")
        public int views;
        @Expose
        @SerializedName("meta_description")
        public String meta_description;
        @Expose
        @SerializedName("meta_title")
        public String meta_title;
        @Expose
        @SerializedName("slug")
        public String slug;
        @Expose
        @SerializedName("isLiked")
        public boolean isLiked;
        @Expose
        @SerializedName("distance")
        public int distance;
        @Expose
        @SerializedName("affiliate")
        public String affiliate;
        @Expose
        @SerializedName("instagram")
        public String instagram;
        @Expose
        @SerializedName("facebook")
        public String facebook;
        @Expose
        @SerializedName("web")
        public String web;
        @Expose
        @SerializedName("hot")
        public List<Boolean> hot;
        @Expose
        @SerializedName("scanForRedeem")
        public boolean scanForRedeem;
        @Expose
        @SerializedName("gallery")
        public List<String> gallery;
        @Expose
        @SerializedName("subCategory")
        public String subCategory;
        @Expose
        @SerializedName("startDay")
        public String startDay;
        @Expose
        @SerializedName("accommodation_email")
        public String accommodation_email;
        @Expose
        @SerializedName("address")
        public Address address;
        @Expose
        @SerializedName("location")
        public Location location;
        @Expose
        @SerializedName("desc")
        public String desc;
        @Expose
        @SerializedName("title")
        public String title;
        @Expose
        @SerializedName("_category")
        public String _category;
        @Expose
        @SerializedName("_provider")
        public _provider _provider;
        @Expose
        @SerializedName("created_at")
        public String created_at;
        @Expose
        @SerializedName("updated_at")
        public String updated_at;
        @Expose
        @SerializedName("_id")
        public String _id;
    }

    public static class Address {
        @Expose
        @SerializedName("zip")
        public String zip;
        @Expose
        @SerializedName("city")
        public String city;
        @Expose
        @SerializedName("street")
        public String street;
    }

    public static class Location {
        @Expose
        @SerializedName("r")
        public double r;
        @Expose
        @SerializedName("lng")
        public double lng;
        @Expose
        @SerializedName("lat")
        public double lat;
    }

    public static class _provider {
        @Expose
        @SerializedName("photo")
        public String photo;
        @Expose
        @SerializedName("coverPhoto")
        public String coverPhoto;
        @Expose
        @SerializedName("phone")
        public List<String> phone;
        @Expose
        @SerializedName("desc")
        public String desc;
        @Expose
        @SerializedName("password")
        public String password;
        @Expose
        @SerializedName("email")
        public String email;
        @Expose
        @SerializedName("person")
        public String person;
        @Expose
        @SerializedName("location")
        public Locations location;
        @Expose
        @SerializedName("address")
        public Addresss address;
        @Expose
        @SerializedName("name")
        public String name;
        @Expose
        @SerializedName("created_at")
        public String created_at;
        @Expose
        @SerializedName("updated_at")
        public String updated_at;
        @Expose
        @SerializedName("_id")
        public String _id;
    }

    public static class Locations {
        @Expose
        @SerializedName("r")
        public double r;
        @Expose
        @SerializedName("lng")
        public double lng;
        @Expose
        @SerializedName("lat")
        public double lat;
    }

    public static class Addresss {
        @Expose
        @SerializedName("zip")
        public String zip;
        @Expose
        @SerializedName("city")
        public String city;
        @Expose
        @SerializedName("street")
        public String street;
    }
}