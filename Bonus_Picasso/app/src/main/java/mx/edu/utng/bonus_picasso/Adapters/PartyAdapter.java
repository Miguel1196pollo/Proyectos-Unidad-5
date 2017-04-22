package mx.edu.utng.bonus_picasso.Adapters;

/**
 * Created by Toshiba on 13/04/2017.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.squareup.picasso.Picasso;

import mx.edu.utng.bonus_picasso.R;

/**
 * Created by Alejandro on 13/11/16.
 */

public class PartyAdapter extends RecyclerView.Adapter<PartyAdapter.ViewHolder> {

    private Context context;
    private int[] parties;
    private int layout;


    public PartyAdapter(Context context, int[] parties, int layout) {
        this.context = context;
        this.parties = parties;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(context).load(parties[position]).fit().placeholder(R.drawable.spinner).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return parties.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            this.image = (ImageView) itemView.findViewById(R.id.imageViewLayout);
        }

    }
}