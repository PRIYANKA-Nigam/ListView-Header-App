package com.example.listviewheader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter<String> {
    int vg;
    String[] item_list;
    Context context;

    public ListAdapter(@NonNull Context context,   int vg, int Id,String[] item_list) {
        super(context,vg, Id,item_list);
        this.vg = vg;
        this.item_list = item_list;
       this.context=context;
    }
    static class ViewHolder{
        public TextView t1,t2;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row=convertView;
        if (row==null){
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(vg,parent,false);
            ViewHolder holder=new ViewHolder();
            holder.t1=(TextView)row.findViewById(R.id.tt);
            holder.t2=(TextView)row.findViewById(R.id.tt2);
            row.setTag(holder);

        }
        String[] items=item_list[position].split("_");
        ViewHolder holder=(ViewHolder)row.getTag();
        holder.t1.setText(items[0]);
        holder.t2.setText(items[1]);
        return row;

    }
}
