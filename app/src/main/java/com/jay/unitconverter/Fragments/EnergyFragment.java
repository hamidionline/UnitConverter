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

import java.math.BigDecimal;
import java.math.BigInteger;


public class EnergyFragment extends Fragment {

    public EnergyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_energy, container, false);

        final EditText joule = (EditText) view.findViewById(R.id.input_joule);
        final EditText kilojoule = (EditText) view.findViewById(R.id.input_kilojoule);
        final EditText gramcalorie = (EditText) view.findViewById(R.id.input_gram_calorie);
        final EditText kilocalorie = (EditText) view.findViewById(R.id.input_kilocalorie);
        final EditText watthour = (EditText) view.findViewById(R.id.input_watt_hour);
        final EditText kilowatthour = (EditText) view.findViewById(R.id.input_kilowatt_hour);
        final EditText electronvolt = (EditText) view.findViewById(R.id.input_electronvolt);
        final EditText britishthermalunit = (EditText) view.findViewById(R.id.input_british_thermal_unit);
        final EditText ustherm = (EditText) view.findViewById(R.id.input_us_therm);
        final EditText footpound = (EditText) view.findViewById(R.id.input_foot_pound);

        joule.addTextChangedListener(new TextWatcher() {
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
                if (joule.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        kilojoule.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.001)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.239006));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000239006));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000277778));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00000027778));
                        electronvolt.setText(String.valueOf(Double.parseDouble(s.toString()) * 6242000000000000000L));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000947817));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0000000094804));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.737562));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        kilojoule.getText().clear();
                        gramcalorie.getText().clear();
                        kilocalorie.getText().clear();
                        watthour.getText().clear();
                        kilowatthour.getText().clear();
                        electronvolt.getText().clear();
                        britishthermalunit.getText().clear();
                        ustherm.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        gramcalorie.addTextChangedListener(new TextWatcher() {
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
                if (gramcalorie.isFocused()) {

                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        joule.setText(String.valueOf((Double.parseDouble(s.toString()) * 4.184)));
                        kilojoule.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.004184));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.001));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00116222));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0000011622));
                        BigInteger sBigInteger = new BigInteger(s.toString());
                        BigInteger multiplicant = new BigInteger("26110000000000000000");
                        electronvolt.setText(String.valueOf(sBigInteger.multiply(multiplicant)));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00396567));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000000039666));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 3.08596));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        kilojoule.getText().clear();
                        kilocalorie.getText().clear();
                        watthour.getText().clear();
                        kilowatthour.getText().clear();
                        electronvolt.getText().clear();
                        britishthermalunit.getText().clear();
                        ustherm.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        kilojoule.addTextChangedListener(new TextWatcher() {
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
                if (kilojoule.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        joule.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 239.006));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.239006));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.277778));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00027778));
                        BigInteger sBigInteger = new BigInteger(s.toString());
                        BigInteger multiplicant = new BigInteger("6241999999999999976712");
                        electronvolt.setText(String.valueOf(sBigInteger.multiply(multiplicant)));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.947817));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0000094804));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 737.562));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        gramcalorie.getText().clear();
                        kilocalorie.getText().clear();
                        watthour.getText().clear();
                        kilowatthour.getText().clear();
                        electronvolt.getText().clear();
                        britishthermalunit.getText().clear();
                        ustherm.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        kilocalorie.addTextChangedListener(new TextWatcher() {
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
                if (kilocalorie.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        joule.setText(String.valueOf((Double.parseDouble(s.toString()) * 4184)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        kilojoule.setText(String.valueOf(Double.parseDouble(s.toString()) * 4.184));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.16222));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00116222));
                        BigInteger sBigInteger = new BigInteger(s.toString());
                        BigInteger multiplicant = new BigInteger("26110000000000000000288");
                        electronvolt.setText(String.valueOf(sBigInteger.multiply(multiplicant)));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 3.96567));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000039666));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 3085.96));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        gramcalorie.getText().clear();
                        kilojoule.getText().clear();
                        watthour.getText().clear();
                        kilowatthour.getText().clear();
                        electronvolt.getText().clear();
                        britishthermalunit.getText().clear();
                        ustherm.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        watthour.addTextChangedListener(new TextWatcher() {
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
                if (watthour.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        joule.setText(String.valueOf((Double.parseDouble(s.toString()) * 3600)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 860.421));
                        kilojoule.setText(String.valueOf(Double.parseDouble(s.toString()) * 3.6));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.860421));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.001));
                        BigInteger sBigInteger = new BigInteger(s.toString());
                        BigInteger multiplicant = new BigInteger("22470000000000000000136");
                        electronvolt.setText(String.valueOf(sBigInteger.multiply(multiplicant)));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 3.41214));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00003413));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 2655.22));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        gramcalorie.getText().clear();
                        kilojoule.getText().clear();
                        kilocalorie.getText().clear();
                        kilowatthour.getText().clear();
                        electronvolt.getText().clear();
                        britishthermalunit.getText().clear();
                        ustherm.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        kilowatthour.addTextChangedListener(new TextWatcher() {
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
                if (kilowatthour.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        joule.setText(String.valueOf((Double.parseDouble(s.toString()) * 3600000)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 860421));
                        kilojoule.setText(String.valueOf(Double.parseDouble(s.toString()) * 3600));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 860.421));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        BigInteger sBigInteger = new BigInteger(s.toString());
                        BigInteger multiplicant = new BigInteger("22470000000000004096440496");
                        electronvolt.setText(String.valueOf(sBigInteger.multiply(multiplicant)));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 3412.14));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0341296));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 2655000));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        gramcalorie.getText().clear();
                        kilojoule.getText().clear();
                        kilocalorie.getText().clear();
                        watthour.getText().clear();
                        electronvolt.getText().clear();
                        britishthermalunit.getText().clear();
                        ustherm.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        electronvolt.addTextChangedListener(new TextWatcher() {
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
                if (electronvolt.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        BigDecimal sBigInteger = new BigDecimal(s.toString());
                        BigDecimal multiplicantjoule = new BigDecimal("0.00000000000000000016022");
                        joule.setText(String.valueOf(sBigInteger.multiply(multiplicantjoule)));
                        BigDecimal multiplicantgramcalorie = new BigDecimal("0.000000000000000000038293");
                        gramcalorie.setText(String.valueOf(sBigInteger.multiply(multiplicantgramcalorie)));
                        BigDecimal multiplicantkilojoule = new BigDecimal("0.00000000000000000000016022");
                        kilojoule.setText(String.valueOf(sBigInteger.multiply(multiplicantkilojoule)));
                        BigDecimal multiplicantkilocalorie = new BigDecimal("0.000000000000000000000038293");
                        kilocalorie.setText(String.valueOf(sBigInteger.multiply(multiplicantkilocalorie)));
                        BigDecimal multiplicantwatthour = new BigDecimal("0.000000000000000000000044505");
                        watthour.setText(String.valueOf(sBigInteger.multiply(multiplicantwatthour)));
                        BigDecimal multiplicantkilowatthour = new BigDecimal("0.000000000000000000000000044505");
                        kilowatthour.setText(String.valueOf(sBigInteger.multiply(multiplicantkilowatthour)));
                        BigDecimal multiplicantbritishthermalunit = new BigDecimal("0.00000000000000000000015186");
                        britishthermalunit.setText(String.valueOf(sBigInteger.multiply(multiplicantbritishthermalunit)));
                        BigDecimal multiplicantustherm = new BigDecimal("0.0000000000000000000000000015189");
                        ustherm.setText(String.valueOf(sBigInteger.multiply(multiplicantustherm)));
                        BigDecimal multiplicantfootpound = new BigDecimal("0.00000000000000000011817");
                        footpound.setText(String.valueOf(sBigInteger.multiply(multiplicantfootpound)));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        gramcalorie.getText().clear();
                        kilojoule.getText().clear();
                        kilocalorie.getText().clear();
                        watthour.getText().clear();
                        kilowatthour.getText().clear();
                        britishthermalunit.getText().clear();
                        ustherm.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        britishthermalunit.addTextChangedListener(new TextWatcher() {
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
                if (britishthermalunit.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        joule.setText(String.valueOf((Double.parseDouble(s.toString()) * 1055.06)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 252.164));
                        kilojoule.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.05506));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.252164));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.293071));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000293071));
                        BigInteger sBigInteger = new BigInteger(s.toString());
                        BigInteger multiplicant = new BigInteger("6585000000000000000856");
                        electronvolt.setText(String.valueOf(sBigInteger.multiply(multiplicant)));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000010002));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 778.169));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        gramcalorie.getText().clear();
                        kilojoule.getText().clear();
                        kilocalorie.getText().clear();
                        watthour.getText().clear();
                        kilowatthour.getText().clear();
                        electronvolt.getText().clear();
                        ustherm.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        ustherm.addTextChangedListener(new TextWatcher() {
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
                if (ustherm.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        joule.setText(String.valueOf((Double.parseDouble(s.toString()) * 105500000)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 25210000));
                        kilojoule.setText(String.valueOf(Double.parseDouble(s.toString()) * 105480));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 25210.4));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 29300.1));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 29.3001));
                        BigInteger sBigInteger = new BigInteger(s.toString());
                        BigInteger multiplicant = new BigInteger("658400000000000128072472696");
                        electronvolt.setText(String.valueOf(sBigInteger.multiply(multiplicant)));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 99976.1));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 77800000));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        gramcalorie.getText().clear();
                        kilojoule.getText().clear();
                        kilocalorie.getText().clear();
                        watthour.getText().clear();
                        kilowatthour.getText().clear();
                        electronvolt.getText().clear();
                        britishthermalunit.getText().clear();
                        footpound.getText().clear();
                    }
                }
            }
        });

        footpound.addTextChangedListener(new TextWatcher() {
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
                if (footpound.isFocused()) {
                    if (!s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        joule.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.35582)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.324048));
                        kilojoule.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00135582));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000324048));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000376616));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00000037662));
                        BigInteger sBigInteger = new BigInteger(s.toString());
                        BigInteger multiplicant = new BigInteger("8462000000000000000");
                        electronvolt.setText(String.valueOf(sBigInteger.multiply(multiplicant)));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00128507));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000000012854));
                    } else if (s.toString().trim().isEmpty() || s.toString().trim().charAt(s.length() - 1) != '.') {
                        joule.getText().clear();
                        gramcalorie.getText().clear();
                        kilojoule.getText().clear();
                        kilocalorie.getText().clear();
                        watthour.getText().clear();
                        kilowatthour.getText().clear();
                        electronvolt.getText().clear();
                        britishthermalunit.getText().clear();
                        ustherm.getText().clear();
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