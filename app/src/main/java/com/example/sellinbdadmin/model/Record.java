package com.example.sellinbdadmin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Record {

    @SerializedName("post_id")
    @Expose
    private String postId;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("productname")
    @Expose
    private String productname;
    @SerializedName("productdescription")
    @Expose
    private String productdescription;
    @SerializedName("productprice")
    @Expose
    private String productprice;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("usernumber1")
    @Expose
    private String usernumber1;
    @SerializedName("usernumber2")
    @Expose
    private String usernumber2;
    @SerializedName("productStatus")
    @Expose
    private String productStatus;
    @SerializedName("priceStatus")
    @Expose
    private String priceStatus;
    @SerializedName("image1")
    @Expose
    private String image1;
    @SerializedName("image2")
    @Expose
    private String image2;
    @SerializedName("image3")
    @Expose
    private String image3;
    @SerializedName("image4")
    @Expose
    private String image4;
    @SerializedName("image5")
    @Expose
    private String image5;
    @SerializedName("images")
    @Expose
    private List<String> images = null;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("division")
    @Expose
    private String division;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("registrationyear")
    @Expose
    private String registrationyear;
    @SerializedName("enginecapacity")
    @Expose
    private String enginecapacity;
    @SerializedName("fueltype")
    @Expose
    private String fueltype;
    @SerializedName("gear")
    @Expose
    private String gear;
    @SerializedName("bodytype")
    @Expose
    private String bodytype;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernumber1() {
        return usernumber1;
    }

    public void setUsernumber1(String usernumber1) {
        this.usernumber1 = usernumber1;
    }

    public String getUsernumber2() {
        return usernumber2;
    }

    public void setUsernumber2(String usernumber2) {
        this.usernumber2 = usernumber2;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(String priceStatus) {
        this.priceStatus = priceStatus;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationyear() {
        return registrationyear;
    }

    public void setRegistrationyear(String registrationyear) {
        this.registrationyear = registrationyear;
    }

    public String getEnginecapacity() {
        return enginecapacity;
    }

    public void setEnginecapacity(String enginecapacity) {
        this.enginecapacity = enginecapacity;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

}