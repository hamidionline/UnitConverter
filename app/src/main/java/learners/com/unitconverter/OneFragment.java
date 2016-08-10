package learners.com.unitconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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

        EditText squareKilometre = (EditText) view.findViewById(R.id.input_square_kilometer);
        EditText squareMetre = (EditText) view.findViewById(R.id.input_square_metre);
        EditText squareMile = (EditText) view.findViewById(R.id.input_square_mile);
        EditText squareYard = (EditText) view.findViewById(R.id.input_square_yard);
        EditText squareFoot = (EditText) view.findViewById(R.id.input_square_foot);
        EditText squareInch = (EditText) view.findViewById(R.id.input_square_inch);
        EditText hectare = (EditText) view.findViewById(R.id.input_hectare);
        EditText acre = (EditText) view.findViewById(R.id.input_acre);

        return view;
    }

}
