package pe.edu.upc.mivecindario.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import pe.edu.upc.mivecindario.R;

public class PostActivity extends AppCompatActivity {

    private static final int REQUEST_SIGNUP = 0;
    @InjectView(R.id.contentEditText) EditText contentEditView;
    @InjectView(R.id.signupCompatButton) Button postCompatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        ButterKnife.inject(this);

        postCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WallActivity.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
            }
        });
    }

}
