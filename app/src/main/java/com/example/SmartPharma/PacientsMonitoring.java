package com.example.SmartPharma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PacientsMonitoring extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    )
    {



    // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pacients_monitoring, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<Pacient> pacients = new ArrayList<Pacient>();
        pacients.add(new Pacient("Ion", "Popescu", "0752145785"));
        pacients.add(new Pacient("Pavel", "Iliescu", "0723145792"));
        pacients.add(new Pacient("Maria", "Petrescu", "0721246783"));
        pacients.add(new Pacient("Georgeta", "Popa", "0752143725"));
        pacients.add(new Pacient("Ionel", "Pavelescu", "0736149781"));
        // set up the RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.pacient_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager((view.getContext())));
        PacientsViewAdapter adapter = new PacientsViewAdapter(view.getContext(), pacients);
        //adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }


}