package ng.hotels.android.app.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;

import ng.hotels.android.app.R;
import ng.hotels.android.app.ui.fragments.PendingPaymentReminderFragment;
import ng.hotels.android.app.ui.fragments.SlowNetworkOptionsFragment;
import ng.hotels.android.app.ui.fragments.RequestDialogLoginRegisterFragment;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity implements
        PendingPaymentReminderFragment.OnFragmentInteractionListener,
        SlowNetworkOptionsFragment.OnFragmentInteractionListener{

    private PendingPaymentReminderFragment pendingPaymentReminderFragment;
    private RequestDialogLoginRegisterFragment requestDialogLoginRegisterFragment;
    private SlowNetworkOptionsFragment slowNetworkOptionsFragment;
    private ScrollView viewContainer;
    private FrameLayout frameLayout;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        frameLayout = findViewById(R.id.container);
        viewContainer = findViewById(R.id.view_container);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void showPendingPaymentReminderFragment(){
        if (pendingPaymentReminderFragment == null)
            pendingPaymentReminderFragment = PendingPaymentReminderFragment.newInstance();
        pendingPaymentReminderFragment.show(getSupportFragmentManager(), "Payment reminder");
        pendingPaymentReminderFragment.setCancelable(true);
    }

    private void requestloginFragment(){
        if (requestDialogLoginRegisterFragment == null)
            requestDialogLoginRegisterFragment = RequestDialogLoginRegisterFragment.newInstance();
        requestDialogLoginRegisterFragment.show(getSupportFragmentManager(), "request Login");
        requestDialogLoginRegisterFragment.setCancelable(true);
    }

    private void showSlowNetworkOptionsFragment() {
        if (slowNetworkOptionsFragment == null)
            slowNetworkOptionsFragment = SlowNetworkOptionsFragment.newInstance();
        slowNetworkOptionsFragment.show(getSupportFragmentManager(), "Slow Network Options");
        slowNetworkOptionsFragment.setCancelable(true);
    }

    @Override
    public void onBackPressed() {
        if (pendingPaymentReminderFragment != null && pendingPaymentReminderFragment.isAdded()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openHompage(View view) {
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
    }

    public void openLoginpage(View view) {
        startActivity(new Intent(getApplicationContext(), UserAuthenticationActivity.class));
    }



    public void openSingleHotel(View view) {
        startActivity(new Intent(getApplicationContext(), SingleHotelPageActivity.class));
    }

    public void openPaymentSuccess(View view) {
        startActivity(new Intent(getApplicationContext(), SuccessfulBookingActivity.class));
    }

    public void openFlightDetails(View view) {
        startActivity(new Intent(getApplicationContext(), FlightDetailActivity.class));
    }

    public void openBookingDetails(View view) {
        startActivity(new Intent(getApplicationContext(), BookingDetailsActivity.class));
    }

    public void openSettings(View view) {
        startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
    }

    public void openFlightTracking(View view) {
        startActivity(new Intent(getApplicationContext(), MapsActivity.class));
    }

    public void openFlightReceipt(View view) {
        startActivity(new Intent(getApplicationContext(), FlightReservationReceiptActivity.class));
    }

    public void HelpPage(View View){
        startActivity(new Intent(getApplicationContext(),HelpActivity.class));
    }

    public void openCheckout(View view) {
        startActivity(new Intent(getApplicationContext(), CheckoutActivity.class));
    }


    public void openGallery(View View){
        startActivity(new Intent(getApplicationContext(),GalleryActivity.class));
    }




    public void openInvite(View view) {
        startActivity(new Intent(getApplicationContext(), InviteFriendsActivity.class));
    }

    public void openHistoryDetail(View view) {
        Intent intent = new Intent(getApplicationContext(), BookingHistoryActivity.class);
        intent.putExtra("page", 0);
        startActivity(intent);
    }

    public void openCustomerServiceChat(View view){
        startActivity(new Intent(this,CustomerServiceStartConversationActivity.class));
    }

    public void openHistoryList(View view) {
        Intent intent = new Intent(getApplicationContext(), BookingHistoryActivity.class);
        intent.putExtra("page", 1);
        startActivity(intent);
    }
    public void openPaymentReminder(View view) {
        showPendingPaymentReminderFragment();
    }

    public void openConfirmBooking(View view) {
        Intent intent =new Intent(getApplicationContext(), BookingActivity.class);
        intent.putExtra("page", 3);
        startActivity(intent);
    }

    public void openAnalytics(View view) {
        startActivity(new Intent(getApplicationContext(), AnalyticsActivity.class));
    }

    public void openCinemas(View view) {
        Intent intent = new Intent(getApplicationContext(), EventsAndCinemasActivity.class);
        intent.putExtra("page",1);
        startActivity(intent);
    }

    public void openEvents(View view) {
        Intent intent = new Intent(getApplicationContext(), EventsAndCinemasActivity.class);
        intent.putExtra("page", 0);
        startActivity(intent);
    }

    public void openReviewStay(View view) {
        startActivity(new Intent(getApplicationContext(), ReviewStayActivity.class));
    }
    public void openFlightReminder(View view){
        startActivity(new Intent(getApplicationContext(), FlightReminderActivity.class));
    }

    public void openLoginReminder(View view) {
        requestloginFragment();
    }

    public void openSlowNetworkReminder(View view) {
        showSlowNetworkOptionsFragment();
    }

    public void openLanguageSetting(View view){
        startActivity(new Intent(getApplicationContext(), LanguageSettingActivity.class));
    }

    public void openHotelSearchList(View view){
        startActivity(new Intent(getApplicationContext(), HotelListingAndSearchActivity.class));
    }

    public void openMoCapture(View view){
        startActivity(new Intent(getApplicationContext(), MocaptureActivity.class));
    }

    public void openLoyaltyCoin(View view){
        startActivity(new Intent(getApplicationContext(), LoyaltyCoinActivity.class));
    }

    public void openUserProfile(View view) {
        Intent intent = new Intent(getApplicationContext(), UserProfileActivity.class);
        intent.putExtra("test", 0);
        startActivity(intent);
    }


    @Override
    public void onConfirmClicked() {

    }

    @Override
    public void onFragmentInteraction() {

    }
}
