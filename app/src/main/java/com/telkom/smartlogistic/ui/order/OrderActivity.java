package com.telkom.smartlogistic.ui.order;

import android.os.Bundle;
import com.telkom.smartlogistic.base.BaseActivity;
import com.telkom.smartlogistic.R;

/**
 * Created by Isnaeni on 08/03/2021.
 */
public class OrderActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_order);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_order;
    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.navigation_order;
    }
}