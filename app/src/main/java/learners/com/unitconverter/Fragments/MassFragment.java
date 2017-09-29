package learners.com.unitconverter.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import learners.com.unitconverter.R;

public class MassFragment extends Fragment {

    public MassFragment() {
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
        View view = inflater.inflate(R.layout.fragment_mass, container, false);

        final EditText tonne = (EditText) view.findViewById(R.id.input_tonne);
        final EditText kilogram = (EditText) view.findViewById(R.id.input_kilogram);
        final EditText gram = (EditText) view.findViewById(R.id.input_gram);
        final EditText miligram = (EditText) view.findViewById(R.id.input_milligram);
        final EditText microgram = (EditText) view.findViewById(R.id.input_microgram);
        final EditText imperialton = (EditText) view.findViewById(R.id.input_imperial_ton);
        final EditText stone = (EditText) view.findViewById(R.id.input_stone);
        final EditText pound = (EditText) view.findViewById(R.id.input_pound);
        final EditText ounce = (EditText) view.findViewById(R.id.input_ounce);

        tonne.addTextChangedListener(new TextWatcher() {
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
                if (tonne.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        kilogram.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000)));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000000));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000000000L));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.984207));
                        stone.setText(String.valueOf(Double.parseDouble(s.toString()) * 157.473));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 2204.62));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 35274));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        kilogram.getText().clear();
                        gram.getText().clear();
                        miligram.getText().clear();
                        microgram.getText().clear();
                        imperialton.getText().clear();
                        stone.getText().clear();
                        pound.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        kilogram.addTextChangedListener(new TextWatcher() {
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
                if (kilogram.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.001)));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000000));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000984207));
                        stone.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.157473));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 2.20462));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 35.274));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        gram.getText().clear();
                        miligram.getText().clear();
                        microgram.getText().clear();
                        imperialton.getText().clear();
                        stone.getText().clear();
                        pound.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        gram.addTextChangedListener(new TextWatcher() {
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
                if (gram.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.000001)));
                        kilogram.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.001));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000000));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00000098421));
                        stone.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000157473));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00220462));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.035274));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        kilogram.getText().clear();
                        miligram.getText().clear();
                        microgram.getText().clear();
                        imperialton.getText().clear();
                        stone.getText().clear();
                        pound.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        miligram.addTextChangedListener(new TextWatcher() {
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
                if (miligram.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.000000001)));
                        kilogram.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000001));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.001));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00000000098421));
                        stone.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00000015747));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0000022046));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000035274));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        kilogram.getText().clear();
                        gram.getText().clear();
                        microgram.getText().clear();
                        imperialton.getText().clear();
                        stone.getText().clear();
                        pound.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        microgram.addTextChangedListener(new TextWatcher() {
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
                if (microgram.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.000000000001)));
                        kilogram.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000000001));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000001));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.001));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00000000000098421));
                        stone.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00000000015747));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0000000022046));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000000035274));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        kilogram.getText().clear();
                        gram.getText().clear();
                        miligram.getText().clear();
                        imperialton.getText().clear();
                        stone.getText().clear();
                        pound.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        imperialton.addTextChangedListener(new TextWatcher() {
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
                if (imperialton.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.01605)));
                        kilogram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1016.05));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1016000));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1016000000));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1016000000000L));
                        stone.setText(String.valueOf(Double.parseDouble(s.toString()) * 160));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 2240));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 35840));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        kilogram.getText().clear();
                        gram.getText().clear();
                        miligram.getText().clear();
                        microgram.getText().clear();
                        stone.getText().clear();
                        pound.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        stone.addTextChangedListener(new TextWatcher() {
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
                if (stone.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.01605)));
                        kilogram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1016.05));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1016000));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1016000000));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 1016000000000L));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 160));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 2240));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 35840));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        kilogram.getText().clear();
                        gram.getText().clear();
                        miligram.getText().clear();
                        microgram.getText().clear();
                        imperialton.getText().clear();
                        pound.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        stone.addTextChangedListener(new TextWatcher() {
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
                if (stone.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.00635029)));
                        kilogram.setText(String.valueOf(Double.parseDouble(s.toString()) * 6.35029));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 6350.29));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 6350000));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 6350000000L));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00625));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 14));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 224));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        kilogram.getText().clear();
                        gram.getText().clear();
                        miligram.getText().clear();
                        microgram.getText().clear();
                        imperialton.getText().clear();
                        pound.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        pound.addTextChangedListener(new TextWatcher() {
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
                if (pound.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.000453592)));
                        kilogram.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.453592));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 453.592));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 453592));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 453600000));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000446429));
                        stone.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0714286));
                        ounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 16));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        kilogram.getText().clear();
                        gram.getText().clear();
                        miligram.getText().clear();
                        microgram.getText().clear();
                        imperialton.getText().clear();
                        stone.getText().clear();
                        ounce.getText().clear();
                    }
                }
            }
        });

        ounce.addTextChangedListener(new TextWatcher() {
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
                if (ounce.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        tonne.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.00002835)));
                        kilogram.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0283495));
                        gram.setText(String.valueOf(Double.parseDouble(s.toString()) * 28.3495));
                        miligram.setText(String.valueOf(Double.parseDouble(s.toString()) * 28349.5));
                        microgram.setText(String.valueOf(Double.parseDouble(s.toString()) * 28350000));
                        imperialton.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000027902));
                        stone.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00446429));
                        pound.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0625));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        tonne.getText().clear();
                        kilogram.getText().clear();
                        gram.getText().clear();
                        miligram.getText().clear();
                        microgram.getText().clear();
                        imperialton.getText().clear();
                        stone.getText().clear();
                        pound.getText().clear();
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
