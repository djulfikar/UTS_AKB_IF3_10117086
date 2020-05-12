package com.example.tugas_uts_akb_if3_10117086.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;

import com.example.tugas_uts_akb_if3_10117086.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
/** NIM : 10117086
 * Nama : RD Muhammad Djulfikar Bu
 * Kelas : IF 3
 * Tanggal : 12-05-2020**/
public class ProfilActivity extends Fragment {

    public ProfilActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        // Inflate the layout for this fragment
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.activity_profil, container, false);
    }
}
