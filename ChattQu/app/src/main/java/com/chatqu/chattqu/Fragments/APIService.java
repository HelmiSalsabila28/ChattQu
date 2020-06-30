package com.chatqu.chattqu.Fragments;

import com.chatqu.chattqu.Notifications.MyResponse;
import com.chatqu.chattqu.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAC_reDcQ:APA91bG8xomY7A75VCs5McxC-GNSKrtSnpqeq6Kfh1_N3MGBgWKSvPefMvcjOtKkLuG7EtHBIDXQmm4aDcWW5P31tdRDROcYcYZ-ElXDJ4uVZ_j1syuIyefUx_lvCiHMv_apjNAsDKAs"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
