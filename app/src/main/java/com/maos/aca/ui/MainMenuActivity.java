package com.maos.aca.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.maos.aca.R;
import com.maos.aca.adapters.MainMenuAdapter;
import com.maos.aca.models.Menu;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {

    public ArrayList<Menu> menu_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        initUi();
    }

    public void initUi(){
        RecyclerView menu_recycler = (RecyclerView) findViewById(R.id.main_menu_recycler_view);

        //set the layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation( linearLayoutManager.VERTICAL );
        menu_recycler.setLayoutManager( linearLayoutManager );

        //set adapter
        MainMenuAdapter mainMenuAdapter = new MainMenuAdapter( getMenulist() , this);
        menu_recycler.setAdapter( mainMenuAdapter );


    }

    public ArrayList<Menu> getMenulist() {

        menu_list = new ArrayList<Menu>();

        menu_list.add( new Menu("About Us", " Learn more about our values, mission and vision ") );
        menu_list.add( new Menu("Services ", " In implementing its mandate, the Agency will provide the following to its external and internal customers:\n"));
        menu_list.add( new Menu("Stakeholders", " Who are the key players, Find out more") );
        menu_list.add( new Menu("Learn about Counterfeits", "Gain more insight on counterfeit products"));
        return menu_list;
    }
}
