package com.brian.halflifetracker.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.brian.halflifetracker.R;

import org.w3c.dom.Text;

/**
 * Created by Brian on 3/31/2015.
 */
public class ActiveDrugAdapter extends RecyclerView.Adapter<ActiveDrugAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View mRootView;
        public TextView mTitle;
        public TextView mDescription;
        public TextView mAmount;
        public ProgressBar mProgressBar;

        public ViewHolder(View v) {
            super(v);

            mRootView = v;

            mTitle = (TextView) mRootView.findViewById(R.id.active_drug_cardview_title);
            mDescription = (TextView) mRootView.findViewById(R.id.drug_list_cardview_description);
            mAmount = (TextView) mRootView.findViewById(R.id.drug_list_cardview_amount);
            mProgressBar = (ProgressBar) mRootView.findViewById(R.id.drug_list_cardview_progressbar);
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

//        vh.mTitle.setText();
//        vh.mDescription.setText();
//        vh.mAmount.setText();
        vh.mProgressBar.setProgress(80);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTitle.setText(mDataset[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
