package com.mrs_electronic.devslopesradio.services;

import com.mrs_electronic.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by mlinaberry on 4/3/17.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public ArrayList<Station> getFeaturedStations() {
        // pretend we've downloaded featured stations from the internet.
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlists)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        // pretend we've downloaded featured stations from the internet.
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlists)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getPartyStations() {
        // pretend we've downloaded featured stations from the internet.
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlists)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }
}
