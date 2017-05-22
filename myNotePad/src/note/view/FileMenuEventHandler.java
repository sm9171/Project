package note.view;

import java.awt.event.*;
import javax.swing.*;

public class FileMenuEventHandler implements ActionListener {
	//Field
	private JFrame parentFrame;
	NoteMenu noteMenu;

	public FileMenuEventHandler(NoteMenu noteMenu, JFrame parentFrame) {
		this.noteMenu = noteMenu;
		this.parentFrame = parentFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ���� �޴����� �޴� �������� �������� ���� ������ ������ �޼ҵ�
		JMenuItem selectMenuItem = (JMenuItem)e.getSource();

		//������ �޴��� ���õǾ��ٸ�
		if(selectMenuItem.getText().equals(noteMenu.getFileExit().getText()))
			fileExitAction();
	}

	public void fileExitAction() {
		// ������ �޴� �������� ���õǾ��� �� ó���� ���� ���� �޼ҵ�
		int result = JOptionPane.showConfirmDialog(parentFrame, 
							"�޸����� �����Ͻðڽ��ϱ�?", "������", 
							JOptionPane.OK_CANCEL_OPTION);
		
		if(result == JOptionPane.OK_OPTION){
			//ok ��ư Ŭ����
			System.exit(0);  //���α׷� ������
			parentFrame.dispose();  //���� ������ â ����
		}
	}

}








