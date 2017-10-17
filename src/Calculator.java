import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel MainPanel;
    private JPanel upPanel;
    private JPanel numbersField;
    private JPanel operationsField;
    private JButton multiplybutton;
    private JButton divisionbutton;
    private JButton minusButton;
    private JButton plusButton;
    private JButton resultButton;
    private JButton backspaceButton;
    private JPanel optionsPanel;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton cancelButton;
    private JTextField typingTextField;
    private JButton changeSignButton;
    private JPanel resultJPanel;
    private JLabel resultLabel;
    private JButton a0Button;
    private JButton button1;

    double numbers, answer;
    int calculation;

    public void arithmeticOp() {
        switch (calculation) {
            case 1:
                answer = numbers + Double.parseDouble(typingTextField.getText());
                typingTextField.setText(Double.toString(answer));
                break;

            case 2:
                answer = numbers - Double.parseDouble(typingTextField.getText());
                typingTextField.setText(Double.toString(answer));
                break;

            case 3:
                answer = numbers / Double.parseDouble(typingTextField.getText());
                typingTextField.setText(Double.toString(answer));
                break;

            case 4:
                answer = numbers * Double.parseDouble(typingTextField.getText());
                typingTextField.setText(Double.toString(answer));
                break;
        }


    }


    public Calculator() {


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "3");

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                typingTextField.setText(typingTextField.getText() + "9");
            }
        });
        multiplybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers = Double.parseDouble(typingTextField.getText());
                calculation = 4;
                typingTextField.setText(" ");
                resultLabel.setText(numbers + " " + "*");
            }
        });
        divisionbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers = Double.parseDouble(typingTextField.getText());
                calculation = 3;
                typingTextField.setText(" ");
                resultLabel.setText(numbers + " " + "/");
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers = Double.parseDouble(typingTextField.getText());
                calculation = 2;
                typingTextField.setText(" ");
                resultLabel.setText(numbers + " " + "-");
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers = Double.parseDouble(typingTextField.getText());
                calculation = 1;
                typingTextField.setText(" ");
                resultLabel.setText(numbers + " " + "+");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText("");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typingTextField.setText(typingTextField.getText() + ".");
            }
        });

        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int lenght = typingTextField.getText().length();
                int number = typingTextField.getText().length() - 1;
                String store;

                if (lenght > 0) {
                    StringBuilder back = new StringBuilder(typingTextField.getText());
                    //strinbuilder object "back" stores Strings
                    back.deleteCharAt(number);//method used to delete single character from position "number"
                    store = back.toString();//convert StringBuilder "back" into String
                    typingTextField.setText(store);//"store" set in setText() method

                }
            }
        });

        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmeticOp();
                resultLabel.setText("");

            }
        });


        changeSignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double plusMinus = Double.parseDouble(String.valueOf(typingTextField.getText()));
                plusMinus = plusMinus * (-1);
                typingTextField.setText(String.valueOf(plusMinus));


            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        MainPanel = new JPanel();
        MainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        MainPanel.setEnabled(true);
        MainPanel.setMaximumSize(new Dimension(172, 329));
        MainPanel.setName("");
        MainPanel.setOpaque(false);
        MainPanel.setRequestFocusEnabled(false);
        upPanel = new JPanel();
        upPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        MainPanel.add(upPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        typingTextField = new JTextField();
        typingTextField.setHorizontalAlignment(4);
        typingTextField.setText("");
        upPanel.add(typingTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 56), null, 0, false));
        resultJPanel = new JPanel();
        resultJPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        upPanel.add(resultJPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        resultLabel = new JLabel();
        Font resultLabelFont = this.$$$getFont$$$(null, -1, 14, resultLabel.getFont());
        if (resultLabelFont != null) resultLabel.setFont(resultLabelFont);
        resultLabel.setText("");
        resultJPanel.add(resultLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(0, 37), null, 0, false));
        operationsField = new JPanel();
        operationsField.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), 50, 0));
        MainPanel.add(operationsField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        multiplybutton = new JButton();
        Font multiplybuttonFont = this.$$$getFont$$$(null, Font.BOLD, 14, multiplybutton.getFont());
        if (multiplybuttonFont != null) multiplybutton.setFont(multiplybuttonFont);
        multiplybutton.setText("*");
        operationsField.add(multiplybutton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        divisionbutton = new JButton();
        Font divisionbuttonFont = this.$$$getFont$$$(null, Font.BOLD, 14, divisionbutton.getFont());
        if (divisionbuttonFont != null) divisionbutton.setFont(divisionbuttonFont);
        divisionbutton.setHorizontalTextPosition(0);
        divisionbutton.setText("/");
        operationsField.add(divisionbutton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        minusButton = new JButton();
        Font minusButtonFont = this.$$$getFont$$$(null, Font.BOLD, 14, minusButton.getFont());
        if (minusButtonFont != null) minusButton.setFont(minusButtonFont);
        minusButton.setText("-");
        operationsField.add(minusButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(42, 36), null, 0, false));
        plusButton = new JButton();
        Font plusButtonFont = this.$$$getFont$$$(null, Font.BOLD, 14, plusButton.getFont());
        if (plusButtonFont != null) plusButton.setFont(plusButtonFont);
        plusButton.setText("+");
        operationsField.add(plusButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultButton = new JButton();
        Font resultButtonFont = this.$$$getFont$$$(null, Font.BOLD, 22, resultButton.getFont());
        if (resultButtonFont != null) resultButton.setFont(resultButtonFont);
        resultButton.setHideActionText(false);
        resultButton.setText("=");
        operationsField.add(resultButton, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        optionsPanel = new JPanel();
        optionsPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        MainPanel.add(optionsPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        backspaceButton = new JButton();
        backspaceButton.setText("<---");
        backspaceButton.setVerticalTextPosition(0);
        optionsPanel.add(backspaceButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cancelButton = new JButton();
        cancelButton.setText("C");
        optionsPanel.add(cancelButton, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        changeSignButton = new JButton();
        Font changeSignButtonFont = this.$$$getFont$$$(null, Font.BOLD, 14, changeSignButton.getFont());
        if (changeSignButtonFont != null) changeSignButton.setFont(changeSignButtonFont);
        changeSignButton.setText("+/-");
        optionsPanel.add(changeSignButton, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        numbersField = new JPanel();
        numbersField.setLayout(new GridBagLayout());
        MainPanel.add(numbersField, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a4Button = new JButton();
        a4Button.setText("4");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a4Button, gbc);
        a7Button = new JButton();
        a7Button.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a7Button, gbc);
        a8Button = new JButton();
        a8Button.setText("8");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a8Button, gbc);
        a5Button = new JButton();
        a5Button.setText("5");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a5Button, gbc);
        a6Button = new JButton();
        a6Button.setText("6");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a6Button, gbc);
        a2Button = new JButton();
        a2Button.setText("2");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a2Button, gbc);
        a3Button = new JButton();
        a3Button.setText("3");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a3Button, gbc);
        a1Button = new JButton();
        a1Button.setText("1");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a1Button, gbc);
        a9Button = new JButton();
        a9Button.setText("9");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a9Button, gbc);
        a0Button = new JButton();
        a0Button.setText("0");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(a0Button, gbc);
        button1 = new JButton();
        button1.setText(",");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        numbersField.add(button1, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MainPanel;
    }
}
