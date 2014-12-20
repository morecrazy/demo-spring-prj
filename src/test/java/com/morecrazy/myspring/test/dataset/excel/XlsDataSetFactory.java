package com.morecrazy.myspring.test.dataset.excel;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.excel.XlsDataSet;
import org.unitils.core.UnitilsException;
import org.unitils.dbunit.datasetfactory.DataSetFactory;
import org.unitils.dbunit.util.MultiSchemaDataSet;

public class XlsDataSetFactory implements DataSetFactory {
	
	 private String defaultSchemaName;
	 public MultiSchemaDataSet createDataSet(File... dataSetFiles) {
		 if (dataSetFiles == null || dataSetFiles.length <= 0 || dataSetFiles[0] == null) {
			 throw new RuntimeException("xls");
		 }
		 if (!dataSetFiles[0].getName().endsWith(".xls")) {
			 throw new RuntimeException("xls");
		 }
	  
		 MultiSchemaDataSet multiSchemaDataSet = new MultiSchemaDataSet();
	  
		 IDataSet idataSet = null;
		 try {
			 idataSet = new XlsDataSet(dataSetFiles[0]);
		 } catch (DataSetException e) {
			 e.printStackTrace();
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
		 multiSchemaDataSet.setDataSetForSchema(defaultSchemaName, idataSet);
		 return multiSchemaDataSet;
	 }
	 
	 public String getDataSetFileExtension() {
		 return "xls";
	 }
	 
	 public void init(Properties configuration, String defaultSchemaName) {
		 this.defaultSchemaName = defaultSchemaName;
	 }
}
