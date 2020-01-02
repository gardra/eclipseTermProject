package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;

public class Buttons {
	protected boolean equipmentIsOpen = false;
	protected Shell shell;
	private EquipmentTable table = new EquipmentTable(); 
	private Probabilities  prob = new Probabilities();
	
	private boolean eqWindow = false; 
	private boolean probWindow = false; 
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		try {
			Buttons window = new Buttons();
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
		
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.CLOSE|SWT.ON_TOP);
		shell.setSize(273, 90);
		shell.setText("SWT Application");
		FillLayout fl_shell = new FillLayout(SWT.HORIZONTAL);
		fl_shell.spacing = 2;
		fl_shell.marginWidth = 2;
		fl_shell.marginHeight = 2;
		shell.setLayout(fl_shell);
		
		Composite composite = new Composite(shell, SWT.BORDER);
		FillLayout fl_composite = new FillLayout(SWT.HORIZONTAL);
		fl_composite.marginHeight = 1;
		composite.setLayout(fl_composite);
		
		
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			//@Override
			
			public void widgetSelected(SelectionEvent e) {
				//open the equipment table
				if(!eqWindow) {
					eqWindow = true;
					table.open();			
				}
				
				else if (table.visible){
					table.disAppear();
					
				}
				else {
					table.appear();
					
					
				}
					//end open
				
				
			
			}
		});
		btnNewButton.setText("Equipments");
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//open the equipment table
				if(!probWindow) {
					probWindow = true;
					prob.open();			
				}
				
				else if (prob.visible){
					prob.disAppear();
					
				}
				else {
					prob.appear();
					
					
				}
					//end open
				
				
			}
		});
		btnNewButton_1.setText("Probabities");

	}
}
