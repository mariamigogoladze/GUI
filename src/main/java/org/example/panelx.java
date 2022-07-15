package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class panelx extends JFrame {
  GridBagConstraints c = new GridBagConstraints();
  JDialog jd = new JDialog();
  JLabel[] options;
  JTextField[] fields;
  JPanel panelLeft = new JPanel();
  JPanel panelRight = new JPanel();
  JPanel panelBottom = new JPanel();

  public panelx() {
    this.createDialog();
  }

  private void createDialog() {
    jd = new JDialog();
    jd.setBounds(200, 200, 600, 500);
    jd.setMinimumSize(new Dimension(600, 200));
  //  jd.setLayout(new GridBagLayout());
    panelRight.setLayout(new GridBagLayout());
    panelLeft.setLayout(new GridBagLayout());
    jd.setUndecorated(true);


    options = new JLabel[5];
    fields = new JTextField[5];

    c = new GridBagConstraints();
   // c.fill = GridBagConstraints.VERTICAL;
    Border blackline = BorderFactory.createTitledBorder("Title");
    panelLeft.setBorder(blackline);
    panelRight.setBorder(blackline);

    panelLeft.setPreferredSize(new Dimension(300, 170));
    panelRight.setPreferredSize(new Dimension(300, 170));
//    panelBottom.setPreferredSize(new Dimension(290, 150));

    c.insets = new Insets(10, 10, 5, 5);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.anchor = GridBagConstraints.PAGE_START;

    panelBottom.setLayout(new GridBagLayout());

    c.gridx =0;
    c.gridy =0;
    c.weightx = 0.5;
    jd.add(panelLeft, BorderLayout.LINE_START);
    c.gridx =1;
    c.gridy =0;
    c.weightx = 0.5;
    jd.add(panelRight, BorderLayout.LINE_END);
    c.anchor = GridBagConstraints.PAGE_END;
    jd.add(panelBottom, BorderLayout.PAGE_END);

    createIdBox();
    createMyFareKeyBox();
    createComboBox();
    createEthernetBox();
    createDateAndTimeBox();
    createSaveAndCancel();
    createReadOnly();
    createCreditCardCheckbox();
    createLabel();
    createAutoMount();

    jd.show();
    jd.setResizable(true);
  }

  private void createComboBox() {
    JLabel comboLabel = new JLabel("Combo");
    JComboBox connType = new JComboBox<>();
    connType.setMaximumRowCount(4);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    panelLeft.add(comboLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 0;
    panelLeft.add(connType, c);
  }

  private void createLabel() {
    //JLabel idLabel = new JLabel();
    JTextField idInput = new JTextField();
    JTextField idInput2 = new JTextField();
    // c.weightx = 0.250;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 6;
    idInput2.setVisible(false);
    panelRight.add(idInput2, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 6;
    idInput.setVisible(false);
    panelRight.add(idInput, c);
  }

  private void createEthernetBox() {
    JLabel dhcpLabel = new JLabel("dhcp");
    JCheckBox dhcp = new JCheckBox("");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 1;
    panelLeft.add(dhcpLabel, c);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 1;
    panelLeft.add(dhcp, c);

    options[0] = new JLabel("ip");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 2;
    panelLeft.add(options[0], c);

    fields[0] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 2;

    panelLeft.add(fields[0], c);

    options[1] = new JLabel("subnet");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 3;
    panelLeft.add(options[1], c);

    fields[1] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 3;
    panelLeft.add(fields[1], c);

    // Gateway
    options[2] = new JLabel("gateway");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 4;
    panelLeft.add(options[2], c);

    fields[2] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 4;
    panelLeft.add(fields[2], c);

    options[3] = new JLabel("ns1");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 5;
    panelLeft.add(options[3], c);

    fields[3] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 5;
    panelLeft.add(fields[3], c);

    options[4] = new JLabel("ns2");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 6;
    panelLeft.add(options[4], c);

    fields[4] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 6;
    panelLeft.add(fields[4], c);

    dhcp.setEnabled(false);
    dhcpLabel.setEnabled(false);
    setEnableOptions(false);
  }

  private void setEnableOptions(boolean check) {
    for (int i = 0; i < options.length; i++) {
      options[i].setEnabled(check);
      fields[i].setEnabled(check);
    }
  }

  public void createIdBox() {
    JLabel idLabel = new JLabel("ID");
    JTextField idInput = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    panelRight.add(idLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 0;
    idInput.setText("uduu");
    panelRight.add(idInput, c);
  }

  private void createMyFareKeyBox() {
    JLabel myFareKeyLabel = new JLabel("My fare key");
    JTextField myFareKeyInput = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 1;
    panelRight.add(myFareKeyLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 1;
    panelRight.add(myFareKeyInput, c);
  }

  /** Create box to manually select date and time. */
  private void createDateAndTimeBox() {
    JLabel dateLabel = new JLabel("date");
    JTextField dateInput = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 2;
    panelRight.add(dateLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 2;

    panelRight.add(dateInput, c);

    JLabel timeLabel = new JLabel("time");
    JTextField timeInput = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 3;
    panelRight.add(timeLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 3;
    panelRight.add(timeInput, c);
  }

  /** Read Only box with checker whether it is selected or not. */
  private void createReadOnly() {
    JLabel readOnlyLabel = new JLabel("readOnly");
    JCheckBox readOnly = new JCheckBox("");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 4;
    panelRight.add(readOnlyLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 4;
    panelRight.add(readOnly, c);
  }

  /** Credit Card box with checker whether it is selected or not. */
  private void createCreditCardCheckbox() {
    JLabel readOnlyLabel = new JLabel("creditCard");
    JCheckBox creditCard = new JCheckBox("");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 5;
    panelRight.add(readOnlyLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 5;
    panelRight.add(creditCard, c);
  }

  /** Save and Cancel buttons on panel */
  private void createSaveAndCancel() {
    JButton save = new JButton("save");
   // save.setPreferredSize(new Dimension(10,10));
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    panelBottom.add(save, c);

    JButton cancel = new JButton("cancel");
   // cancel.setPreferredSize(new Dimension(10,10));
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 0;
    panelBottom.add(cancel, c);
  }

  private void createAutoMount() {
    JButton mount = new JButton("autoMount");
    c.fill = GridBagConstraints.CENTER;
    c.gridwidth = 2;
    c.gridx = 0;
    c.gridy = 1;
    panelBottom.add(mount, c);
  }

  public static void main(String[] args) {
    new panelx();
  }
}
