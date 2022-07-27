package padrao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sarah Jandozza
 */
public class IMC extends JFrame
{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton calcular;

    public IMC()
    {
        super("Calculando IMC");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("Informe seu peso: ");
        rotulo2 = new JLabel("Informe sua altura: ");
        
        exibir = new JLabel("");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        calcular = new JButton("Calcular");
        
        rotulo1.setBounds(100, 20, 120, 20);
        texto1.setBounds(260, 20, 100 ,20);
        
        rotulo2.setBounds(100, 50, 120, 20);
        texto2.setBounds(260, 50, 100, 20);
        
        calcular.setBounds(150, 90, 150, 30);
        
        exibir.setBounds(50, 140, 400, 25);
        

        calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                        double peso, altura, imc;
                        peso = 0;
                        altura = 0;
                        
                        peso = Double.parseDouble(texto1.getText());
                        altura = Double.parseDouble(texto2.getText());
                        
                        imc = (peso/(altura*altura));
                        
                        if(imc < 18)
                        {
                            exibir.setText("IMC: " + imc + ". Você está abaixo do peso");
                        }  
                            if (imc > 18.5 && imc <= 24.99)
                            {
                                exibir.setText("IMC: " + imc + ". Você está no peso ideal");
                            }
                                else if(imc > 25)
                                {
                                    exibir.setText("IMC: " + imc + ". Você está acima do peso");
                                }
                        
                        exibir.setVisible(true);
                        
                }
            }
        );
        
        texto1.requestFocus();
        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(texto1);
        tela.add(rotulo2);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(calcular);

        setSize(450, 210);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
} 

    public static void main(String[] args) 
    {
       IMC app = new IMC();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
