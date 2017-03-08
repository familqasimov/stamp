package com.sjn.taggingplayer.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sjn.taggingplayer.R;
import com.sjn.taggingplayer.utils.LogHelper;

public class TagEditFragment extends Fragment {

    private static final String TAG = LogHelper.makeLogTag(TagEditFragment.class);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tag_edit, container, false);
    }
}