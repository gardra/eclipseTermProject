package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FillLayout;

import org.eclipse.swt.widgets.Button;

import org.eclipse.wb.swt.SWTResourceManager;



public class EquipmentTable {



	protected Shell shlEquipmentsTable;
	protected boolean visible = false;

	/*protected String[] baseEq  = {"[tftactics.gg][919]BFSword.png", "[tftactics.gg][12]NeedlesslyLargeRod.png", " [tftactics.gg][826]RecurveBow.png"
			, "[tftactics.gg][220]TearoftheGoddess.png", "[tftactics.gg][70]ChainVest.png","[tftactics.gg][875]NegatronCloak.png",
			"[tftactics.gg][244]GiantsBelt.png", "[tftactics.gg][626]SparringGloves.png","[tftactics.gg][887]Spatula.png"};
	 */
	protected boolean tflag[],lflag[];

	/*
	protected String[][] comEq= {{"[tftactics.gg][979]Deathblade.png"},
						{"[tftactics.gg][882]HextechGunblade.png"},
						{"[tftactics.gg][559]GiantSlayer.png"},
						{"[tftactics.gg][102]SpearofShojin.png"},
						{"[tftactics.gg][873]GuardianAngel.png"},
						{"[tftactics.gg][360]Bloodthirster.png"},
						{"[tftactics.gg][323]ZekesHerald.png"},
						{"[tftactics.gg][222]InfinityEdge.png"},
						{"[tftactics.gg][140]YoumuusGhostblade.png"}


						};

8*/

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			EquipmentTable window = new EquipmentTable();
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

		shlEquipmentsTable.open();

		shlEquipmentsTable.layout();
		while (!shlEquipmentsTable.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}


	//set the window dispose or not
	public void disAppear(){      


		shlEquipmentsTable.setVisible(false); 
		visible = false;	
	}

	public void appear()	{

		shlEquipmentsTable.setVisible(true);
		visible = true;
	}
	void Update() {}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {


		//allocate the flag
		tflag =new boolean [9];
		lflag = new boolean [9];

		for(int i =0 ;i<9;i++){
			tflag[i]=false;
			lflag[i]=false;

		}




		shlEquipmentsTable = new Shell(SWT.ON_TOP|SWT.RESIZE|SWT.CLOSE);
		appear();
		shlEquipmentsTable.addShellListener(new ShellAdapter() {


			public void shellClosed(ShellEvent e) {
				disAppear();

				e.doit = false; 
			}
		});
		shlEquipmentsTable.setSize(590, 590);
		shlEquipmentsTable.setText("Equipments Table");
		shlEquipmentsTable.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite = new Composite(shlEquipmentsTable, SWT.NONE);
		composite.setLayout(null);






		Button b08 = new Button(composite, SWT.NONE);
		b08.setBounds(62, 60, 52, 50);	
		b08.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][140]YoumuusGhostblade.png"));
		b08.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b07 = new Button(composite, SWT.NONE);
		b07.setBounds(119, 60, 52, 50);
		b07.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][222]InfinityEdge.png"));
		b07.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b06 = new Button(composite, SWT.NONE);
		b06.setBounds(176, 60, 52, 50);
		b06.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][323]ZekesHerald.png"));
		b06.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b05 = new Button(composite, SWT.NONE);
		b05.setBounds(233, 60, 52, 50);
		b05.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][360]Bloodthirster.png"));
		b05.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b04 = new Button(composite, SWT.NONE);
		b04.setBounds(290, 60, 52, 50);
		b04.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][873]GuardianAngel.png"));
		b04.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b03 = new Button(composite, SWT.NONE);
		b03.setBounds(347, 60, 52, 50);
		b03.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][102]SpearofShojin.png"));
		b03.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b02 = new Button(composite, SWT.NONE);
		b02.setBounds(404, 60, 52, 50);
		b02.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][559]GiantSlayer.png"));
		b02.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b01 = new Button(composite, SWT.NONE);
		b01.setBounds(461, 60, 52, 50);
		b01.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][882]HextechGunblade.png"));
		b01.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b00 = new Button(composite, SWT.NONE);
		b00.setBounds(518, 60, 52, 50);
		b00.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][979]Deathblade.png"));
		b00.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));



		Button b18 = new Button(composite, SWT.NONE);
		b18.setBounds(62, 115, 52, 50);
		b18.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][571]InfernoCinder.png"));
		b18.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b17 = new Button(composite, SWT.NONE);
		b17.setBounds(119, 115, 52, 50);
		b17.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][718]JeweledGauntlet.png"));
		b17.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b16 = new Button(composite, SWT.NONE);
		b16.setBounds(176, 115, 52, 50);
		b16.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][167]Morellonomicon.png"));
		b16.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b15 = new Button(composite, SWT.NONE);
		b15.setBounds(233, 115, 52, 50);
		b15.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][329]IonicSpark.png"));
		b15.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b14 = new Button(composite, SWT.NONE);
		b14.setBounds(290, 115, 52, 50);
		b14.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][833]LocketoftheIronSolari.png"));
		b14.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b13 = new Button(composite, SWT.NONE);
		b13.setBounds(347, 115, 52, 50);
		b13.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][404]LudensEcho.png"));
		b13.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b12 = new Button(composite, SWT.NONE);
		b12.setBounds(404, 115, 52, 50);
		b12.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][108]GuinsoosRageblade.png"));
		b12.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b11 = new Button(composite, SWT.NONE);
		b11.setBounds(461, 115, 52, 50);
		b11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		b11.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][871]RabadonsDeathcap.png"));
		b11.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));


		Button b28 = new Button(composite, SWT.NONE);
		b28.setBounds(62, 170, 52, 50);
		b28.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][93]BladeoftheRuinedKing.png"));
		b28.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b27 = new Button(composite, SWT.NONE);
		b27.setBounds(119, 170, 52, 50);
		b27.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][721]RepeatingCrossbow.png"));
		b27.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b26 = new Button(composite, SWT.NONE);
		b26.setBounds(176, 170, 52, 50);
		b26.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][856]TitanicHydra.png"));
		b26.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b25 = new Button(composite, SWT.NONE);
		b25.setBounds(233, 170, 52, 50);
		b25.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][598]RunaansHurricane.png"));
		b25.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b24 = new Button(composite, SWT.NONE);
		b24.setBounds(290, 170, 52, 50);
		b24.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][232]PhantomDancer.png"));
		b24.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b23 = new Button(composite, SWT.NONE);
		b23.setBounds(347, 170, 52, 50);
		b23.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][610]StatikkShiv.png"));
		b23.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b22 = new Button(composite, SWT.NONE);
		b22.setBounds(404, 170, 52, 50);
		b22.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][635]RapidFirecannon.png"));
		b22.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));



		Button b38 = new Button(composite, SWT.NONE);
		b38.setBounds(62, 225, 52, 50);
		b38.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][761]MagesCap.png"));
		b38.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b37 = new Button(composite, SWT.NONE);
		b37.setBounds(119, 225, 52, 50);
		b37.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][913]HandofJustice.png"));
		b37.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b36 = new Button(composite, SWT.NONE);
		b36.setBounds(176, 225, 52, 50);
		b36.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][445]Redemption.png"));
		b36.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b35 = new Button(composite, SWT.NONE);
		b35.setBounds(233, 225, 52, 50);
		b35.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][845]Hush.png"));
		b35.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b34 = new Button(composite, SWT.NONE);
		b34.setBounds(290, 225, 52, 50);
		b34.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][40]FrozenHeart.png"));
		b34.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b33 = new Button(composite, SWT.NONE);
		b33.setBounds(347, 225, 52, 50);
		b33.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][524]SeraphsEmbrace.png"));
		b33.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));



		Button b48 = new Button(composite, SWT.NONE);
		b48.setBounds(62, 280, 52, 50);
		b48.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][83]WardensMail.png"));
		b48.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b47 = new Button(composite, SWT.NONE);
		b47.setBounds(119, 280, 52, 50);
		b47.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][969]IceborneGauntlet.png"));
		b47.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b46 = new Button(composite, SWT.NONE);
		b46.setBounds(176, 280, 52, 50);
		b46.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][330]RedBuff.png"));
		b46.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b45 = new Button(composite, SWT.NONE);
		b45.setBounds(233, 280, 52, 50);
		b45.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][28]SwordBreaker.png"));
		b45.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b44 = new Button(composite, SWT.NONE);
		b44.setBounds(290, 280, 52, 50);
		b44.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][105]Thornmail.png"));
		b44.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));



		Button b58 = new Button(composite, SWT.NONE);
		b58.setBounds(62, 335, 52, 50);
		b58.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][833]TalismanofLight.png"));
		b58.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b57 = new Button(composite, SWT.NONE);
		b57.setBounds(119, 335, 52, 50);
		b57.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][482]Quicksilver.png"));
		b57.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b56 = new Button(composite, SWT.NONE);
		b56.setBounds(176, 335, 52, 50);
		b56.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][863]Zephyr.png"));
		b56.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b55 = new Button(composite, SWT.NONE);
		b55.setBounds(233, 335, 52, 50);
		b55.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][2]DragonsClaw.png"));
		b55.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));


		Button b68 = new Button(composite, SWT.NONE);
		b68.setBounds(62, 390, 52, 50);
		b68.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][355]FrozenMallet.png"));
		b68.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b67 = new Button(composite, SWT.NONE);
		b67.setBounds(119, 390, 52, 50);
		b67.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][377]TrapClaw.png"));
		b67.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b66 = new Button(composite, SWT.NONE);
		b66.setBounds(176, 390, 52, 50);
		b66.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][8]WarmogsArmor.png"));
		b66.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b78 = new Button(composite, SWT.NONE);
		b78.setBounds(62, 445, 52, 50);
		b78.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][311]BerserkerAxe.png"));
		b78.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b77 = new Button(composite, SWT.NONE);
		b77.setBounds(119, 445, 52, 50);
		b77.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][492]ThiefsGloves.png"));
		b77.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));



		Button b88 = new Button(composite, SWT.NONE);
		b88.setBounds(62, 500, 52, 50);
		b88.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][803]ForceofNature.png"));
		b88.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));



		//control button
		Button tb9 = new Button(composite, SWT.NONE);
		tb9.setBounds(62, 5, 52, 50);
		tb9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[8] == false) {
					tb9.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][887]Spatula.png"));
					tflag[8] = true;					
				}
				else {					
					tb9.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][887]Spatula.png"));
					tflag[8] = false;
				}

				if(lflag[8]&&tflag[8])
					b88.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][803]ForceofNature.png"));
				else 
					b88.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][803]ForceofNature.png"));

				if(lflag[7]&&tflag[8])
					b78.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][311]BerserkerAxe.png"));
				else 
					b78.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][311]BerserkerAxe.png"));

				if(lflag[6]&&tflag[8])
					b68.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][355]FrozenMallet.png"));
				else 
					b68.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][355]FrozenMallet.png"));

				if(lflag[5]&&tflag[8])
					b58.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][833]TalismanofLight.png"));
				else 
					b58.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][833]TalismanofLight.png"));

				if(lflag[4]&&tflag[8])
					b48.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][83]WardensMail.png"));
				else 
					b48.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][83]WardensMail.png"));

				if(lflag[3]&&tflag[8])
					b38.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][761]MagesCap.png"));
				else 
					b38.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][761]MagesCap.png"));


				if(lflag[2]&&tflag[8])
					b28.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][93]BladeoftheRuinedKing.png"));
				else 
					b28.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][93]BladeoftheRuinedKing.png"));


				if(lflag[1]&&tflag[8])
					b18.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][571]InfernoCinder.png"));
				else 
					b18.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][571]InfernoCinder.png"));

				if (lflag[0]&&tflag[8])
					b08.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][140]YoumuusGhostblade.png"));
				else 
					b08.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][140]YoumuusGhostblade.png"));






			}

		});

		tb9.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][887]Spatula.png"));
		tb9.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button tb8 = new Button(composite, SWT.NONE);
		tb8.setBounds(119, 5, 52, 50);
		tb8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[7] == false) {
					tb8.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][626]SparringGloves.png"));
					tflag[7] = true;

				}
				else {					
					tb8.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][626]SparringGloves.png"));
					tflag[7] = false;
				}

				if(lflag[7]&&tflag[7])
					b77.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][492]ThiefsGloves.png"));
				else
					b77.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][492]ThiefsGloves.png"));
			
				if(lflag[6]&&tflag[7])
					b67.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][377]TrapClaw.png"));
				else 
					b67.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][377]TrapClaw.png"));
			

				if(lflag[5]&&tflag[7])
					b57.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][482]Quicksilver.png"));
				else 
					b57.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][482]Quicksilver.png"));

				
				if(lflag[4]&&tflag[7])
				b47.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][969]IceborneGauntlet.png"));
				else 
					b47.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][969]IceborneGauntlet.png"));
				
				if(lflag[3]&&tflag[7])
					b37.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][913]HandofJustice.png"));
				else
					b37.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][913]HandofJustice.png"));
				
				if(lflag[2]&&tflag[7])
					b27.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][721]RepeatingCrossbow.png"));
				else 
					b27.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][721]RepeatingCrossbow.png"));

				if(lflag[1]&&tflag[7])
					b17.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][718]JeweledGauntlet.png"));
				else 
					b17.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][718]JeweledGauntlet.png"));

				if(lflag[0]&&tflag[7])
					b07.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][222]InfinityEdge.png"));
				else
					b07.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][222]InfinityEdge.png"));

			}
		});

		tb8.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][626]SparringGloves.png"));
		tb8.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button tb7 = new Button(composite, SWT.NONE);
		tb7.setBounds(176, 5, 52, 50);
		tb7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[6] == false) {
					tb7.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][244]GiantsBelt.png"));
					tflag[6] = true;					
				}
				else {					
					tb7.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][244]GiantsBelt.png"));
					tflag[6] = false;
				}
				if(lflag[0]&&tflag[6])
					b06.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][323]ZekesHerald.png"));
				else 
					b06.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][323]ZekesHerald.png"));

				if(lflag[1]&&tflag[6])
					b16.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][167]Morellonomicon.png"));
				else 
					b16.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][167]Morellonomicon.png"));

				if(lflag[2]&&tflag[6])
					b26.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][856]TitanicHydra.png"));
				else 
					b26.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][856]TitanicHydra.png"));

				if(lflag[3]&&tflag[6])
					b36.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][445]Redemption.png"));
				else
					b36.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][445]Redemption.png"));

				
				if(lflag[4]&&tflag[6])
				b46.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][330]RedBuff.png"));
				else 
					b46.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][330]RedBuff.png"));

			
				if(lflag[5]&&tflag[6])
					b56.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][863]Zephyr.png"));
				else 
					b56.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][863]Zephyr.png"));

				if(lflag[6]&&tflag[6])
					b66.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][8]WarmogsArmor.png"));
				else 
					b66.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][8]WarmogsArmor.png"));

			}
		});
		tb7.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][244]GiantsBelt.png"));
		tb7.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button tb6 = new Button(composite, SWT.NONE);
		tb6.setBounds(233, 5, 52, 50);
		tb6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[5] == false) {
					tb6.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][875]NegatronCloak.png"));
					tflag[5] = true;					
				}
				else {					
					tb6.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][875]NegatronCloak.png"));
					tflag[5] = false;
				}
				if(lflag[5]&&tflag[5])
					b55.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][2]DragonsClaw.png"));
				else 
					b55.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][2]DragonsClaw.png"));

				if(lflag[4]&&tflag[5])
					b45.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][28]SwordBreaker.png"));
					else 
						b45.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][28]SwordBreaker.png"));
				
				if(lflag[3]&&tflag[5])
					b35.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][845]Hush.png"));
				else
					b35.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][845]Hush.png"));

				if(lflag[2]&&tflag[5])
					b25.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][598]RunaansHurricane.png"));
				else 
					b25.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][598]RunaansHurricane.png"));
				
				if(lflag[1]&&tflag[5])
					b15.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][329]IonicSpark.png"));
				else 
					b15.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][329]IonicSpark.png"));
				
				if(lflag[0]&&tflag[5])
					b05.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][360]Bloodthirster.png"));
				else 
					b05.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][360]Bloodthirster.png"));

			}
		});


		tb6.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][875]NegatronCloak.png"));
		tb6.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button tb5 = new Button(composite, SWT.NONE);
		tb5.setBounds(290, 5, 52, 50);
		tb5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[4] == false) {
					tb5.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][70]ChainVest.png"));
					tflag[4] = true;					
				}
				else {					
					tb5.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][70]ChainVest.png"));
					tflag[4] = false;
				}
				if(lflag[4]&&tflag[4])
					b44.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][105]Thornmail.png"));
					else
						b44.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][105]Thornmail.png"));

				if(lflag[3]&&tflag[4])
					b34.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][40]FrozenHeart.png"));
				else
					b34.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][40]FrozenHeart.png"));


				if(lflag[2]&&tflag[4])
					b24.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][232]PhantomDancer.png"));
				else 
					b24.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][232]PhantomDancer.png"));

				if(lflag[1]&&tflag[4])
					b14.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][833]LocketoftheIronSolari.png"));
				else 
					b14.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][833]LocketoftheIronSolari.png"));
				
				if(lflag[0]&&tflag[4])
					b04.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][873]GuardianAngel.png"));
				else 
					b04.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][873]GuardianAngel.png"));

			}
		});
		tb5.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][70]ChainVest.png"));
		tb5.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button tb4 = new Button(composite, SWT.NONE);
		tb4.setBounds(347, 5, 52, 50);
		tb4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[3] == false) {
					tb4.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][220]TearoftheGoddess.png"));
					tflag[3] = true;					
				}
				else {					
					tb4.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][220]TearoftheGoddess.png"));
					tflag[3] = false;
				}
				if(lflag[0]&&tflag[3])
					b03.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][102]SpearofShojin.png"));
				else 
					b03.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][102]SpearofShojin.png"));

				if(lflag[1]&&tflag[3])
					b13.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][404]LudensEcho.png"));
				else 
					b13.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][404]LudensEcho.png"));
		
				if(lflag[2]&&tflag[3])
					b23.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][610]StatikkShiv.png"));
				else
					b23.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][610]StatikkShiv.png"));
				
				if(lflag[3]&&tflag[3])
					b33.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][524]SeraphsEmbrace.png"));
				else
					b33.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][524]SeraphsEmbrace.png"));


			}
		});
		tb4.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][220]TearoftheGoddess.png"));
		tb4.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button tb3 = new Button(composite, SWT.NONE);
		tb3.setBounds(404, 5, 52, 50);
		tb3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[2] == false) {
					tb3.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][826]RecurveBow.png"));
					tflag[2] = true;					
				}
				else {					
					tb3.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][826]RecurveBow.png"));
					tflag[2] = false;
				}
				
				if(lflag[2]&&tflag[2])
					b22.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][635]RapidFirecannon.png"));
				else 
					b22.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][635]RapidFirecannon.png"));

				if(lflag[1]&&tflag[2])
					b12.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][108]GuinsoosRageblade.png"));
				else
					b12.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][108]GuinsoosRageblade.png"));
				
				if(lflag[0]&&tflag[2])
					b02.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][559]GiantSlayer.png"));
				else 
					b02.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][559]GiantSlayer.png"));

				
			}
		});
		tb3.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][826]RecurveBow.png"));
		tb3.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button tb2 = new Button(composite, SWT.NONE);
		tb2.setBounds(461, 5, 52, 50);
		tb2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[1] == false) {
					tb2.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][12]NeedlesslyLargeRod.png"));
					tflag[1] = true;					
				}
				else {					
					tb2.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][12]NeedlesslyLargeRod.png"));
					tflag[1] = false;
				}
				if(lflag[0]&&tflag[1])
					b01.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][882]HextechGunblade.png"));
				else 
					b01.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][882]HextechGunblade.png"));

				if(lflag[1]&&tflag[1])
					b11.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][871]RabadonsDeathcap.png"));
				else 
					b11.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][871]RabadonsDeathcap.png"));

			}
		});
		tb2.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][12]NeedlesslyLargeRod.png"));
		tb2.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button tb1 = new Button(composite, SWT.NONE);
		tb1.setBounds(518, 5, 52, 50);
		tb1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tflag[0] == false) {
					tb1.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][919]BFSword.png"));
					tflag[0] = true;					
				}
				else {					
					tb1.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][919]BFSword.png"));
					tflag[0] = false;
				}
				
				if(lflag[0]&&tflag[0])
					b00.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][979]Deathblade.png"));
				else 
					b00.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][979]Deathblade.png"));
	

			}
		});
		tb1.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][919]BFSword.png"));
		tb1.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b1 = new Button(composite, SWT.NONE);
		b1.setBounds(5, 60, 52, 50);
		b1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[0] == false) {
					b1.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][919]BFSword.png"));
					lflag[0] = true;					
				}
				else {					
					b1.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][919]BFSword.png"));
					lflag[0] = false;
				}
				if(lflag[0]&&tflag[8])
					b08.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][140]YoumuusGhostblade.png"));
				else 
					b08.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][140]YoumuusGhostblade.png"));

				if(lflag[0]&&tflag[7])
					b07.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][222]InfinityEdge.png"));
				else
					b07.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][222]InfinityEdge.png"));

				if(lflag[0]&&tflag[6])
					b06.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][323]ZekesHerald.png"));
				else 
					b06.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][323]ZekesHerald.png"));

				if(lflag[0]&&tflag[5])
					b05.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][360]Bloodthirster.png"));
				else 
					b05.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][360]Bloodthirster.png"));


				if(lflag[0]&&tflag[4])
					b04.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][873]GuardianAngel.png"));
				else 
					b04.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][873]GuardianAngel.png"));

				if(lflag[0]&&tflag[3])
					b03.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][102]SpearofShojin.png"));
				else 
					b03.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][102]SpearofShojin.png"));


				if(lflag[0]&&tflag[2])
					b02.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][559]GiantSlayer.png"));
				else 
					b02.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][559]GiantSlayer.png"));

				if(lflag[0]&&tflag[1])
					b01.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][882]HextechGunblade.png"));
				else 
					b01.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][882]HextechGunblade.png"));

				if(lflag[0]&&tflag[0])
					b00.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][979]Deathblade.png"));
				else 
					b00.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][979]Deathblade.png"));
			}
		});

		b1.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][919]BFSword.png"));
		b1.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b2 = new Button(composite, SWT.NONE);
		b2.setBounds(5, 115, 52, 50);
		b2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[1] == false) {
					b2.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][12]NeedlesslyLargeRod.png"));
					lflag[1] = true;					
				}
				else {					
					b2.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][12]NeedlesslyLargeRod.png"));
					lflag[1] = false;
				}
				if(lflag[1]&&tflag[8])
					b18.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][571]InfernoCinder.png"));
				else 
					b18.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][571]InfernoCinder.png"));

				if(lflag[1]&&tflag[7])
					b17.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][718]JeweledGauntlet.png"));
				else 
					b17.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][718]JeweledGauntlet.png"));

				if(lflag[1]&&tflag[6])
					b16.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][167]Morellonomicon.png"));
				else 
					b16.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][167]Morellonomicon.png"));

				if(lflag[1]&&tflag[5])
					b15.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][329]IonicSpark.png"));
				else 
					b15.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][329]IonicSpark.png"));
				if(lflag[1]&&tflag[4])
					b14.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][833]LocketoftheIronSolari.png"));
				else 
					b14.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][833]LocketoftheIronSolari.png"));
				if(lflag[1]&&tflag[3])
					b13.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][404]LudensEcho.png"));
				else 
					b13.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][404]LudensEcho.png"));
				if(lflag[1]&&tflag[2])
					b12.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][108]GuinsoosRageblade.png"));
				else
					b12.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][108]GuinsoosRageblade.png"));

				if(lflag[1]&&tflag[1])
					b11.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][871]RabadonsDeathcap.png"));
				else 
					b11.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][871]RabadonsDeathcap.png"));
			}
		});

		b2.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][12]NeedlesslyLargeRod.png"));
		b2.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b3 = new Button(composite, SWT.NONE);
		b3.setBounds(5, 170, 52, 50);
		b3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[2] == false) {
					b3.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][826]RecurveBow.png"));
					lflag[2] = true;					
				}
				else {					
					b3.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][826]RecurveBow.png"));
					lflag[2] = false;
				}

				if(lflag[2]&&tflag[8])
					b28.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][93]BladeoftheRuinedKing.png"));
				else 
					b28.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][93]BladeoftheRuinedKing.png"));

				if(lflag[2]&&tflag[7])
					b27.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][721]RepeatingCrossbow.png"));
				else 
					b27.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][721]RepeatingCrossbow.png"));

				if(lflag[2]&&tflag[6])
					b26.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][856]TitanicHydra.png"));
				else 
					b26.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][856]TitanicHydra.png"));

				if(lflag[2]&&tflag[5])
					b25.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][598]RunaansHurricane.png"));
				else 
					b25.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][598]RunaansHurricane.png"));

				if(lflag[2]&&tflag[4])
					b24.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][232]PhantomDancer.png"));
				else 
					b24.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][232]PhantomDancer.png"));

				if(lflag[2]&&tflag[3])
					b23.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][610]StatikkShiv.png"));
				else
					b23.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][610]StatikkShiv.png"));

				if(lflag[2]&&tflag[2])
					b22.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][635]RapidFirecannon.png"));
				else 
					b22.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][635]RapidFirecannon.png"));

			}
		});
		b3.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][826]RecurveBow.png"));
		b3.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));


		Button b4 = new Button(composite, SWT.NONE);
		b4.setBounds(5, 225, 52, 50);
		b4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[3] == false) {
					b4.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][220]TearoftheGoddess.png"));
					lflag[3] = true;					
				}
				else {					
					b4.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][220]TearoftheGoddess.png"));
					lflag[3] = false;
				}

				if(lflag[3]&&tflag[8])
					b38.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][761]MagesCap.png"));
				else 
					b38.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][761]MagesCap.png"));

				if(lflag[3]&&tflag[7])
					b37.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][913]HandofJustice.png"));
				else
					b37.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][913]HandofJustice.png"));

				if(lflag[3]&&tflag[6])
					b36.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][445]Redemption.png"));
				else
					b36.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][445]Redemption.png"));

				if(lflag[3]&&tflag[5])
					b35.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][845]Hush.png"));
				else
					b35.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][845]Hush.png"));

				if(lflag[3]&&tflag[4])
					b34.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][40]FrozenHeart.png"));
				else
					b34.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][40]FrozenHeart.png"));
				if(lflag[3]&&tflag[3])
					b33.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][524]SeraphsEmbrace.png"));
				else
					b33.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][524]SeraphsEmbrace.png"));


			}
		});
		b4.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][220]TearoftheGoddess.png"));
		b4.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b5 = new Button(composite, SWT.NONE);
		b5.setBounds(5, 280, 52, 50);
		b5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[4] == false) {
					b5.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][70]ChainVest.png"));
					lflag[4] = true;					
				}
				else {					
					b5.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][70]ChainVest.png"));
					lflag[4] = false;
				}
				if(lflag[4]&&tflag[8])
					b48.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][83]WardensMail.png"));
				else 
					b48.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][83]WardensMail.png"));

				if(lflag[4]&&tflag[7])
					b47.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][969]IceborneGauntlet.png"));
				else 
					b47.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][969]IceborneGauntlet.png"));

				if(lflag[4]&&tflag[6])
					b46.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][330]RedBuff.png"));
				else 
					b46.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][330]RedBuff.png"));

				if(lflag[4]&&tflag[5])
					b45.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][28]SwordBreaker.png"));
				else 
					b45.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][28]SwordBreaker.png"));

				if(lflag[4]&&tflag[4])
					b44.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][105]Thornmail.png"));
				else
					b44.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][105]Thornmail.png"));

			}
		});
		b5.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][70]ChainVest.png"));
		b5.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b6 = new Button(composite, SWT.NONE);
		b6.setBounds(5, 335, 52, 50);
		b6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[5] == false) {
					b6.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][875]NegatronCloak.png"));
					lflag[5] = true;					
				}
				else {					
					b6.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][875]NegatronCloak.png"));
					lflag[5] = false;
				}

				if(lflag[5]&&tflag[8])
					b58.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][833]TalismanofLight.png"));
				else 
					b58.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][833]TalismanofLight.png"));
				if(lflag[5]&&tflag[7])
					b57.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][482]Quicksilver.png"));
				else 
					b57.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][482]Quicksilver.png"));

				if(lflag[5]&&tflag[6])
					b56.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][863]Zephyr.png"));
				else 
					b56.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][863]Zephyr.png"));


				if(lflag[5]&&tflag[5])
					b55.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][2]DragonsClaw.png"));
				else 
					b55.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][2]DragonsClaw.png"));

			}
		});
		b6.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][875]NegatronCloak.png"));
		b6.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b7 = new Button(composite, SWT.NONE);
		b7.setBounds(5, 390, 52, 50);
		b7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[6] == false) {
					b7.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][244]GiantsBelt.png"));
					lflag[6] = true;					
				}
				else {					
					b7.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][244]GiantsBelt.png"));
					lflag[6] = false;
				}

				if(lflag[6]&&tflag[8])
					b68.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][355]FrozenMallet.png"));
				else 
					b68.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][355]FrozenMallet.png"));



				if(lflag[6]&&tflag[7])
					b67.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][377]TrapClaw.png"));
				else 
					b67.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][377]TrapClaw.png"));

				if(lflag[6]&&tflag[6])
					b66.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][8]WarmogsArmor.png"));
				else 
					b66.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][8]WarmogsArmor.png"));

			}
		});
		b7.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][244]GiantsBelt.png"));
		b7.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));


		Button b8 = new Button(composite, SWT.NONE);
		b8.setBounds(5, 445, 52, 50);
		b8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[7] == false) {
					b8.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][626]SparringGloves.png"));
					lflag[7] = true;					
				}
				else {					
					b8.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][626]SparringGloves.png"));
					lflag[7] = false;
				}


				if(lflag[7]&&tflag[8])
					b78.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][311]BerserkerAxe.png"));
				else 
					b78.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][311]BerserkerAxe.png"));

				if(lflag[7]&&tflag[7])
					b77.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][492]ThiefsGloves.png"));
				else
					b77.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][492]ThiefsGloves.png"));



			}
		});

		b8.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][626]SparringGloves.png"));
		b8.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));

		Button b9 = new Button(composite, SWT.NONE);
		b9.setBounds(5, 500, 52, 50);
		b9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lflag[8] == false) {
					b9.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/b/[tftactics.gg][887]Spatula.png"));
					lflag[8] = true;					
				}
				else {					
					b9.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][887]Spatula.png"));
					lflag[8] = false;
				}
				if(lflag[8]&&tflag[8])
					b88.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/c/[tftactics.gg][803]ForceofNature.png"));
				else 
					b88.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gc/g[tftactics.gg][803]ForceofNature.png"));

			}
		});
		b9.setImage(SWTResourceManager.getImage(EquipmentTable.class, "/gb/g[tftactics.gg][887]Spatula.png"));
		b9.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));


	}

}
