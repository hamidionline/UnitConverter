package learners.com.unitconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class DigitalStorageFragment extends Fragment {

    public DigitalStorageFragment() {
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
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        final EditText bit = (EditText) view.findViewById(R.id.input_bit);
        final EditText kilobit = (EditText) view.findViewById(R.id.input_kilobit);
        //EditText kibibit = (EditText) view.findViewById(R.id.input_kibibit);
        final EditText megabit = (EditText) view.findViewById(R.id.input_megabit);
        //EditText mebibit = (EditText) view.findViewById(R.id.input_mebibit);
        final EditText gigabit = (EditText) view.findViewById(R.id.input_gigabit);
        //EditText gibibit = (EditText) view.findViewById(R.id.input_gibibit);
        final EditText terabit = (EditText) view.findViewById(R.id.input_terabit);
        //EditText tebibit = (EditText) view.findViewById(R.id.input_tebibit);
        final EditText petabit = (EditText) view.findViewById(R.id.input_petabit);
        //EditText pebibit = (EditText) view.findViewById(R.id.input_pebibit);
        final EditText bytes = (EditText) view.findViewById(R.id.input_byte);
        final EditText kilobyte = (EditText) view.findViewById(R.id.input_kilobyte);
        //EditText kibibyte = (EditText) view.findViewById(R.id.input_kibibyte);
        final EditText megabyte = (EditText) view.findViewById(R.id.input_megabyte);
        //EditText mebibyte = (EditText) view.findViewById(R.id.input_mebibyte);
        final EditText gigabyte = (EditText) view.findViewById(R.id.input_gigabyte);
        //EditText gibibyte = (EditText) view.findViewById(R.id.input_gibibyte);
        final EditText terabyte = (EditText) view.findViewById(R.id.input_terabyte);
        //EditText tebibyte = (EditText) view.findViewById(R.id.input_tebibyte);
        final EditText petabyte = (EditText) view.findViewById(R.id.input_petabyte);
        //EditText pebibyte = (EditText) view.findViewById(R.id.input_pebibyte);

        bit.addTextChangedListener(new TextWatcher() {
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
                if (bit.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        kilobit.setText(String.valueOf((Double.parseDouble(s.toString()) / 1024)));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1048576));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1073741824));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1099511627776L));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1125899906842620L));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
                        kilobyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8192));
                        megabyte.setText(String.valueOf((Double.parseDouble(s.toString()) / 8388608)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8589934592L));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8796093022208L));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 9007199254740990L));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        kilobit.addTextChangedListener(new TextWatcher() {
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
                if (kilobit.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 1024)));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1024));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1048576));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1073741824));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1099511627776L));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 128));
                        kilobyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
                        megabyte.setText(String.valueOf((Double.parseDouble(s.toString()) / 8192)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8388608));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8589934592L));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8796093022208L));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        megabit.addTextChangedListener(new TextWatcher() {
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
                if (megabit.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 1048576)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1024));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1024));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1048576));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1073741824));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 131072));
                        kilobyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 128));
                        megabyte.setText(String.valueOf((Double.parseDouble(s.toString()) / 8)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8192));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8388608));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8589934592L));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        gigabit.addTextChangedListener(new TextWatcher() {
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
                if (gigabit.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 1073741824)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1048576));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1024));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1024));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1048576));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 134217728));
                        kilobyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 131072));
                        megabyte.setText(String.valueOf((Double.parseDouble(s.toString()) * 128)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8192));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8388608));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        terabit.addTextChangedListener(new TextWatcher() {
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
                if (terabit.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 1099511627776L)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1073741824));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1048576));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1024));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 1024));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 137438953472L));
                        kilobyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 134217728));
                        megabyte.setText(String.valueOf((Double.parseDouble(s.toString()) * 131072)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 128));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8192));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        petabit.addTextChangedListener(new TextWatcher() {
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
                if (petabit.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 1125899906842620L)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1099511627776L));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1073741824));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1048576));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 1024));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 140737488355328L));
                        kilobyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 137438953472L));
                        megabyte.setText(String.valueOf((Double.parseDouble(s.toString()) * 134217728)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 131072));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 128));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        bytes.addTextChangedListener(new TextWatcher() {
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
                if (bytes.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 8)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) / 128));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 131072));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 134217728));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 137438953472L));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 140737488355328L));
                        kilobyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1024));
                        megabyte.setText(String.valueOf((Double.parseDouble(s.toString()) / 1048576)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1073741824));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1099511627776L));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1125899906842620L));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        kilobyte.addTextChangedListener(new TextWatcher() {
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
                if (kilobyte.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 8192)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 128));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 131072));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 134217728));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 137438953472L));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 1024));
                        megabyte.setText(String.valueOf((Double.parseDouble(s.toString()) / 1024)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1048576));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1073741824));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1099511627776L));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        megabyte.addTextChangedListener(new TextWatcher() {
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
                if (megabyte.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 8388608)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8192));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 128));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 131072));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 134217728));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 1048576));
                        kilobyte.setText(String.valueOf((Double.parseDouble(s.toString()) * 1024)));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1024));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1048576));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1073741824));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        gigabyte.addTextChangedListener(new TextWatcher() {
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
                if (gigabyte.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 8589934592L)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8388608));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8192));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 128));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 131072));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 1073741824));
                        kilobyte.setText(String.valueOf((Double.parseDouble(s.toString()) * 1048576)));
                        megabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 1024));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1024));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1048576));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        terabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        terabyte.addTextChangedListener(new TextWatcher() {
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
                if (terabyte.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 8796093022208L)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8589934592L));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8388608));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8192));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) / 128));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 1099511627776L));
                        kilobyte.setText(String.valueOf((Double.parseDouble(s.toString()) * 1073741824)));
                        megabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 1048576));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 1024));
                        petabyte.setText(String.valueOf(Double.parseDouble(s.toString()) / 1024));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        petabyte.getText().clear();
                    }
                }
            }
        });

        petabyte.addTextChangedListener(new TextWatcher() {
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
                if (petabyte.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        bit.setText(String.valueOf((Double.parseDouble(s.toString()) * 9007199254740990L)));
                        kilobit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8796093022208L));
                        megabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8589934592L));
                        gigabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8388608));
                        terabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8192));
                        petabit.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
                        bytes.setText(String.valueOf(Double.parseDouble(s.toString()) * 1125899906842620L));
                        kilobyte.setText(String.valueOf((Double.parseDouble(s.toString()) * 1099511627776L)));
                        megabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 1073741824));
                        gigabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 1048576));
                        terabyte.setText(String.valueOf(Double.parseDouble(s.toString()) * 1024));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        bit.getText().clear();
                        kilobit.getText().clear();
                        megabit.getText().clear();
                        gigabit.getText().clear();
                        terabit.getText().clear();
                        petabit.getText().clear();
                        bytes.getText().clear();
                        kilobyte.getText().clear();
                        megabyte.getText().clear();
                        gigabyte.getText().clear();
                        terabyte.getText().clear();
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
