package learners.com.unitconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        kilojoule.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.001)));
                        gramcalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.239006));
                        kilocalorie.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000239006));
                        watthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000277778));
                        kilowatthour.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00000027778));
                        electronvolt.setText(String.valueOf(Double.parseDouble(s.toString()) * 6242000000000000000L));
                        britishthermalunit.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.000947817));
                        ustherm.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.0000000094804));
                        footpound.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.737562));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
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

                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
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
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
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
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
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
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
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
