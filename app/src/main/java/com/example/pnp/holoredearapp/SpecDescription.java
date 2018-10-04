package com.example.pnp.holoredearapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class SpecDescription extends Activity {
    ImageView logoPnp4,logoPnp3;
    TextView judul;
    TouchImageView mImageView;
    //private TouchImageView mImageView = null;
   // private ScaleGestureDetector scaleGestureDetector = null;




    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spec_desc);
        //setContentView(new Zoom(this));
        initControls();
    }

    private void initControls()
    {
        logoPnp4 =(ImageView) findViewById(R.id.logoPnp4);
        //if(mImageView == null) {
            //mImageView = (ImageView) findViewById(R.id.logoPnp3);
            TouchImageView mImageView = (TouchImageView) findViewById(R.id.logoPnp3);
            mImageView.setMaxZoom(15f);
        //}
        judul =(TextView) findViewById(R.id.judul);
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
        String ba = it.getStringExtra("tahun");


        //Toast.makeText(this,String.valueOf(ba),Toast.LENGTH_SHORT).show();

        if (ba.equals("TA 2018"))
        {
            mImageView.setVisibility(View.VISIBLE);
            mImageView.setImageResource(R.drawable.spekrev);
            logoPnp4.setVisibility(View.VISIBLE);
            logoPnp4.setImageResource(R.drawable.pitacukai2018);
            judul.setVisibility(View.VISIBLE);
            judul.setText("INFO SPESIFIKASI TA 2018");
        }
        else if (ba.equals("TA 2017"))
        {
            mImageView.setVisibility(View.VISIBLE);
            mImageView.setImageResource(R.drawable.spekrev);
            logoPnp4.setVisibility(View.VISIBLE);
            logoPnp4.setImageResource(R.drawable.candi_borobudur);
            judul.setVisibility(View.VISIBLE);
            judul.setText("INFO SPESIFIKASI TA 2017");
        }

        /*
         if(ba.equals("Gagal"))
        {
            Toast.makeText(this,String.valueOf(ba),Toast.LENGTH_SHORT).show();

            logoPnp3.setVisibility(View.VISIBLE);
            logoPnp3.setImageResource(R.drawable.spekrev);
            logoPnp4.setVisibility(View.VISIBLE);
            logoPnp4.setImageResource(R.drawable.candi_borobudur);
            judul.setVisibility(View.VISIBLE);
            judul.setText("GAGAL");
        }
         */
    }

    /*
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // Dispatch activity on touch event to the scale gesture detector.
        scaleGestureDetector.onTouchEvent(event);
        return true;
    }
   */

}
