package desmob.ads.usjt.br.filmesdb.controller;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

import desmob.ads.usjt.br.filmesdb.R;
import desmob.ads.usjt.br.filmesdb.model.Genero;
import desmob.ads.usjt.br.filmesdb.model.Util;

// -- Aqui tambem teve alteracao
public class GeneroAdapter extends BaseAdapter{

    private ArrayList<Genero> generos;
    private Context context;

    public GeneroAdapter(ArrayList<Genero> generos, Context context){
        this.generos = generos;
        this.context = context;
    }

    @Override
    public int getCount(){return generos.size();}

    @Override
    public Object getItem(int i){return generos.get(i);}

    @Override
    public long  getItemId(int i){return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        View linha = view;
        if(linha == null) {

            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            linha = inflater.inflate(R.layout.linha_genero, viewGroup, false);

            ImageView fotoGenero = (ImageView)linha.findViewById(R.id.foto_genero);
            TextView linhaNome = (TextView)linha.findViewById(R.id.linha_nome);
            TextView linhaDetalhe = (TextView)linha.findViewById(R.id.linha_detalhe);

            ViewHolder holder = new ViewHolder(fotoGenero, linhaNome, linhaDetalhe);
            linha.setTag(holder);
        }

        Genero genero = generos.get(i);
        ViewHolder holder = (ViewHolder)linha.getTag();

        holder.getLinha1().setText((genero.getNome() + " - ID " + genero.getId()));
        holder.getLinha2().setText((genero.getNomeDiretor() + " - " + genero.getData()));

            /*
            linhaNome.setText(filme.getNome());
            linhaDetalhe.setText(filme.getDescricao());
            */

        Drawable drawable = Util.getDrawable(context, genero.getGenero());

        holder.getImagem().setImageDrawable(drawable);

        //fotoGenero.setImageDrawable(drawable);

        return linha;
    }
}
