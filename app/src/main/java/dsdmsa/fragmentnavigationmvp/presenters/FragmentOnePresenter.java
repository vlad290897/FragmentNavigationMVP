package dsdmsa.fragmentnavigationmvp.presenters;


import dsdmsa.fragmentnavigationmvp.mvp.FragmentOneVP;

public class FragmentOnePresenter implements FragmentOneVP.Presenter {
    private FragmentOneVP.View view;

    public FragmentOnePresenter(FragmentOneVP.View view) {
        this.view = view;
    }

    @Override
    public void getText() {
        view.setText("Text form Presenter ONE");
    }
}
