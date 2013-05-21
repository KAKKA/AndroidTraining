
package jp.mixi.practice.res.animation.beg;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	View imageView = findViewById(R.id.Image1);

    	// Animation Resource を読み込んで、Animation オブジェクトを得る
    	Animation animation = AnimationUtils.loadAnimation(this, R.anim.main);
    	// Animation オブジェクトを View に渡して、アニメーションを開始する
    	imageView.startAnimation(animation);

    }
    @Override
    protected void onStart(){
    	super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
