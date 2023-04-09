package com.example.myinstagramlab;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {


    List<Post> postList;
    LayoutInflater inflater;

    public PostAdapter(Activity activity, List<Post> postList) {
        this.postList = postList;
        inflater = activity.getLayoutInflater();

    }

    @Override
    public int getCount() {
        return postList.size();
    }

    @Override
    public Object getItem(int position) {
        return postList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        rowView = inflater.inflate(R.layout.row, null);
        EditText txtMessage = (EditText) rowView.findViewById(R.id.txtMessage);
        TextView txtLocation = (TextView) rowView.findViewById(R.id.txtLocation);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgView);

        Post post = postList.get(position);
        txtMessage.setText(post.getMessage());
        imageView.setImageBitmap(post.getImage());
        if (post.getLocation() != null) {
            txtLocation.setText(post.getLocation().getLatitude() + " "  + post.getLocation().getLongitude());
        }
        return rowView;

    }
}
