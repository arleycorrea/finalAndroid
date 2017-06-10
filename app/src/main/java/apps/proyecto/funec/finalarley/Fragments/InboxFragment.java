package apps.proyecto.funec.finalarley.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import apps.proyecto.funec.finalarley.MainActivity;
import apps.proyecto.funec.finalarley.R;
import apps.proyecto.funec.finalarley.SettingsActivity;


public class InboxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_inbox, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Q10");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentInbox);

         final TextView textViewInboxFragment = (TextView) view.findViewById(R.id.textViewInboxFragment);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SettingsActivity.class);
                startActivity(intent);

                textViewInboxFragment.setText("BIENVENIDO A Q10");
                textViewInboxFragment.setTextColor(getResources().getColor(R.color.md_yellow_800));

            }
        });

        return view;
    }

}
