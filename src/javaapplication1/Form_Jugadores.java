/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import javax.swing.*;

/**
 *
 * @author cech
 */
public class Form_Jugadores extends javax.swing.JFrame {

    ListaCircular lista_jugadores = new ListaCircular();
    Matriz m = new Matriz();
    ListaSimple diccionario = new ListaSimple();
    ListaSimple letras = new ListaSimple();
    ListaCola letras_cola = new ListaCola();
    int dim;

    /**
     * Creates new form Form_Jugadores
     */
    public Form_Jugadores() {
        initComponents();
        LeerXml xml = new LeerXml();
        xml.cargarXml();
        m = xml.m;
        dim = xml.dimension;
        
        diccionario = xml.diccionario;
        for (int i = 0; i < xml.dimension; i++) {
            for (int j = 0; j < xml.dimension; j++) {
                if (m.item(i, j) != null) {
                    //System.out.println("nodo existe " + " valor: " + m.item(i, j).datos.toString());
                } else {
                    System.out.println("pise");
                }
            }
        }
        //System.out.println("antes de empezar " + diccionario.getsize());
        //System.out.println("datos " + diccionario.primerNodo.datos.toString());
        for (int i = 0; i < diccionario.getsize(); i++) {
            //System.out.println("nodo palabra " + diccionario.nodoPosicion(i));
        }
        //System.out.println(diccionario.nodoPosicionKill(1));
        for (int i = 0; i < diccionario.getsize(); i++) {
            //System.out.println("nodo palabra " + diccionario.nodoPosicion(i));
        }

        //System.out.println("size: " + (letras.getsize() - 1));
        for (int i = 0; i < 12; i++) {
            letras.insertarAlFinal("A");
            letras.insertarAlFinal("E");
        }
        for (int i = 0; i < 9; i++) {
            letras.insertarAlFinal("O");
        }
        for (int i = 0; i < 6; i++) {
            letras.insertarAlFinal("I");
            letras.insertarAlFinal("S");
        }
        for (int i = 0; i < 5; i++) {
            letras.insertarAlFinal("R");
            letras.insertarAlFinal("U");
            letras.insertarAlFinal("N");
        }
        for (int i = 0; i < 4; i++) {
            letras.insertarAlFinal("C");
            letras.insertarAlFinal("T");
            letras.insertarAlFinal("L");
        }
        for (int i = 0; i < 2; i++) {
            letras.insertarAlFinal("H");
            letras.insertarAlFinal("P");
            letras.insertarAlFinal("M");
            letras.insertarAlFinal("B");
            letras.insertarAlFinal("G");
        }
        for (int i = 0; i < 1; i++) {
            letras.insertarAlFinal("Z");
            letras.insertarAlFinal("Ñ");
            letras.insertarAlFinal("X");
            letras.insertarAlFinal("J");
            letras.insertarAlFinal("Q");
            letras.insertarAlFinal("F");
            letras.insertarAlFinal("V");
            letras.insertarAlFinal("Y");
        }
        Random rand = new Random();
        System.out.println("size: " + (letras.getsize() - 1));
        while ((letras.getsize() - 1) > 0) {
            String letter = letras.nodoPosicionKill(rand.nextInt(letras.getsize() - 1));
            //System.out.println(letras.nodoPosicionKill(rand.nextInt(letras.getsize() - 1)) + " actual: " + letras.getsize()); 
            if (letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("l") || letter.equalsIgnoreCase("n") || letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("s")) {
                //System.out.println("Letra: " + letter + " puntos: " + 1);
                letras_cola.insertarAlFinal(new Letras(letter, 1));
            } else if (letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("g")) {
                //System.out.println("Letra: " + letter + " puntos: " + 2);
                letras_cola.insertarAlFinal(new Letras(letter, 2));
            } else if (letter.equalsIgnoreCase("c") || letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("p")) {
                //System.out.println("Letra: " + letter + " puntos: " + 3);
                letras_cola.insertarAlFinal(new Letras(letter, 3));
            } else if (letter.equalsIgnoreCase("h") || letter.equalsIgnoreCase("f") || letter.equalsIgnoreCase("v") || letter.equalsIgnoreCase("y")) {
                //System.out.println("Letra: " + letter + " puntos: " + 4);
                letras_cola.insertarAlFinal(new Letras(letter, 4));
            } else if (letter.equalsIgnoreCase("q")) {
                //System.out.println("Letra: " + letter + " puntos: " + 5);
                letras_cola.insertarAlFinal(new Letras(letter, 5));
            } else if (letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("ñ") || letter.equalsIgnoreCase("x")) {
                //System.out.println("Letra: " + letter + " puntos: " + 8);
                letras_cola.insertarAlFinal(new Letras(letter, 8));
            } //else (letter.equalsIgnoreCase("c") || letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("p")) {
            else {
                //System.out.println("Letra: " + letter + " puntos: " + 10);
                letras_cola.insertarAlFinal(new Letras(letter, 10));
            }
        }
        if (m.primerNodo == null) {
            System.out.println("pise");
        }
        if (m.primerNodo.siguienteNodo == null) {
            System.out.println("pise x2");
        }
        if (m.primerNodo.inferiorNodo == null) {
            System.out.println("pise x3");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingreso De Jugadores");

        jLabel2.setText("Nombre De Usuario:");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton1)))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user = jTextField1.getText();
        if (lista_jugadores.estaVacia()) {
            ListaSimple letras_j = new ListaSimple();
            for (int i = 0; i < 7; i++) {
                Letras temp_l = (Letras) letras_cola.eliminarDelFrente();
                //System.out.println("Letra " + user + " string " + temp_l.getLetra());
                letras_j.insertarAlFinal(temp_l);
            }
            Jugadores gamer = new Jugadores(user, 0, letras_j);
            JOptionPane.showMessageDialog(null, "Usuario Creado");
            lista_jugadores.insertarAlFinal(gamer);
        } else {
            if (lista_jugadores.primerNodo.siguienteNodo == null) {
                System.out.println("si null");
            }
            if (lista_jugadores.primerNodo != null) {
                System.out.println("ño");
            }
            if (lista_jugadores.ultimoNodo != null) {
                System.out.println("ño ul");
                Jugadores temp_j = (Jugadores) lista_jugadores.ultimoNodo.datos;
                System.out.println("en ultimo esta " + temp_j.nombre_usuario);
            }
            if (lista_jugadores.ultimoNodo.siguienteNodo == lista_jugadores.primerNodo) {
                System.out.println("si vuelta");
            }
            if (lista_jugadores.primerNodo.siguienteNodo == lista_jugadores.ultimoNodo) {
                System.out.println("si ultimo");
            }
            //System.out.println("opcion 2");
            Boolean crear = lista_jugadores.validar(user);
            //System.out.println("tamaño " + lista_jugadores.getsize());
            /*for (int i = 0; i < lista_jugadores.getsize(); i++) {
                Jugadores temp_j = (Jugadores) lista_jugadores.nodoPosicion(i);
            System.out.println("opcion prueba "+temp_j.getNombre_usuario());
                if (user.equals(temp_j.getNombre_usuario())) {
                    crear = false;
                    JOptionPane.showMessageDialog(null, "Usuario Ya Existe");
                }
            }*/
            if (crear) {
                ListaSimple letras_j = new ListaSimple();
                for (int i = 0; i < 7; i++) {
                    Letras temp_l = (Letras) letras_cola.eliminarDelFrente();
                    //System.out.println("Letra " + user + " string " + temp_l.getLetra());
                    letras_j.insertarAlFinal(temp_l);
                }
                Jugadores gamer = new Jugadores(user, 0, letras_j);
                lista_jugadores.insertarAlFinal(gamer);
                JOptionPane.showMessageDialog(null, "Usuario Creado");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario Ya Existe");
            }
        }
        jTextField1.setText("");
        jTextField1.setFocusable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (1 < lista_jugadores.tam) {
            Random rand = new Random();
            Tablero tab = new Tablero();
            tab.diccionario = diccionario;
            tab.dim = dim;
            tab.lista_jugadores = lista_jugadores;
            tab.letras_cola = letras_cola;
            tab.m = m;
            tab.carga();
            //rand.nextInt(letras.getsize() - 1)
            int random=0;
            //do{
            random = (int) (Math.random() * (lista_jugadores.tam - 1));
            //System.out.println("posicion "+random + " Tamaño actual: "+lista_jugadores.tam );
            //}while(random==0);
            Jugadores player = lista_jugadores.nodoPosicion(random);
            tab.jugador_actual= lista_jugadores.nodoPosicionN(random) ;
            JOptionPane.showMessageDialog(null, "Comienza la partida: "+player.getNombre_usuario());
            //System.out.println("posicion "+random);
            tab.reload(player);
            //tab.mstar();
            tab.timer();
            tab.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Como minimo 2 jugadores");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Jugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
