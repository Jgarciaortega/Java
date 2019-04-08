package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dominio.Calculadora;
import excepciones.DivisionPorCeroExcepcion;

public class MenuPpal extends JFrame implements KeyListener{

	private JPanel contentPane;
	private JTextField textResultado;
	
	Calculadora calculadora;

	public static void main(String[] args) {

		MenuPpal frame = new MenuPpal();
		frame.setVisible(true);
	}

	public MenuPpal() {

		calculadora = new Calculadora();
		setFont(new Font("Arial", Font.PLAIN, 12));

		setTitle("Calculadora 2.0");		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Toolkit miPantalla = Toolkit.getDefaultToolkit(); 

		//Para que la pantalla se ajuste al centro de cualquier pantalla
		
		Dimension sizeScreen = miPantalla.getScreenSize();
		
		int alturaPantalla  = sizeScreen.height;
		int anchuraPantalla = sizeScreen.width;

		int a = anchuraPantalla / 2 - 207;
		int b = alturaPantalla / 2  - 175;
		
		setBounds(a, b, 350, 415);
		
		//Elimino el icono de java y a�ado otro
		Image miIcono = miPantalla.getImage("src/interfaz/calculadora1.jpg");		
		setIconImage(miIcono);

		//Creacion barra de menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);

		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArchivo.add(mntmAbrir);

		JMenuItem mntmSeparador = new JMenuItem("Separador");
		mnArchivo.add(mntmSeparador);

		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);

		JMenu mnEdicin = new JMenu("Edici\u00F3n");
		menuBar.add(mnEdicin);

		JMenuItem mntmCopiar = new JMenuItem("Copiar");
		mnEdicin.add(mntmCopiar);

		JMenuItem mntmPegar = new JMenuItem("Pegar");
		mnEdicin.add(mntmPegar);

		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		JMenuItem mntmManualDeAyuda = new JMenuItem("Manual de ayuda");
		mnAyuda.add(mntmManualDeAyuda);

		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de");
		mnAyuda.add(mntmAcercaDe);
		getContentPane().setLayout(new BorderLayout(0, 0));

		//Utilidades calculadora
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);


		/******DISPLAY CALCULADORA********/

		JPanel panel_Top = new JPanel();
		contentPane.add(panel_Top, BorderLayout.NORTH);

		textResultado = new JTextField();
		textResultado.setColumns(10);

		//Cambiamos propiedades del display
		textResultado.setBackground(Color.WHITE);
		textResultado.setHorizontalAlignment(JTextField.RIGHT);

		//Marcar que no se puede modificar directamente
		textResultado.setEditable(false);

		//Modificar el texto
		textResultado.setText("0");
		GroupLayout gl_panel_Top = new GroupLayout(panel_Top);
		gl_panel_Top.setHorizontalGroup(
				gl_panel_Top.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Top.createSequentialGroup()
						.addContainerGap()
						.addComponent(textResultado, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
						.addContainerGap())
				);
		gl_panel_Top.setVerticalGroup(
				gl_panel_Top.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_Top.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textResultado, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);
		panel_Top.setLayout(gl_panel_Top);

		//Asignar el Key listener al Display
		textResultado.addKeyListener(this);

		//Poner el foco en el Display cada vez que se haga clic en un boton
		textResultado.requestFocus();

		/*******TECLADO CALCULADORA*******/ 

		JPanel panel_Centro = new JPanel();
		contentPane.add(panel_Centro, BorderLayout.CENTER);

		Calculadora calculadora = new Calculadora();

		JPanel panel_Centro_Centro = new JPanel();
		panel_Centro.add(panel_Centro_Centro);
		panel_Centro_Centro.setSize(100,100);
		GridBagLayout gbl_panel_Centro_Centro = new GridBagLayout();
		gbl_panel_Centro_Centro.columnWidths = new int[]{40,40,40,40,40};
		gbl_panel_Centro_Centro.rowHeights = new int[]{40,40,40,40,40,40};
		gbl_panel_Centro_Centro.columnWeights = new double[]{0.0};
		gbl_panel_Centro_Centro.rowWeights = new double[]{0.0};
		panel_Centro_Centro.setLayout(gbl_panel_Centro_Centro);

		JButton button_MemoryClear = new JButton("MC");
		button_MemoryClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				borrarMemoria();

			}
		});
		GridBagConstraints gbc_button_MemoryClear = new GridBagConstraints();
		gbc_button_MemoryClear.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryClear.fill = GridBagConstraints.BOTH;
		gbc_button_MemoryClear.gridx = 0;
		gbc_button_MemoryClear.gridy = 0;
		panel_Centro_Centro.add(button_MemoryClear, gbc_button_MemoryClear);

		JButton button_MemoryRecall = new JButton("MR");
		button_MemoryRecall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				llamarMemoria();
			}
		});
		GridBagConstraints gbc_button_MemoryRecall = new GridBagConstraints();
		gbc_button_MemoryRecall.fill = GridBagConstraints.BOTH;
		gbc_button_MemoryRecall.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryRecall.gridx = 1;
		gbc_button_MemoryRecall.gridy = 0;
		panel_Centro_Centro.add(button_MemoryRecall, gbc_button_MemoryRecall);

		JButton button_MemoryStorage = new JButton("MS");
		button_MemoryStorage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				guardarNumeroMemoria();
			}
		});
		GridBagConstraints gbc_button_MemoryStorage = new GridBagConstraints();
		gbc_button_MemoryStorage.fill = GridBagConstraints.BOTH;
		gbc_button_MemoryStorage.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryStorage.gridx = 2;
		gbc_button_MemoryStorage.gridy = 0;
		panel_Centro_Centro.add(button_MemoryStorage, gbc_button_MemoryStorage);

		JButton button_MemorySumar = new JButton("M+");
		button_MemorySumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				sumarMemoria();
			}


		});
		GridBagConstraints gbc_button_MemorySumar = new GridBagConstraints();
		gbc_button_MemorySumar.fill = GridBagConstraints.BOTH;
		gbc_button_MemorySumar.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemorySumar.gridx = 3;
		gbc_button_MemorySumar.gridy = 0;
		panel_Centro_Centro.add(button_MemorySumar, gbc_button_MemorySumar);

		JButton button_MemoryRestar = new JButton("M-");
		button_MemoryRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				restarMemoria();
			}
		});
		GridBagConstraints gbc_button_MemoryRestar = new GridBagConstraints();
		gbc_button_MemoryRestar.fill = GridBagConstraints.BOTH;
		gbc_button_MemoryRestar.insets = new Insets(0, 0, 5, 0);
		gbc_button_MemoryRestar.gridx = 4;
		gbc_button_MemoryRestar.gridy = 0;
		panel_Centro_Centro.add(button_MemoryRestar, gbc_button_MemoryRestar);

		JButton button_Retroceder = new JButton("\u2190");
		button_Retroceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				retroceder();
			}
		});
		GridBagConstraints gbc_button_Retroceder = new GridBagConstraints();
		gbc_button_Retroceder.fill = GridBagConstraints.BOTH;
		gbc_button_Retroceder.insets = new Insets(0, 0, 5, 5);
		gbc_button_Retroceder.gridx = 0;
		gbc_button_Retroceder.gridy = 1;
		panel_Centro_Centro.add(button_Retroceder, gbc_button_Retroceder);

		JButton button_ClearError = new JButton("CE");
		button_ClearError.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				clearError();
			}
		});
		GridBagConstraints gbc_button_ClearError = new GridBagConstraints();
		gbc_button_ClearError.fill = GridBagConstraints.BOTH;
		gbc_button_ClearError.insets = new Insets(0, 0, 5, 5);
		gbc_button_ClearError.gridx = 1;
		gbc_button_ClearError.gridy = 1;
		panel_Centro_Centro.add(button_ClearError, gbc_button_ClearError);

		JButton button_Clear = new JButton("C");
		button_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				clear();
			}
		});
		GridBagConstraints gbc_button_Clear = new GridBagConstraints();
		gbc_button_Clear.fill = GridBagConstraints.BOTH;
		gbc_button_Clear.insets = new Insets(0, 0, 5, 5);
		gbc_button_Clear.gridx = 2;
		gbc_button_Clear.gridy = 1;
		panel_Centro_Centro.add(button_Clear, gbc_button_Clear);

		JButton button_CambiarSigno = new JButton("+/-");
		button_CambiarSigno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cambiarSigno();
			}
		});
		GridBagConstraints gbc_button_CambiarSigno = new GridBagConstraints();
		gbc_button_CambiarSigno.fill = GridBagConstraints.BOTH;
		gbc_button_CambiarSigno.insets = new Insets(0, 0, 5, 5);
		gbc_button_CambiarSigno.gridx = 3;
		gbc_button_CambiarSigno.gridy = 1;
		panel_Centro_Centro.add(button_CambiarSigno, gbc_button_CambiarSigno);

		JButton button_RaizCuadrada = new JButton("\u221A");
		button_RaizCuadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				raiz();

			}
		});
		GridBagConstraints gbc_button_RaizCuadrada = new GridBagConstraints();
		gbc_button_RaizCuadrada.fill = GridBagConstraints.BOTH;
		gbc_button_RaizCuadrada.insets = new Insets(0, 0, 5, 0);
		gbc_button_RaizCuadrada.gridx = 4;
		gbc_button_RaizCuadrada.gridy = 1;
		panel_Centro_Centro.add(button_RaizCuadrada, gbc_button_RaizCuadrada);

		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("7");			
			}

		});
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 2;
		panel_Centro_Centro.add(button_7, gbc_button_7);

		JButton button_8 = new JButton("8");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("8");			
			}

		});
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 1;
		gbc_button_8.gridy = 2;
		panel_Centro_Centro.add(button_8, gbc_button_8);

		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("9");			
			}

		});
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 2;
		panel_Centro_Centro.add(button_9, gbc_button_9);

		JButton button_Dividir = new JButton("/");
		button_Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				asignarOperacion("/");
			}			
		});
		GridBagConstraints gbc_button_Dividir = new GridBagConstraints();
		gbc_button_Dividir.fill = GridBagConstraints.BOTH;
		gbc_button_Dividir.insets = new Insets(0, 0, 5, 5);
		gbc_button_Dividir.gridx = 3;
		gbc_button_Dividir.gridy = 2;
		panel_Centro_Centro.add(button_Dividir, gbc_button_Dividir);

		JButton button_Porcentaje = new JButton("%");
		button_Porcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				asignarOperacion("%");
			}
		});
		GridBagConstraints gbc_button_Porcentaje = new GridBagConstraints();
		gbc_button_Porcentaje.fill = GridBagConstraints.BOTH;
		gbc_button_Porcentaje.insets = new Insets(0, 0, 5, 0);
		gbc_button_Porcentaje.gridx = 4;
		gbc_button_Porcentaje.gridy = 2;
		panel_Centro_Centro.add(button_Porcentaje, gbc_button_Porcentaje);


		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("4");			
			}

		});
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 3;
		panel_Centro_Centro.add(button_4, gbc_button_4);



		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("5");			
			}

		});
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 3;
		panel_Centro_Centro.add(button_5, gbc_button_5);

		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("6");			
			}

		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 2;
		gbc_button_6.gridy = 3;
		panel_Centro_Centro.add(button_6, gbc_button_6);

		JButton button_Multiplicar = new JButton("*");
		button_Multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				asignarOperacion("*");
			}			
		});
		GridBagConstraints gbc_button_Multiplicar = new GridBagConstraints();
		gbc_button_Multiplicar.fill = GridBagConstraints.BOTH;
		gbc_button_Multiplicar.insets = new Insets(0, 0, 5, 5);
		gbc_button_Multiplicar.gridx = 3;
		gbc_button_Multiplicar.gridy = 3;
		panel_Centro_Centro.add(button_Multiplicar, gbc_button_Multiplicar);

		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				inversa();
			}
		});
		GridBagConstraints gbc_btnx = new GridBagConstraints();
		gbc_btnx.fill = GridBagConstraints.BOTH;
		gbc_btnx.insets = new Insets(0, 0, 5, 0);
		gbc_btnx.gridx = 4;
		gbc_btnx.gridy = 3;
		panel_Centro_Centro.add(btnx, gbc_btnx);

		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("1");			
			}

		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 4;
		panel_Centro_Centro.add(button_1, gbc_button_1);


		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("2");			
			}

		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 4;
		panel_Centro_Centro.add(button_2, gbc_button_2);

		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("3");			
			}

		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 4;
		panel_Centro_Centro.add(button_3, gbc_button_3);

		JButton button_Restar = new JButton("-");
		button_Restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				asignarOperacion("-");
			}			
		});
		GridBagConstraints gbc_button_Restar = new GridBagConstraints();
		gbc_button_Restar.fill = GridBagConstraints.BOTH;
		gbc_button_Restar.insets = new Insets(0, 0, 5, 5);
		gbc_button_Restar.gridx = 3;
		gbc_button_Restar.gridy = 4;
		panel_Centro_Centro.add(button_Restar, gbc_button_Restar);

		JButton button_Igual = new JButton("=");
		button_Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				calcular();
			}
		});
		GridBagConstraints gbc_button_Igual = new GridBagConstraints();
		gbc_button_Igual.fill = GridBagConstraints.BOTH;
		gbc_button_Igual.gridheight = 2;
		gbc_button_Igual.gridx = 4;
		gbc_button_Igual.gridy = 4;
		panel_Centro_Centro.add(button_Igual, gbc_button_Igual);

		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero("0");			
			}

		});
		GridBagConstraints gbc_button_0 = new GridBagConstraints();
		gbc_button_0.fill = GridBagConstraints.BOTH;
		gbc_button_0.gridwidth = 2;
		gbc_button_0.insets = new Insets(0, 0, 0, 5);
		gbc_button_0.gridx = 0;
		gbc_button_0.gridy = 5;
		panel_Centro_Centro.add(button_0, gbc_button_0);

		JButton button_Coma = new JButton(",");
		button_Coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				insertarNumero(".");
			}
		});
		GridBagConstraints gbc_button_Coma = new GridBagConstraints();
		gbc_button_Coma.fill = GridBagConstraints.BOTH;
		gbc_button_Coma.insets = new Insets(0, 0, 0, 5);
		gbc_button_Coma.gridx = 2;
		gbc_button_Coma.gridy = 5;
		panel_Centro_Centro.add(button_Coma, gbc_button_Coma);

		JButton button_Sumar = new JButton("+");
		button_Sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				asignarOperacion("+");
			}
		});
		GridBagConstraints gbc_button_Sumar = new GridBagConstraints();
		gbc_button_Sumar.fill = GridBagConstraints.BOTH;
		gbc_button_Sumar.insets = new Insets(0, 0, 0, 5);
		gbc_button_Sumar.gridx = 3;
		gbc_button_Sumar.gridy = 5;
		panel_Centro_Centro.add(button_Sumar, gbc_button_Sumar);


		/************************************/
		JPanel panel_Bot = new JPanel();
		contentPane.add(panel_Bot, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("CALCULADORA");
		panel_Bot.add(lblNewLabel);

	}

	//FUNCIONES

	private void insertarNumero(String dato) {

		calculadora.concatenar(dato);
		refrescarTextoResultado();	
		textResultado.requestFocus();
	}

	private void asignarOperacion(String operacion)  {


		//Opcion para a�adir un signo negativo al numero que se va a concatenar
		if(calculadora.getNumActual().equals("") && operacion.equals("-") && calculadora.getNum1() == 0) {

			calculadora.concatenar(operacion);

		}else {

			//Opcion en la que entre cuando se introduce primer num
			if(calculadora.getNum1() == 0) {

				try {

					calculadora.setNum1(Double.parseDouble(calculadora.getNumActual()));

				}catch (NumberFormatException e){

					calculadora.reset();

				}
				calculadora.setOperacion(operacion);
				calculadora.setNumActual("");

			}else {

				/*if (!calculadora.getNumActual().equals("-")) {

					calcular();
				}*/

				try {
					//Opcion en la que llega un % para ser concatenado al signo
					//de operacion existente
					if(operacion.equals("%")) {
						//De esta forma no permito concatenar mas % en operacion
						if(!calculadora.getOperacion().contains("%")) {			

							calculadora.setOperacion(calculadora.getOperacion()+"%");
							calcular();						
						}
						//Opcion en la que llega un numero que debera ser operado
					}else {

						calcular();
						calculadora.setOperacion(operacion);

					}

				}catch (NumberFormatException e) {


				}

			}

			//Cada vez que realizamos inversa y calculamos debo reiniciar
			//este valor
			if(calculadora.getEsInversa()) {

				calculadora.ResetInversa();
			}


		}
		textResultado.requestFocus();

	}

	private void calcular()    {

		textResultado.requestFocus();
		
		try {
			//No permito que calcule si numActual esta "".
			//Esto ocurre cuando pulsamos varias veces signos por ejemplo

			if (!calculadora.getNumActual().equals("")){

				calculadora.setNum1(calculadora.calcular());
				redondear(calculadora.getNum1());//Redondeo a 4 decimales en esta funcion
				calculadora.setNumActual(Double.toString(calculadora.getNum1()));
				quitarCerosDerecha (calculadora.getNumActual());
				calculadora.setNum2(0);//Reinicio aqui para que al pulsar de nuevo en operaciones no duplique la operacion
				refrescarTextoResultado();
				calculadora.setNumActual("");
				calculadora.setOperacion("");


			}


		} catch (DivisionPorCeroExcepcion e) {

			calculadora.setNumActual(e.codigoError());
			refrescarTextoResultado();
			calculadora.reset();
		}

	}





	private void raiz() {

		//Opcion para calcular la raiz de una operacion que sea
		//resultado de otra operacion
		if(calculadora.getNumActual().equals("")) {

			calculadora.setNumActual(Double.toString(calculadora.getNum1())); 

		}

		calculadora.setNum1(Double.parseDouble(calculadora.getNumActual()));
		calculadora.setNum1(calculadora.raiz());
		redondear(calculadora.getNum1());//Redondeo a 4 decimales en esta funcion
		calculadora.setNumActual(Double.toString(calculadora.getNum1()));
		quitarCerosDerecha (calculadora.getNumActual());
		refrescarTextoResultado();
		calculadora.setNumActual("");
	}

	private void inversa() {

		try {
			calculadora.inversa();
			calculadora.setNumActual(Double.toString(calculadora.getNum1()));
			quitarCerosDerecha (calculadora.getNumActual());
			refrescarTextoResultado();
			calculadora.setNumActual("");

		} catch (DivisionPorCeroExcepcion e) {

			calculadora.setNumActual(e.codigoError());
			refrescarTextoResultado();
			calculadora.reset();
		}


	}

	private void cambiarSigno() {

		calculadora.cambiarSigno();
		quitarCerosDerecha(calculadora.getNumActual());
		refrescarTextoResultado();	

	}

	private void retroceder() {

		calculadora.retroceder();
		refrescarTextoResultado();

	}

	private void clearError() {

		calculadora.setNumActual("");
		refrescarTextoResultado();

	}

	private void clear() {

		calculadora.reset();
		refrescarTextoResultado();

	}

	private void quitarCerosDerecha (String numActual) {

		int ultDigito = numActual.length()-1;
		int cont = 0;

		if(numActual.charAt(ultDigito) == '0') {

			for(int i = ultDigito; numActual.charAt(i) != ','; i--) {

				if(numActual.charAt(i) == '0') {

					cont ++;

				}else {

					break;
				}

			}

			calculadora.setNumActual(numActual.substring(0 , ultDigito-cont));

		}

	}
	private void refrescarTextoResultado() {

		String screen;


		//No permito que la pantalla muestra "" 
		if(calculadora.getNumActual().equals("")) { 

			screen = "0";

		}else {

			screen = puntoPorComa(calculadora.getNumActual());
			//screen = calculadora.getNumActual();
		}

		textResultado.setText(screen);	

	}

	private String puntoPorComa(String numero) {

		numero = numero.replace('.',',');

		return numero;
	}

	//Con esta funcion solo permito 4 decimales
	private void redondear(double num1) {

		double parteEntera , resultado;
		resultado = num1;

		parteEntera = Math.floor(resultado);
		resultado = (resultado - parteEntera)*Math.pow(10, 4);
		resultado = Math.round(resultado);
		resultado = (resultado / Math.pow(10, 4)) + parteEntera;

		calculadora.setNum1(resultado);

	}

	private void guardarNumeroMemoria() {

		try {
			//Cuando calculamos, el algoritmo resetea numActual, por lo que la 
			//forma de almacenar el numero de la pantalla es guardando num1. Esto
			//ocurre cuando numActual es "".
			if(calculadora.getNumActual().equals("")) {

				calculadora.setNumMemoria(Double.toString(calculadora.getNum1()));
				//Por el contrario, si a�n no hemos operado el numero que almacenamos sera
				//el numActual
			}else {
				calculadora.setNumMemoria(calculadora.getNumActual());

			}

		}catch (NullPointerException e) {



		}catch (NumberFormatException i){


		}

	}

	private void llamarMemoria() {

		try {

			calculadora.setNumActual(calculadora.getNumMemoria());
			quitarCerosDerecha(calculadora.getNumActual());
			refrescarTextoResultado();
			calculadora.setNum1(Double.parseDouble(calculadora.getNumActual()));
			calculadora.setNumActual("");

		}catch (NullPointerException e) {



		}catch (NumberFormatException i){


		}

	}

	private void borrarMemoria() {

		calculadora.setNumMemoria("");

	}

	private void sumarMemoria() {

		calculadora.sumarMemoria();
	}

	private void restarMemoria() {

		calculadora.restarMemoria();
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		switch (key){

		//Menu Izquierda
		case KeyEvent.VK_0: insertarNumero("0"); break;
		case KeyEvent.VK_1: insertarNumero("1"); break;
		case KeyEvent.VK_2: insertarNumero("2"); break;
		case KeyEvent.VK_3: insertarNumero("3"); break;
		case KeyEvent.VK_4: insertarNumero("4"); break;
		case KeyEvent.VK_5: insertarNumero("5"); break;
		case KeyEvent.VK_6: insertarNumero("6"); break;
		case KeyEvent.VK_7: insertarNumero("7"); break;
		case KeyEvent.VK_8: insertarNumero("8"); break;
		case KeyEvent.VK_9: insertarNumero("9"); break;

		case KeyEvent.VK_COMMA: insertarNumero("."); break;
		case KeyEvent.VK_PERIOD: insertarNumero("."); break;


		//Menu Derecha
		case KeyEvent.VK_NUMPAD0: insertarNumero("0");break;
		case KeyEvent.VK_NUMPAD1: insertarNumero("1");break;
		case KeyEvent.VK_NUMPAD2: insertarNumero("2");break;
		case KeyEvent.VK_NUMPAD3: insertarNumero("3");break;
		case KeyEvent.VK_NUMPAD4: insertarNumero("4");break;
		case KeyEvent.VK_NUMPAD5: insertarNumero("5");break;
		case KeyEvent.VK_NUMPAD6: insertarNumero("6");break;
		case KeyEvent.VK_NUMPAD7: insertarNumero("7");break;
		case KeyEvent.VK_NUMPAD8: insertarNumero("8");break;
		case KeyEvent.VK_NUMPAD9: insertarNumero("9");break;

		case KeyEvent.VK_ADD: asignarOperacion("+");break;
		case KeyEvent.VK_SUBTRACT: asignarOperacion("-");break; 
		case KeyEvent.VK_MULTIPLY: asignarOperacion("*");break;
		case KeyEvent.VK_DIVIDE: asignarOperacion("/");break;
		case KeyEvent.VK_ESCAPE: clear(); break;
		case KeyEvent.VK_DECIMAL: insertarNumero("."); break;	
		case KeyEvent.VK_ENTER: calcular(); break;
		case KeyEvent.VK_DELETE: clearError(); break;
		case KeyEvent.VK_BACK_SPACE: retroceder(); break;

		}


		//Combinaciones de teclas
		if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_L){
			borrarMemoria();
		}

		if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_R){
			llamarMemoria();

		}

		if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_M){
	         guardarNumeroMemoria();
	    
		}
		
		if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_P){
	         sumarMemoria();
	    
		}
		
		if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Q){
	         restarMemoria();
	    
		}
		
		


	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}

