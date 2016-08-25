package learners.com.unitconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class ThreeFragment extends Fragment {

    public ThreeFragment() {
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

        EditText bit = (EditText) view.findViewById(R.id.input_bit);
        EditText kilobit = (EditText) view.findViewById(R.id.input_kilobit);
        EditText kibibit = (EditText) view.findViewById(R.id.input_kibibit);
        EditText megabit = (EditText) view.findViewById(R.id.input_megabit);
        EditText mebibit = (EditText) view.findViewById(R.id.input_mebibit);
        EditText gigabit = (EditText) view.findViewById(R.id.input_gigabit);
        EditText gibibit = (EditText) view.findViewById(R.id.input_gibibit);
        EditText terabit = (EditText) view.findViewById(R.id.input_terabit);
        EditText tebibit = (EditText) view.findViewById(R.id.input_tebibit);
        EditText petabit = (EditText) view.findViewById(R.id.input_petabit);
        EditText pebibit = (EditText) view.findViewById(R.id.input_pebibit);
        EditText bytes = (EditText) view.findViewById(R.id.input_byte);
        EditText kilobyte = (EditText) view.findViewById(R.id.input_kilobyte);
        EditText kibibyte = (EditText) view.findViewById(R.id.input_kibibyte);
        EditText megabyte = (EditText) view.findViewById(R.id.input_megabyte);
        EditText mebibyte = (EditText) view.findViewById(R.id.input_mebibyte);
        EditText gigabyte = (EditText) view.findViewById(R.id.input_gigabyte);
        EditText gibibyte = (EditText) view.findViewById(R.id.input_gibibyte);
        EditText terabyte = (EditText) view.findViewById(R.id.input_terabyte);
        EditText tebibyte = (EditText) view.findViewById(R.id.input_tebibyte);
        EditText petabyte = (EditText) view.findViewById(R.id.input_petabyte);
        EditText pebibyte = (EditText) view.findViewById(R.id.input_pebibyte);

        return view;
    }

}
