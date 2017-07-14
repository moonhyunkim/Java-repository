package GUI_beginer;

import javax.swing.*;

public class JMenuExam extends JFrame {
	private JRadioButtonMenuItem colorItems[], fonts[];
	private JCheckBoxMenuItem styleItems[];
	private ButtonGroup fontGroup, colorGroup;
	
	public JMenuExam() {
		super( "JMenu �׽�Ʈ" );
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		
		JMenu fileMenu = new JMenu("����(F)");
		fileMenu.setToolTipText("���� �޴��Դϴ�");
		fileMenu.setMnemonic('F');
		
		JMenuItem newItem = new JMenuItem("������(N)");
		newItem.setMnemonic('N');
		fileMenu.add(newItem);
		
		JMenuItem openItem = new JMenuItem("����(O)");
		openItem.setMnemonic('O');
		fileMenu.add(openItem);
		
		JMenuItem saveItem = new JMenuItem("����(S)");
		saveItem.setMnemonic('S');
		fileMenu.add(saveItem);
		
		JMenuItem exitItem = new JMenuItem("�ݱ�(X)");
		exitItem.setMnemonic('X');
		fileMenu.add(exitItem);
	      bar.add( fileMenu );   

		
		JMenu formatMenu = new JMenu("����(E)");
		formatMenu.setToolTipText("�����޴��Դϴ�");
		formatMenu.setMnemonic('E');
		String colors[]= {"����", "�Ķ�", "����", "�ʷ�"};
	
		JMenu colorMenu = new JMenu("����(C)");
		colorMenu.setMnemonic('C');
		colorItems = new JRadioButtonMenuItem[colors.length];
	      colorGroup = new ButtonGroup();
	      for ( int i = 0; i < colors.length; i++ ) 
		  {
	         colorItems[ i ] = new JRadioButtonMenuItem( colors[ i ] );
	         colorMenu.add( colorItems[ i ] );
	         colorGroup.add( colorItems[ i ] );
	      }

	      colorItems[ 0 ].setSelected( true );
	      formatMenu.add( colorMenu );
	      formatMenu.addSeparator();


	      String fontNames[] = { "����", "����", "���" };
	      JMenu fontMenu = new JMenu( "�۲�(T)" ); 
		  fontMenu.setMnemonic( 'T' );
	      fonts = new JRadioButtonMenuItem[ fontNames.length ];
	      fontGroup = new ButtonGroup();

	      for ( int i = 0; i < fonts.length; i++ ) 
		  {
	         fonts[ i ] = new JRadioButtonMenuItem( fontNames[ i ] );
	         fontMenu.add( fonts[ i ] );
	         fontGroup.add( fonts[ i ] );
	      }

	      fonts[ 0 ].setSelected( true );
	      fontMenu.addSeparator();

	      String styleNames[] = { "����", "�����" };
	      styleItems = new JCheckBoxMenuItem[ styleNames.length ];

	      

	      for ( int i = 0; i < styleNames.length; i++ ) 
		  {
	         styleItems[ i ] = new JCheckBoxMenuItem( styleNames[ i ] );
	         fontMenu.add( styleItems[ i ] );
	      }
	      formatMenu.add( fontMenu );
	      bar.add( formatMenu ); 
		  JMenu helpMenu = new JMenu( "����(H)" );
		  helpMenu.setToolTipText("���� �޴��Դϴ�");
		  helpMenu.setMnemonic( 'H' );
	JMenuItem helpItem = new JMenuItem( "�����׸�(L)" );
	      helpItem.setMnemonic( 'L' );
	      helpMenu.add(helpItem);
		  bar.add( helpMenu );
	setSize( 400, 200 );
	      setVisible(true);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
	   }

	public static void main( String args[] )
	   {
	      new JMenuExam();      
	   }
	



}
