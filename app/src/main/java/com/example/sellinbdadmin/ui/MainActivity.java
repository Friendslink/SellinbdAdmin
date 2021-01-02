package com.example.sellinbdadmin.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Toast;

import com.example.sellinbdadmin.API.Api;
import com.example.sellinbdadmin.API.ApiClient;
import com.example.sellinbdadmin.R;
import com.example.sellinbdadmin.adapter.PostAdapter;
import com.example.sellinbdadmin.model.ModelPost;
import com.example.sellinbdadmin.model.PostModel;
import com.example.sellinbdadmin.model.Record;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayList<ModelPost> postModels=new ArrayList<>();
    ArrayList<Record> records=new ArrayList<>();
    PostAdapter postAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        Api api3 = ApiClient.getClient().create(Api.class);
        Call<PostModel> callPost = api3.getPosts();
        callPost.enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                if (response.isSuccessful()) {
                    for (int i = 0; i < response.body().getRecords().size(); i++) {
                        ModelPost postNormalModel = new ModelPost();
                        postNormalModel.setName(response.body().getRecords().get(i).getUsername());
                        postNormalModel.setTitle(response.body().getRecords().get(i).getProductname());
                        postNormalModel.setArea(response.body().getRecords().get(i).getPlace());
                        postNormalModel.setType(response.body().getRecords().get(i).getCategory());
                        postNormalModel.setImage(response.body().getRecords().get(i).getImage1());
                        postNormalModel.setPrice(response.body().getRecords().get(i).getProductprice());
                        postModels.add(postNormalModel);

                    }

                    recyclerView.setAdapter(postAdapter);




                }
                else
                {
                    Toast.makeText(getApplicationContext(),response.body().getRecords().toString(),Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_LONG).show();
            }


        });
        postAdapter = new PostAdapter(getApplicationContext(), postModels);

    }
}