package com.akarbowy.tagop.network;

import com.akarbowy.tagop.BuildConfig;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by akarbowy on 07.08.16.
 */
public class AuthInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();

        String appKeyPath = "appkey/" + BuildConfig.API_KEY;
        HttpUrl authorizedUrl = original.url().newBuilder()
                .addPathSegments(appKeyPath)
                .build();

        Request authorized = original.newBuilder()
                .url(authorizedUrl)
                .build();

        return chain.proceed(authorized);
    }
}
