package com.baharaksongur.itemdecorationdemo;

/*
 * Created by baharaksongur on 07/12/2018.
 */


import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class CustomItemDecoration extends RecyclerView.ItemDecoration {
	private static int PADDING_BOTTOM = -50;

	public CustomItemDecoration() {}


	/*In getItemOffsets, we’re changing the shape of the Rect outRect,
		which determines the amount of padding on each side of the the list item.
		By default, this padding is 0. Here, we change the top field of outRect to the height of our divider
	 	so that it has room to be drawn without overlapping any other views
	*/
	@Override
	public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
		super.getItemOffsets(outRect, view, parent, state);

		if (parent.getChildAdapterPosition(view) == 0) {
			return;
		}
		outRect.bottom = PADDING_BOTTOM;
	}
}
