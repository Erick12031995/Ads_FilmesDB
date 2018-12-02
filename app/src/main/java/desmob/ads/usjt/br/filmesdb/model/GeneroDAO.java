package desmob.ads.usjt.br.filmesdb.model;

public class GeneroDAO {
    public static Genero[] generos;

    private GeneroDAO(){};

    public static Genero[] getGenero(){
        if(generos == null){

            generos = new Genero[19];
            generos[0] = new Genero(1,"Vingadores: Guerra Infinita","Thanos (Josh Brolin) enfim chega à Terra, disposto a reunir as Joias do Infinito.");
            generos[1] = new Genero(2,"Gladiador","Nos dias finais do reinado de Marcus Aurelius (Richard Harris), o imperador desperta a ira de seu filho Commodus (Joaquin Phoenix) ao tornar...");
            generos[2] = new Genero(3,"Animação do azilo winchester","Animação animada");
            generos[3] = new Genero(4,"O Auto da Compadecida","As aventuras dos nordestinos João Grilo (Matheus Natchergaele), um sertanejo pobre e mentiroso, e Chicó (Selton Mello), o mais covarde dos homens....");
            generos[4] = new Genero(5,"Crime de abril","Crime num mês bacana");
            generos[5] = new Genero(6,"Documentário dos pubs","Documentário animal");
            generos[6] = new Genero(7,"Drama da serra elétrica","Drama forte");
            generos[7] = new Genero(8,"Família sinistra","Família italiana");
            generos[8] = new Genero(9,"Fantasia nos alpes","Fantasia");
            generos[9] = new Genero(10,"História e Eren","História");
            generos[10] = new Genero(11,"Invocação do Mal","Horror");
            generos[11] = new Genero(12,"Musical lindo","Musical");
            generos[12] = new Genero(13,"Mistério misterioso","Mistério");
            generos[13] = new Genero(14,"Romance em bankog","Romance");
            generos[14] = new Genero(15,"Ficção Científica","Ficcao");
            generos[15] = new Genero(16,"Filmes para TV disney","Filmes");
            generos[16] = new Genero(17,"Suspense suspenso","Suspense");
            generos[17] = new Genero(18,"Guerra Civil","Guerra");
            generos[18] = new Genero(19,"Procurando Nemo","O passado reserva tristes memórias para Marlin nos recifes de coral, onde perdeu sua esposa e toda a ninhada.");
        }


        return generos;

    }

}
