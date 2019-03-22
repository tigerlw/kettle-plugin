package org.pentaho.di.trans.steps;

import org.pentaho.di.core.annotations.Step;
import org.pentaho.di.core.exception.KettleStepException;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.core.row.ValueMeta;
import org.pentaho.di.core.row.ValueMetaInterface;
import org.pentaho.di.core.variables.VariableSpace;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.BaseStepMeta;
import org.pentaho.di.trans.step.StepDataInterface;
import org.pentaho.di.trans.step.StepInterface;
import org.pentaho.di.trans.step.StepMeta;
import org.pentaho.di.trans.step.StepMetaInterface;

@Step( id = "plugin-demo", image = "mongodb-input.svg", name = "plugin demo",
description = "plugin demo",
documentationUrl = "Products/Data_Integration/Transformation_Step_Reference/MongoDB_Input",
categoryDescription = "Big Data" )
public class AdditionTransMeta extends BaseStepMeta implements StepMetaInterface 
{
	protected static Class<?> PKG = AdditionTransMeta.class;
	

	@Override
	public void setDefault() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StepInterface getStep(StepMeta stepMeta, StepDataInterface stepDataInterface, int copyNr,
			TransMeta transMeta, Trans trans) {
		// TODO Auto-generated method stub
		StepInterface step  = new AdditionTrans(stepMeta, stepDataInterface, copyNr, transMeta, trans);
		
		return step;
	}

	@Override
	public StepDataInterface getStepData() {
		// TODO Auto-generated method stub
		
		StepDataInterface stepData = new AdditionTransStepData();
		
		return stepData;
	}
	
	@Override
	public void getFields(RowMetaInterface inputRowMeta, String name,
			RowMetaInterface[] info, StepMeta nextStep, VariableSpace space)
			throws KettleStepException {
		String realFieldName = space.environmentSubstitute("hello");
		ValueMetaInterface field = new ValueMeta(realFieldName, ValueMetaInterface.TYPE_STRING);
		field.setOrigin(name);		
		inputRowMeta.addValueMeta(field);
	}

}
