package test;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TPMGenerator implements ActionListener
{
	JFrame f;
	JTextArea offeringDetails;
    TPMGenerator()
    {
    	//Completed testing
    	f=new JFrame();
    	offeringDetails=new JTextArea();
    	
    	JLabel offeringDetailsText=new JLabel("Offering Details");
    	JLabel tapeDetails=new JLabel("Video Asset Id");
        JLabel tapecut=new JLabel("TAPE_CUT Details");
        
        Button generateMetadataButton=new Button("Generate GO V1 Thirdparty Metadata");
    	
    	JTextField videoIdText=new JTextField(10);
    	JTextField tapecutText=new JTextField(10);
        
    	f.setSize(550, 500);
    	offeringDetailsText.setBounds(100, 75, 100, 30);
        tapeDetails.setBounds(100, 200, 100, 30); 
    	offeringDetails.setBounds(100, 100, 300, 90);
    	videoIdText.setBounds(100, 230, 150, 30);
    	tapecut.setBounds(100, 260, 150, 30);
    	tapecutText.setBounds(100, 290, 150, 30);
    	generateMetadataButton.setBounds(100, 350, 300, 30);
    	
    	generateMetadataButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					String lines[]=offeringDetails.getText().split("//n");
					for(int i=0;i<lines.length;i++)
					{
						System.out.println(lines[i]);
					}
				} 
				finally
				{
					
				}
				
			}
		});
    	
    	f.add(offeringDetails);
    	f.add(offeringDetailsText);
    	f.add(tapeDetails);
    	f.add(videoIdText);
    	f.add(tapecut);
    	f.add(tapecutText);
    	f.add(generateMetadataButton);
    	f.setLayout(null);
    	f.setVisible(true);
    }

	public static void main(String[] args) 
	{
		TPMGenerator tpmGeneratonew= new TPMGenerator();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

}
