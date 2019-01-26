package com.jay.unitconverter.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jay.unitconverter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrencyExchangeFragment extends Fragment {

    public CurrencyExchangeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_currency_exchange, container, false);
    }

}
