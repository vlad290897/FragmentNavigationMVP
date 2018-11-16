package dsdmsa.fragmentnavigationmvp.mvp;


public interface FragmentOneVP {
    interface View{
        void setText(String str);

    }

    interface Presenter{
        void getText();
    }
}
