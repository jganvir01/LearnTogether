package com.example.learntogether;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class fruitsFragmentAdapter extends FragmentStateAdapter{

    public fruitsFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch(position)
        {
            case 1:
                return new fruits2();
            case 2:
                return new fruits3();
        }
        return new fruits1();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}