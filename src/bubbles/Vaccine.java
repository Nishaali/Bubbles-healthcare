/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbles;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Vaccine extends javax.swing.JFrame {

    /**
     * Creates new form Vaccine
     */
    public Vaccine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\838549764-1024x1024.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1946, 1946, 2018, 1));
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(440, 150, 120, 40);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(360, 150, 80, 40);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(jSpinner4);
        jSpinner4.setBounds(290, 150, 70, 40);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel3.setText("Bubbles HealthCare");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 30, 350, 35);

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 3, 24)); // NOI18N
        jLabel1.setText("Enter your DOB");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 150, 160, 40);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 250, 80, 50);

        area.setColumns(20);
        area.setFont(new java.awt.Font("MS UI Gothic", 3, 24)); // NOI18N
        area.setRows(5);
        jScrollPane4.setViewportView(area);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(28, 330, 690, 280);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\838549764-1024x1024.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-30, -50, 780, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "ALERT MESSAGE", "Your vaccination is due soon!!!", JOptionPane.WARNING_MESSAGE); 
        Vaccination vv=new Vaccination();
        vv.display();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vaccine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables


class Vaccination
{
   int y=(Integer)jSpinner2.getValue();
int m=(Integer)jSpinner3.getValue();
int d=(Integer)jSpinner4.getValue();

            GregorianCalendar c5=new GregorianCalendar();
	   GregorianCalendar c1=new GregorianCalendar(y,m,d);
	     GregorianCalendar c3=new GregorianCalendar(y,m,d);
	    GregorianCalendar c4=new GregorianCalendar(y,m,d);
	    
	
	void display()
	{
		//JOptionPane.showMessageDialog(null,"",JOptionPane.PLAIN_MESSAGE);
		for(int i=0;i<5;i++)
		{
			c1.add(GregorianCalendar.YEAR,1);
			//System.out.println(c1.getTime());
		    area.setText(area.getText()+"\nDue date "+(i+1)+" for Polio vaccine:"+c1.getTime());
		}
		
		c3.add(GregorianCalendar.YEAR,3);
		area.setText(area.getText()+"\nDue date for HepatitisB vaccine is until: "+c3.getTime());
		c4.add(GregorianCalendar.YEAR,10);
		area.setText(area.getText()+"\nDue date for Brain fever vaccine is until: "+c4.getTime());
	}
	
}
}




