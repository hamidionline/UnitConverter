package learners.com.unitconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class TwoFragment extends Fragment{

    public TwoFragment() {
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
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        final EditText bitpersecond = (EditText) view.findViewById(R.id.input_bit_per_second);
        final EditText kilobitpersecond = (EditText) view.findViewById(R.id.input_kilobit_per_second);
        final EditText kilobytepersecond = (EditText) view.findViewById(R.id.input_kilobyte_per_second);
        final EditText kibibitpersecond = (EditText) view.findViewById(R.id.input_kibibit_per_second);
        final EditText megabitpersecond = (EditText) view.findViewById(R.id.input_megabit_per_second);
        final EditText megabytepersecond = (EditText) view.findViewById(R.id.input_megabyte_per_second);
        final EditText mebibitpersecond = (EditText) view.findViewById(R.id.input_mebibit_per_second);
        final EditText gigabitpersecond = (EditText) view.findViewById(R.id.input_gigabit_per_second);
        final EditText gigabytepersecond = (EditText) view.findViewById(R.id.input_gigabyte_per_second);
        final EditText gibibitpersecond = (EditText) view.findViewById(R.id.input_gibibit_per_second);
        final EditText terabitpersecond = (EditText) view.findViewById(R.id.input_terabit_per_second);
        final EditText terabytepersecond = (EditText) view.findViewById(R.id.input_terabyte_per_second);
        final EditText tebibitpersecond = (EditText) view.findViewById(R.id.input_tebibit_per_second);

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
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        kilobitpersecond.setText(String.valueOf((Double.parseDouble(s.toString()) / 1000)));
                        kilobytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000));
                        //kibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 258.998811));
                        megabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000));
                        megabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000));
                        //mebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.000000064516));
                        gigabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000));
                        gigabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000000L));
                        //gibibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                        terabitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000000000000L));
                        terabytepersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 8000000000000L));
                        //tebibitpersecond.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.404685642));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        kilobitpersecond.getText().clear();
                        kilobytepersecond.getText().clear();
                        kibibitpersecond.getText().clear();
                        megabitpersecond.getText().clear();
                        megabytepersecond.getText().clear();
                        mebibitpersecond.getText().clear();
                        gigabitpersecond.getText().clear();
                        gigabytepersecond.getText().clear();
                        gibibitpersecond.getText().clear();
                        terabitpersecond.getText().clear();
                        terabytepersecond.getText().clear();
                        tebibitpersecond.getText().clear();
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
