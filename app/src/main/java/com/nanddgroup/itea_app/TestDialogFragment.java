package com.nanddgroup.itea_app;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestDialogFragment extends DialogFragment {

    private IChangeActivityState iChangeActivityState;

    interface IChangeActivityState{
        void changeActivityBackground();
    }


    public TestDialogFragment() {
        // Required empty public constructor
    }

    public static TestDialogFragment newInstance(Bundle bundle){
        TestDialogFragment testDialogFragment = new TestDialogFragment();
        testDialogFragment.setArguments(bundle);
        return testDialogFragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        iChangeActivityState = (IChangeActivityState) activity;
        Log.e("dialog", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        Log.e("dialog", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("dialog", "onCreateView");
        View view = inflater.inflate(R.layout.fragment_test_dialog, container, false);
        Button etTextText = (Button) view.findViewById(R.id.bTest);
        etTextText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "ButtonClicked", Toast.LENGTH_SHORT).show();
                iChangeActivityState.changeActivityBackground();
            }
        });
        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("dialog", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("dialog", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("dialog", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("dialog", "onDetach");
    }
}
