package com.example.learntogether;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class community_helperfragment extends FragmentStateAdapter {
    public community_helperfragment(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch(position)
        {
            case 1:
                return new fire_fighter();
            case 2:
                return new pilot();
        }
        return new doctor();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
