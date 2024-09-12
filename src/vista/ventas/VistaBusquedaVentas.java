/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.ventas;

import interfaces.Colores;
import interfaces.Fuentes;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 * Clase Vista Busqueda Ventas.
 * Pantalla De BusquedaVentas.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 24/11/2023
 */
public class VistaBusquedaVentas extends JDialog implements Fuentes,Colores{
    private ImageIcon  ImArt = new ImageIcon(getClass().getResource("/imagenes/articulos/art.jpeg"));
     
    JLabel LblNombre = new JLabel("Producto a buscar");
    public JTextField TxtNombre = new JTextField();
    public JButton BtnAceptar = new JButton("Aceptar");
    public JLabel LblArt = new JLabel(ImArt);
    
    //Tabla donde se visualizaran todos los productos existentes
    public JTable Tabla = new JTable();
    //PAra que aparezca una barra de Desplazamiento Vertical
    JScrollPane ScrollTabla = new JScrollPane(Tabla);
    
    public VistaBusquedaVentas(Frame owner, boolean modal){
        super(owner, modal);
        configuracionInicial();
        agregarComponentes();
        
    }

    private void configuracionInicial() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImArt.getIconWidth(), ImArt.getIconHeight());
        this.setContentPane(LblArt);
        this.setLocationRelativeTo(null);
        this.setTitle("Busqueda Ventas");
        this.setLayout(null);
    }

    private void agregarComponentes() {
        LblNombre.setBounds(250,55,200,40);
        TxtNombre.setBounds(460,55,200,40);
        ScrollTabla.setBounds(50,200,900,200);
        
        BtnAceptar.setBounds(450,500,120,40);
        
        LblNombre.setFont(FUENTE_LBL);
        LblNombre.setBackground(FONDOLBL);
        LblNombre.setOpaque(true);
        this.add(LblNombre);
        this.add(TxtNombre);
        this.add(ScrollTabla);
        
        this.add(BtnAceptar);
    }
}
