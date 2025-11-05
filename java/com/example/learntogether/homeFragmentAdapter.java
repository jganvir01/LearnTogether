package com.example.learntogether;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class homeFragmentAdapter extends FragmentStateAdapter {
    public homeFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch(position)
        {
            case 1:
                return new home2();
            case 2:
                return new home3();
        }
        return new home_();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}