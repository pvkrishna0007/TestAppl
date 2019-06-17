package com.example.testappl;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

public class test {

    public void runnn() {
        View popupView = null;
        popupView.post(new Runnable() {
            @Override
            public void run() {
                //hello
            }
        });


    }

        public static int dpToPx(Context context, int dp) {
            return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
        }



}
