package com.pcc.th.yyy;

abstract class Report {
    abstract void createHeader();
    abstract void createBody();
    abstract void createFooter();
    void generateReport() {
        createHeader();
        createBody();
        createFooter();
    }
}

class Report2 extends Report{

    @Override
    void createHeader() {
        // TODO Auto-generated method stub
        
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
