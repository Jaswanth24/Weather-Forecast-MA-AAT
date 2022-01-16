package com.jarves.navigationdrawer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);



        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription(" Weather Forecast app is designed to fetch the weather of the requested city. We have given the ability for the app to display time,min temp,max,temp,etc. The weather is fetched by using open weather api.")
                .addItem(new Element().setTitle("APP version 1.0.0"))
                .addItem(new Element().setTitle("Tested on Pixel 4 XL API 30"))
                //.addItem(new Element().setTitle("Version 1.0"))
                .addGroup("CONNECT WITH US!")
                .addEmail("jaswanth.mca20@bmsce.ac.in")
                //.addWebsite("Your website/")
                //.addYoutube("UCbekhhidkzkGryM7mi5Ys_w")   //Enter your youtube link here (replace with my channel link)
                //.addPlayStore("com.example.yourprojectname")   //Replace all this with your package name
                .addInstagram("6feet_guy_")    //Your instagram id
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by Jaswanth Reddy and K H Greeshma", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutus.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}