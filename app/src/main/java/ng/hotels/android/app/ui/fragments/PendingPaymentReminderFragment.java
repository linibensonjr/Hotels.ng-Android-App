package ng.hotels.android.app.ui.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ng.hotels.android.app.R;


public class PendingPaymentReminderFragment extends Fragment {


    private OnFragmentInteractionListener mListener;

    public PendingPaymentReminderFragment() {
        // Required empty public constructor
    }

    public interface OnFragmentInteractionListener {
        void onConfirmClicked();
    }


    public static PendingPaymentReminderFragment newInstance() {
        PendingPaymentReminderFragment fragment = new PendingPaymentReminderFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pending_payment_reminder, container, true);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

}