package com.example.star.sidemenuexam.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;

import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.star.sidemenuexam.R;
import com.example.star.sidemenuexam.Utils.Constant;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by STAR on 1/10/2017.
 */

public class CountryActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_country);

        LinearLayout lyCountry = (LinearLayout)findViewById(R.id.lyCountry);
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray m_jArry = obj.getJSONArray("countries");

            for(int i = 0; i < m_jArry.length(); i ++) {
                JSONObject jo_inside = m_jArry.getJSONObject(i);
                String strCountry = jo_inside.getString("label");

                LayoutInflater inflater = LayoutInflater.from(this);
                View viewCountry = inflater.inflate(R.layout.cell_country, null);

                TextView tvCountry = (TextView) viewCountry.findViewById(R.id.textView_country);
                tvCountry.setText(strCountry);

                lyCountry.addView(viewCountry);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public String loadJSONFromAsset() {
        String json = null;
        try {

            InputStream is = getAssets().open("countries_json.txt");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }

}
