/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.iesjandula.administracion.huelga_alumnos;

import java.awt.Toolkit;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.iesjandula.administracion.exceptions.IESJandulaException;
import es.iesjandula.administracion.huelga_alumnos.utils.Alumn;
import es.iesjandula.administracion.huelga_alumnos.utils.ApplicationHuelgas;


/**
 * @author David Martinez
 *
 */
public class Huelga extends javax.swing.JFrame
{
	/** Attribute logger */
	private static final Logger logger = LogManager.getLogger();
	
	/** Attribute allListModel*/
	private DefaultListModel<Alumn> allListModel = new DefaultListModel<>();

	/** Attribute alumnList*/
	private List<Alumn> alumnList;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private java.awt.Choice choiceCurso;
	private javax.swing.JButton jButtonAceptar;
	private javax.swing.JButton jButtonSalir;
	private com.toedter.calendar.JDateChooser jDateChooser;
	private javax.swing.JLabel jLabelAlumnNumber;
	private javax.swing.JLabel jLabelAlumnNumberText;
	private javax.swing.JLabel jLabelBackground;
	private javax.swing.JLabel jLabelCurso;
	private javax.swing.JLabel jLabelHuelga;
	private javax.swing.JLabel jLabelJandulaLogo;
	private javax.swing.JList<Alumn> jListAllAlumns;
	private javax.swing.JScrollPane jScrollPane;
	// End of variables declaration//GEN-END:variables

	/**
	 * Creates new form Huelga
	 */
	public Huelga(List<Alumn> alumnList)
	{
		Charset.defaultCharset();
		this.initComponents();
		this.setResizable(false);
		this.setTitle("HUELGAS");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("./images/jandula.png"));

		this.jLabelBackground.setIcon(new ImageIcon("./images/background2.jpg"));
		this.jLabelJandulaLogo.setIcon(new ImageIcon("./images/jandula.png"));

		this.alumnList = alumnList;
		this.jListAllAlumns.setCellRenderer(new CheckboxListCellRenderer());
		this.allListModel.addAll(this.alumnList);
		this.jListAllAlumns.setModel(this.allListModel);
		this.jLabelAlumnNumber.setText(this.allListModel.size() + "");
		this.addChoiceCursoList();

		this.setLocationRelativeTo(null);
		// this.jListAllAlumns.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{

		this.jScrollPane = new javax.swing.JScrollPane();
		this.jListAllAlumns = new javax.swing.JList<>();
		this.jLabelCurso = new javax.swing.JLabel();
		this.jLabelHuelga = new javax.swing.JLabel();
		this.jLabelAlumnNumberText = new javax.swing.JLabel();
		this.jLabelAlumnNumber = new javax.swing.JLabel();
		this.jDateChooser = new com.toedter.calendar.JDateChooser();
		this.choiceCurso = new java.awt.Choice();
		this.jButtonAceptar = new javax.swing.JButton();
		this.jButtonSalir = new javax.swing.JButton();
		this.jLabelJandulaLogo = new javax.swing.JLabel();
		this.jLabelBackground = new javax.swing.JLabel();

		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		this.jListAllAlumns.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		this.jScrollPane.setViewportView(this.jListAllAlumns);
		this.jListAllAlumns.getAccessibleContext().setAccessibleDescription("");

		this.getContentPane().add(this.jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 710, 260));

		this.jLabelCurso.setBackground(new java.awt.Color(255, 255, 255));
		this.jLabelCurso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		this.jLabelCurso.setText("CURSO:");
		this.getContentPane().add(this.jLabelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 90, -1));

		this.jLabelHuelga.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		this.jLabelHuelga.setText("HUELGA:");
		this.getContentPane().add(this.jLabelHuelga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 100, -1));

		this.jLabelAlumnNumberText.setBackground(new java.awt.Color(255, 255, 255));
		this.jLabelAlumnNumberText.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
		this.jLabelAlumnNumberText.setText("N.ALUMNOS:");
		this.getContentPane().add(this.jLabelAlumnNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, 40));

		this.jLabelAlumnNumber.setBackground(new java.awt.Color(255, 255, 255));
		this.jLabelAlumnNumber.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
		this.jLabelAlumnNumber.setText("0");
		this.jLabelAlumnNumber.setOpaque(true);
		this.getContentPane().add(this.jLabelAlumnNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 100, 20));
		this.getContentPane().add(this.jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 92, 210, 30));

		this.choiceCurso.addItemListener(new java.awt.event.ItemListener()
		{
			@Override
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				Huelga.this.choiceCursoItemStateChanged(evt);
			}
		});
		this.getContentPane().add(this.choiceCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 170, 40));

		this.jButtonAceptar.setBackground(new java.awt.Color(203, 203, 203));
		this.jButtonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		this.jButtonAceptar.setText("ACEPTAR");
		this.jButtonAceptar.addActionListener(new java.awt.event.ActionListener()
		{
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				Huelga.this.jButtonAceptarActionPerformed(evt);
			}
		});
		this.getContentPane().add(this.jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 111, 38));

		this.jButtonSalir.setBackground(new java.awt.Color(203, 203, 203));
		this.jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		this.jButtonSalir.setText("SALIR");
		this.jButtonSalir.addActionListener(new java.awt.event.ActionListener()
		{
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				Huelga.this.jButtonSalirActionPerformed(evt);
			}
		});
		this.getContentPane().add(this.jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 111, 38));
		this.getContentPane().add(this.jLabelJandulaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 140, 90));
		this.getContentPane().add(this.jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 510));

		this.pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Method jButtonAceptarActionPerformed
	 * @param evt
	 */
	private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButtonAceptarActionPerformed
		List<Alumn> selectedAlumns = this.jListAllAlumns.getSelectedValuesList();
		System.out.println(selectedAlumns);

		ApplicationHuelgas application = new ApplicationHuelgas();
		if (selectedAlumns.size() > 0)
		{
			if (this.jDateChooser.getDate() != null)
			{
				try
				{
					application.registerHuelga(selectedAlumns, this.jDateChooser.getDate());
				}
				catch (IESJandulaException exception)
				{
					String error = "IESJandulaException registerHuelga";
					JOptionPane.showMessageDialog(null,error);
					logger.error(error,exception);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "NO HAY FECHA SELECCIONADA");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "NO HAY ALUMNOS SELECCIONADOS");
		}

	}// GEN-LAST:event_jButtonAceptarActionPerformed

	/**
	 * Method jButtonSalirActionPerformed
	 * @param evt
	 */
	private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButtonSalirActionPerformed
		MenuHuelga menuHuelga = new MenuHuelga(this.alumnList);
		menuHuelga.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_jButtonSalirActionPerformed

	/**
	 * Method choiceCursoItemStateChanged
	 * @param evt
	 */
	private void choiceCursoItemStateChanged(java.awt.event.ItemEvent evt)
	{// GEN-FIRST:event_choiceCursoItemStateChanged
		List<Alumn> temporalList = new ArrayList<>();
		if (!this.choiceCurso.getSelectedItem().equals("Todos"))
		{
			for (Alumn alumn : this.alumnList)
			{
				if (alumn.getCourse().equalsIgnoreCase(this.choiceCurso.getSelectedItem()))
				{
					temporalList.add(alumn);
					System.out.println(alumn);
				}
			}
			DefaultListModel<Alumn> temporalListModel = new DefaultListModel<>();
			temporalListModel.addAll(temporalList);
			this.jListAllAlumns.setModel(temporalListModel);
			this.jLabelAlumnNumber.setText(temporalList.size() + "");
		}
		else
		{
			this.jListAllAlumns.setModel(this.allListModel);
			this.jLabelAlumnNumber.setText(this.allListModel.size() + "");
		}

	}// GEN-LAST:event_choiceCursoItemStateChanged


	/**
	 * Method addChoiceCursoList
	 */
	private void addChoiceCursoList()
	{
		Set<String> courses = new HashSet<>();

		for (Alumn alumno : this.alumnList)
		{
			courses.add(alumno.getCourse());
		}
		List<String> sortedList = new ArrayList<>(courses);
		Collections.sort(sortedList);
		sortedList.add(0, "Todos");
		for (String curso : sortedList)
		{
			this.choiceCurso.add(curso);
		}

	}

}