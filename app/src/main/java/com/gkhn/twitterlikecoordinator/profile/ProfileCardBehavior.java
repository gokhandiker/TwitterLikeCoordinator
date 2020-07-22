package com.gkhn.twitterlikecoordinator.profile;

import android.content.Context;
import android.util.AttributeSet;

import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class ProfileCardBehavior extends CoordinatorLayout.Behavior<CardView> {
    public ProfileCardBehavior() {
    }

    public ProfileCardBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

}
