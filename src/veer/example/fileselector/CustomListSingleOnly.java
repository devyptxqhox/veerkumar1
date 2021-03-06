package veer.example.fileselector;


import veer.example.fileselector.R;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomListSingleOnly extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] web;
    private final Integer imageId;
    public CustomListSingleOnly(Activity context, String[] web, Integer imageId) {
        super(context, R.layout.list_single_only, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
    	//Log.i("web2","+"+web[position]);
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single_only, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);
        
        imageView.setImageResource(imageId);
        return rowView;
    }
}
