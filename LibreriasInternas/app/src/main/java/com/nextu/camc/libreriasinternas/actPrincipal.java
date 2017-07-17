package com.nextu.camc.libreriasinternas;

import android.media.*;
import android.provider.MediaStore.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;


public class actPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lytprincipal);

        Audio objAudio = new Audio();
        Files objFile = new Files();
        Video objVideo = new Video();
        FaceDetector objFaceDetector = new FaceDetector(78,78,78);
        Base64 objBase64;
    }
}
