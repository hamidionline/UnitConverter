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


/**
 * A simple {@link Fragment} subclass.
 */
public class VolumeFragment extends Fragment {


    public VolumeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_volume, container, false);

        final EditText usliquidgallon = (EditText) view.findViewById(R.id.input_us_liquid_gallon);
        final EditText usliquidquart = (EditText) view.findViewById(R.id.input_us_liquid_quart);
        final EditText usliquidpint = (EditText) view.findViewById(R.id.input_us_liquid_pint);
        final EditText uslegalcup = (EditText) view.findViewById(R.id.input_us_legal_cup);
        final EditText usfluidounce = (EditText) view.findViewById(R.id.input_us_fluid_ounce);
        final EditText ustablespoon = (EditText) view.findViewById(R.id.input_us_tablespoon);
        final EditText usteaspoon = (EditText) view.findViewById(R.id.input_us_teaspoon);
//        final EditText cubicmetre = (EditText) view.findViewById(R.id.input_cubic_metre);
        final EditText litre = (EditText) view.findViewById(R.id.input_litre);
        final EditText millilitre = (EditText) view.findViewById(R.id.input_millilitre);
        final EditText imperialgallon = (EditText) view.findViewById(R.id.input_imperial_gallon);
        final EditText imperialquant = (EditText) view.findViewById(R.id.input_imperial_quart);
        final EditText imperialpint = (EditText) view.findViewById(R.id.input_imperial_pint);
//        final EditText imperialcup = (EditText) view.findViewById(R.id.input_imperial_cup);
        final EditText imperialfluidounce = (EditText) view.findViewById(R.id.input_imperial_fluid_ounce);
        final EditText imperialtablespoon = (EditText) view.findViewById(R.id.input_imperial_tablespoon);
        final EditText imperialteaspoon = (EditText) view.findViewById(R.id.input_imperial_teaspoon);
//        final EditText cubicfoot = (EditText) view.findViewById(R.id.input_cubic_foot);
//        final EditText cubicinch = (EditText) view.findViewById(R.id.input_cubic_inch);

        usliquidgallon.addTextChangedListener(new TextWatcher() {
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
                if (usliquidgallon.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidquart.setText(String.valueOf((Double.parseDouble(s.toString()) * 4)));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) * 16));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 128));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 256));
                        usteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 768));
                        litre.setText(String.valueOf((Double.parseDouble(s.toString()) * 3.785411784)));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 3785.411784));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.83267384046639071232));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) * 3.3306953618655629312));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 6.6613907237311258624));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 133.22781447462252544));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 213.16450315939602432)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 639.49350947818807296));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        usliquidquart.addTextChangedListener(new TextWatcher() {
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
                if (usliquidquart.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 4)));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 2));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) * 4));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 32));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 64));
                        usteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 192));
                        litre.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.94635294599999995904)));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 946.35294599999995904));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.20816846011659767808));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.83267384046639071232));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.6653476809327814656));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 33.306953618655629312));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 53.291125789849001984)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 159.87337736954701824));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        usliquidpint.addTextChangedListener(new TextWatcher() {
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
                if (usliquidpint.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 8)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 2));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) * 2));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 16));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 32));
                        usteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 96));
                        litre.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.47317647299999997952)));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 473.17647299999997952));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.10408423005829883904));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.41633692023319535616));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.83267384046639071232));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 16.653476809327814656));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 26.645562894924500992)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 79.936688684773507072));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        uslegalcup.addTextChangedListener(new TextWatcher() {
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
                if (uslegalcup.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 16)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 4));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 2));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 16));
                        usteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 48));
                        litre.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.23658823649999998976)));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 236.58823649999998976));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.052042115029149417472));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.20816846011659767808));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.41633692023319535616));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 8.3267384046639071232));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 13.322781447462250496)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 39.968344342386753536));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        usfluidounce.addTextChangedListener(new TextWatcher() {
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
                if (usfluidounce.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 128)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 32));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 16));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 2));
                        usteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 6));
                        litre.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.029573529562499997696)));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 29.573529562499997696));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.006505264378643677184));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.026021057514574708736));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.052042115029149417472));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.0408423005829883904));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.6653476809327814656)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 4.9960430427983437824));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        ustablespoon.addTextChangedListener(new TextWatcher() {
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
                if (ustablespoon.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 256)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 64));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 32));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 16));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 2));
                        usteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 3));
                        litre.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.014786764781249998848)));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 14.786764781249998848));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.003252632189321838592));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.013010528757287354368));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.026021057514574708736));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.52042115029149417472));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.83267384046639071232)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 2.4980215213991718912));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        usteaspoon.addTextChangedListener(new TextWatcher() {
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
                if (usteaspoon.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 768)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 192));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 96));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 48));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 6));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 3));
                        litre.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.004928921593749999616)));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 4.928921593749999616));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.00108421072977394606));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.004336842919095784243));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.008673685838191568486));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.1734737167638313984));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 0.27755794682213023744)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.83267384046639071232));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        litre.addTextChangedListener(new TextWatcher() {
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
                if (litre.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 3.785411784)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.94635294599999995904));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.47317647299999997952));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.23658823649999998976));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.029573529562499997696));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.014786764781249998848));
                        usteaspoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.004928921593749999616)));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 1000));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) / 4.546091879));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) / 1.13652296975));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.56826148487499988992));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.028413074243749994496));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.017758171402343747584)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.005919390467447916134));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        millilitre.addTextChangedListener(new TextWatcher() {
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
                if (millilitre.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 3785.411784)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 946.35294599999995904));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 473.17647299999997952));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 236.58823649999998976));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 29.573529562499997696));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 14.786764781249998848));
                        usteaspoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 4.928921593749999616)));
                        litre.setText(String.valueOf(Double.parseDouble(s.toString()) / 1000));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) / 4546.091879));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) / 1136.52296975));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 568.26148487499988992));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 28.413074243749994496));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 17.758171402343747584)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 5.9193904674479161344));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        imperialgallon.addTextChangedListener(new TextWatcher() {
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
                if (imperialgallon.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.83267384046639071232)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.20816846011659767808));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.10408423005829883904));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.052042115029149417472));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.006505264378643677184));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.003252632189321838592));
                        usteaspoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.00108421072977394606)));
                        litre.setText(String.valueOf(Double.parseDouble(s.toString()) * 4.546091879));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 4546.091879));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) * 4));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 8));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 160));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 256)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 768));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        imperialquant.addTextChangedListener(new TextWatcher() {
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
                if (imperialquant.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 3.3306953618655629312)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.83267384046639071232));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.41633692023319535616));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.20816846011659767808));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.026021057514574708736));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.013010528757287354368));
                        usteaspoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.004336842919095784243)));
                        litre.setText(String.valueOf(Double.parseDouble(s.toString()) * 1.13652296975));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 1136.52296975));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) / 4));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) * 2));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 40));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 64)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 192));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        imperialpint.addTextChangedListener(new TextWatcher() {
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
                if (imperialpint.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 6.6613907237311258624)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 1.6653476809327814656));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.83267384046639071232));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.41633692023319535616));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.052042115029149417472));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.026021057514574708736));
                        usteaspoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.008673685838191568486)));
                        litre.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.56826148487499988992));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 568.26148487499988992));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) / 8));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) / 2));
                        imperialfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) * 20));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 32)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 96));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        imperialfluidounce.addTextChangedListener(new TextWatcher() {
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
                if (imperialfluidounce.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 133.22781447462252544)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 33.306953618655629312));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 16.653476809327814656));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 8.3267384046639071232));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 1.0408423005829883904));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.52042115029149417472));
                        usteaspoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.1734737167638313984)));
                        litre.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.028413074243749994496));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 28.413074243749994496));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) / 160));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) / 40));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 20));
                        imperialtablespoon.setText(String.valueOf((Double.parseDouble(s.toString()) * 1.6)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 4.8));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialtablespoon.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        imperialtablespoon.addTextChangedListener(new TextWatcher() {
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
                if (imperialtablespoon.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 213.16450315939602432)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 53.291125789849001984));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 26.645562894924500992));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 13.322781447462250496));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 1.6653476809327814656));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 0.83267384046639071232));
                        usteaspoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.27755794682213023744)));
                        litre.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.017758171402343747584));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 17.758171402343747584));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) / 256));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) / 64));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 32));
                        imperialfluidounce.setText(String.valueOf((Double.parseDouble(s.toString()) / 1.6)));
                        imperialteaspoon.setText(String.valueOf(Double.parseDouble(s.toString()) * 3));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialteaspoon.getText().clear();
                    }
                }
            }
        });

        imperialteaspoon.addTextChangedListener(new TextWatcher() {
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
                if (imperialteaspoon.isFocused()) {
                    if (s.toString().trim() != null && !s.toString().trim().isEmpty() && charCount > -1 && s.toString().trim().charAt(s.length() - 1) != '.' && tryParseDouble(s.toString().trim())) {
                        usliquidgallon.setText(String.valueOf((Double.parseDouble(s.toString()) / 639.49350947818807296)));
                        usliquidquart.setText(String.valueOf(Double.parseDouble(s.toString()) / 159.87337736954701824));
                        usliquidpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 79.936688684773507072));
                        uslegalcup.setText(String.valueOf(Double.parseDouble(s.toString()) / 39.968344342386753536));
                        usfluidounce.setText(String.valueOf(Double.parseDouble(s.toString()) / 4.9960430427983437824));
                        ustablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 2.4980215213991718912));
                        usteaspoon.setText(String.valueOf((Double.parseDouble(s.toString()) / 0.83267384046639071232)));
                        litre.setText(String.valueOf(Double.parseDouble(s.toString()) * 0.005919390467447916134));
                        millilitre.setText(String.valueOf(Double.parseDouble(s.toString()) * 5.9193904674479161344));
                        imperialgallon.setText(String.valueOf(Double.parseDouble(s.toString()) / 768));
                        imperialquant.setText(String.valueOf(Double.parseDouble(s.toString()) / 192));
                        imperialpint.setText(String.valueOf(Double.parseDouble(s.toString()) / 96));
                        imperialfluidounce.setText(String.valueOf((Double.parseDouble(s.toString()) / 4.8)));
                        imperialtablespoon.setText(String.valueOf(Double.parseDouble(s.toString()) / 3));
                    } else if (s.toString().trim() != null && !s.toString().trim().isEmpty() && s.toString().trim().charAt(s.length() - 1) == '.') {
                    } else {
                        usliquidgallon.getText().clear();
                        usliquidquart.getText().clear();
                        usliquidpint.getText().clear();
                        uslegalcup.getText().clear();
                        usfluidounce.getText().clear();
                        ustablespoon.getText().clear();
                        usteaspoon.getText().clear();
                        litre.getText().clear();
                        millilitre.getText().clear();
                        imperialgallon.getText().clear();
                        imperialquant.getText().clear();
                        imperialpint.getText().clear();
                        imperialfluidounce.getText().clear();
                        imperialtablespoon.getText().clear();
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
