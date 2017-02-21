/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author cech
 */
public class LeerXml {

    public int dimension = 0;
    public Matriz m = null;
    public ListaSimple diccionario = new ListaSimple();
    public void cargarXml() {
        //Se crea un SAXBuilder para poder parsear el archivo
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("archivo.xml");
        try {
            //Se crea el documento a traves del archivo
            Document document = (Document) builder.build(xmlFile);

            //Se obtiene la raiz 'tables'
            Element rootNode = document.getRootElement();

            //Se obtiene la lista de hijos de la raiz 'tables'
            List list = rootNode.getChildren("dimension");
            List list_dobles = rootNode.getChildren("dobles");
            List list_triples = rootNode.getChildren("triples");
            List list_diccionario = rootNode.getChildren("diccionario");
            //Se recorre la lista de hijos de 'tables'
            for (int i = 0; i < list.size(); i++) {
                //Se obtiene el elemento 'tabla'
                Element tabla = (Element) list.get(i);
                System.out.println("Dimension: " + tabla.getText());
                dimension = Integer.parseInt(tabla.getText());
                m = new Matriz(dimension, dimension);
            }
            for (int i = 0; i < list_dobles.size(); i++) {
                //Se obtiene el elemento 'tabla'
                Element tabla = (Element) list_dobles.get(i);
                //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
                //String nombreTabla = tabla.getAttributeValue("nombre");

                //System.out.println("Tabla: " + nombreTabla);
                //Se obtiene la lista de hijos del tag 'tabla'
                List lista_campos = tabla.getChildren();

                //System.out.println("\tNombre\t\tTipo\t\tValor");
                //Se recorre la lista de campos
                for (int j = 0; j < lista_campos.size(); j++) {
                    //Se obtiene el elemento 'campo'
                    Element campo = (Element) lista_campos.get(j);

                    //Se obtienen los valores que estan entre los tags '<campo></campo>'
                    //Se obtiene el valor que esta entre los tags '<nombre></nombre>'
                    String x = campo.getChildTextTrim("x");

                    //Se obtiene el valor que esta entre los tags '<tipo></tipo>'
                    String y = campo.getChildTextTrim("y");
                    m.item(Integer.parseInt(x) -1, Integer.parseInt(y) -1).datos = 2;
                    System.out.println("Puntos Dobles en la posicion X:" + x + " Y: " + y);
                }
            }
            for (int i = 0; i < list_triples.size(); i++) {
                //Se obtiene el elemento 'tabla'
                Element tabla = (Element) list_triples.get(i);
                //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
                //String nombreTabla = tabla.getAttributeValue("nombre");

                //System.out.println("Tabla: " + nombreTabla);
                //Se obtiene la lista de hijos del tag 'tabla'
                List lista_campos = tabla.getChildren();

                //System.out.println("\tNombre\t\tTipo\t\tValor");
                //Se recorre la lista de campos
                for (int j = 0; j < lista_campos.size(); j++) {
                    //Se obtiene el elemento 'campo'
                    Element campo = (Element) lista_campos.get(j);

                    //Se obtienen los valores que estan entre los tags '<campo></campo>'
                    //Se obtiene el valor que esta entre los tags '<nombre></nombre>'
                    String x = campo.getChildTextTrim("x");

                    //Se obtiene el valor que esta entre los tags '<tipo></tipo>'
                    String y = campo.getChildTextTrim("y");
                    m.item(Integer.parseInt(x) -1, Integer.parseInt(y) -1).datos = 3;
                    System.out.println("Puntos Triples en la posicion X:" + x + " Y: " + y);
                }
            }

            for (int i = 0; i < list_diccionario.size(); i++) {
                //Se obtiene el elemento 'tabla'
                Element tabla = (Element) list_diccionario.get(i);
                //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
                //String nombreTabla = tabla.getAttributeValue("nombre");

                //System.out.println("Tabla: " + nombreTabla);
                //Se obtiene la lista de hijos del tag 'tabla'
                List lista_campos = tabla.getChildren();

                //System.out.println("\tNombre\t\tTipo\t\tValor");
                //Se recorre la lista de campos
                for (int j = 0; j < lista_campos.size(); j++) {
                    //Se obtiene el elemento 'campo'
                    Element campo = (Element) lista_campos.get(j);
                    System.out.println("Palabra: "+ campo.getText() + " tamano lista " + diccionario.getsize()) ;
                    diccionario.insertarAlFinal(campo.getText());
                }
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        }
    }

}
