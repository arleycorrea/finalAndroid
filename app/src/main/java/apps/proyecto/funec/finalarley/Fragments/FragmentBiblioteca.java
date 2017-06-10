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




public class FragmentBiblioteca extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_biblioteca, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("BIBLIOTECA");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentBiblioteca);

        final TextView textViewFragmentBiblioteca = (TextView) view.findViewById(R.id.textViewFragmentBiblioteca);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewFragmentBiblioteca.setTextSize(40);
                textViewFragmentBiblioteca.setText("ESTA ES TU BIBLIOTECA");
                textViewFragmentBiblioteca.setTextColor(getResources().getColor(R.color.md_green_800));

            }
        });

        return view;
    }

}