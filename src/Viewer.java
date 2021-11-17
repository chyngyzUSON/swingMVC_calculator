import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Viewer {

    private JTextField textFieldExpression;
    private JTextField textFieldTemp;

    public Viewer() {
        Controller controller = new Controller(this);

        Font font = new Font("Bernard MT Condensed", Font.PLAIN, 15);

        textFieldExpression = new JTextField();
        textFieldExpression.setBounds(10, 10, 270, 40);
        textFieldExpression.setFont(font);
        textFieldExpression.setForeground(Color.RED);
        textFieldExpression.setEditable(false);

        textFieldTemp = new JTextField();
        textFieldTemp.setBounds(10, 60, 270, 40);
        textFieldTemp.setFont(font);
        textFieldTemp.setForeground(Color.RED);
        textFieldTemp.setEditable(false);

        JButton buttonPercent = new JButton("%");
        buttonPercent.setBounds(10, 110, 60, 40);
        buttonPercent.setFont(font);
        buttonPercent.setForeground(Color.RED);
        buttonPercent.addActionListener(controller);
        buttonPercent.setActionCommand("Percent");

        JButton buttonCleanEntry = new JButton("CE");
        buttonCleanEntry.setBounds(80, 110, 60, 40);
        buttonCleanEntry.setFont(font);
        buttonCleanEntry.setForeground(Color.RED);
        buttonCleanEntry.addActionListener(controller);
        buttonCleanEntry.setActionCommand("CleanEntry");

        JButton buttonClean = new JButton("C");
        buttonClean.setBounds(150, 110, 60, 40);
        buttonClean.setFont(font);
        buttonClean.setForeground(Color.RED);
        buttonClean.addActionListener(controller);
        buttonClean.setActionCommand("Clean");

        JButton buttonBack = new JButton("<--");
        buttonBack.setBounds(220, 110, 60, 40);
        buttonBack.setFont(font);
        buttonBack.setForeground(Color.RED);
        buttonBack.addActionListener(controller);
        buttonBack.setActionCommand("Back");

        JButton buttonMultiplicativeInverse = new JButton("1/x");
        buttonMultiplicativeInverse.setBounds(10, 160, 60, 40);
        buttonMultiplicativeInverse.setFont(font);
        buttonMultiplicativeInverse.setForeground(Color.RED);
        buttonMultiplicativeInverse.addActionListener(controller);
        buttonMultiplicativeInverse.setActionCommand("MultiplicativeInverse");

        JButton buttonSquare = new JButton("x\u00B2");
        buttonSquare.setBounds(80, 160, 60, 40);
        buttonSquare.setFont(font);
        buttonSquare.setForeground(Color.RED);
        buttonSquare.addActionListener(controller);
        buttonSquare.setActionCommand("Square");

        JButton buttonRoot = new JButton("\u221A");
        buttonRoot.setBounds(150, 160, 60, 40);
        buttonRoot.setFont(font);
        buttonRoot.setForeground(Color.RED);
        buttonRoot.addActionListener(controller);
        buttonRoot.setActionCommand("Root");

        JButton buttonDiv = new JButton("/");
        buttonDiv.setBounds(220, 160, 60, 40);
        buttonDiv.setFont(font);
        buttonDiv.setForeground(Color.RED);
        buttonDiv.addActionListener(controller);
        buttonDiv.setActionCommand("Div");

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(10, 210, 60, 40);
        buttonSeven.setFont(font);
        buttonSeven.setForeground(Color.RED);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("Seven");

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(80, 210, 60, 40);
        buttonEight.setFont(font);
        buttonEight.setForeground(Color.RED);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("Eight");

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(150, 210, 60, 40);
        buttonNine.setFont(font);
        buttonNine.setForeground(Color.RED);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("Nine");

        JButton buttonMulti = new JButton("*");
        buttonMulti.setBounds(220, 210, 60, 40);
        buttonMulti.setFont(font);
        buttonMulti.setForeground(Color.RED);
        buttonMulti.addActionListener(controller);
        buttonMulti.setActionCommand("Multi");

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(10, 260, 60, 40);
        buttonFour.setFont(font);
        buttonFour.setForeground(Color.RED);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("Four");

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(80, 260, 60, 40);
        buttonFive.setFont(font);
        buttonFive.setForeground(Color.RED);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("Five");

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(150, 260, 60, 40);
        buttonSix.setFont(font);
        buttonSix.setForeground(Color.RED);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("Six");

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(220, 260, 60, 40);
        buttonMinus.setFont(font);
        buttonMinus.setForeground(Color.RED);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("Minus");

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(10, 310, 60, 40);
        buttonOne.setFont(font);
        buttonOne.setForeground(Color.RED);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(80, 310, 60, 40);
        buttonTwo.setFont(font);
        buttonTwo.setForeground(Color.RED);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(150, 310, 60, 40);
        buttonThree.setFont(font);
        buttonThree.setForeground(Color.RED);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("Three");

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(220, 310, 60, 40);
        buttonPlus.setFont(font);
        buttonPlus.setForeground(Color.RED);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("Plus");

        JButton buttonPlusMinus = new JButton("+/-");
        buttonPlusMinus.setBounds(10, 360, 60, 40);
        buttonPlusMinus.setFont(font);
        buttonPlusMinus.setForeground(Color.RED);
        buttonPlusMinus.addActionListener(controller);
        buttonPlusMinus.setActionCommand("PlusMinus");

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(80, 360, 60, 40);
        buttonZero.setFont(font);
        buttonZero.setForeground(Color.RED);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("Zero");

        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(150, 360, 60, 40);
        buttonDot.setFont(font);
        buttonDot.setForeground(Color.RED);
        buttonDot.addActionListener(controller);
        buttonDot.setActionCommand("Dot");

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(220, 360, 60, 40);
        buttonEqual.setFont(font);
        buttonEqual.setForeground(Color.RED);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");

        JFrame frame = new JFrame("My first calculator");
        frame.setSize(310, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(textFieldTemp);
        frame.add(textFieldExpression);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonZero);

        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.add(buttonMulti);
        frame.add(buttonDiv);
        frame.add(buttonEqual);

        frame.add(buttonClean);
        frame.add(buttonCleanEntry);
        frame.add(buttonPercent);
        frame.add(buttonBack);
        frame.add(buttonDot);
        frame.add(buttonPlusMinus);
        frame.add(buttonRoot);
        frame.add(buttonSquare);
        frame.add(buttonMultiplicativeInverse);
    }

    public void updateTemp(String text) {
        textFieldTemp.setText(text);
    }

    public void updateExpression(String text) {
        textFieldExpression.setText(text);
    }
}
