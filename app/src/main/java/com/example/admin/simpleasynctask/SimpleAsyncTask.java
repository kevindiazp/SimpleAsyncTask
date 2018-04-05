package com.example.admin.simpleasynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Admin on 05/04/2018.
 */

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {
    private final TextView mTextview;

    @Override
    protected String doInBackground(Void... voids) {
        Random r = new Random();
        int n = r.nextInt(11);

        int s = n * 200;

        try{
            Thread.sleep(s);
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
        return "Awake at last after sleeping for " + s + " milliseconds!";
    }
    public  SimpleAsyncTask(TextView tv){
        mTextview = tv;
    }

    protected void onPostExecute(String result){
        mTextview.setText(result);
    }


}
