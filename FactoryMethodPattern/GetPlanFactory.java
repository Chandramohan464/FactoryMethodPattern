public class GetPlanFactory {
    public Plan getPlan(String PlanType){
        if(PlanType==null){
            return null;
        }
        if(PlanType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        else if(PlanType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(PlanType.equalsIgnoreCase("INSTITUIONALPLAN")){
            return new InstitutionalPlan();
        }
        return null;
    }
}