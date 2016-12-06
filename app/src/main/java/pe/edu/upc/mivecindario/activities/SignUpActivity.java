package pe.edu.upc.mivecindario.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import pe.edu.upc.mivecindario.R;
import pe.edu.upc.mivecindario.model.User;


public class SignUpActivity extends AppCompatActivity {

    private static final String TAG = "SignupActivity";
    private static final int REQUEST_SIGNUP = 0;

    @InjectView(R.id.nameEditText) EditText nameEditText;
    @InjectView(R.id.emailEditText) EditText emailEditText;
    @InjectView(R.id.passwordEditText) EditText passwordEditText;
    @InjectView(R.id.signupCompatButton) Button signupCompatButton;
    @InjectView(R.id.loginTextView) TextView loginTextView;
    @InjectView(R.id.userEditText) EditText userEditText;
    @InjectView(R.id.idEditText) EditText idEditText;
    @InjectView(R.id.addressEditText) EditText addressEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ButterKnife.inject(this);

        signupCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the registration screen and return to the Login activity
                finish();
            }
        });

    }

    public void signup() {
        Log.d(TAG, "Signup");

        if (!validate()) {
            onSignupFailed();
            return;
        }

        signupCompatButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(SignUpActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creando Cuenta...");
        progressDialog.show();

        User user = new User();

        user.setUsuario(userEditText.getText().toString())
                .setNombre(nameEditText.getText().toString())
                .setNumeroDocumento(idEditText.getText().toString())
                .setEmail(emailEditText.getText().toString())
                .setDireccion(addressEditText.getText().toString());

        // TODO: Login Logic


        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        onSignupSuccess();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }


    public void onSignupSuccess() {
        signupCompatButton.setEnabled(true);
        setResult(RESULT_OK, null);
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivityForResult(intent, REQUEST_SIGNUP);
        //finish();
    }

    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Registro falló", Toast.LENGTH_LONG).show();

        signupCompatButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (name.isEmpty() || name.length() < 3) {
            nameEditText.setError("3 caracteres como mínimo");
            valid = false;
        } else {
            nameEditText.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailEditText.setError("ingrese un correo electónico válido");
            valid = false;
        } else {
            emailEditText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            passwordEditText.setError("entre 4 a 10 caracteres alfanuméricos");
            valid = false;
        } else {
            passwordEditText.setError(null);
        }

        return valid;
    }
}
