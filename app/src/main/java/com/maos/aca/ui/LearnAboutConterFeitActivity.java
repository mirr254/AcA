package com.maos.aca.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.maos.aca.R;
import com.maos.aca.models.AboutUs;
import com.maos.aca.models.AboutUsMenu;
import com.maos.aca.utils.HeadingView;
import com.maos.aca.utils.MenuView;
import com.maos.aca.utils.Utils;
import com.mindorks.placeholderview.ExpandablePlaceHolderView;

public class LearnAboutConterFeitActivity extends AppCompatActivity {

    private ExpandablePlaceHolderView mExpandableView;
    private Context mContext;
    private String JSON_FILE_NAME = "learn_about_cf.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mContext = this.getApplicationContext();
        mExpandableView = (ExpandablePlaceHolderView)findViewById(R.id.expandableView);
        for(AboutUs aboutUs : Utils.loadFeeds(this.getApplicationContext(), JSON_FILE_NAME)){
            mExpandableView.addView(new HeadingView(mContext, aboutUs.getHeading()));
            for(AboutUsMenu usMenu : aboutUs.getAbout_us_menu_list()){
                mExpandableView.addView(new MenuView(mContext, usMenu));
            }
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
