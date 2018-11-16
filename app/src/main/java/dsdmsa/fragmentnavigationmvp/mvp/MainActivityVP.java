package dsdmsa.fragmentnavigationmvp.mvp;


import dsdmsa.fragmentnavigationmvp.fragment.BaseFragment;

public interface MainActivityVP {
    interface View{
        void setFragment(BaseFragment fragment);
    }

    interface Presenter{

        void getRandomFragment();

    }
}
