package ru.ilfat.relaxmedia;

import android.app.FragmentTransaction;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Relax1 extends AppCompatActivity {
    Button btnS1;
    Fragment1 fragment1;
    FragmentTransaction fragmentTransaction;

    MediaPlayer mediaPlayer;
    AudioManager audioManager;
//    CheckBox chLoop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax1);

        fragment1=new Fragment1();
        btnS1=(Button) findViewById(R.id.btnS1);
        audioManager=(AudioManager) getSystemService(AUDIO_SERVICE);
//        chLoop=(CheckBox) findViewById(R.id.chLoop);
//        chLoop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (mediaPlayer!=null)
//                    mediaPlayer.setLooping(isChecked);
//            }
//        });

    }
    public void onClickBtnS1(View v) {

        fragmentTransaction=getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmentCont,fragment1);
        fragmentTransaction.commit();


        mediaPlayer=MediaPlayer.create(this,R.raw.kasta);
        mediaPlayer.start();


    }
}
