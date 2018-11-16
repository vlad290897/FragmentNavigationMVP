package dsdmsa.fragmentnavigationmvp.presenters;


import dsdmsa.fragmentnavigationmvp.mvp.FragmentOneVP;

public class FragmentTowPresenter implements FragmentOneVP.Presenter {
    private FragmentOneVP.View view;

    public FragmentTowPresenter(FragmentOneVP.View view) {
        this.view = view;
    }

    @Override
    public void getText() {
        view.setText("Text form Presenter TOW");
    }

}
