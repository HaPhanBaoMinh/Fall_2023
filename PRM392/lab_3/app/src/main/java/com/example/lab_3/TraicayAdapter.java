package com.example.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TraicayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Traicay> traicayList;

    public TraicayAdapter(Context context, int layout, ArrayList<Traicay> traicayList) {
        this.context = context;
        this.layout = layout;
        this.traicayList = traicayList;
    }


    @Override
    public int getCount() {
        return traicayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtTen = (TextView) view.findViewById(R.id.textViewTen);
        TextView txtMota = (TextView) view.findViewById(R.id.textViewMota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageViewHinh);

        Traicay traicay = traicayList.get(i);
        txtTen.setText(traicay.getTen());
        txtMota.setText(traicay.getMota());
        imgHinh.setImageResource(traicay.getHinh());

        return view;
    }
}
