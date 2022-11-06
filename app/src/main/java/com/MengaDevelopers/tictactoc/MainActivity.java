


package com.MengaDevelopers.tictactoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tictactoc.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,egg,egg1,egg2;
    private Button playAgain;
    int container = 0;
    int [] box = new int[9];
    private AdView mAdView;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                super.onAdClicked();
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        });






        AdRequest inadRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-9986980606552169/6938736187", inadRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdClicked() {
                                super.onAdClicked();
                                // Called when a click is recorded for an ad.

                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Set the ad reference to null so you don't show the ad a second time.

                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.

                                mInterstitialAd = null;

                            }

                            @Override
                            public void onAdImpression() {
                                // Called when an impression is recorded for an ad.

                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.

                            }
                        });

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error

                        mInterstitialAd = null;
                    }
                });





        int circle =R.drawable.circle_trip_origin_24;
        int multiple =R.drawable.multiple_clear_24;

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);
        img9=findViewById(R.id.img9);

        playAgain=findViewById(R.id.play_again);


      img1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (box[0]==1){
                  Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
              }else {

                  if (container == 0) {
                      img1.setImageResource(circle);
                      container = 1;

                  } else {

                      img1.setImageResource(multiple);
                      container = 0;
                  }
                  box[0] = 1;
              }

          }
      });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[1]==2){
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                }else {


                    if (container == 0) {
                        img2.setImageResource(circle);
                        container = 1;

                    } else {

                        img2.setImageResource(multiple);
                        container = 0;
                    }
                    box[1]=2;

                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[2]==3){
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                }else {
                    if (container == 0) {
                        img3.setImageResource(circle);
                        container = 1;

                    } else {

                        img3.setImageResource(multiple);
                        container = 0;
                    }
                    box[2]=3;

                }
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[3]==4){
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                }else {
                    if (container == 0) {
                        img4.setImageResource(circle);
                        container = 1;

                    } else {

                        img4.setImageResource(multiple);
                        container = 0;
                    }
                    box[3]=4;
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[4] == 5) {
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();
                } else {

                    if (container == 0) {
                        img5.setImageResource(circle);
                        container = 1;

                    } else {

                        img5.setImageResource(multiple);
                        container = 0;
                    }
                    box[4]=5;

                }
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[5] == 6) {
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();
                } else {

                    if (container == 0) {
                        img6.setImageResource(circle);
                        container = 1;

                    } else {

                        img6.setImageResource(multiple);
                        container = 0;
                    }
                    box[5]=6;
                }
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[6] == 7) {
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();
                } else {

                    if (container == 0) {
                        img7.setImageResource(circle);
                        container = 1;

                    } else {

                        img7.setImageResource(multiple);
                        container = 0;
                    }
                    box[6]=7;
                }
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[7] == 8) {
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();
                } else {

                    if (container == 0) {
                        img8.setImageResource(circle);
                        container = 1;

                    } else {

                        img8.setImageResource(multiple);
                        container = 0;
                    }
                    box[7]=8;
                }
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[8] == 9) {
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();
                } else {

                    if (container == 0) {
                        img9.setImageResource(circle);
                        container = 1;

                    } else {

                        img9.setImageResource(multiple);
                        container = 0;
                    }
                    box[8] =9;
                }
            }
        });
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                } else {

                }

               img1.setImageResource(R.drawable.shocked);
                img2.setImageResource(R.drawable.shocked);
                img3.setImageResource(R.drawable.shocked);
                img4.setImageResource(R.drawable.shocked);
                img5.setImageResource(R.drawable.shocked);
                img6.setImageResource(R.drawable.shocked);
                img7.setImageResource(R.drawable.shocked);
                img8.setImageResource(R.drawable.shocked);
                img9.setImageResource(R.drawable.shocked);
                container = 0;
                box =new int[9];

            }
        });
egg=findViewById(R.id.imageView4);
        egg1=findViewById(R.id.imageView3);
        egg2=findViewById(R.id.imageView2);
egg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        Toast.makeText(MainActivity.this, "Got a new egg", Toast.LENGTH_SHORT).show();
    }
});


        egg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                } else {

                }
                Toast.makeText(MainActivity.this, "Got a new egg", Toast.LENGTH_SHORT).show();
            }
        });
        egg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}