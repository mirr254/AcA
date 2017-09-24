package com.maos.aca.utils;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.maos.aca.R;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.*;

@Parent
@SingleTop
@Layout(R.layout.feed_heading)
public class HeadingView {

    @View(R.id.headingTxt)
    private TextView headingTxt;

    @View(R.id.toggleIcon)
    private ImageView toggleIcon;

    @Toggle(R.id.toggleView)
    private LinearLayout toggleView;

    @ParentPosition
    private int mParentPosition;

    private Context mContext;
    private String mHeading;

    public HeadingView(Context context, String heading) {
        mContext = context;
        mHeading = heading;
    }

    @Resolve
    private void onResolved() {
        toggleIcon.setImageDrawable(ContextCompat.getDrawable(mContext,R.drawable.ic_keyboard_arrow_up_black_24dp));
        headingTxt.setText(mHeading);
    }

    @Expand
    private void onExpand(){
        toggleIcon.setImageDrawable(ContextCompat.getDrawable(mContext,R.drawable.ic_keyboard_arrow_down_black_24dp));
    }

    @Collapse
    private void onCollapse(){
        toggleIcon.setImageDrawable(ContextCompat.getDrawable(mContext,R.drawable.ic_keyboard_arrow_up_black_24dp));
    }
}
