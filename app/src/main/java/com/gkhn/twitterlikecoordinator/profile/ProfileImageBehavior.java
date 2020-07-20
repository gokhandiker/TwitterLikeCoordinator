package com.gkhn.twitterlikecoordinator.profile;

import android.content.Context;
import android.util.AttributeSet;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileImageBehavior extends CoordinatorLayout.Behavior<CircleImageView> {
    public ProfileImageBehavior() {
    }

    public ProfileImageBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
