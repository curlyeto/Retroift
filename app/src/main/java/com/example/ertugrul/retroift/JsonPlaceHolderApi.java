package com.example.ertugrul.retroift;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {


    @GET("posts")//json u cekicegimiz linkte "https://www....../posts" oldugu için yazdık
    Call<List<Post>> getPosts();
}
