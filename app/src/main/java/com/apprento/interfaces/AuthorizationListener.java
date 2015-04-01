package com.apprento.interfaces;

import com.apprento.enums.ServiceEnum;

/**
 * Created by Виталий on 01/04/2015.
 */
public interface AuthorizationListener {

    // TODO add response model to params (or smth.)
    public void onSignIn();

    public void onSignUpClicked();

    public void onServiceSelected(final ServiceEnum _service);

    //TODO add response model / token or smth.
    public void onServiceSignIn();
}
