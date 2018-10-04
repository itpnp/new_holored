package com.example.pnp.holoredearapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class UUDescription extends Activity {
    ImageView judulUU;
    TouchImageView mImageView;
    //private TouchImageView mImageView = null;
   // private ScaleGestureDetector scaleGestureDetector = null;




    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uu_desc);

        initControls();
    }

    private void initControls()
    {
            judulUU =(ImageView) findViewById(R.id.judulUU);
            TouchImageView mImageView = (TouchImageView) findViewById(R.id.logoUU);
            mImageView.setMaxZoom(15f);
        //}

       /*
        if(scaleGestureDetector == null)
        {
            // Create an instance of OnPinchListner custom class.
            OnPinchListener onPinchListener = new OnPinchListener(getApplicationContext(), mImageView);

            // Create the new scale gesture detector object use above pinch zoom gesture listener.
            scaleGestureDetector = new ScaleGestureDetector(getApplicationContext(), onPinchListener);
        }
       */





        Intent it = getIntent();
        String ba = it.getStringExtra("undang");


        //Toast.makeText(this,String.valueOf(ba),Toast.LENGTH_SHORT).show();

        if (ba.equals("deskripsi"))
        {
            mImageView.setVisibility(View.VISIBLE);
            mImageView.setImageResource(R.drawable.uu_cukai);
            judulUU.setVisibility(View.VISIBLE);
            judulUU.setImageResource(R.drawable.undang2);
        }

    }



}
