package ng.hotels.android.app.ui.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import ng.hotels.android.app.R;
import ng.hotels.android.app.ui.fragments.CinemasFragment;
import ng.hotels.android.app.ui.fragments.EventsFragment;

public class EventsAndCinemasActivity extends AppCompatActivity implements
        CinemasFragment.OnFragmentInteractionListener, EventsFragment.OnFragmentInteractionListener{

    private EventsFragment eventsFragment;
    private CinemasFragment cinemasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_and_cinemas);

        Intent intent = getIntent();
        if (intent.hasExtra("page")){
            int page = intent.getIntExtra("page", 0);
            if (page == 0){
                showEventsFragment();
            } else if (page == 1){
                showCinemasFragment();
            }
        }
    }

    private void showEventsFragment(){
        if (eventsFragment == null)
            eventsFragment = EventsFragment.newInstance();
        loadFragment(eventsFragment);
    }

    private void showCinemasFragment(){
        if (cinemasFragment == null)
            cinemasFragment = CinemasFragment.newInstance();
        loadFragment(cinemasFragment);
    }

    private void loadFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment, fragment.getClass().getSimpleName())
                .addToBackStack(fragment.getClass().getSimpleName())
                .commit();
    }

    @Override
    public void onFragmentInteraction() {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
