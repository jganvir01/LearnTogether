package com.example.learntogether;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class domesticFragmentAdapter extends FragmentStateAdapter {
    public domesticFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position) {
            case 1:
                return new domestic2();
            case 2:
                return new domestic3();
            case 3:
                return new domestic4();

        }
        return new domestic1();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
