package learners.com.unitconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class FuelEconomyFragment extends Fragment {

    public FuelEconomyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fuel_economy, container, false);

        final EditText usmilespergallon = (EditText) view.findViewById(R.id.input_us_miles_per_gallon);
        final EditText milespergallonimperial = (EditText) view.findViewById(R.id.input_miles_per_gallon_imperial);
        final EditText kilometerperlitre = (EditText) view.findViewById(R.id.input_kilometer_per_litre);
        final EditText litreper100kilometres = (EditText) view.findViewById(R.id.input_litre_per_100_kilometres);

        usmilespergallon.addTextChangedListener(new TextWatcher() {
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
                if (usmilespergallon.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        milespergallonimperial.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.20095)));
                        kilometerperlitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.425144));
                        litreper100kilometres.setText(String.valueOf(Double.parseDouble(s.toString()) * 235.215));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        milespergallonimperial.getText().clear();
                        kilometerperlitre.getText().clear();
                        litreper100kilometres.getText().clear();
                    }
                }
            }
        });

        milespergallonimperial.addTextChangedListener(new TextWatcher() {
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
                if (milespergallonimperial.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usmilespergallon.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.832674)));
                        kilometerperlitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.354006));
                        litreper100kilometres.setText(String.valueOf(Double.parseDouble(s.toString()) * 282.481));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usmilespergallon.getText().clear();
                        kilometerperlitre.getText().clear();
                        litreper100kilometres.getText().clear();
                    }
                }
            }
        });

        kilometerperlitre.addTextChangedListener(new TextWatcher() {
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
                if (kilometerperlitre.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usmilespergallon.setText(String.valueOf((Double.parseDouble(s.toString()) * 2.35215)));
                        milespergallonimperial.setText(String.valueOf(Double.parseDouble(s.toString()) * 2.82481));
                        litreper100kilometres.setText(String.valueOf(Double.parseDouble(s.toString()) * 100));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usmilespergallon.getText().clear();
                        milespergallonimperial.getText().clear();
                        litreper100kilometres.getText().clear();
                    }
                }
            }
        });

        litreper100kilometres.addTextChangedListener(new TextWatcher() {
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
                if (litreper100kilometres.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usmilespergallon.setText(String.valueOf((Double.parseDouble(s.toString()) * 235.215)));
                        milespergallonimperial.setText(String.valueOf(Double.parseDouble(s.toString()) * 282.481));
                        kilometerperlitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 100));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usmilespergallon.getText().clear();
                        milespergallonimperial.getText().clear();
                        kilometerperlitre.getText().clear();
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
