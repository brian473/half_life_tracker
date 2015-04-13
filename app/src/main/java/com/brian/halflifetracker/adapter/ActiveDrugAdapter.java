package com.brian.halflifetracker.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brian.halflifetracker.R;

/**
 * Created by Brian on 3/31/2015.
 */
public class ActiveDrugAdapter extends RecyclerView.Adapter<ActiveDrugAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View mView;
        public ViewHolder(View v) {
            super(v);

            mView = v;
        }
    }

    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public ActiveDrugAdapter(String[] pDataset) {
        mDataset = pDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ActiveDrugAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.drug_list_card_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ((TextView)holder.mView.findViewById(R.id.active_drug_cardview_title)).setText(mDataset[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
