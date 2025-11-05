package com.example.learntogether;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class community_helperfragment2 extends FragmentStateAdapter
{

    public community_helperfragment2(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch(position) {
            case 1:
                return new scientist();
            case 2:
                return new teacher();
        }
        return new police();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
