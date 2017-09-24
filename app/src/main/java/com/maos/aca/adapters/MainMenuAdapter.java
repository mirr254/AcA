package com.maos.aca.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.maos.aca.R;
import com.maos.aca.models.Menu;

import java.util.List;

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.MyViewHolder> {

    public List<Menu> list_of_menus;
    public Context mContext;

    public MainMenuAdapter( List<Menu> list_of_menus, Context context){
        this.list_of_menus = list_of_menus;
        this.mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Menu menu = list_of_menus.get(position);
        holder.title_text.setText( menu.title );
        holder.details_text.setText( menu.details );

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = menu.title;
                Log.d("CardView", "CardView Clicked: " + currentValue);

                //opening activity
                int pos = position;
                switch (pos){
                    case 0:
                        try {
                            Class aboutUs = Class.forName("com.maos.aca.ui.AboutUsMenuActivity");
                            Intent menuItent = new Intent( mContext, aboutUs );
                            mContext.startActivity(menuItent);

                        }catch (ClassNotFoundException e){
                            e.printStackTrace();
                        }
                        break;

                    case 1:
                        try {
                            Class services = Class.forName("com.maos.aca.ui.ServicesActivity");
                            Intent serviceIntent = new Intent( mContext, services);
                            mContext.startActivity(serviceIntent);

                        }catch (ClassNotFoundException e){
                            e.printStackTrace();
                        }
                        break;

                    case 2:
                        try {
                            Class stakeholders = Class.forName("com.maos.aca.ui.StakeholdersActivity");
                            Intent stakeholdersIntent = new Intent( mContext, stakeholders);
                            mContext.startActivity(stakeholdersIntent);

                        }catch (ClassNotFoundException e){
                            e.printStackTrace();
                        }
                        break;

                    case 3:
                        try {
                            Class locf = Class.forName("com.maos.aca.ui.LearnAboutConterFeitActivity");
                            Intent locfIntent = new Intent( mContext, locf);
                            mContext.startActivity(locfIntent);

                        }catch (ClassNotFoundException e){
                            e.printStackTrace();
                        }
                        break;
                }
            }
        });

    }


    @Override
    public int getItemCount() {
        return list_of_menus.size();
    }

    /*
      View Holder class
    * */

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public CardView mCardView;
        public TextView title_text, details_text;

        public MyViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.card_view);
            title_text = (TextView) itemView.findViewById(R.id.menu_title);
            details_text = (TextView) itemView.findViewById(R.id.menu_details);
        }
    }


}
