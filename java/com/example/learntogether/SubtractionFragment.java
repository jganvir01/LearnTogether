package com.example.learntogether;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SubtractionFragment extends FragmentStateAdapter {
    public SubtractionFragment(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1: return new Twominustwo();
            case 2: return new Sixminusthree();
            case 3: return new Threeminustwo();
        }

        return new Sevenminusfive();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
