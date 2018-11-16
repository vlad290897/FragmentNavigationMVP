package dsdmsa.fragmentnavigationmvp.presenters;


import java.util.Random;

import dsdmsa.fragmentnavigationmvp.fragment.BaseFragment;
import dsdmsa.fragmentnavigationmvp.fragment.FragmentOne;
import dsdmsa.fragmentnavigationmvp.fragment.FragmentTow;
import dsdmsa.fragmentnavigationmvp.mvp.FragmentNavigation;
import dsdmsa.fragmentnavigationmvp.mvp.MainActivityVP;

/**
 * the main presenter has the main activity presentation logic and the navigation logic
 */
public class MainActivityPresenter implements MainActivityVP.Presenter, FragmentNavigation.Presenter {

    private MainActivityVP.View view;

    public MainActivityPresenter(MainActivityVP.View view) {
        this.view = view;
    }

    /**
     * this method from navigaiton presenter tells the view to show
     * the param fragment
     * @param fragment
     */
    @Override
    public void addFragment(BaseFragment fragment) {
        view.setFragment(fragment);
    }

    @Override
    public void getRandomFragment() {
        if (new Random().nextBoolean()) {
            view.setFragment(new FragmentOne());
        } else {
            view.setFragment(new FragmentTow());
        }
    }
}
