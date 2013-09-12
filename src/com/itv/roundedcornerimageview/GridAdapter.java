package com.itv.roundedcornerimageview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class GridAdapter extends ArrayAdapter {

	private LayoutInflater inflater;

	public GridAdapter(Context context) {
		super(context, 0);
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	public int getCount(){
		return 50;
	}

	public View getView(int position, View convertView, ViewGroup parent){
		ViewHolder holder;
		if(convertView == null){
			convertView = inflater.inflate(R.layout.rounded_image, parent, false);
			holder = new ViewHolder();
			holder.image = (RoundedCornerImageView) convertView.findViewById(R.id.imageView1);
			convertView.setTag(holder);
			
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		
		switch(position % 4){
		case 0:
			holder.image.setImageResource(R.drawable.mountain);
			break;
		case 1:
			holder.image.setImageResource(R.drawable.mountain2);
			break;
		case 2:
			holder.image.setImageResource(R.drawable.architecture);
			break;
		case 3:
			holder.image.setImageResource(R.drawable.architecture2);
			break;
		}
		
		return convertView;
	}
	
	private static class ViewHolder{
		public RoundedCornerImageView image;
	}
}
