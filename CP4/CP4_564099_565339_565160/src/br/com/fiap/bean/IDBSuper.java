/*
Natalia Souza rm: 564099
Felipe Ishii rm: 565339
Vitória Rodrigues rm: 565160
 */

package br.com.fiap.bean;

import java.io.IOException;

public interface IDBSuper {
    public DragonBallSuper ler(String path) throws IOException;
    public String gravar(String path);
}