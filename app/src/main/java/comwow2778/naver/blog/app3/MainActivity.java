package comwow2778.naver.blog.app3;

import android.graphics.Color;
import android.opengl.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout L1,L2;
    FrameLayout L0;
    ImageView i1,i2;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메뉴를 눌러보세요");
        L0 = (FrameLayout)findViewById(R.id.L0);
        L1 = (LinearLayout)findViewById(R.id.L1);
        L2 = (LinearLayout)findViewById(R.id.L2);
        i1 = (ImageView)findViewById(R.id.i1);
        i2 = (ImageView)findViewById(R.id.i2);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tab1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== R.id.red){
            L0.setBackgroundColor(Color.RED);
        }
        else if(item.getItemId()== R.id.blue){
            L0.setBackgroundColor(Color.BLUE);
        }
        else if(item.getItemId()== R.id.yellow){
            L0.setBackgroundColor(Color.YELLOW);
        }
        else if(item.getItemId() == R.id.m4) {
            L2.setVisibility(View.INVISIBLE);
            L1.setVisibility(View.VISIBLE);
        }
        else if(item.getItemId() == R.id.m5) {
            L1.setVisibility(View.INVISIBLE);
            L2.setVisibility(View.VISIBLE);
        }

        else if(item.getItemId() == R.id.m2) {
            if(L1.getVisibility() == View.VISIBLE) {
                t2.setVisibility(View.INVISIBLE);
                t1.setVisibility(View.VISIBLE);
            }
            else if(L2.getVisibility() == View.VISIBLE){
                t1.setVisibility(View.INVISIBLE);
                t2.setVisibility(View.VISIBLE);
            }
        }
        else if(item.getItemId() ==R.id.m1){
            if(L1.getVisibility() == View.VISIBLE){
                i1.setRotation(30);
            }
            else if(L2.getVisibility() == View.VISIBLE){
                i2.setRotation(30);
            }
        }
        else if(item.getItemId() ==R.id.m3){
            if(L1.getVisibility() == View.VISIBLE) {
                i1.setScaleX(2);
                i1.setScaleY(2);
            }
        else if(L2.getVisibility() == View.VISIBLE){
                i2.setScaleX(2);
                i2.setScaleY(2);
            }
        }
        return super.onOptionsItemSelected(item);
    }



}

