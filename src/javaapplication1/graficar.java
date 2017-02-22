/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;

/**
 *
 * @author Loscordonhdez
 */
public class graficar {

    public void grafo(String archivo, String nombre) {
        try {
            File miDir = new File(".");
            String directo = miDir.getCanonicalPath();
            File vo = new File(directo + "\\imagenes\\" + nombre + ".txt");
            BufferedWriter bw;
            if (vo.exists()) {
                bw = new BufferedWriter(new FileWriter(vo));
                bw.write("digraph G\n{" + archivo + "\n}");
//                bw.newLine();
//                bw.write("digraph G\n{" + archivo + "\n}");

            } else {
                bw = new BufferedWriter(new FileWriter(vo));
                bw.write("digraph G\n{" + archivo + "\n}");
            }

            bw.close();
        } catch (Exception e) {
            System.out.println("Errorcito D':");
            System.out.println(e.getMessage());
        }
    }

    public void generar(String name) {
        try {

            File miDir = new File(".");
            String directo = miDir.getCanonicalPath();

            String dotPath = "c:\\Archivos de programa\\Graphviz2.38\\bin\\dot.exe";

            String fileInputPath = directo + "\\imagenes\\" + name + ".txt";
            String fileOutputPath = directo + "\\imagenes\\" + name + ".jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(cmd);
            System.out.println("YA SE GENERO LA IMAGEN");
            p.waitFor();
        } catch (Exception ex) {
            System.out.println("Error en Generar D:");
            ex.printStackTrace();
        } finally {
        }
    }
}
