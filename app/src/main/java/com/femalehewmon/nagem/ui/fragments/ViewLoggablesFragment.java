package com.femalehewmon.nagem.ui.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.femalehewmon.nagem.R;
import com.femalehewmon.nagem.ui.adapters.ViewLoggablesAdapter;

public class ViewLoggablesFragment extends Fragment {

    private OnFragmentInteractionListener _fragInteractionListener;

    // Views
    private GridView _gridView;

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);
    }

    public static ViewLoggablesFragment newInstance() {
        ViewLoggablesFragment fragment = new ViewLoggablesFragment();
        return fragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            _fragInteractionListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    public ViewLoggablesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    static final String[] numbers = new String[] {
            "A", "B", "C", "D", "E",
            "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O",
            "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_loggables, container, false);

        // Initialize views
        _gridView = (GridView)view.findViewById(R.id.gridview_view_loggables);

        // Set adapters and onClickListeners
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
        //        android.R.layout.simple_list_item_1, numbers);

        //_gridView.setAdapter(adapter);

        _gridView.setAdapter(new ViewLoggablesAdapter(this.getActivity()));
        _gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ViewLoggablesFragment.this.getActivity(),
                        "" + position, Toast.LENGTH_SHORT).show();
                if (_fragInteractionListener != null) {
                    _fragInteractionListener.onFragmentInteraction(null);
                }
            }
        });

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        _fragInteractionListener = null;
    }

}
