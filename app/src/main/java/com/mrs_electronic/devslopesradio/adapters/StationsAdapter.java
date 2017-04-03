package com.mrs_electronic.devslopesradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mrs_electronic.devslopesradio.R;
import com.mrs_electronic.devslopesradio.activities.MainActivity;
import com.mrs_electronic.devslopesradio.holders.StationViewHolder;
import com.mrs_electronic.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by mlinaberry on 3/31/17.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {
    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, final int position) {
        final Station station = stations.get(position);
        holder.updateUI(station);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // load the details screen.
                MainActivity.getMainActivity().loadDetailsScreen(station);
            }
        });
    }

    @Override
    public int getItemCount() {
        // like numberOfRowsInSection
        return stations.size();
    }

    // inflate the stuff (like cellForRowAtIndexPath)
    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }

}
