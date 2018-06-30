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


public class DataTransferRateFragment extends Fragment {

    public DataTransferRateFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data_transfer_rate, container, false);

        final EditText bitPerSecond = view.findViewById(R.id.input_bit_per_second);
        final EditText kiloBitPerSecond = view.findViewById(R.id.input_kilobit_per_second);
        final EditText kiloBytePerSecond = view.findViewById(R.id.input_kilobyte_per_second);
//        final EditText kibibitpersecond = view.findViewById(R.id.input_kibibit_per_second);
        final EditText megaBitPerSecond = view.findViewById(R.id.input_megabit_per_second);
        final EditText megaBytePerSecond = view.findViewById(R.id.input_megabyte_per_second);
//        final EditText mebibitpersecond = view.findViewById(R.id.input_mebibit_per_second);
        final EditText gigaBitPerSecond = view.findViewById(R.id.input_gigabit_per_second);
        final EditText gigaBytePerSecond = view.findViewById(R.id.input_gigabyte_per_second);
//        final EditText gibibitpersecond = view.findViewById(R.id.input_gibibit_per_second);
        final EditText teraBitPerSecond = view.findViewById(R.id.input_terabit_per_second);
        final EditText teraBytePerSecond = view.findViewById(R.id.input_terabyte_per_second);
//        final EditText tebibitpersecond = view.findViewById(R.id.input_tebibit_per_second);

        bitPerSecond.addTextChangedListener(new TextWatcher() {
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
                if (bitPerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        kiloBitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) / 1000)));
                        kiloBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        megaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
                        megaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000));
                        gigaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000000L));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        teraBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000000L));
                        teraBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000000000L));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        kiloBitPerSecond.getText().clear();
                        kiloBytePerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        megaBitPerSecond.getText().clear();
                        megaBytePerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigaBitPerSecond.getText().clear();
                        gigaBytePerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        teraBitPerSecond.getText().clear();
                        teraBytePerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        kiloBitPerSecond.addTextChangedListener(new TextWatcher() {
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
                if (kiloBitPerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000)));
                        kiloBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        megaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
                        megaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
                        gigaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        teraBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000));
                        teraBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000000L));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitPerSecond.getText().clear();
                        kiloBytePerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        megaBitPerSecond.getText().clear();
                        megaBytePerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigaBitPerSecond.getText().clear();
                        gigaBytePerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        teraBitPerSecond.getText().clear();
                        teraBytePerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        kiloBytePerSecond.addTextChangedListener(new TextWatcher() {
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
                if (kiloBytePerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 8000)));
                        kiloBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        megaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 125));
                        megaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000008));
                        gigaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        teraBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000000008));
                        teraBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitPerSecond.getText().clear();
                        kiloBitPerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        megaBitPerSecond.getText().clear();
                        megaBytePerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigaBitPerSecond.getText().clear();
                        gigaBytePerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        teraBitPerSecond.getText().clear();
                        teraBytePerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        megaBitPerSecond.addTextChangedListener(new TextWatcher() {
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
                if (megaBitPerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000000)));
                        kiloBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kiloBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 125));
                        megaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
                        gigaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        teraBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
                        teraBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitPerSecond.getText().clear();
                        kiloBitPerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kiloBytePerSecond.getText().clear();
                        megaBytePerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigaBitPerSecond.getText().clear();
                        gigaBytePerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        teraBitPerSecond.getText().clear();
                        teraBytePerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        megaBytePerSecond.addTextChangedListener(new TextWatcher() {
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
                if (megaBytePerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 8000000)));
                        kiloBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kiloBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        megaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.008));
                        gigaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        teraBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000008));
                        teraBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitPerSecond.getText().clear();
                        kiloBitPerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kiloBytePerSecond.getText().clear();
                        megaBitPerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigaBitPerSecond.getText().clear();
                        gigaBytePerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        teraBitPerSecond.getText().clear();
                        teraBytePerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        gigaBitPerSecond.addTextChangedListener(new TextWatcher() {
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
                if (gigaBitPerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000000000)));
                        kiloBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kiloBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000008));
                        megaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        megaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.008));
                        gigaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        teraBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
                        teraBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitPerSecond.getText().clear();
                        kiloBitPerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kiloBytePerSecond.getText().clear();
                        megaBitPerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        megaBytePerSecond.getText().clear();
                        gigaBytePerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        teraBitPerSecond.getText().clear();
                        teraBytePerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        gigaBytePerSecond.addTextChangedListener(new TextWatcher() {
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
                if (gigaBytePerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 8000000000L)));
                        kiloBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kiloBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
                        megaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        megaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        gigaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        teraBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.008));
                        teraBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitPerSecond.getText().clear();
                        kiloBitPerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kiloBytePerSecond.getText().clear();
                        megaBitPerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        megaBytePerSecond.getText().clear();
                        gigaBitPerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        teraBitPerSecond.getText().clear();
                        teraBytePerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        teraBitPerSecond.addTextChangedListener(new TextWatcher() {
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
                if (teraBitPerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000000000000L)));
                        kiloBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kiloBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000008));
                        megaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        megaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000008));
                        gigaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        gigaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.008));
                        teraBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitPerSecond.getText().clear();
                        kiloBitPerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kiloBytePerSecond.getText().clear();
                        megaBitPerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        megaBytePerSecond.getText().clear();
                        gigaBitPerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        gigaBytePerSecond.getText().clear();
                        teraBytePerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        teraBytePerSecond.addTextChangedListener(new TextWatcher() {
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
                if (teraBytePerSecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitPerSecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 8000000000000L)));
                        kiloBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000000000L));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kiloBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000000));
                        megaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        megaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
                        gigaBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        gigaBytePerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        teraBitPerSecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitPerSecond.getText().clear();
                        kiloBitPerSecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kiloBytePerSecond.getText().clear();
                        megaBitPerSecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        megaBytePerSecond.getText().clear();
                        gigaBitPerSecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        gigaBytePerSecond.getText().clear();
                        teraBitPerSecond.getText().clear();
//                        tebibitpersecond.getText().clear();
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