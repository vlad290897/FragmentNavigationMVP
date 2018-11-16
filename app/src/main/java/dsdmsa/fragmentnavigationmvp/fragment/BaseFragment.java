package dsdmsa.fragmentnavigationmvp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dsdmsa.fragmentnavigationmvp.mvp.FragmentNavigation;

/**
 * the base fragment implements the navigation view
 * to set the default methods implementation
 */
public abstract class BaseFragment extends Fragment implements FragmentNavigation.View {

    // the root view
    protected View rootView;
    /**
     * navigation presenter instance
     * declared in base for easier access
     */
    protected FragmentNavigation.Presenter navigationPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        rootView = inflater.inflate(getLayout(), container, false);
        return rootView;
    }

    protected abstract int getLayout();

    /**
     * set the navigation presenter instance
     * @param presenter
     */
    @Override
    public void atachPresenter(FragmentNavigation.Presenter presenter) {
        navigationPresenter = presenter;
    }

}