package dsdmsa.fragmentnavigationmvp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dsdmsa.fragmentnavigationmvp.R;
import dsdmsa.fragmentnavigationmvp.mvp.FragmentOneVP;
import dsdmsa.fragmentnavigationmvp.presenters.FragmentTowPresenter;

public class FragmentTow extends BaseFragment implements FragmentOneVP.View{

    /**
     * fragment presenter
     */
    private FragmentOneVP.Presenter presenter;
    //views
    private TextView textView;
    private Button button;

    @Override
    protected int getLayout() {
        return R.layout.fragment_layout;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = new FragmentTowPresenter(this);
        textView = (TextView) rootView.findViewById(R.id.tv_text);
        button = (Button) rootView.findViewById(R.id.btn_interact);

        presenter.getText();
        /**
         * the on click method tels the default navigation presenter to show the fragment one
         */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationPresenter.addFragment(new FragmentOne());
            }
        });
    }

    @Override
    public void setText(String str) {
        textView.setText(str);
    }
}
