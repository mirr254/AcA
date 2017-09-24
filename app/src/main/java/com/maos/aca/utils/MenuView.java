package com.maos.aca.utils;


import android.content.Context;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.maos.aca.R;
import com.maos.aca.models.AboutUsMenu;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

@Layout(R.layout.feed_item)
public class MenuView {

    @ParentPosition
    private int mParentPosition;

    @ChildPosition
    private int mChildPosition;

    @View(R.id.titleTxt)
    private TextView titleTxt;

    @View(R.id.captionTxt)
    private TextView captionTxt;


    private AboutUsMenu menuView;
    private Context mContext;

    public MenuView(Context context, AboutUsMenu menu_view) {
        mContext = context;
        menuView = menu_view;
    }

    @Resolve
    private void onResolved() {
        titleTxt.setText(menuView.getTitle());
        captionTxt.setText(menuView.getCaption());
    }
}


