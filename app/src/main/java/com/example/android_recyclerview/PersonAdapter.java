package com.example.android_recyclerview;

// PersonAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<Person> personList;

    // Constructeur
    public PersonAdapter(List<Person> personList) {
        this.personList = personList;
    }

    // 1. Créer le ViewHolder
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_person, parent, false);
        return new PersonViewHolder(view);
    }

    // 2. Remplir les données
    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.bind(person);

        // Gestion du clic sur un élément
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action lors du clic
                // Ex: ouvrir un détail
            }
        });
    }

    // 3. Nombre total d'éléments
    @Override
    public int getItemCount() {
        return personList.size();
    }

    // ViewHolder : Représente un élément de la liste
    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewName;
        private TextView textViewEmail;
        private ImageView imageViewProfile;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
            imageViewProfile = itemView.findViewById(R.id.imageViewProfile);
        }

        public void bind(Person person) {
            textViewName.setText(person.getName());
            textViewEmail.setText(person.getEmail());
            imageViewProfile.setImageResource(person.getProfileImage());
        }
    }
}
