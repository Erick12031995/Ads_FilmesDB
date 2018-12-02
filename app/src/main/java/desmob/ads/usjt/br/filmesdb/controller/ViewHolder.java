package desmob.ads.usjt.br.filmesdb.controller;

import android.media.ImageWriter;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {

    private ImageView imagem;
    private TextView linha1, linha2;

    public ViewHolder(TextView linha1, TextView linha2){
        this.linha1 = linha1;
        this.linha2 = linha2;
    }

    public void setLinha1(TextView linha1){
        this.linha1 = linha1;
    }
    public TextView getLinha1(){ return linha1; }

    public void setLinha2(TextView linha2){
        this.linha2 = linha2;
    }
    public TextView getLinha2(){ return linha2; }
}
