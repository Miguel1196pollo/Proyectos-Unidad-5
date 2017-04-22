package mx.edu.utng.seccion_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapater extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> names;

    public MyAdapater(Context context, int layout, List<String> names){
        this.context = context;
        this.layout = layout;
        this.names = names;
    }


    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {


        //View patter
        ViewHolder holder;

        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout, null);

            holder = new ViewHolder();

            //Referenciamos
            holder.nameTextView = (TextView) convertView.findViewById(R.id.tv_textView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }


        String currentName = names.get(position);
        //currentName = (String) getItem(position);
        holder.nameTextView.setText(currentName);
              return convertView;

    }

    static class ViewHolder{
        private TextView nameTextView;

    }
}
