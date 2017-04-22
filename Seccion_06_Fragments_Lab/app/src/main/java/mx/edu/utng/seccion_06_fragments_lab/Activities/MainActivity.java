package mx.edu.utng.seccion_06_fragments_lab.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import mx.edu.utng.seccion_06_fragments_lab.Fragments.DetailsFragment;
import mx.edu.utng.seccion_06_fragments_lab.Fragments.ListFragment;
import mx.edu.utng.seccion_06_fragments_lab.Models.Mail;
import mx.edu.utng.seccion_06_fragments_lab.R;

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener {


    private boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMultiPanel();

    }

    @Override
    public void onListClick(Mail mail) {

        if (isMultiPanel) {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
            detailsFragment.renderMail(mail);
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("subject", mail.getSubject());
            intent.putExtra("message", mail.getMessage());
            intent.putExtra("senderName", mail.getSenderName());
            startActivity(intent);
        }

    }

    private void setMultiPanel() {
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail) != null);
    }
}
