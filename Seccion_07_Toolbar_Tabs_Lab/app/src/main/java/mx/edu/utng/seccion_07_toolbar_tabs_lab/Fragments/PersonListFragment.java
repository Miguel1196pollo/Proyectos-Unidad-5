package mx.edu.utng.seccion_07_toolbar_tabs_lab.Fragments;

/**
 * Created by Toshiba on 14/04/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mx.edu.utng.seccion_07_toolbar_tabs_lab.Adapters.PersonAdapter;
import mx.edu.utng.seccion_07_toolbar_tabs_lab.Models.Person;
import mx.edu.utng.seccion_07_toolbar_tabs_lab.R;

public class PersonListFragment extends Fragment {

    private List<Person> persons;
    private ListView listView;
    private PersonAdapter adapter;

    public PersonListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        persons = new ArrayList<Person>();
        listView = (ListView) view.findViewById(R.id.listViewPerson);
        adapter = new PersonAdapter(getContext(), R.layout.list_view_item_person, persons);
        listView.setAdapter(adapter);

        return view;
    }

    public void addPerson(Person person) {
        this.persons.add(person);
        adapter.notifyDataSetChanged();
    }

}