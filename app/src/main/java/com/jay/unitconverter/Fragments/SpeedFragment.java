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


/**
 * A simple {@link Fragment} subclass.
 */
public class SpeedFragment extends Fragment {


    public SpeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_speed, container, false);

        final EditText milesperhour = (EditText) view.findViewById(R.id.input_miles_per_hour);
        final EditText footpersecond = (EditText) view.findViewById(R.id.input_foot_per_second);
        final EditText metrepersecond = (EditText) view.findViewById(R.id.input_metre_per_second);
        final EditText kilometrepersecond = (EditText) view.findViewById(R.id.input_kilometre_per_second);
        final EditText knot = (EditText) view.findViewById(R.id.input_knot);

        milesperhour.addTextChangedListener(new TextWatcher() {
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
                if (milesperhour.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        footpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.46667)));
                        metrepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.44704));
                        kilometrepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.60934));
                        knot.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.868976));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        footpersecond.getText().clear();
                        metrepersecond.getText().clear();
                        kilometrepersecond.getText().clear();
                        knot.getText().clear();
                    }
                }
            }
        });

        footpersecond.addTextChangedListener(new TextWatcher() {
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
                if (footpersecond.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        milesperhour.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.681818)));
                        metrepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.3048));
                        kilometrepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.09728));
                        knot.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.592484));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        milesperhour.getText().clear();
                        metrepersecond.getText().clear();
                        kilometrepersecond.getText().clear();
                        knot.getText().clear();
                    }
                }
            }
        });

        metrepersecond.addTextChangedListener(new TextWatcher() {
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
                if (metrepersecond.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        milesperhour.setText(String.valueOf((Double.parseDouble(s.toString()) * 2.23694)));
                        footpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 3.28084));
                        kilometrepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 3.6));
                        knot.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.94384));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        milesperhour.getText().clear();
                        footpersecond.getText().clear();
                        kilometrepersecond.getText().clear();
                        knot.getText().clear();
                    }
                }
            }
        });

        kilometrepersecond.addTextChangedListener(new TextWatcher() {
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
                if (kilometrepersecond.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        milesperhour.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.621371)));
                        footpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.911344));
                        metrepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.277778));
                        knot.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.539957));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        milesperhour.getText().clear();
                        footpersecond.getText().clear();
                        metrepersecond.getText().clear();
                        knot.getText().clear();
                    }
                }
            }
        });

        knot.addTextChangedListener(new TextWatcher() {
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
                if (knot.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        milesperhour.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.15078)));
                        footpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.68781));
                        metrepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.514444));
                        kilometrepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.852));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        milesperhour.getText().clear();
                        footpersecond.getText().clear();
                        metrepersecond.getText().clear();
                        kilometrepersecond.getText().clear();
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
