import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanaInicio extends JFrame implements ActionListener{
	FuncionalidadCalculadora FC = new FuncionalidadCalculadora();
    GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	JTextField cajaOperacion, cajaoper;
	JButton Delet, backSpace, Cuadrado, div,
		N7, N8, N9, mult,
		N4, N5, N6, menos,
		N1, N2, N3, mas,
		am, N0, point, igual;
	JRadioButton n;

    public VentanaInicio(){
        gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(1, 1, 1, 1);
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("CALCULADORA");
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);

		String operacion = "";

        cajaoper = new JTextField();
		cajaoper.setEditable(false);
		agregarComponente(cajaoper, 0, 0, 4, 1);


		cajaOperacion = new JTextField();
		cajaOperacion.setEditable(false);
		agregarComponente(cajaOperacion, 0, 1, 4, 1);


		Delet = new JButton("CE");
		Delet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				cajaOperacion.setText("");
				cajaoper.setText("");
				FC.resultado = 0;
				

			}
		});
		agregarComponente(Delet, 0, 2, 1, 1);
		backSpace = new JButton("<--");
		backSpace.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String var = cajaOperacion.getText();
				StringBuilder var1 = new StringBuilder(var);
				int index = var1.length()-1;
				var1.deleteCharAt(index);
				cajaOperacion.setText("");
				cajaOperacion.setText(var1.toString());
			}
		});
		agregarComponente(backSpace, 1, 2, 1, 1);
		Cuadrado = new JButton("X^2");
		Cuadrado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String var = cajaOperacion.getText();
				String vr = "";
				for(int i = 0; i<var.length(); i++){
					char n = var.charAt(i);
					String nn = String.valueOf(n);

					if(nn.matches("[0-9]") || nn.equals(".")){
						vr = vr + nn;
					}
				}
				double num = Double.parseDouble(vr);
				double nu = num * num;
				String nm = String.valueOf(nu);
				cajaoper.setText(var);
				cajaOperacion.setText(nm);
			}
		});
		agregarComponente(Cuadrado, 2, 2, 1, 1);
		div = new JButton("/");
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "/");
			}
		});
		agregarComponente(div, 3, 2, 1, 1);

		N7 = new JButton("7");
		N7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "7");
			}
		});
		agregarComponente(N7, 0, 3, 1, 1);
		N8 = new JButton("8");
		N8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "8");
			}
		});
		agregarComponente(N8, 1, 3, 1, 1);
		N9 = new JButton("9");
		N9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "9");
			}
		});
		agregarComponente(N9, 2, 3, 1, 1);
		mult = new JButton("X");
		mult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "*");
			}
		});
		agregarComponente(mult, 3, 3, 1, 1);

		N4 = new JButton("4");
		N4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "4");
			}
		});
		agregarComponente(N4, 0, 4, 1, 1);
		N5 = new JButton("5");
		N5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "5");
			}
		});
		agregarComponente(N5, 1, 4, 1, 1);
		N6 = new JButton("6");
		N6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "6");
			}
		});
		agregarComponente(N6, 2, 4, 1, 1);
		menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "-");
			}
		});
		agregarComponente(menos, 3, 4, 1, 1);

		N1 = new JButton("1");
		N1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "1");
			}
		});
		agregarComponente(N1, 0, 5, 1, 1);
		N2 = new JButton("2");
		N2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "2");
			}
		});
		agregarComponente(N2, 1, 5, 1, 1);
		N3 = new JButton("3");
		N3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "3");
			}
		});
		agregarComponente(N3, 2, 5, 1, 1);
		mas = new JButton("+");
		mas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "+");
			}
		});
		agregarComponente(mas, 3, 5, 1, 1);


		am = new JButton("+/-");
		am.setBackground(Color.LIGHT_GRAY);
		am.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				FC.cambioSimbolo = !FC.cambioSimbolo;
				cambioColor();
			}
		});
		agregarComponente(am, 0, 6, 1, 1);

		N0 = new JButton("0");
		N0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + "0");
			}
		});
		agregarComponente(N0, 1, 6, 1, 1);
		point = new JButton(".");
		point.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(oper + ".");
			}
		});
		agregarComponente(point, 2, 6, 1, 1);
		igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				FC.leeroperaci(cajaOperacion.getText());
				double resultadoCaja = FC.HacerOperacion();
				String oper = cajaOperacion.getText();
				cajaOperacion.setText(String.valueOf(resultadoCaja));
				cajaoper.setText(oper);
				
			}
		});
		agregarComponente(igual, 3, 6, 1, 1);

    }



	public void agregarComponente(JComponent componente, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}

	public void cambioColor(){
		if(FC.cambioSimbolo){
			am.setBackground(Color.GREEN);
		}
		else if (!FC.cambioSimbolo){
			am.setBackground(Color.LIGHT_GRAY);
		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
	}

	

 }


public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaInicio();
				
			}
		});
    }
}
