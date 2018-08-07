package com.pcc.th.yyy;

abstract class Report {
	abstract void createHeader();
	abstract void createBody();
	abstract void createFooter();
	void generataeReport() {
		createHeader();
		createBody();
		createFooter();
	}
}
class Report1 extends Report{
	@Override
	void createHeader() {
		
	}

	@Override
	void createBody() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void createFooter() {
		// TODO Auto-generated method stub
		
	}
}
