package desmob.ads.usjt.br.filmesdb.model;

public class GeneroDAO {
    public static Genero[] generos;

    private GeneroDAO(){};

    public static Genero[] getGenero(){
        if(generos == null){

            generos = new Genero[19];
            generos[0] = new Genero(1,"Vingadores: Guerra Infinita", "aventura",
                    "Thanos (Josh Brolin) enfim chega à Terra, disposto a reunir as Joias do Infinito.", "Alfredo", "01/04/2018", 10);
            generos[1] = new Genero(2,"Gladiador","acao",
                    "Nos dias finais do reinado de Marcus Aurelius (Richard Harris), o imperador desperta a ira de seu filho Commodus (Joaquin Phoenix) ao tornar...",
                    "Rodiney    ", "03/04/1996", 8);
            generos[2] = new Genero(3,"Animação do azilo winchester",
                    "animacao","Animação animada", "Guimarães", "25/12/2011", 7);
            generos[3] = new Genero(4,"O Auto da Compadecida", "comedia",
                    "Comédia", "Alberto", "12/12/12", 9);
            generos[4] = new Genero(5,"Crime de abril", "crime",
                    "Crime num mês bacana", "Nobunaga", "20/05/2005", 7);
            generos[5] = new Genero(6,"Documentário dos pubs","documentario",
                    "Documentário animal", "Ciro", "07/10/2018", 8);
            generos[6] = new Genero(7,"Drama da serra elétrica", "drama",
                    "Drama forte", "Gomes", "07/07/2018", 5);
            generos[7] = new Genero(8,"Família sinistra","familia",
                    "Família italiana", "EleNão", "07/10/2018", 10);
            generos[8] = new Genero(9,"Fantasia nos alpes","fantasia",
                    "Fantasia", "Bozo", "17/03/1995", 10);
            generos[9] = new Genero(10,"História e Eren","historia",
                    "História", "Bonato", "30/09/2014", 5);
            generos[10] = new Genero(11,"Invocação do Mal","horror",
                    "Horror", "Carlos Drummond", "04/11/2003", 8);
            generos[11] = new Genero(12,"Musical lindo", "musical",
                    "Musical", "Miguel", "26/01/2002", 9);
            generos[12] = new Genero(13,"Mistério misterioso","misterio",
                    "Mistério", "Sanchez","14/11/2007", 2);
            generos[13] = new Genero(14,"Romance em bankog", "romance",
                    "Romance", "João", "10/10/10", 3);
            generos[14] = new Genero(15,"Ficção Científica","ficcao",
                    "Ficcao", "Rodrigo", "25/08/2015", 10);
            generos[15] = new Genero(16,"generos para TV disney","tv",
                    "generos", "Takeshi","13/12/11", 5);
            generos[16] = new Genero(17,"Suspense suspenso","suspense",
                    "Suspense", "Kovacs", "01/09/2009", 7);
            generos[17] = new Genero(18,"Guerra Civil","guerra",
                    "Guerra", "Ortigoza", "10/03/1951", 8);
            generos[18] = new Genero(19,"Procurando Nemo","western",
                    "O passado reserva tristes memórias para Marlin nos recifes de coral, onde perdeu sua esposa e toda a ninhada.", "Neuma", "25/12/2016", 9);
        }


        return generos;

    }

}
