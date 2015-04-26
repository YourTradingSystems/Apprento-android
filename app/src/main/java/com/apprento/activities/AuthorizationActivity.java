package com.apprento.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

import com.apprento.R;
import com.apprento.enums.ServiceEnum;
import com.apprento.interfaces.AuthorizationListener;

import java.util.StringTokenizer;


public class AuthorizationActivity extends ActionBarActivity implements AuthorizationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_AA);
        setSupportActionBar(toolbar);
        getActionBar().setDisplayShowHomeEnabled(true);
      int i = 5;
    }

    @Override
    public void onSignIn() {

    }

    @Override
    public void onSignUpClicked() {

    }

    @Override
    public void onServiceSelected(ServiceEnum _service) {

    }

    @Override
    public void onServiceSignIn() {

    }
}