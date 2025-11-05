package com.example.learntogether;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class action_wordsFragment extends FragmentStateAdapter
{
    public action_wordsFragment(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle)
    {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch(position)
        {
            case 1: return new cycling();
            case 2: return new eating();
            case 3: return new running();
            case 4: return new swimming();
            case 5: return new climbing();
        }
        return new reading();
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
