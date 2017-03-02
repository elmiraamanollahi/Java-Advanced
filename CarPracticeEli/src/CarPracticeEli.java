
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.util.IllegalFormatException;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elmira
 */
public class CarPracticeEli extends javax.swing.JFrame {

    DefaultListModel<Car> ModelCarList = new DefaultListModel<>();

    /**
     * Creates new form CarPracticeEli
     */
    public CarPracticeEli() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        lblModelMakeError.setVisible(false);
        lblYopError.setVisible(false);
        lblSecsto100Error.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgCarListEdit = new javax.swing.JDialog();
        tfDlgYopEdit = new javax.swing.JTextField();
        tfdlgSecstoEdit = new javax.swing.JTextField();
        lbldlgModelMakeErroredit = new javax.swing.JLabel();
        lbldlgModelMake = new javax.swing.JLabel();
        lblDlgYopErrorEdit = new javax.swing.JLabel();
        lbldlgYop = new javax.swing.JLabel();
        lblDlgSecsto100ErrorEdit = new javax.swing.JLabel();
        lbldlgSecsto100 = new javax.swing.JLabel();
        tfDlgModelMakeEdit = new javax.swing.JTextField();
        btndlgSaveEdit = new javax.swing.JButton();
        btnDlgCancleEdit = new javax.swing.JButton();
        dlgCarListDelete = new javax.swing.JDialog();
        btnDlgDelete = new javax.swing.JButton();
        lblDlgModelMakeErrorDelete = new javax.swing.JLabel();
        lblDlgYopErrorDelete = new javax.swing.JLabel();
        lblModelMake1 = new javax.swing.JLabel();
        lblDlgSecsto100ErrorDelete = new javax.swing.JLabel();
        lblYop1 = new javax.swing.JLabel();
        lblSecsto101 = new javax.swing.JLabel();
        tfDlgModelMakeDelete = new javax.swing.JTextField();
        tfDlgYopDelete = new javax.swing.JTextField();
        tfDlgSecsto100Delete = new javax.swing.JTextField();
        lblModelMake = new javax.swing.JLabel();
        lblYop = new javax.swing.JLabel();
        lblSecsto100 = new javax.swing.JLabel();
        tfModelMake = new javax.swing.JTextField();
        tfYop = new javax.swing.JTextField();
        tfSecsto100 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        carList = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        lblModelMakeError = new javax.swing.JLabel();
        lblYopError = new javax.swing.JLabel();
        lblSecsto100Error = new javax.swing.JLabel();

        dlgCarListEdit.setSize(new java.awt.Dimension(550, 350));

        tfDlgYopEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDlgYopEditActionPerformed(evt);
            }
        });

        lbldlgModelMakeErroredit.setForeground(new java.awt.Color(255, 0, 0));
        lbldlgModelMakeErroredit.setText("2 to 300 character");

        lbldlgModelMake.setText("Model Make");

        lblDlgYopErrorEdit.setForeground(new java.awt.Color(255, 0, 0));
        lblDlgYopErrorEdit.setText("1900 - 2050");

        lbldlgYop.setText("Year of Production");

        lblDlgSecsto100ErrorEdit.setForeground(new java.awt.Color(255, 51, 51));
        lblDlgSecsto100ErrorEdit.setText("0 - 1000");

        lbldlgSecsto100.setText("Secs to 100");

        btndlgSaveEdit.setText("Save");
        btndlgSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndlgSaveEditActionPerformed(evt);
            }
        });

        btnDlgCancleEdit.setText("Cancle");
        btnDlgCancleEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgCancleEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgCarListEditLayout = new javax.swing.GroupLayout(dlgCarListEdit.getContentPane());
        dlgCarListEdit.getContentPane().setLayout(dlgCarListEditLayout);
        dlgCarListEditLayout.setHorizontalGroup(
            dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCarListEditLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCarListEditLayout.createSequentialGroup()
                        .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDlgYopErrorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldlgModelMakeErroredit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCarListEditLayout.createSequentialGroup()
                        .addComponent(tfdlgSecstoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCarListEditLayout.createSequentialGroup()
                        .addComponent(lblDlgSecsto100ErrorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCarListEditLayout.createSequentialGroup()
                        .addComponent(tfDlgModelMakeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
            .addGroup(dlgCarListEditLayout.createSequentialGroup()
                .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgCarListEditLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbldlgSecsto100))
                    .addGroup(dlgCarListEditLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btndlgSaveEdit)
                        .addGap(94, 94, 94)
                        .addComponent(btnDlgCancleEdit)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dlgCarListEditLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbldlgYop)
                        .addComponent(lbldlgModelMake))
                    .addGap(16, 16, 16)
                    .addComponent(tfDlgYopEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );
        dlgCarListEditLayout.setVerticalGroup(
            dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgCarListEditLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(tfDlgModelMakeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldlgModelMakeErroredit)
                .addGap(52, 52, 52)
                .addComponent(lblDlgYopErrorEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldlgSecsto100)
                    .addComponent(tfdlgSecstoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDlgSecsto100ErrorEdit)
                .addGap(43, 43, 43)
                .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndlgSaveEdit)
                    .addComponent(btnDlgCancleEdit))
                .addGap(48, 48, 48))
            .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dlgCarListEditLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(lbldlgModelMake)
                    .addGap(57, 57, 57)
                    .addGroup(dlgCarListEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldlgYop)
                        .addComponent(tfDlgYopEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(222, Short.MAX_VALUE)))
        );

        dlgCarListDelete.setMinimumSize(new java.awt.Dimension(250, 150));
        dlgCarListDelete.setSize(new java.awt.Dimension(550, 250));

        btnDlgDelete.setText("Delete");
        btnDlgDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgDeleteActionPerformed(evt);
            }
        });

        lblDlgModelMakeErrorDelete.setForeground(new java.awt.Color(255, 0, 0));
        lblDlgModelMakeErrorDelete.setText("2 to 300 character");

        lblDlgYopErrorDelete.setForeground(new java.awt.Color(255, 0, 0));
        lblDlgYopErrorDelete.setText("1900 - 2050");

        lblModelMake1.setText("Model Make");

        lblDlgSecsto100ErrorDelete.setForeground(new java.awt.Color(255, 51, 51));
        lblDlgSecsto100ErrorDelete.setText("0 - 1000");

        lblYop1.setText("Year of Production");

        lblSecsto101.setText("Secs to 100");

        tfDlgYopDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDlgYopDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgCarListDeleteLayout = new javax.swing.GroupLayout(dlgCarListDelete.getContentPane());
        dlgCarListDelete.getContentPane().setLayout(dlgCarListDeleteLayout);
        dlgCarListDeleteLayout.setHorizontalGroup(
            dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCarListDeleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDlgModelMakeErrorDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCarListDeleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDlgSecsto100ErrorDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(dlgCarListDeleteLayout.createSequentialGroup()
                .addGroup(dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgCarListDeleteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDlgYopErrorDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(dlgCarListDeleteLayout.createSequentialGroup()
                                    .addComponent(lblYop1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfDlgYopDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dlgCarListDeleteLayout.createSequentialGroup()
                                    .addGroup(dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblModelMake1)
                                        .addComponent(lblSecsto101))
                                    .addGap(64, 64, 64)
                                    .addGroup(dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfDlgModelMakeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfDlgSecsto100Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(dlgCarListDeleteLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnDlgDelete)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        dlgCarListDeleteLayout.setVerticalGroup(
            dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCarListDeleteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDlgModelMakeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelMake1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDlgModelMakeErrorDelete)
                .addGap(22, 22, 22)
                .addGroup(dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYop1)
                    .addComponent(tfDlgYopDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDlgYopErrorDelete)
                .addGap(29, 29, 29)
                .addGroup(dlgCarListDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDlgSecsto100Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSecsto101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDlgSecsto100ErrorDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnDlgDelete)
                .addGap(43, 43, 43))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblModelMake.setText("Model Make");

        lblYop.setText("Year of Production");

        lblSecsto100.setText("Secs to 100");

        tfYop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfYopActionPerformed(evt);
            }
        });

        carList.setModel(ModelCarList);
        carList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carListMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carList);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblModelMakeError.setForeground(new java.awt.Color(255, 0, 0));
        lblModelMakeError.setText("2 to 300 character");

        lblYopError.setForeground(new java.awt.Color(255, 0, 0));
        lblYopError.setText("1900 - 2050");

        lblSecsto100Error.setForeground(new java.awt.Color(255, 51, 51));
        lblSecsto100Error.setText("0 - 1000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tfSecsto100, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSecsto100)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYop)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblModelMake)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSecsto100Error, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblYopError, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblModelMakeError, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfYop, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tfModelMake, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfModelMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelMake))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblModelMakeError)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYop)
                            .addComponent(tfYop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblYopError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSecsto100)
                            .addComponent(tfSecsto100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblSecsto100Error)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isCarDataValid(String modelMake, JLabel modelMakeError, String yopStr, JLabel yopStrError, String secsTo100, JLabel secsTo100Error) {

        boolean ismodelMakeInvalid = (modelMake.length() < 2 || modelMake.length() > 30);
        lblModelMakeError.setVisible(ismodelMakeInvalid);

        int yop = 0;
        boolean isYopInvalid;
        try {
            yop = Integer.parseInt(yopStr);
            isYopInvalid = yop < 1900 || yop > 2050;
        } catch (NumberFormatException e) {
            isYopInvalid = true;
        }
        lblYopError.setVisible(isYopInvalid);

        double secto100 = 0;
        boolean isSectTo100Invalid;
        try {
            secto100 = Double.parseDouble(secsTo100);
            isSectTo100Invalid = secto100 < 1 || secto100 > 1000;

        } catch (NumberFormatException e) {

            isSectTo100Invalid = true;
        }

        lblSecsto100Error.setVisible(isSectTo100Invalid);

        return (!(ismodelMakeInvalid || isYopInvalid || isSectTo100Invalid));

    }

    private void tfYopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfYopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfYopActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        /**/
        String modelmake = tfModelMake.getText();
        String yopStr = tfYop.getText();
        String secsTo100 = tfSecsto100.getText();
        if (isCarDataValid(modelmake, lblModelMakeError, yopStr, lblYopError, secsTo100, lblSecsto100Error)) {

            ModelCarList.addElement(new Car(modelmake, Integer.parseInt(yopStr), Double.parseDouble(secsTo100)));

        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void carListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carListMouseClicked
        if ((evt.getButton() == MouseEvent.BUTTON1) && (evt.getClickCount() == 2)) {
            // left button, double-click
            carList.setSelectedIndex(carList.locationToIndex(evt.getPoint()));
            int index = carList.getSelectedIndex();
            if (index != -1) {
                Car c = ModelCarList.get(index);
                // fill in data of Person double-clicked for editing
                tfDlgModelMakeEdit.setText(c.MakeModel);
                tfDlgYopEdit.setText(c.yop + "");
                tfdlgSecstoEdit.setText(c.SecsTo100 + "");
                // hide errors
                lbldlgModelMakeErroredit.setVisible(false);
                lblDlgYopErrorEdit.setVisible(false);
                lblDlgSecsto100ErrorEdit.setVisible(false);
                // show dialog
                dlgCarListEdit.setVisible(true);
            }
        }
        if ((evt.getButton() == MouseEvent.BUTTON3) && (evt.getClickCount() == 1)) {
            // left button, double-click
            carList.setSelectedIndex(carList.locationToIndex(evt.getPoint()));
            int index = carList.getSelectedIndex();
            if (index != -1) {
                Car c = ModelCarList.get(index);
                // fill in data of Person double-clicked for editing
                tfDlgModelMakeDelete.setText(c.MakeModel);
                tfDlgYopDelete.setText(c.yop + "");
                tfDlgSecsto100Delete.setText(c.SecsTo100 + "");
                // hide errors
                lblDlgModelMakeErrorDelete.setVisible(false);
                lblDlgYopErrorDelete.setVisible(false);
                lblDlgSecsto100ErrorDelete.setVisible(false);
                // show dialog
                dlgCarListDelete.setVisible(true);
            }
        }


    }//GEN-LAST:event_carListMouseClicked

    private void tfDlgYopEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDlgYopEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDlgYopEditActionPerformed

    private void btndlgSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndlgSaveEditActionPerformed

        String modelmake = tfModelMake.getText();
        String yopStr = tfYop.getText();
        String secsTo100 = tfSecsto100.getText();
        if (isCarDataValid(modelmake, lblModelMakeError, yopStr, lblYopError, secsTo100, lblSecsto100Error)) {
            Car c = ModelCarList.get(carList.getSelectedIndex());
            // save changes
            c.MakeModel = modelmake;
            c.yop = Integer.parseInt(yopStr);
            c.SecsTo100 = Double.parseDouble(secsTo100);
            //
            dlgCarListEdit.setVisible(false);
        }


    }//GEN-LAST:event_btndlgSaveEditActionPerformed

    private void btnDlgCancleEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgCancleEditActionPerformed
        dlgCarListEdit.setVisible(false);
    }//GEN-LAST:event_btnDlgCancleEditActionPerformed

    private void btnDlgDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgDeleteActionPerformed
        int index = carList.getSelectedIndex();
        Car c = ModelCarList.get(index);
        //Custom button text
        Object[] options = {"Delete", "Cancel"};
        int choice = JOptionPane.showOptionDialog(this,
                "Are you sure you want to delete item: \n" + c,
                "Confirm deletion",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        if (choice == 0) {
            ModelCarList.remove(index);
        }
    }//GEN-LAST:event_btnDlgDeleteActionPerformed

    private void tfDlgYopDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDlgYopDeleteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfDlgYopDeleteActionPerformed

    private void carListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carListMouseReleased
       /* if ((evt.getButton() == MouseEvent.BUTTON3) && (evt.getClickCount() == 1)) {
            // left button, double-click
            carList.setSelectedIndex(carList.locationToIndex(evt.getPoint()));
            int index = carList.getSelectedIndex();
            if (index != -1) {
                Car c = ModelCarList.get(index);
                // fill in data of Person double-clicked for editing
                tfDlgModelMakeDelete.setText(c.MakeModel);
                tfDlgYopDelete.setText(c.yop + "");
                tfDlgSecsto100Delete.setText(c.SecsTo100 + "");
                // hide errors
                lblDlgModelMakeErrorDelete.setVisible(false);
                lblDlgYopErrorDelete.setVisible(false);
                lblDlgSecsto100ErrorDelete.setVisible(false);
                // show dialog
                dlgCarLis.setVisible(true);
            }
        }*/
    }//GEN-LAST:event_carListMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarPracticeEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarPracticeEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarPracticeEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarPracticeEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarPracticeEli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDlgCancleEdit;
    private javax.swing.JButton btnDlgDelete;
    private javax.swing.JButton btndlgSaveEdit;
    private javax.swing.JList<Car> carList;
    private javax.swing.JDialog dlgCarListDelete;
    private javax.swing.JDialog dlgCarListEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDlgModelMakeErrorDelete;
    private javax.swing.JLabel lblDlgSecsto100ErrorDelete;
    private javax.swing.JLabel lblDlgSecsto100ErrorEdit;
    private javax.swing.JLabel lblDlgYopErrorDelete;
    private javax.swing.JLabel lblDlgYopErrorEdit;
    private javax.swing.JLabel lblModelMake;
    private javax.swing.JLabel lblModelMake1;
    private javax.swing.JLabel lblModelMakeError;
    private javax.swing.JLabel lblSecsto100;
    private javax.swing.JLabel lblSecsto100Error;
    private javax.swing.JLabel lblSecsto101;
    private javax.swing.JLabel lblYop;
    private javax.swing.JLabel lblYop1;
    private javax.swing.JLabel lblYopError;
    private javax.swing.JLabel lbldlgModelMake;
    private javax.swing.JLabel lbldlgModelMakeErroredit;
    private javax.swing.JLabel lbldlgSecsto100;
    private javax.swing.JLabel lbldlgYop;
    private javax.swing.JTextField tfDlgModelMakeDelete;
    private javax.swing.JTextField tfDlgModelMakeEdit;
    private javax.swing.JTextField tfDlgSecsto100Delete;
    private javax.swing.JTextField tfDlgYopDelete;
    private javax.swing.JTextField tfDlgYopEdit;
    private javax.swing.JTextField tfModelMake;
    private javax.swing.JTextField tfSecsto100;
    private javax.swing.JTextField tfYop;
    private javax.swing.JTextField tfdlgSecstoEdit;
    // End of variables declaration//GEN-END:variables
}