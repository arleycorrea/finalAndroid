package apps.proyecto.funec.finalarley.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import apps.proyecto.funec.finalarley.MainActivity;
import apps.proyecto.funec.finalarley.R;


public class FragmentRedes extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_redes, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Q10 MANIZALES");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentRedes);

        final TextView textViewFragmentRedes = (TextView) view.findViewById(R.id.textViewFragmentRedes);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewFragmentRedes.setTextSize(40);
                textViewFragmentRedes.setText("encuentranos");
                textViewFragmentRedes.setTextColor(getResources().getColor(R.color.md_green_800));

            }
        });

        return view;
    }

}