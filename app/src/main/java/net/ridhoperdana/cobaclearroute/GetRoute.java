package net.ridhoperdana.cobaclearroute;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by RIDHO on 3/10/2017.
 */

public interface GetRoute {
    @GET
    Call<JsonElement> getRoute(@Url String url);
}
