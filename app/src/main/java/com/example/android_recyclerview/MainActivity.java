package com.example.android_recyclerview;

// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PersonAdapter adapter;
    private List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialiser le RecyclerView
        recyclerView = findViewById(R.id.recyclerView);

        // Configurer le LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Créer la liste de données
        createPersonList();

        // Créer et configurer l'adapter
        adapter = new PersonAdapter(personList);
        recyclerView.setAdapter(adapter);

        // Option: Ajouter une ligne de séparation entre les éléments
        recyclerView.addItemDecoration(new DividerItemDecoration(
                this, LinearLayoutManager.VERTICAL));
    }

    private void createPersonList() {
        personList = new ArrayList<>();

        // Ajouter des données d'exemple
        personList.add(new Person("Alice Martin", "alice@email.com", R.drawable.obj));
        personList.add(new Person("Bob Dupont", "bob@email.com", R.drawable.obj));
        personList.add(new Person("Charlie Wilson", "charlie@email.com", R.drawable.obj));
        personList.add(new Person("Diana Ross", "diana@email.com", R.drawable.obj));
        personList.add(new Person("Émilie Laurent", "emilie@email.com", R.drawable.obj));

        // Ajouter plus d'éléments pour le scroll
        for (int i = 6; i <= 20; i++) {
            personList.add(new Person(
                    "Personne " + i,
                    "personne" + i + "@email.com",
                    R.drawable.obj
            ));
        }
    }
}