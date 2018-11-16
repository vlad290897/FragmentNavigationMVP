package dsdmsa.fragmentnavigationmvp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dsdmsa.fragmentnavigationmvp.R;
import dsdmsa.fragmentnavigationmvp.fragment.BaseFragment;
import dsdmsa.fragmentnavigationmvp.mvp.MainActivityVP;
import dsdmsa.fragmentnavigationmvp.presenters.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityVP.View{

    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter(this);

        presenter.getRandomFragment();
    }


    /**
     * sets a new fragment on fragment_container frame
     * layout and attaches to it the presenter
     * @param fragment
     */
    @Override
    public void setFragment(BaseFragment fragment) {
        //ataching to fragment the navigation presenter
        fragment.atachPresenter(presenter);
        //showing the presenter on screen
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,fragment)
                .commit();
    }
}
