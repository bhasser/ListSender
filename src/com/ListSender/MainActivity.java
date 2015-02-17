package com.ListSender;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.ListSender.R;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {

    
	Button mBtn1;
	
	EditText eT_ToName;

	EditText eT_WhyShort1;
	
	EditText eT_WhyShort2;
	
	EditText eT_WhyShort3;
	
	EditText eT_WhyShort4;
	
	EditText eT_WhyShort5;
	
	EditText eT_WhyShort6;

	


	Bitmap src;

	ImageView iv;

	Canvas ivCanvas;

	Bitmap ourNewBitmap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);  
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
		
		mBtn1 = (Button) findViewById(R.id.button1);

		mBtn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent share = new Intent(Intent.ACTION_SEND);
				share.setType("image/*");
				ByteArrayOutputStream bytes = new ByteArrayOutputStream();
				ourNewBitmap.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
				File f = new File(Environment.getExternalStorageDirectory()
						+ "/certificate.jpg");
				try {
					f.createNewFile();
					FileOutputStream fo = new FileOutputStream(f);
					fo.write(bytes.toByteArray());
					fo.close();
					bytes.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				share.putExtra(Intent.EXTRA_STREAM,
						Uri.parse("file:///sdcard/certificate.jpg"));
				startActivity(Intent.createChooser(share, "Share Image"));
			}
		});

			
		eT_ToName = (EditText) findViewById(R.id.editText_ToName);

		eT_WhyShort1 = (EditText) findViewById(R.id.editText_ForShort1);
		
		eT_WhyShort2 = (EditText) findViewById(R.id.editText_ForShort2);
		
		eT_WhyShort3 = (EditText) findViewById(R.id.editText_ForShort3);
		
		eT_WhyShort4 = (EditText) findViewById(R.id.editText_ForShort4);
		
		eT_WhyShort5 = (EditText) findViewById(R.id.editText_ForShort5);
		
		eT_WhyShort6 = (EditText) findViewById(R.id.editText_ForShort6);



	
		iv = (ImageView) findViewById(R.id.imageView1);

		src = BitmapFactory.decodeResource(getResources(),
				(R.drawable.certtemplate));

		ourNewBitmap = Bitmap.createBitmap(src.getWidth(), src.getHeight(),
				Bitmap.Config.ARGB_8888);
		ivCanvas = new Canvas(ourNewBitmap);

		

		
		eT_WhyShort1.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				updateCanvas();
			}
		});
		
		eT_WhyShort2.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				updateCanvas();
			}
		});
		
		eT_WhyShort3.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				updateCanvas();
			}
		});
		
		eT_WhyShort4.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				updateCanvas();
			}
		});
		
		eT_WhyShort5.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				updateCanvas();
			}
		});
		
		eT_WhyShort6.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				updateCanvas();
			}
			
			
		});

		
		
		Paint paint = new Paint();
		ivCanvas.drawBitmap(src, 0, 0, paint);
	}

	
	//Edit the section below to change text location, color and size 
	public void updateCanvas() {
		Paint paint = new Paint();
		ivCanvas.drawBitmap(src, 0, 0, paint);
		paint.setColor(Color.BLACK);		
		paint.setTextAlign(Align.CENTER);
		
		Typeface tf = Typeface.create("Times New Roman",Typeface.BOLD);
		Typeface tf1 = Typeface.create("Times New Roman",Typeface.NORMAL);
		paint.setTypeface(tf);
		paint.setUnderlineText(true);
		
		float verttoname = 0.15f;		
		paint.setTextSize(32);
		ivCanvas.drawText(eT_ToName.getText().toString(), (ivCanvas.getWidth()/2), (ivCanvas.getHeight()*verttoname), paint);
		
		paint.setUnderlineText(false);
		paint.setTextAlign(Align.LEFT);
		paint.setTextSize(25);
		paint.setTypeface(tf);
		
		float vertshort1 = 0.28f;		
		ivCanvas.drawText("1.)", (ivCanvas.getWidth()/7), (ivCanvas.getHeight()*vertshort1), paint);				
		ivCanvas.drawText(eT_WhyShort1.getText().toString(), (ivCanvas.getWidth()/4), (ivCanvas.getHeight()*vertshort1), paint);
		
		float vertshort2 = 0.38f;		
		ivCanvas.drawText("2.)", (ivCanvas.getWidth()/7), (ivCanvas.getHeight()*vertshort2), paint);
		ivCanvas.drawText(eT_WhyShort2.getText().toString(), (ivCanvas.getWidth()/4), (ivCanvas.getHeight()*vertshort2), paint);
		
		float vertshort3 = 0.48f;		
		ivCanvas.drawText("3.)", (ivCanvas.getWidth()/7), (ivCanvas.getHeight()*vertshort3), paint);
		ivCanvas.drawText(eT_WhyShort3.getText().toString(), (ivCanvas.getWidth()/4), (ivCanvas.getHeight()*vertshort3), paint);
		
		float vertshort4 = 0.58f;
		ivCanvas.drawText("4.)", (ivCanvas.getWidth()/7), (ivCanvas.getHeight()*vertshort4), paint);
		ivCanvas.drawText(eT_WhyShort4.getText().toString(), (ivCanvas.getWidth()/4), (ivCanvas.getHeight()*vertshort4), paint);
		
		float vertshort5 = 0.68f;
		ivCanvas.drawText("5.)", (ivCanvas.getWidth()/7), (ivCanvas.getHeight()*vertshort5), paint);
		ivCanvas.drawText(eT_WhyShort5.getText().toString(), (ivCanvas.getWidth()/4), (ivCanvas.getHeight()*vertshort5), paint);
		
		float vertshort6 = 0.78f;
		ivCanvas.drawText("6.)", (ivCanvas.getWidth()/7), (ivCanvas.getHeight()*vertshort6), paint);
		ivCanvas.drawText(eT_WhyShort6.getText().toString(), (ivCanvas.getWidth()/4), (ivCanvas.getHeight()*vertshort6), paint);
		
		
				
		// Everything has been drawn to bmp, so we can set that here, now.
		iv.setImageBitmap(ourNewBitmap);

	}

}