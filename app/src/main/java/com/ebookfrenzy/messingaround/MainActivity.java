package com.ebookfrenzy.messingaround;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private Button answerYesButton, answerNoButton;
    private EditText userNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        answerYesButton=(Button)findViewById(R.id.answer_yes_button);
        answerNoButton=(Button)findViewById(R.id.answer_no_button);
        userNameEditText=(EditText)findViewById(R.id.users_name_edit_text);
    }

    public void onYesButtonClick(View view)
    {
        String userName= String.valueOf(userNameEditText.getText());
        String yourYesResponse = "That is great" + " "+userName;

        Toast.makeText(this,yourYesResponse,Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClick(View view)
    {
        String userName= String.valueOf(userNameEditText.getText());
        String yourNoResponse = "To bad" + " "+userName;

        Toast.makeText(this,yourNoResponse,Toast.LENGTH_LONG).show();
    }
}
