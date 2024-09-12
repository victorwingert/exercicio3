/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author wingert
 */
public class Console {
    public void imprimir(){
        System.out.print("""
                        Bem-vindo ao jogo de slimes

                        Regras:

                        Cada slime comeca com 10 de vida e 5 de energia

                        Cada slime tem 3 habilidades ativadas pelos seguintes comandos:
                        0: Termina o turno
                        1: Ataque
                        2: Energizar
                        3: Especial
                        Cada jogador pode escolher o ancestral do slime no comeco do jogo

                        Os Ancestrais disponiveis sao:

                        1 - Vampiro
                        2 - Dragao
                        3 - Sereia
                        4 - Anjo
                        5 - Demonio


                        """);
    }
}
