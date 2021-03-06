package com.dev.darrell.musicfinder.api;

import com.dev.darrell.musicfinder.model.TrackResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DeezerApiService {

    @GET("/search")
    Call<TrackResponse> findTrack(@Query("q") String query);

    @GET("/chart/0/tracks")
    Call<TrackResponse> fromTopCharts(@Query("limit") int limit);
}
