package baocaocuoiki.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_HoatDong extends  RecyclerView.Adapter<Adapter_HoatDong.ViewHoder>{

    ArrayList<HoatDong> hoatDongs;
    Context context;

    public Adapter_HoatDong(ArrayList<HoatDong> hoatDongs, Context context) {
        this.hoatDongs = hoatDongs;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.row_hoat_dong,parent,false);
        return new ViewHoder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        holder.txtTen.setText(hoatDongs.get(position).getTen());
        holder.imgHinh.setImageResource(hoatDongs.get(position).getAnh());
    }

    @Override
    public int getItemCount() {
        return hoatDongs.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder{

        TextView txtTen;
        ImageView imgHinh;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);

            txtTen = (TextView) itemView.findViewById(R.id.tv_ten);
            imgHinh = (ImageView) itemView.findViewById(R.id.img);

        }
    }
}
