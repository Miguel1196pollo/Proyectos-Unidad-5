package mx.edu.utng.seccion_06_fragments_lab.Activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mx.edu.utng.seccion_06_fragments_lab.Fragments.DetailsFragment;
import mx.edu.utng.seccion_06_fragments_lab.Models.Mail;
import mx.edu.utng.seccion_06_fragments_lab.R;

/**
 * Created by Toshiba on 11/04/2017.
 */
public class DetailsActivity extends AppCompatActivity {


    private String subject;
    private String message;
    private String sender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        if (getIntent().getExtras() != null) {
            subject = getIntent().getStringExtra("subject");
            message = getIntent().getStringExtra("message");
            sender = getIntent().getStringExtra("senderName");
        }

        Mail mail = new Mail(subject, message, sender);

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
        detailsFragment.renderMail(mail);

    }
}
