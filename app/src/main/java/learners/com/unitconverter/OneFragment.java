package learners.com.unitconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class OneFragment extends Fragment{

    public OneFragment() {
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
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        final EditText squarekilometre = (EditText) view.findViewById(R.id.input_square_kilometer);
        final EditText squaremetre = (EditText) view.findViewById(R.id.input_square_metre);
        final EditText squaremile = (EditText) view.findViewById(R.id.input_square_mile);
        final EditText squareyard = (EditText) view.findViewById(R.id.input_square_yard);
        final EditText squarefoot = (EditText) view.findViewById(R.id.input_square_foot);
        final EditText squareinch = (EditText) view.findViewById(R.id.input_square_inch);
        final EditText hectare = (EditText) view.findViewById(R.id.input_hectare);
        final EditText acre = (EditText) view.findViewById(R.id.input_acre);

        squarekilometre.addTextChangedListener(new TextWatcher() {
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
                if (squarekilometre.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        squaremetre.setText(String.valueOf((Double.parseDouble(s.toString()) * 1000000)));
                        squaremile.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.38610));
                        squareyard.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.00000083612736));
                        squarefoot.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.00000009290304));
                        squareinch.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.00000000064516));
                        hectare.setText(String.valueOf(Double.parseDouble(s.toString()) * 100));
                        acre.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.00404685642));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        squaremetre.getText().clear();
                        squaremile.getText().clear();
                        squareyard.getText().clear();
                        squarefoot.getText().clear();
                        squareinch.getText().clear();
                        hectare.getText().clear();
                        acre.getText().clear();
                    }
                }
            }
        });

        squaremetre.addTextChangedListener(new TextWatcher() {
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
                if (squaremetre.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        squarekilometre.setText(String.valueOf((Double.parseDouble(s.toString()) / 1000000)));
                        squaremile.setText(String.valueOf(Double.parseDouble(s.toString()) / 2589988.11));
                        squareyard.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.83612736));
                        squarefoot.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.09290304));
                        squareinch.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.00064516));
                        hectare.setText(String.valueOf(Double.parseDouble(s.toString()) / 10000));
                        acre.setText(String.valueOf(Double.parseDouble(s.toString()) / 4046.85642));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        squarekilometre.getText().clear();
                        squaremile.getText().clear();
                        squareyard.getText().clear();
                        squarefoot.getText().clear();
                        squareinch.getText().clear();
                        hectare.getText().clear();
                        acre.getText().clear();
                    }
                }
            }
        });

        squaremile.addTextChangedListener(new TextWatcher() {
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
                if (squaremile.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        squarekilometre.setText(String.valueOf((Double.parseDouble(s.toString()) * 2.58998811)));
                        squaremetre.setText(String.valueOf(Double.parseDouble(s.toString()) * 2589988.11));
                        squareyard.setText(String.valueOf(Double.parseDouble(s.toString()) * 3097600));
                        squarefoot.setText(String.valueOf(Double.parseDouble(s.toString()) * 27878400));
                        squareinch.setText(String.valueOf(Double.parseDouble(s.toString()) * 4014489600L));
                        hectare.setText(String.valueOf(Double.parseDouble(s.toString()) * 258.998811));
                        acre.setText(String.valueOf(Double.parseDouble(s.toString()) * 640));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        squarekilometre.getText().clear();
                        squaremetre.getText().clear();
                        squareyard.getText().clear();
                        squarefoot.getText().clear();
                        squareinch.getText().clear();
                        hectare.getText().clear();
                        acre.getText().clear();
                    }
                }
            }
        });

        squareyard.addTextChangedListener(new TextWatcher() {
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
                if (squareyard.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        squarekilometre.setText(String.valueOf((Double.parseDouble(s.toString()) * 2.58998811)));
                        squaremetre.setText(String.valueOf(Double.parseDouble(s.toString()) * 2589988.11));
                        squaremile.setText(String.valueOf(Double.parseDouble(s.toString()) * 3097600));
                        squarefoot.setText(String.valueOf(Double.parseDouble(s.toString()) * 27878400));
                        squareinch.setText(String.valueOf(Double.parseDouble(s.toString()) * 4014489600L));
                        hectare.setText(String.valueOf(Double.parseDouble(s.toString()) * 258.998811));
                        acre.setText(String.valueOf(Double.parseDouble(s.toString()) * 640));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        squarekilometre.getText().clear();
                        squaremetre.getText().clear();
                        squaremile.getText().clear();
                        squarefoot.getText().clear();
                        squareinch.getText().clear();
                        hectare.getText().clear();
                        acre.getText().clear();
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
