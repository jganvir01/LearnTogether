package com.example.learntogether;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
public class vegetableFragmentAdapter extends FragmentStateAdapter {
    public vegetableFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch(position)
        {
            case 1:
                return new vegetable2();
            case 2:
                return new vegetable3();
        }
        return new vegetable1();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
