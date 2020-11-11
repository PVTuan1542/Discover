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


public class Adapter_casi extends  RecyclerView.Adapter<Adapter_casi.ViewHolder> {

    ArrayList<casi> casis;
    Context context;

    public Adapter_casi(ArrayList<casi> casis, Context context) {
        this.casis = casis;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.row_casi,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTen.setText(casis.get(position).getTen());
        holder.imgHinh.setImageResource(casis.get(position).getAnh());
    }

    @Override
    public int getItemCount() {
        return casis.size();
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
