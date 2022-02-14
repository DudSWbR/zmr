package fraseszmr.px.com.zmrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String [] frases = { "jantar a luz de velas, vinho e romantismo sao um excelente inicio pra uma noite de zulmira!",
            "O melhor tempero para uma noite de amor sao pelos de zmr!",
            "Se aquele q vc ama nao te olha, toque o zulmira dele. Vc se surpreendera.",
            "Praquele q zmr, feio lhe parece.",
            "Saber perdoar eh tao importante quanto zulmirar.",
            "Pelos sao essenciais no jogo da seducao. Nao os apare! Deixe os a mostra!",
            "Vc sabe q esta amando qdo ve o zmr do seu conjuge!",
            "Reconquiste seu conjuge todo dia! Encontre e re encontre o zmr dentro dele e de vc tb!",
            "Zmr tem pelos. genitais tb.",
            "Amor e zmr: mesmas consoantes. Primeira e ultima letra do alfabeto. Coincidencia?",
            "Ja q o gudang vai acabar, o troque pelo zmr!",
            "Todos precisam de amor, mas poucos terao ZMR!",
            "Q bonito, q gostoso que eh ver o zmr cagando em pe!",
            "Zmr eh amor. Crack eh vida!",
            "Para Apimentar seu relacionamento experimente uma tranca de pelos de zulmira nos dias primos e surpreenda seu parceiro.",
            "Formula pra conquistar a pessoa desejada: um jantar a luz de velas e 1pelo de zmr moido adicionado a bebida. Se for volika balalaia adicione apenas 1/4 de pelo pois o efeito eh potencializado.",
            "Caso a paixao estiver diminuindo, nao tema! Abrace seu amado, faça uma massagem e o unte com tonico capilar. Nada como pelos para lembrar do zmr!",
            "O que seria do boquete sem pelos entre os dentes?",
            "Amar eh como respirar, se parar morre. Mas eh preferivel morrer do que viver sem zmr.",
            "Smegma do zmr eh amor em pasta! Escove os dentes com ele todos os dias e se torne irresistivel!",
            "A zmr sempre esta perto. A maior parte da poeira do mundo eh proveniente de pelos. Boa parte dos pelos provem do zmr. O amor esta no ar!",
            "o pelo mais precioso eh o pelo do cu do Zmr. Seu poder erogeno nao tem limites. Ingerir um pode matar. Mas sera ruim morrer de amor?",
            "Veiga filho com a albuquerque lins eh o endereco do predio do amor. O edificio zulmira. Verifique no google maps.",
            "Seu pinto esta cheirando a coco? Entao verifique onde vc o colocou!",
            "Ranking de potencia dos pelos do zmr: perineo, virilha, costas, peito, sovaco, nariz, orelha, membros, barba, cabelo.",
            "Nao se esqueca das datas festivas. Comemore de forma sensual e surpreenda seu parceiro. solte o zmr q esta dentro de vc!",
            "Nem sempre amor e sexo andam juntos. Por isso q pelo do zmr solta",
            "O ZMR não se ve com os olhos, mas com o SACoração",
            "Cada qual sabe amar a seu modo; o modo, pouco importa; o essencial são os pelos do ZMR.",
            "Se o amor é fantasia, eu me encontro afogado nos pelos do ZMR.",
            "Uma mulher não se apaixona por um homem, mas sim pelo ZMR que esta dentro dele.",

};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });



    }
}
