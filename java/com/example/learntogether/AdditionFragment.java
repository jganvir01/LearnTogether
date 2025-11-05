package com.example.learntogether;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdditionFragment extends FragmentStateAdapter {
    public AdditionFragment(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1: return new fiveplusthree();
            case 2: return new Twoplusthree();
            case 3: return new Nineplustwo();
        }

        return new TwoplusTwo();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
