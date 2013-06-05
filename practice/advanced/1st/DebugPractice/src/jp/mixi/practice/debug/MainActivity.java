
package jp.mixi.practice.debug;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
//実行時間がかかるTOP5  
//org/apache/harmony/dalvik/ddmc/DdmServer.dispatch 0.120
//android/ddm/DdmHandleProfiling.handleChunk             0.096
//java/util/HashMap.get                                                 0.074
//java/lang/Integer.valueOf                                             0.047
//android/ddm/DdmHandleProfiling.handleMPRQ             0.049
