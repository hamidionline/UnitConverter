package com.jay.unitconverter.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.jay.unitconverter.R;


public class FuelEconomyFragment extends Fragment {

    public FuelEconomyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fuel_economy, container, false);

        final EditText usMilesPerGallon = view.findViewById(R.id.input_us_miles_per_gallon);
        final EditText milesPerGallonImperial = view.findViewById(R.id.input_miles_per_gallon_imperial);
        final EditText kilometerPerLitre = view.findViewById(R.id.input_kilometer_per_litre);
        final EditText litrePer100Kilometres = view.findViewById(R.id.input_litre_per_100_kilometres);

        usMilesPerGallon.addTextChangedListener(new TextWatcher() {
            int charCount = 0;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                charCount = count;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (usMilesPerGallon.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        milesPerGallonImperial.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.20095)));
                        kilometerPerLitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.425144));
                        litrePer100Kilometres.setText(String.valueOf(Double.parseDouble(s.toString()) * 235.215));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        milesPerGallonImperial.getText().clear();
                        kilometerPerLitre.getText().clear();
                        litrePer100Kilometres.getText().clear();
                    }
                }
            }
        });

        milesPerGallonImperial.addTextChangedListener(new TextWatcher() {
            int charCount = 0;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                charCount = count;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (milesPerGallonImperial.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usMilesPerGallon.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.832674)));
                        kilometerPerLitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.354006));
                        litrePer100Kilometres.setText(String.valueOf(Double.parseDouble(s.toString()) * 282.481));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        usMilesPerGallon.getText().clear();
                        kilometerPerLitre.getText().clear();
                        litrePer100Kilometres.getText().clear();
                    }
                }
            }
        });

        kilometerPerLitre.addTextChangedListener(new TextWatcher() {
            int charCount = 0;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                charCount = count;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (kilometerPerLitre.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usMilesPerGallon.setText(String.valueOf((Double.parseDouble(s.toString()) * 2.35215)));
                        milesPerGallonImperial.setText(String.valueOf(Double.parseDouble(s.toString()) * 2.82481));
                        litrePer100Kilometres.setText(String.valueOf(Double.parseDouble(s.toString()) * 100));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        usMilesPerGallon.getText().clear();
                        milesPerGallonImperial.getText().clear();
                        litrePer100Kilometres.getText().clear();
                    }
                }
            }
        });

        litrePer100Kilometres.addTextChangedListener(new TextWatcher() {
            int charCount = 0;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                charCount = count;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (litrePer100Kilometres.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usMilesPerGallon.setText(String.valueOf((Double.parseDouble(s.toString()) * 235.215)));
                        milesPerGallonImperial.setText(String.valueOf(Double.parseDouble(s.toString()) * 282.481));
                        kilometerPerLitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 100));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        usMilesPerGallon.getText().clear();
                        milesPerGallonImperial.getText().clear();
                        kilometerPerLitre.getText().clear();
                    }
                }
            }
        });

        return view;
    }

    private boolean tryParseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}