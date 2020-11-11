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

public class Adapter_BaiHat  extends  RecyclerView.Adapter<Adapter_BaiHat.ViewHolder> {

    ArrayList<List_baiHat> baiHats;
    Context context;

    public Adapter_BaiHat(ArrayList<List_baiHat> baiHats, Context context) {
        this.baiHats = baiHats;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.row_layout4,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTen.setText(baiHats.get(position).getTen());
        holder.imgHinh.setImageResource(baiHats.get(position).getAnh());
    }

    @Override
    public int getItemCount() {
        return baiHats.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtTen ;
        ImageView imgHinh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTen = (TextView) itemView.findViewById(R.id.tv_ten);
            imgHinh = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
