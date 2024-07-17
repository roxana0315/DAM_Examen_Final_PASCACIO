package com.example.dam_examen_final_pascacio;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dam_examen_final_pascacio.databinding.FragmentItemBinding;

import java.io.ByteArrayOutputStream;
import java.util.List;

public class MyNotaRecyclerViewAdapter extends RecyclerView.Adapter<MyNotaRecyclerViewAdapter.ViewHolder> {

    private ByteArrayOutputStream mValues;

    public MyNotaRecyclerViewAdapter(List<Nota> notaList) {
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {



        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final TextView mContentView;


        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mIdView = binding.textView2;
            mContentView = binding.textView2;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}