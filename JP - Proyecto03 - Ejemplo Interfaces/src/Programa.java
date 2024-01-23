import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Programa implements ActionListener  {

	public static void main(String[] args) {
		// Creamos una ventana
		JFrame ventana = new JFrame("Mi Ventana");
		// Creamos un panel que ira dentro de la ventana
		JPanel panel = new JPanel();
		// Configuramos el panel
		panel.setBounds(100, 100, 320, 200);
		// Agregamos un boton en el centro
		JButton boton = new JButton("Dame clic <3");
		// Le indicamos al boton quien le va a escuchar sus eventos
		EscuchaBoton oreja = new EscuchaBoton();
		//boton.addActionListener( (ActionListener) oreja );
		boton.addActionListener(   new Programa()   );
		/*
		boton.addActionListener(
				new ActionListener() 
				{
					@Override public void actionPerformed(ActionEvent e) {
						System.out.println("Me encantas...");
					}
				}
		);
		*/
		
		boton.setBounds(136, 92, 48, 16);
		panel.add(boton);
		// Agregamos el panel a la ventana
		ventana.add(panel);
		ventana.setSize(328, 216);
		// Mostramos la ventana
		ventana.show();
	}

	@Override public void actionPerformed(ActionEvent e) {
		System.out.println("Me encantas...");
	}


}