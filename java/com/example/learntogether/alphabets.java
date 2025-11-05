package com.example.learntogether;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

public class alphabets extends  AppCompatActivity
{
        ViewPager2 viewpager2;
        alphabetfragment adapter;
        MediaPlayer mp = new MediaPlayer();
         @Override
    protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_alphabets);

            viewpager2 = findViewById(R.id.view_pager2);

            FragmentManager fm = getSupportFragmentManager();
            adapter = new alphabetfragment(fm,getLifecycle());
            viewpager2.setAdapter(adapter);

        }//on create end

    public void play_audio(View view)
    {
        int id=view.getId();
                if(id== R.id.a || id== R.id.ap)
                {
                    mp = MediaPlayer.create(this, R.raw.a_for_apple);
                    mp.start();
                }
                else if(id== R.id.b || id== R.id.bp)
                {
                    mp = MediaPlayer.create(this, R.raw.b_for_ball);
                    mp.start();
                }
                else if(id== R.id.c || id== R.id.cp)
                {
                    mp = MediaPlayer.create(this, R.raw.c_for_cat);
                    mp.start();
                }
                else if(id== R.id.d || id== R.id.dp)
                {
                    mp = MediaPlayer.create(this, R.raw.d_for_dog);
                    mp.start();
                }
                else if(id== R.id.e || id== R.id.ep)
                {
                    mp = MediaPlayer.create(this, R.raw.e_for_elephant);
                    mp.start();
                }
                else if(id== R.id.f || id== R.id.fp)
                {
                    mp = MediaPlayer.create(this, R.raw.f_for_fish);
                    mp.start();
                }
                else if(id== R.id.g || id== R.id.gp)
                {
                    mp = MediaPlayer.create(this, R.raw.g_for_grapes);
                    mp.start();
                }
                else if(id== R.id.h || id== R.id.hp)
                {
                    mp = MediaPlayer.create(this, R.raw.h_for_horse);
                    mp.start();
                }
                //i=8
                else if(id== R.id.i || id== R.id.ip)
                {
                    mp = MediaPlayer.create(this, R.raw.i_for_ice_cream);
                    mp.start();
                }
                else if(id== R.id.j || id== R.id.jp)
                {
                    mp = MediaPlayer.create(this, R.raw.j_for_joker);
                    mp.start();
                }
                else if(id== R.id.k || id== R.id.kp)
                {
                    mp = MediaPlayer.create(this, R.raw.k_for_kite);
                    mp.start();
                }
                else if(id== R.id.l || id== R.id.lp)
                {
                    mp = MediaPlayer.create(this, R.raw.l_for_lion);
                    mp.start();
                }
                else if(id== R.id.m || id== R.id.mp)
                {
                    mp = MediaPlayer.create(this, R.raw.m_for_mouse);
                    mp.start();
                }
                else if(id== R.id.n || id== R.id.np)
                {
                    mp = MediaPlayer.create(this, R.raw.n_for_nest);
                    mp.start();
                }
                else if(id== R.id.o || id== R.id.op)
                {
                    mp = MediaPlayer.create(this, R.raw.o_for_orange);
                    mp.start();
                }
                else if(id== R.id.p || id== R.id.pp)
                {
                    mp = MediaPlayer.create(this, R.raw.p_for_peacock);
                    mp.start();
                }
                else if(id== R.id.q || id== R.id.qp)
                {
                    mp = MediaPlayer.create(this, R.raw.q_for_queen);
                    mp.start();
                }
                else if(id== R.id.r || id== R.id.rp)
                {
                    mp = MediaPlayer.create(this, R.raw.r_for_rabbit);
                    mp.start();
                }
                else if(id== R.id.s || id== R.id.sp)
                {
                    mp = MediaPlayer.create(this, R.raw.s_for_ship);
                    mp.start();
                }
                else if(id== R.id.t || id== R.id.tp)
                {
                    mp = MediaPlayer.create(this, R.raw.t_for_tiger);
                    mp.start();
                }
                else if(id== R.id.u || id== R.id.up)
                {
                    mp = MediaPlayer.create(this, R.raw.u_for_umbrella);
                    mp.start();
                }
                else if(id== R.id.v || id== R.id.vp)
                {
                    mp = MediaPlayer.create(this, R.raw.v_for_violin);
                    mp.start();
                }
                else if(id== R.id.w || id== R.id.wp)
                {
                    mp = MediaPlayer.create(this, R.raw.w_for_watch);
                    mp.start();
                }
                else if(id== R.id.x || id== R.id.xp)
                {
                    mp = MediaPlayer.create(this, R.raw.x_for_x_mas_tree);
                    mp.start();
                }
                else if(id== R.id.y || id== R.id.yp)
                {
                    mp = MediaPlayer.create(this, R.raw.y_for_yak);
                    mp.start();
                }
                else if(id== R.id.z || id== R.id.zp)
                {
                    mp = MediaPlayer.create(this, R.raw.z_for_zebra);
                    mp.start();
                }
           //}//while end
        }//play audio
    public void back_english(View view)
    {
        Intent i = new Intent(getApplicationContext(),English.class);
        startActivity(i);
    }
    public void back_home(View view)
    {
        Intent i = new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }}
