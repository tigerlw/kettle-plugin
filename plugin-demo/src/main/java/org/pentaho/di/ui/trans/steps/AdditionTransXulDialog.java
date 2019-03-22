package org.pentaho.di.ui.trans.steps;

import java.util.ResourceBundle;

import org.eclipse.swt.widgets.Shell;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.BaseStepMeta;
import org.pentaho.di.ui.trans.step.BaseStepGenericXulDialog;
import org.pentaho.ui.xul.XulException;
import org.pentaho.ui.xul.XulSettingsManager;
import org.pentaho.ui.xul.swing.SwingBindingFactory;
import org.pentaho.ui.xul.swing.SwingXulLoader;
import org.pentaho.ui.xul.swing.SwingXulRunner;

public class AdditionTransXulDialog extends BaseStepGenericXulDialog
{

	public AdditionTransXulDialog( Object parent, BaseStepMeta baseStepMeta, TransMeta transMeta, String stepname ) {
		 super( "org/pentaho/di/ui/trans/steps/mongodbinput/xul/mongodb_input.xul", parent, baseStepMeta, transMeta,
			        stepname );
	}
	
	public void init() {
	
	}

	@Override
	protected void initializeXul() throws XulException {
		// TODO Auto-generated method stub
		initializeXul( new SwingXulLoader(), new SwingBindingFactory(), new SwingXulRunner(), parent );
	}

	@Override
	public XulSettingsManager getSettingsManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceBundle getResourceBundle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAccept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Class<?> getClassForMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
