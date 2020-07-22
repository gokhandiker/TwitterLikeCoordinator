package com.gkhn.twitterlikecoordinator.profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.gkhn.twitterlikecoordinator.R;
import com.google.android.material.appbar.AppBarLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileImageBehavior extends CoordinatorLayout.Behavior<CircleImageView> {
    private final Context context;

    private int startHeight;
    private int startwidth;
    private int startYPosition;
    private int startXPosition;
    private float startToolbarPosition;



    public ProfileImageBehavior(Context context, AttributeSet attrs) {
        this.context = context;
    }

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull CircleImageView child, @NonNull View dependency) {
        return dependency instanceof AppBarLayout;
    }

    private double limit = 1.2580645;
    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull CircleImageView child, @NonNull View dependency) {
        maybeInitProperties((ImageView) child, dependency);



        final int maxScrollDistance = (int) (startToolbarPosition - getStatusBarHeight());
        float expandedPercentageFactor = dependency.getY() / maxScrollDistance;


        Log.e("parenty",""+parent.get);

        CoordinatorLayout.LayoutParams lp = (CoordinatorLayout.LayoutParams) child.getLayoutParams();
        lp.width = (int) (startHeight - startHeight*expandedPercentageFactor/10);
        lp.height = (int) (startHeight - startHeight*expandedPercentageFactor/10);
        child.setLayoutParams(lp);


        return true;
    }

    @SuppressLint("PrivateResource")
    private void maybeInitProperties(ImageView child, View dependency) {
        if (startYPosition == 0)
            startYPosition = (int) (child.getY());

        if (startXPosition == 0)
            startXPosition = (int) (child.getX());

        if (startHeight == 0)
            startHeight = (child.getHeight());

        if (startwidth == 0)
            startwidth = child.getWidth();



        if (startToolbarPosition == 0)
            startToolbarPosition = dependency.getY();
    }

    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");

        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
