package br.com.fiap;

public class Radio {
        // atributos não inicializa, é diferente de variável, eles só vão existir quando tiver o objeto
        public int volume;
        public float estacao;
        //métodos
        public void aumentarVolume() {

            volume++;
        }

        public void diminuirVolume(){
            volume--;
        }

        public void trocarEstacao (float frequencia) {
            estacao = frequencia;
        }
        }
}
