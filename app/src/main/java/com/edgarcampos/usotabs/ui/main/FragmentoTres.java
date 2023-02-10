package com.edgarcampos.usotabs.ui.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.edgarcampos.usotabs.R;

public class FragmentoTres extends Fragment {
    Button correo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_tres, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        correo = view.findViewById(R.id.btnContactar);

        correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"camposedgar899@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Me interesan tus servicios");
                intent.putExtra(Intent.EXTRA_TEXT, "");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Elije un cliente de correo:"));
            }
        });
    }
}