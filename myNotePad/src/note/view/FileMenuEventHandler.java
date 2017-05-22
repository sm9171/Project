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
		// 파일 메뉴에서 메뉴 아이템을 선택했을 때의 내용을 구현할 메소드
		JMenuItem selectMenuItem = (JMenuItem)e.getSource();

		//끝내기 메뉴가 선택되었다면
		if(selectMenuItem.getText().equals(noteMenu.getFileExit().getText()))
			fileExitAction();
	}

	public void fileExitAction() {
		// 끝내기 메뉴 아이템이 선택되었을 때 처리할 내용 구현 메소드
		int result = JOptionPane.showConfirmDialog(parentFrame, 
							"메모장을 종료하시겠습니까?", "끝내기", 
							JOptionPane.OK_CANCEL_OPTION);
		
		if(result == JOptionPane.OK_OPTION){
			//ok 버튼 클릭시
			System.exit(0);  //프로그램 종료함
			parentFrame.dispose();  //메인 프레임 창 닫음
		}
	}

}








