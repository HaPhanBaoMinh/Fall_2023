package com.example.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CauthuAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Cauthu> cauthuList;

    public CauthuAdapter(Context context, int layout, ArrayList<Cauthu> cauthuList) {
        this.context = context;
        this.layout = layout;
        this.cauthuList = cauthuList;
    }


    @Override
    public int getCount() {
        return cauthuList.size();
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
        ImageView imgHinh2 = (ImageView) view.findViewById(R.id.imageViewHinh2);

        Cauthu cauthu = cauthuList.get(i);
        txtTen.setText(cauthu.getTen());
        txtMota.setText(cauthu.getMota());
        imgHinh.setImageResource(cauthu.getHinh());
        imgHinh2.setImageResource(cauthu.getQuocgia());

        return view;
    }
}
