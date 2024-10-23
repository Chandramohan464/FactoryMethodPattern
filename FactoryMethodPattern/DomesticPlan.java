class DomesticPlan extends Plan{
    @Override
    public void getRate(){
        rate=3.50;
    }
}

class CommercialPlan extends Plan{
    @Override
    public void getRate(){
        rate=7.50;
    }
}

class InstitutionalPlan extends Plan{
    @Override
    public void getRate(){
        rate=5.50;
    }
}