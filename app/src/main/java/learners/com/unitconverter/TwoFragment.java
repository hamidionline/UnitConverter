package learners.com.unitconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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

        EditText bitpersecond = (EditText) view.findViewById(R.id.input_bit_per_second);
        EditText kilobitpersecond = (EditText) view.findViewById(R.id.input_kilobit_per_second);
        EditText kilobytepersecond = (EditText) view.findViewById(R.id.input_kilobyte_per_second);
        EditText kibibitpersecond = (EditText) view.findViewById(R.id.input_kibibit_per_second);
        EditText megabitpersecond = (EditText) view.findViewById(R.id.input_megabit_per_second);
        EditText megabytepersecond = (EditText) view.findViewById(R.id.input_megabyte_per_second);
        EditText mebibitpersecond = (EditText) view.findViewById(R.id.input_mebibit_per_second);
        EditText gigabitpersecond = (EditText) view.findViewById(R.id.input_gigabit_per_second);
        EditText gigabytepersecond = (EditText) view.findViewById(R.id.input_gigabyte_per_second);
        EditText gibibitpersecond = (EditText) view.findViewById(R.id.input_gibibit_per_second);
        EditText terabitpersecond = (EditText) view.findViewById(R.id.input_terabit_per_second);
        EditText terabytepersecond = (EditText) view.findViewById(R.id.input_terabyte_per_second);
        EditText tebibitpersecond = (EditText) view.findViewById(R.id.input_tebibit_per_second);

        return view;
    }

}
