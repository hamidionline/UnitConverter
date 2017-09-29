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


public class PlaneAngleFragment extends Fragment {

    public PlaneAngleFragment() {
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
        View view = inflater.inflate(R.layout.fragment_plane_angle, container, false);

//        final EditText angularmill = (EditText) view.findViewById(R.id.input_angular_mill);
        final EditText degree = (EditText) view.findViewById(R.id.input_degree);
        final EditText gradian = (EditText) view.findViewById(R.id.input_gradian);
        final EditText minuteofarc = (EditText) view.findViewById(R.id.input_minute_of_arc);
        final EditText radian = (EditText) view.findViewById(R.id.input_radian);
        final EditText secondofarc = (EditText) view.findViewById(R.id.input_second_of_arc);

        degree.addTextChangedListener(new TextWatcher() {
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
                if (degree.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        gradian.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.11111));
                        minuteofarc.setText(String.valueOf(Double.parseDouble(s.toString()) * 60));
                        radian.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0174533));
                        secondofarc.setText(String.valueOf(Double.parseDouble(s.toString()) * 3600));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        gradian.getText().clear();
                        minuteofarc.getText().clear();
                        radian.getText().clear();
                        secondofarc.getText().clear();
                    }
                }
            }
        });

        gradian.addTextChangedListener(new TextWatcher() {
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
                if (gradian.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        degree.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.9));
                        minuteofarc.setText(String.valueOf(Double.parseDouble(s.toString()) * 54));
                        radian.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.015708));
                        secondofarc.setText(String.valueOf(Double.parseDouble(s.toString()) * 3240));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        degree.getText().clear();
                        minuteofarc.getText().clear();
                        radian.getText().clear();
                        secondofarc.getText().clear();
                    }
                }
            }
        });

        minuteofarc.addTextChangedListener(new TextWatcher() {
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
                if (minuteofarc.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        degree.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0166667));
                        gradian.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0185185));
                        radian.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000290888));
                        secondofarc.setText(String.valueOf(Double.parseDouble(s.toString()) * 60));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        degree.getText().clear();
                        gradian.getText().clear();
                        radian.getText().clear();
                        secondofarc.getText().clear();
                    }
                }
            }
        });

        radian.addTextChangedListener(new TextWatcher() {
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
                if (radian.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        degree.setText(String.valueOf(Double.parseDouble(s.toString()) * 57.2958));
                        gradian.setText(String.valueOf(Double.parseDouble(s.toString()) * 63.662));
                        minuteofarc.setText(String.valueOf(Double.parseDouble(s.toString()) * 3437.75));
                        secondofarc.setText(String.valueOf(Double.parseDouble(s.toString()) * 206265));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        degree.getText().clear();
                        gradian.getText().clear();
                        minuteofarc.getText().clear();
                        secondofarc.getText().clear();
                    }
                }
            }
        });

        secondofarc.addTextChangedListener(new TextWatcher() {
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
                if (secondofarc.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        degree.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000277778));
                        gradian.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000308642));
                        minuteofarc.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0166667));
                        radian.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0000048481));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        degree.getText().clear();
                        gradian.getText().clear();
                        minuteofarc.getText().clear();
                        radian.getText().clear();
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
