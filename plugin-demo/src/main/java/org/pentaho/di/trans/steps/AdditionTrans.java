package org.pentaho.di.trans.steps;

import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.row.RowDataUtil;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.BaseStep;
import org.pentaho.di.trans.step.StepDataInterface;
import org.pentaho.di.trans.step.StepInterface;
import org.pentaho.di.trans.step.StepMeta;
import org.pentaho.di.trans.step.StepMetaInterface;

public class AdditionTrans extends BaseStep implements StepInterface{

	public AdditionTrans(StepMeta stepMeta, StepDataInterface stepDataInterface, int copyNr, TransMeta transMeta,
			Trans trans) {
		super(stepMeta, stepDataInterface, copyNr, transMeta, trans);
	}
	
	public boolean processRow(StepMetaInterface smi, StepDataInterface sdi) throws KettleException {

		AdditionTransMeta meta  = (AdditionTransMeta) smi;
		AdditionTransStepData data = (AdditionTransStepData) sdi;
		
		Object[] row = getRow();
		if (row==null) {
			setOutputDone();
			return false;
		}
		
		if (first) {
			first=false;
			
			data.outputRowMeta = getInputRowMeta().clone();
			meta.getFields(data.outputRowMeta, getStepname(), null, null, this);
		}
		
		String value = "Hello, world!";
		
		Object[] outputRow = RowDataUtil.addValueData(row, getInputRowMeta().size(), value);
		
		putRow(data.outputRowMeta, outputRow);
		
		return true;
	}

}
