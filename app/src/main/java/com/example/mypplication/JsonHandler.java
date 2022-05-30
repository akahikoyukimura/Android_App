package com.example.mypplication;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonHandler {

    @GET("posts")
    Call<List<PostModel>> getPostModel();
}
