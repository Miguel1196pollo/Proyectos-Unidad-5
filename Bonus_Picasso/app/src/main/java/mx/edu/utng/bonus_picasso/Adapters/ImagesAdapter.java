package mx.edu.utng.bonus_picasso.Adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/**
 * Created by Toshiba on 13/04/2017.
 */

import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.List;

import mx.edu.utng.bonus_picasso.R;


public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder> {

    private Context context;
    private List<String> images;
    private int layout;


    public ImagesAdapter(Context context, List<String> images, int layout) {
        this.context = context;
        this.images = images;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(context).load(new File(images.get(position))).fit().placeholder(R.drawable.spinner).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            this.image = (ImageView) itemView.findViewById(R.id.imageViewLayout);
        }

    }
}