package sg.edu.rp.soi.c346p09quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<Formula> objects;

    public CustomAdapter(Context context, int resource, ArrayList<Formula> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(resource, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvShape = rowView.findViewById(R.id.tvShape);
        TextView tvFormula = rowView.findViewById(R.id.tvFormula);
        TextView tvType = rowView.findViewById(R.id.tvType);

        // Obtain the Android Version information based on the position
        Formula form = objects.get(position);

        // Set values to the TextView to display the corresponding information
        tvShape.setText(form.getType()+ " of " + form.getShape());
        tvFormula.setText(form.getFormula());
        tvType.setText("Formula type is: " + form.getType());

        return rowView;
    }

}

