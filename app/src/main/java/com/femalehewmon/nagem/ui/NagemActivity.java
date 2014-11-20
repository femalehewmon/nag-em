package com.femalehewmon.nagem.ui;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.femalehewmon.nagem.R;
import com.femalehewmon.nagem.ui.fragments.ViewLoggablesFragment;

public class NagemActivity extends FragmentActivity
        implements ViewLoggablesFragment.OnFragmentInteractionListener{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
        // Inflate the layout
        setContentView(R.layout.activity_nagem);

        super.onCreate(savedInstanceState);
	}

    @Override
	protected void onSaveInstanceState(Bundle outState)
	{
		super.onSaveInstanceState(outState);
	}
	
	@Override 
	protected void onDestroy()
	{
		super.onDestroy();
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nagem, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch(item.getItemId())
        {
            case R.id.action_about:
                return true;
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
