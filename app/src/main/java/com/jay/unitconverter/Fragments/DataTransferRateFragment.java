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

        final EditText bitpersecond = (EditText) view.findViewById(R.id.input_bit_per_second);
        final EditText kilobitpersecond = (EditText) view.findViewById(R.id.input_kilobit_per_second);
        final EditText kilobytepersecond = (EditText) view.findViewById(R.id.input_kilobyte_per_second);
//        final EditText kibibitpersecond = (EditText) view.findViewById(R.id.input_kibibit_per_second);
        final EditText megabitpersecond = (EditText) view.findViewById(R.id.input_megabit_per_second);
        final EditText megabytepersecond = (EditText) view.findViewById(R.id.input_megabyte_per_second);
//        final EditText mebibitpersecond = (EditText) view.findViewById(R.id.input_mebibit_per_second);
        final EditText gigabitpersecond = (EditText) view.findViewById(R.id.input_gigabit_per_second);
        final EditText gigabytepersecond = (EditText) view.findViewById(R.id.input_gigabyte_per_second);
//        final EditText gibibitpersecond = (EditText) view.findViewById(R.id.input_gibibit_per_second);
        final EditText terabitpersecond = (EditText) view.findViewById(R.id.input_terabit_per_second);
        final EditText terabytepersecond = (EditText) view.findViewById(R.id.input_terabyte_per_second);
//        final EditText tebibitpersecond = (EditText) view.findViewById(R.id.input_tebibit_per_second);

        bitpersecond.addTextChangedListener(new TextWatcher() {
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
                if (bitpersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        kilobitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) / 1000)));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000000L));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000000L));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000000000L));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        kilobitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        megabitpersecond.getText().clear();
                        megabytepersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigabitpersecond.getText().clear();
                        gigabytepersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        terabitpersecond.getText().clear();
                        terabytepersecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        kilobitpersecond.addTextChangedListener(new TextWatcher() {
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
                if (kilobitpersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000)));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000000L));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        megabitpersecond.getText().clear();
                        megabytepersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigabitpersecond.getText().clear();
                        gigabytepersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        terabitpersecond.getText().clear();
                        terabytepersecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        kilobytepersecond.addTextChangedListener(new TextWatcher() {
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
                if (kilobytepersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 8000)));
                        kilobitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 125));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000008));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000000008));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitpersecond.getText().clear();
                        kilobitpersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        megabitpersecond.getText().clear();
                        megabytepersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigabitpersecond.getText().clear();
                        gigabytepersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        terabitpersecond.getText().clear();
                        terabytepersecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        megabitpersecond.addTextChangedListener(new TextWatcher() {
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
                if (megabitpersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000000)));
                        kilobitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 125));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitpersecond.getText().clear();
                        kilobitpersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
                        megabytepersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigabitpersecond.getText().clear();
                        gigabytepersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        terabitpersecond.getText().clear();
                        terabytepersecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        megabytepersecond.addTextChangedListener(new TextWatcher() {
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
                if (megabytepersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 8000000)));
                        kilobitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.008));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000008));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitpersecond.getText().clear();
                        kilobitpersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
                        megabitpersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        gigabitpersecond.getText().clear();
                        gigabytepersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        terabitpersecond.getText().clear();
                        terabytepersecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        gigabitpersecond.addTextChangedListener(new TextWatcher() {
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
                if (gigabitpersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000000000)));
                        kilobitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000008));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.008));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitpersecond.getText().clear();
                        kilobitpersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
                        megabitpersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        megabytepersecond.getText().clear();
                        gigabytepersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        terabitpersecond.getText().clear();
                        terabytepersecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        gigabytepersecond.addTextChangedListener(new TextWatcher() {
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
                if (gigabytepersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 8000000000L)));
                        kilobitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.008));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitpersecond.getText().clear();
                        kilobitpersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
                        megabitpersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        megabytepersecond.getText().clear();
                        gigabitpersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        terabitpersecond.getText().clear();
                        terabytepersecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        terabitpersecond.addTextChangedListener(new TextWatcher() {
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
                if (terabitpersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000000000000L)));
                        kilobitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000000));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000008));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000008));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.008));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitpersecond.getText().clear();
                        kilobitpersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
                        megabitpersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        megabytepersecond.getText().clear();
                        gigabitpersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        gigabytepersecond.getText().clear();
                        terabytepersecond.getText().clear();
//                        tebibitpersecond.getText().clear();
                    }
                }
            }
        });

        terabytepersecond.addTextChangedListener(new TextWatcher() {
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
                if (terabytepersecond.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) * 8000000000000L)));
                        kilobitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000000000L));
//                        kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000000));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000000));
//                        mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8000));
//                        gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
//                        tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        bitpersecond.getText().clear();
                        kilobitpersecond.getText().clear();
//                        kibibitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
                        megabitpersecond.getText().clear();
//                        mebibitpersecond.getText().clear();
                        megabytepersecond.getText().clear();
                        gigabitpersecond.getText().clear();
//                        gibibitpersecond.getText().clear();
                        gigabytepersecond.getText().clear();
                        terabitpersecond.getText().clear();
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