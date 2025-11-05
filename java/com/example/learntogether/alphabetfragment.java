package com.example.learntogether;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class alphabetfragment  extends FragmentStateAdapter {
 public alphabetfragment(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
                super(fragmentManager, lifecycle);
            }

        @NonNull
        @Override
        public Fragment createFragment(int position)
        {
            switch(position)
            {
                case 1: return new B();
                case 2: return new C();
                case 3: return new D();
                case 4: return new E();
                case 5: return new F();
                case 6: return new G();
                case 7: return new H();
                case 8: return new I();
                case 9: return new J();
                case 10: return new K();
                case 11: return new L();
                case 12: return new M();
                case 13: return new N();
                case 14: return new O();
                case 15: return new P();
                case 16: return new Q();
                case 17: return new rr();
                case 18: return new S();
                case 19: return new T();
                case 20: return new U();
                case 21: return new V();
                case 22: return new W();
                case 23: return new X();
                case 24: return new Y();
                case 25: return new Z();
            }
            return new A();
        }

        @Override
        public int getItemCount()
        {
            return 26;
        }
}

