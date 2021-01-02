package com.example.sellinbdadmin.API;


import com.example.sellinbdadmin.model.PostModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Api {

    @GET("product/readPostsAdmin.php")
    Call<PostModel> getPosts();

    }
