package com.example.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myproject.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private EditText et_name, et_password;
    private String name, password;
    Button logbtn;
    Button regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = (EditText) findViewById(R.id.name);
        et_password = (EditText) findViewById(R.id.password);
        logbtn = (Button) findViewById(R.id.logbtn);
        regbtn = (Button) findViewById(R.id.regbtn);


      regbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent intent = new Intent(MainActivity.this, LoginActivity.class);
              startActivity(intent);

          }
      });


        logbtn.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        login();

    }
    });

   }
    public void login(){
        initialize();
        if (!validate()){
            Toast.makeText(this,"signup  valid",Toast.LENGTH_LONG).show();
        }else {
            onSignupSuccess();
        }
    }
    public void onSignupSuccess(){

    }
    public boolean validate(){
        boolean valid =true;
        if (name.equals("admin")&& password.equals("1234")){

            valid = false ;

            Intent intent = new Intent(MainActivity.this, item.class);
            startActivity(intent);
        }

        return valid;
    }

    public void initialize(){
        name = et_name.getText().toString().trim();
        password =et_password.getText().toString().trim();


}

}


