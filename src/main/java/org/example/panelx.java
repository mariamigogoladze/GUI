package org.example;

import javax.swing.*;
import java.awt.*;

class panelx extends JFrame {
  GridBagConstraints c = new GridBagConstraints();
  JDialog jd = new JDialog();
  JLabel[] options;
  JTextField[] fields;

  public panelx() {
    this.createDialog();
  }

  private void createDialog() {
    jd = new JDialog();
    jd.setBounds(100,100,600,500);
    jd.setMinimumSize(new Dimension(600, 200));
    jd.setLayout(new GridBagLayout());
    jd.setUndecorated(true);

    options = new JLabel[5];
    fields = new JTextField[5];

    c = new GridBagConstraints();
    c.insets = new Insets(10, 10, 5, 5);
    c.fill = GridBagConstraints.HORIZONTAL;

    createIdBox();
    createMyFareKeyBox();
    createComboBox();
    createEthernetBox();
    createDateAndTimeBox();
    createSaveAndCancel();
    createReadOnly();
    createCreditCardCheckbox();
    createAutoMount();

    jd.show();
    jd.setResizable(true);
  }


  private void createComboBox() {
    JLabel comboLabel = new JLabel("Combo");
    JComboBox connType = new JComboBox<>();
    connType.setMaximumRowCount(4);

    c.fill = GridBagConstraints.HORIZONTAL;
   // c.weightx = 0.3;
    c.gridx = 0;
    c.gridy = 0;
    jd.add(comboLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
 //   c.weightx = 0.7;
    c.gridx = 1;
    c.gridy = 0;
    jd.add(connType, c);
  }

  private void createEthernetBox() {
    JLabel dhcpLabel = new JLabel("dhcp");
    JCheckBox dhcp = new JCheckBox("");
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.3;
    c.gridx = 0;
    c.gridy = 1;
    jd.add(dhcpLabel, c);
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.7;
    c.gridx = 1;
    c.gridy = 1;
    jd.add(dhcp, c);

    // IP BOX
    options[0] = new JLabel("ip");
    c.fill = GridBagConstraints.HORIZONTAL;
   // c.weightx = 0.3;
    c.gridx = 0;
    c.gridy = 2;
    jd.add(options[0], c);

    fields[0] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.7;
    c.gridx = 1;
    c.gridy = 2;

    jd.add(fields[0], c);

    // SubnetMasks
    options[1] = new JLabel("subnet");
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.3;
    c.gridx = 0;
    c.gridy = 3;
    jd.add(options[1], c);

    fields[1] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
   // c.weightx = 0.7;
    c.gridx = 1;
    c.gridy = 3;
    jd.add(fields[1], c);

    // Gateway
    options[2] = new JLabel("gateway");
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.3;
    c.gridx = 0;
    c.gridy = 4;
    jd.add(options[2], c);

    fields[2] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.7;
    c.gridx = 1;
    c.gridy = 4;
    jd.add(fields[2], c);

    // NS1
    options[3] = new JLabel("ns1");
    c.fill = GridBagConstraints.HORIZONTAL;
   // c.weightx = 0.3;
    c.gridx = 0;
    c.gridy = 5;
    jd.add(options[3], c);

    fields[3] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.7;
    c.gridx = 1;
    c.gridy = 5;
    jd.add(fields[3], c);

    // NS2
    options[4] = new JLabel("ns2");
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.3;
    c.gridx = 0;
    c.gridy = 6;
    jd.add(options[4], c);

    fields[4] = new JTextField();
    c.fill = GridBagConstraints.HORIZONTAL;
   // c.weightx = 0.7;
    c.gridx = 1;
    c.gridy = 6;
    jd.add(fields[4], c);

    // make everything uneditable before Ethernet is chosen
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
    //  idLabel.setSize(150, idLabel.getHeight());
    JTextField idInput = new JTextField();
    // c.weightx = 0.250;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 0;
    jd.add(idLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    //  c.weightx = 0.250;
    c.gridx = 3;
    c.gridy = 0;
    idInput.setText("uduu");
    jd.add(idInput, c);
  }

  private void createMyFareKeyBox() {
    JLabel myFareKeyLabel = new JLabel("My fare key");
    //  myFareKeyLabel.setSize(150, myFareKeyLabel.getHeight());
    JTextField myFareKeyInput = new JTextField();
    //  c.weightx = 0.3;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 1;
    jd.add(myFareKeyLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    //   c.weightx = 0.7;
    c.gridx = 3;
    c.gridy = 1;
    jd.add(myFareKeyInput, c);
  }


  /** Create box to manually select date and time. */
  private void createDateAndTimeBox() {
    // Date

    JLabel dateLabel = new JLabel("date");
    //dateLabel.setSize(150, dateLabel.getHeight());
    JTextField dateInput = new JTextField();
   // c.weightx = 0.250;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 2;
    jd.add(dateLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
 //   c.weightx = 0.250;
    c.gridx = 3;
    c.gridy = 2;

    jd.add(dateInput, c);

    // Time
    JLabel timeLabel = new JLabel("time");
 //   timeLabel.setSize(150, timeLabel.getHeight());
    JTextField timeInput = new JTextField();
  //  c.weightx = 0.3;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 3;
    jd.add(timeLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
   // c.weightx = 0.7;
    c.gridx = 3;
    c.gridy = 3;

    jd.add(timeInput, c);
  }

  /** Read Only box with checker whether it is selected or not. */
  private void createReadOnly() {
    JLabel readOnlyLabel = new JLabel("readOnly");
    JCheckBox readOnly = new JCheckBox("");
    c.fill = GridBagConstraints.HORIZONTAL;
 //   c.weightx = 0.3;
    c.gridx = 2;
    c.gridy = 4;
    jd.add(readOnlyLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.7;
    c.gridx = 3;
    c.gridy = 4;
    jd.add(readOnly, c);
  }

  /** Credit Card box with checker whether it is selected or not. */
  private void createCreditCardCheckbox() {
    JLabel readOnlyLabel = new JLabel("creditCard");
    JCheckBox creditCard = new JCheckBox("");
    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.3;
    c.gridx = 2;
    c.gridy = 5;
    jd.add(readOnlyLabel, c);

    c.fill = GridBagConstraints.HORIZONTAL;
  //  c.weightx = 0.7;
    c.gridx = 3;
    c.gridy = 5;
    jd.add(creditCard, c);
  }

  /** Save and Cancel buttons on panel */
  private void createSaveAndCancel() {
    // Save or Cancel buttons
    JButton save = new JButton("save");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = (int) 1.5;
    c.gridy = 13;
    jd.add(save, c);

    JButton cancel = new JButton("cancel");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 2;
    c.gridy = 13;
    jd.add(cancel, c);
  }

  private void createAutoMount() {
    JButton mount = new JButton("autoMount");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1;
    c.gridwidth = 2;
    c.gridx = (int) 1.5;
    c.gridy = 14;
    jd.add(mount, c);
  }

  public static void main(String[] args) {
    new panelx();
  }
}
