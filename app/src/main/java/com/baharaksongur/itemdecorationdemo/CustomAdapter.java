package com.baharaksongur.itemdecorationdemo;
/*
 * Created by baharaksongur on 07/12/2018.
 */
import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter {
	public ArrayList<String> items;
	private Activity context;

	public CustomAdapter(Context context,ArrayList<String> items ){
		this.items = items;
		this.context = (Activity) context;
	}

	public class MyViewHolder extends RecyclerView.ViewHolder {
		TextView text;
		LinearLayout container;

		public MyViewHolder(View itemView) {
			super(itemView);
		text = itemView.findViewById(R.id.txt_title);
		container = itemView.findViewById(R.id.container);
		}
	}
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
		MyViewHolder vh;
		LayoutInflater inflater = context.getLayoutInflater();
		View view =  inflater.inflate(R.layout.rcv_item, viewGroup, false);
		vh = new MyViewHolder(view);
		return vh;
	}

	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {

		if (viewHolder instanceof MyViewHolder) {
			String title = items.get(i);
			((MyViewHolder) viewHolder).text.setText(title);
			if ( i % 2 == 0) {
				((MyViewHolder) viewHolder).text.setBackgroundResource(R.drawable.rectangle_category2);
			}
		}
	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}
