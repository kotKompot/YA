package com.k.maksim.fisher.presentation.watcher;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.k.maksim.fisher.R;

/**
 * Created by maksi on 21.08.2018.
 *
 */

public class WatcherFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_watcher, container, false);
    }
}