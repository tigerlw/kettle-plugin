package org.pentaho.di.ui.trans.steps;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.pentaho.di.core.Const;
import org.pentaho.di.i18n.BaseMessages;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.BaseStepMeta;
import org.pentaho.di.trans.step.StepDialogInterface;
import org.pentaho.di.trans.steps.AdditionTransMeta;
import org.pentaho.di.ui.trans.step.BaseStepDialog;

public class AdditionTransDialog extends BaseStepDialog implements StepDialogInterface
{
	protected static Class<?> PKG = AdditionTransMeta.class; 

	public AdditionTransDialog(Shell parent, Object in, TransMeta tr, String sname)
	{
		super( parent, (BaseStepMeta) in, tr, sname );
		// TODO Auto-generated constructor stub
	}

	@Override
	public String open() 
	{
		// TODO Auto-generated method stub
		Shell parent = getParent();
		Display display = parent.getDisplay();

		shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.RESIZE | SWT.MAX | SWT.MIN);

		FormLayout formLayout = new FormLayout();
		formLayout.marginWidth = Const.FORM_MARGIN;
		formLayout.marginHeight = Const.FORM_MARGIN;

		shell.setLayout(formLayout);
		shell.setText(BaseMessages.getString(PKG, "MongoDbInputDialog.Shell.Title"));

		setSize();

		shell.open();

		return "hello";
	}

}
