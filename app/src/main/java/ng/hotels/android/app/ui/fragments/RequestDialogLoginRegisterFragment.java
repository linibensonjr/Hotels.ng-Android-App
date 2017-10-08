package ng.hotels.android.app.ui.fragments;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

import ng.hotels.android.app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RequestDialogLoginRegisterFragment extends DialogFragment {


    private RequestDialogLoginRegisterFragment.OnFragmentInteractionListener mListener;

    public RequestDialogLoginRegisterFragment() {
        // Required empty public constructor
    }

    public interface OnFragmentInteractionListener {
        void onConfirmClicked();
    }


    public static RequestDialogLoginRegisterFragment newInstance() {
        RequestDialogLoginRegisterFragment fragment = new RequestDialogLoginRegisterFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View root = inflater.inflate(R.layout.fragment_request_dialog_login_register, null);

        builder.setView(root);
        final AlertDialog dialog = builder.create();

        dialog.getWindow().setLayout(364,440);

        return dialog;
    }

}
