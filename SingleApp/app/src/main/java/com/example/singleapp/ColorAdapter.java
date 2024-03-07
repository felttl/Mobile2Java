package com.example.singleapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// heritage de classe qui doit s'adapter a ma vision des données
public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {


    // quelles sont mes données ?
    String[] titres, descrption;
    int[] imagesRefs;
    private Context ctx;

    /**
     *
     * @param ctx
     * @param colorTitres
     * @param colorDescs
     * @param colorImgs
     */
    public ColorAdapter(Context ctx, String[] colorTitres, String[] colorDescs, int[] colorImgs) {
        this.ctx=ctx;
        this.titres = colorTitres;
        this.descrption = colorDescs;
        this.imagesRefs = colorImgs;
        // écouteur de clique sur la ligne de l'item
        // on utilisera le cardview complet pour capturer le clic

    }

    /**
     *
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return le layout d'un item
     */
    @NonNull
    @Override
    public ColorAdapter.ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutinf = LayoutInflater.from(this.ctx);
        // sert a mettre "le style des cellule du array dynamique" dans le recyclerView
        View item = layoutinf.inflate(R.layout.lerecyclerview, parent, false);
        return new ColorViewHolder(item);
    }

    /**
     * on affecte les données a chaque élément graphique
     * @param holder The ViewHolder which should be updated to represent the contents of the
     *        item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull ColorAdapter.ColorViewHolder holder, int position) {
        holder.titreColor.setText(this.titres[position]);
        holder.descColor.setText(this.descrption[position]);
        holder.imgColor.setImageResource(this.imagesRefs[position]);
    }

    /**
     * savoir combien d'éléments a afficher
     * @return
     */
    @Override
    public int getItemCount() {
        return this.titres.length;
    }

    public class ColorViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgColor;
        private TextView titreColor, descColor;

        //private CardView cvItemColor;
        public ColorViewHolder(@NonNull View itemView){
            super(itemView);
            imgColor = itemView.findViewById(R.id.ImageNView3);
            titreColor = itemView.findViewById(R.id.titreDeCarteN);
            descColor = itemView.findViewById(R.id.descriptionCarteN);


        }

    }
}
