package dsdmsa.fragmentnavigationmvp.mvp;


import dsdmsa.fragmentnavigationmvp.fragment.BaseFragment;

/**
 * Created by dsdmsa on 4/8/17.
 */

public interface FragmentNavigation {
    interface View {
        void atachPresenter(Presenter presenter);

    }

    interface Presenter {
        void addFragment(BaseFragment fragment);
    }
}
