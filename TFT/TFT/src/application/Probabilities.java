package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;



public class Probabilities {



	protected Shell shell;
	protected boolean visible = false;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Probabilities window = new Probabilities();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();

		shell.open();

		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}


	//set the window dispose or not
	public void disAppear(){      

		
		shell.setVisible(false); 
		visible = false;	
	}

	public void appear()	{
		
		shell.setVisible(true);
		visible = true;
	}


	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.ON_TOP|SWT.RESIZE|SWT.CLOSE);
		appear();
		shell.addShellListener(new ShellAdapter() {


			public void shellClosed(ShellEvent e) {
				disAppear();
			
				e.doit = false; 
			}
		});
		shell.setSize(450, 300);
		shell.setText("Probabilities Table");

	}

}

