package desmob.ads.usjt.br.filmesdb.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import desmob.ads.usjt.br.filmesdb.R;
import desmob.ads.usjt.br.filmesdb.model.Genero;
import desmob.ads.usjt.br.filmesdb.model.Util;

// Commit errado - Deveria ter commit and Push ---------
// Re-Commitnado...

public class DetalheGenero extends Activity {
    private TextView nomeGenero, descricao, diretor, data, popularidade;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_genero);
        nomeGenero = findViewById(R.id.txt_nome);
        diretor = findViewById(R.id.txt_diretor);
        data = findViewById(R.id.txt_data);
        popularidade = findViewById(R.id.txt_popularidade);
        descricao = findViewById(R.id.txt_descricao);

        foto = findViewById(R.id.detalhe_foto_filme);

        Intent intent = getIntent();
        Genero genero = (Genero) intent.getSerializableExtra(ListaGeneroActivity.GENERO1);

        nomeGenero.setText(genero.getNome());
        diretor.setText(genero.getNomeDiretor());
        data.setText(genero.getData());
        descricao.setText(genero.getDescricao());
        popularidade.setText(genero.getPopularidade() + "");

        foto.setImageDrawable(Util.getDrawable2(this, genero.getId()));
    }
}
