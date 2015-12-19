package com.kimkha.readability.test;

import com.kimkha.readability.Log;
import com.kimkha.readability.PageReadException;
import com.kimkha.readability.PageReader;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * Created by kimkha on 12/13/15.
 */
public class OkHttpReader implements PageReader {
    private static final String TAG = "OkHttpReader";

    /** {@inheritDoc}*/
    @Override
    public String readPage(String url) throws PageReadException {
        Log.i(TAG, "Reading " + url);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (Exception e) {
            Log.e(TAG, "Download failed of " + url, e);
            throw new PageReadException("Failed to read " + url, e);
        }
    }

}
