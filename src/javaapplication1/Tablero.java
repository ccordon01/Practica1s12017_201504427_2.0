package javaapplication1;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Loscordonhdez
 */
public class Tablero extends javax.swing.JFrame {

    public ListaCircular lista_jugadores = new ListaCircular();
    public Matriz m = new Matriz();
    public ListaSimple diccionario = new ListaSimple();
    public ListaSimple letras = new ListaSimple();
    public ListaCola letras_cola = new ListaCola();
    public int dim;
    public Letras letra1;
    public Letras letra2;
    public Letras letra3;
    public Letras letra4;
    public Letras letra5;
    public Letras letra6;
    public Letras letra7;
    int[] label1orign = new int[2];
    int[] label1pos = new int[2];
    int[] label2orign = new int[2];
    int[] label2pos = new int[2];
    int[] label3orign = new int[2];
    int[] label3pos = new int[2];
    int[] label4orign = new int[2];
    int[] label4pos = new int[2];
    int[] label5orign = new int[2];
    int[] label5pos = new int[2];
    int[] label6orign = new int[2];
    int[] label6pos = new int[2];
    int[] label7orign = new int[2];
    int[] label7pos = new int[2];
    int sizex = 0;
    int sizey = 0;

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
    }

    public void carga() {
        jLabel8.setBackground(Color.white);
        jLabel9.setBackground(Color.white);
        jLabel10.setBackground(Color.white);
        jLabel11.setBackground(Color.white);
        jLabel12.setBackground(Color.white);
        jLabel13.setBackground(Color.white);
        jLabel14.setBackground(Color.white);
        sizex = (int) (tablero_panel.getWidth() / dim);
        sizey = (int) (tablero_panel.getHeight() / dim);
        label1orign[0] = jLabel8.getX();
        label1orign[1] = jLabel8.getY();
        label2orign[0] = jLabel9.getX();
        label2orign[1] = jLabel9.getY();
        label3orign[0] = jLabel10.getX();
        label3orign[1] = jLabel10.getY();
        label4orign[0] = jLabel11.getX();
        label4orign[1] = jLabel11.getY();
        label5orign[0] = jLabel12.getX();
        label5orign[1] = jLabel12.getY();
        label6orign[0] = jLabel13.getX();
        label6orign[1] = jLabel13.getY();
        label7orign[0] = jLabel14.getX();
        label7orign[1] = jLabel14.getY();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                JPanel tab = new JPanel();
                JLabel text = new JLabel();
                text.setText(i+","+j);
                //System.out.println("estoy leyendo: " + m.item(i, j).datos.toString());
                if (m.item(i, j).datos.toString().equals("3")) {
                    tab.setBackground(Color.cyan);
                    //text.setText("x3");
                    tab.add(text);
                } else if (m.item(i, j).datos.toString().equals("2")) {
                    tab.setBackground(Color.LIGHT_GRAY);
                    //text.setText("x2");
                    tab.add(text);
                } else {
                    tab.setBackground(Color.white);
                    tab.add(text);
                }
                tab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                tab.setBounds((sizex * i), (sizey * j), sizex, sizey);
                tablero_panel.add(tab);
            }
        }
        tablero_panel.setBackground(new java.awt.Color(0, 153, 153));
        /*jButton2.setSize(sizex - 5, sizey - 5);
        jButton3.setSize(sizex - 5, sizey - 5);
        jButton4.setSize(sizex - 5, sizey - 5);
        jButton5.setSize(sizex - 5, sizey - 5);
        jButton6.setSize(sizex - 5, sizey - 5);
        jButton7.setSize(sizex - 5, sizey - 5);
        jButton8.setSize(sizex - 5, sizey - 5);*/
        String[] array = new String[lista_jugadores.tam];
        for (int i = 0; i < lista_jugadores.tam; i++) {
            Jugadores player = lista_jugadores.nodoPosicion(i);
            array[i] = player.getNombre_usuario() + " - " + player.getPuntos();
        }
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = array;

            @Override
            public int getSize() {
                return strings.length;
            }

            @Override
            public String getElementAt(int i) {
                return strings[i];
            }
        });
    }

    public void reload(Jugadores player) {
        jLabel3.setText(player.nombre_usuario);
        letra1 = (Letras) player.palabras.nodoPosicionO(0);
        letra2 = (Letras) player.palabras.nodoPosicionO(1);
        letra3 = (Letras) player.palabras.nodoPosicionO(2);
        letra4 = (Letras) player.palabras.nodoPosicionO(3);
        letra5 = (Letras) player.palabras.nodoPosicionO(4);
        letra6 = (Letras) player.palabras.nodoPosicionO(5);
        letra7 = (Letras) player.palabras.nodoPosicionO(6);
        jLabel8.setText(letra1.letra);
        jLabel9.setText(letra2.letra);
        jLabel10.setText(letra3.letra);
        jLabel11.setText(letra4.letra);
        jLabel12.setText(letra5.letra);
        jLabel13.setText(letra6.letra);
        jLabel14.setText(letra7.letra);
        jCheckBox1.setText(letra1.letra);
        jCheckBox2.setText(letra2.letra);
        jCheckBox3.setText(letra3.letra);
        jCheckBox4.setText(letra4.letra);
        jCheckBox10.setText(letra5.letra);
        jCheckBox9.setText(letra6.letra);
        jCheckBox6.setText(letra7.letra);
        //jCheckBox4
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        tablero_panel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 680));
        setMinimumSize(new java.awt.Dimension(1250, 680));
        setPreferredSize(new java.awt.Dimension(1250, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1250, 680));
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(151, 222, 222));
        jPanel6.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("R");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });
        jPanel6.add(jLabel8);
        jLabel8.setBounds(640, 535, 70, 46);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("R");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel9MouseReleased(evt);
            }
        });
        jPanel6.add(jLabel9);
        jLabel9.setBounds(640, 490, 70, 46);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("R");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel10MouseDragged(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });
        jPanel6.add(jLabel10);
        jLabel10.setBounds(710, 490, 70, 46);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("R");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel11MouseDragged(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
        });
        jPanel6.add(jLabel11);
        jLabel11.setBounds(780, 490, 70, 46);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("R");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel12MouseDragged(evt);
            }
        });
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });
        jPanel6.add(jLabel12);
        jLabel12.setBounds(780, 535, 70, 46);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("R");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);
        jLabel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel13MouseDragged(evt);
            }
        });
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
        });
        jPanel6.add(jLabel13);
        jLabel13.setBounds(710, 580, 70, 48);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("R");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setOpaque(true);
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel14MouseDragged(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
        });
        jPanel6.add(jLabel14);
        jLabel14.setBounds(710, 535, 70, 46);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(null);
        jPanel6.add(jPanel8);
        jPanel8.setBounds(640, 490, 210, 138);

        tablero_panel.setBackground(new java.awt.Color(0, 153, 153));
        tablero_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablero_panel.setMinimumSize(new java.awt.Dimension(620, 620));
        tablero_panel.setPreferredSize(new java.awt.Dimension(620, 620));
        tablero_panel.setLayout(null);
        jPanel6.add(tablero_panel);
        tablero_panel.setBounds(10, 11, 620, 620);

        jTabbedPane1.setBackground(new java.awt.Color(0, 51, 51));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista De Las Fichas Activas", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista De Jugadores", jPanel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Matriz Tablero", jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cola De Fichas", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista Diccionario", jPanel1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jPanel6.add(jPanel7);
        jPanel7.setBounds(859, 50, 374, 523);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setText("Area De Reportes");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(859, 11, 241, 25);

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Turno:");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(643, 25, 73, 19);

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jugador");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(643, 50, 216, 37);

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Puntuacion:");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(643, 101, 132, 19);

        jScrollPane2.setViewportView(jList1);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(643, 126, 203, 130);

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nueva Palabra:");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(643, 267, 151, 19);
        jPanel6.add(jTextField1);
        jTextField1.setBounds(643, 292, 178, 25);

        jButton1.setText("Agregar");
        jPanel6.add(jButton1);
        jButton1.setBounds(775, 319, 71, 23);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cambiar Letras:");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(643, 348, 159, 19);

        jCheckBox1.setText("jCheckBox1");
        jPanel6.add(jCheckBox1);
        jCheckBox1.setBounds(643, 374, 81, 23);

        jCheckBox2.setText("jCheckBox1");
        jPanel6.add(jCheckBox2);
        jCheckBox2.setBounds(765, 374, 81, 23);

        jCheckBox3.setText("jCheckBox1");
        jPanel6.add(jCheckBox3);
        jCheckBox3.setBounds(643, 400, 81, 23);

        jCheckBox4.setText("jCheckBox1");
        jPanel6.add(jCheckBox4);
        jCheckBox4.setBounds(765, 400, 81, 23);

        jCheckBox6.setText("jCheckBox1");
        jPanel6.add(jCheckBox6);
        jCheckBox6.setBounds(643, 426, 81, 23);

        jCheckBox9.setText("jCheckBox1");
        jPanel6.add(jCheckBox9);
        jCheckBox9.setBounds(643, 452, 81, 23);

        jCheckBox10.setText("jCheckBox1");
        jPanel6.add(jCheckBox10);
        jCheckBox10.setBounds(765, 426, 81, 23);

        jButton9.setText("Cancelar Todo");
        jPanel6.add(jButton9);
        jButton9.setBounds(1040, 580, 164, 47);

        jButton10.setText("Validar Todo");
        jPanel6.add(jButton10);
        jButton10.setBounds(870, 580, 151, 47);

        jButton11.setText("Cambiar");
        jPanel6.add(jButton11);
        jButton11.setBounds(730, 460, 120, 23);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1250, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        // TODO add your handling code here:
        Movimiento(jLabel9, evt);
    }//GEN-LAST:event_jLabel9MouseDragged

    private void jLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseReleased
        // TODO add your handling code here:
        FinMovimiento(jLabel9, evt);
    }//GEN-LAST:event_jLabel9MouseReleased

    private void jLabel10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseDragged
        // TODO add your handling code here:
        Movimiento(jLabel10, evt);
    }//GEN-LAST:event_jLabel10MouseDragged

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
        // TODO add your handling code here:
        FinMovimiento(jLabel10, evt);
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseDragged
        // TODO add your handling code here:
        Movimiento(jLabel11, evt);
    }//GEN-LAST:event_jLabel11MouseDragged

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
        // TODO add your handling code here:
        FinMovimiento(jLabel11, evt);
    }//GEN-LAST:event_jLabel11MouseReleased

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        // TODO add your handling code here:
        FinMovimiento(jLabel13, evt);
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jLabel13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseDragged
        // TODO add your handling code here:
        Movimiento(jLabel13, evt);
    }//GEN-LAST:event_jLabel13MouseDragged

    private void jLabel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseDragged
        // TODO add your handling code here:
        Movimiento(jLabel14, evt);
    }//GEN-LAST:event_jLabel14MouseDragged

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        // TODO add your handling code here:
        FinMovimiento(jLabel14, evt);
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
        // TODO add your handling code here:
        FinMovimiento(jLabel12, evt);
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseDragged
        // TODO add your handling code here:
        Movimiento(jLabel12, evt);
    }//GEN-LAST:event_jLabel12MouseDragged

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        // TODO add your handling code here:
        Movimiento(jLabel8, evt);
    }//GEN-LAST:event_jLabel8MouseDragged

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        // TODO add your handling code here:
        FinMovimiento(jLabel8, evt);
    }//GEN-LAST:event_jLabel8MouseReleased

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel tablero_panel;
    // End of variables declaration//GEN-END:variables

    private void Movimiento(JLabel label, java.awt.event.MouseEvent mme) {
        label.setSize(sizex, sizey);
        label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label.setBackground(Color.red);
        label.setLocation(label.getX() + mme.getX() - label.getWidth() / 2,
                label.getY() + mme.getY() - label.getHeight() / 2);
        if (label == jLabel8) {
            label1pos[0] = label.getX() + mme.getX() - label.getWidth() / 2;
            label1pos[1] = label.getY() + mme.getY() - label.getHeight() / 2;
            //System.out.println("se detuvo en x: "+(label.getX() + mme.getX() - label.getWidth() / 2)+ " y: "+ (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel9) {
            label2pos[0] = label.getX() + mme.getX() - label.getWidth() / 2;
            label2pos[1] = label.getY() + mme.getY() - label.getHeight() / 2;
            //System.out.println("se detuvo en x: "+(label.getX() + mme.getX() - label.getWidth() / 2)+ " y: "+ (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel10) {
            label3pos[0] = label.getX() + mme.getX() - label.getWidth() / 2;
            label3pos[1] = label.getY() + mme.getY() - label.getHeight() / 2;
            //System.out.println("se detuvo en x: "+(label.getX() + mme.getX() - label.getWidth() / 2)+ " y: "+ (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel11) {
            label4pos[0] = label.getX() + mme.getX() - label.getWidth() / 2;
            label4pos[1] = label.getY() + mme.getY() - label.getHeight() / 2;
            //System.out.println("se detuvo en x: "+(label.getX() + mme.getX() - label.getWidth() / 2)+ " y: "+ (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel12) {
            label5pos[0] = label.getX() + mme.getX() - label.getWidth() / 2;
            label5pos[1] = label.getY() + mme.getY() - label.getHeight() / 2;
            //System.out.println("se detuvo en x: "+(label.getX() + mme.getX() - label.getWidth() / 2)+ " y: "+ (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel13) {
            label6pos[0] = label.getX() + mme.getX() - label.getWidth() / 2;
            label6pos[1] = label.getY() + mme.getY() - label.getHeight() / 2;
            //System.out.println("se detuvo en x: "+(label.getX() + mme.getX() - label.getWidth() / 2)+ " y: "+ (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel14) {
            label7pos[0] = label.getX() + mme.getX() - label.getWidth() / 2;
            label7pos[1] = label.getY() + mme.getY() - label.getHeight() / 2;
            //System.out.println("se detuvo en x: "+(label.getX() + mme.getX() - label.getWidth() / 2)+ " y: "+ (label.getY() + mme.getY() - label.getHeight() / 2));
        }
    }

    private void FinMovimiento(JLabel label, MouseEvent mme) {
        int x = (label.getX() + mme.getX() - label.getWidth() / 2);
        x += (int) (sizex / 2);
        int y = (label.getY() + mme.getY() - label.getHeight() / 2);
        int labelx = -1;
        int labely = -1;
        for (int i = 0; i < dim; i++) {
            if (x >= tablero_panel.getX() && x <= (tablero_panel.getX() +(sizex + (sizex * i)))) {
                labelx = tablero_panel.getX() + (sizex * i);
                System.out.println("x:" + i);
                break;
            }
        }
        for (int i = 0; i < dim; i++) {
            if (y >= tablero_panel.getY() && y <= (sizey + (sizey * i))) {
                labely = tablero_panel.getY() + (sizey * i);
                System.out.println("y:" + i);
                break;
            }
        }

        if (label == jLabel8) {
            if (labelx > 0 && labely > 0) {
                label.setLocation(labelx, labely);
            } else {
                label.setSize(70, 46);
                label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                label.setLocation(label1orign[0], label1orign[1]);
            }
            System.out.println("se detuvo en x: " + (label.getX() + mme.getX() - label.getWidth() / 2) + " y: " + (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel9) {
            if (labelx > 0 && labely > 0) {
                label.setLocation(labelx, labely);
            } else {
                label.setSize(70, 46);
                label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                label.setLocation(label2orign[0], label2orign[1]);
            }
            System.out.println("se detuvo en x: " + (label.getX() + mme.getX() - label.getWidth() / 2) + " y: " + (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel10) {
            if (labelx > 0 && labely > 0) {
                label.setLocation(labelx, labely);
            } else {
                label.setSize(70, 46);
                label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                label.setLocation(label3orign[0], label3orign[1]);
            }
            System.out.println("se detuvo en x: " + (label.getX() + mme.getX() - label.getWidth() / 2) + " y: " + (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel11) {
            if (labelx > 0 && labely > 0) {
                label.setLocation(labelx, labely);
            } else {
                label.setSize(70, 46);
                label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                label.setLocation(label4orign[0], label4orign[1]);
            }
            System.out.println("se detuvo en x: " + (label.getX() + mme.getX() - label.getWidth() / 2) + " y: " + (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel12) {
            if (labelx > 0 && labely > 0) {
                label.setLocation(labelx, labely);
            } else {
                label.setSize(70, 46);
                label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                label.setLocation(label5orign[0], label5orign[1]);
            }
            System.out.println("se detuvo en x: " + (label.getX() + mme.getX() - label.getWidth() / 2) + " y: " + (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel13) {
            if (labelx > 0 && labely > 0) {
                label.setLocation(labelx, labely);
            } else {
                label.setSize(sizex, sizey);
                label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                label.setLocation(label6orign[0], label6orign[1]);
            }
            System.out.println("se detuvo en x: " + (label.getX() + mme.getX() - label.getWidth() / 2) + " y: " + (label.getY() + mme.getY() - label.getHeight() / 2));
        } else if (label == jLabel14) {
            if (labelx > 0 && labely > 0) {
                label.setLocation(labelx, labely);
            } else {
                label.setSize(70, 46);
                label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                label.setLocation(label7orign[0], label7orign[1]);
            }
            System.out.println("se detuvo en x: " + (label.getX() + mme.getX() - label.getWidth() / 2) + " y: " + (label.getY() + mme.getY() - label.getHeight() / 2));
        }
    }
}
