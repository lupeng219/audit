package com.crdloo.audit.web.rule.form;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;


public class RuleForm  implements Serializable{

    private static final long serialVersionUID = 5463676781392294101L;
    
    private String flag_rulespeciallist = ""; 
    private String flag_ruleapplyloan = "";   
    private String flag_ruleapplyloanmon = "";
    private String flag_ruleexecution = "";   
    private String rule_final_decision = "";  
    private String rule_final_weight = "";
    private String rule_name_QJS010 = ""; 
    private String rule_weight_QJS010 = ""; 
    private String rule_name_QJF050 = ""; 
    private String rule_weight_QJF050 = ""; 
    private String rule_name_QAM010 = ""; 
    private String rule_weight_QAM010 = ""; 
    private String rule_name_QJE010 = ""; 
    private String rule_weight_QJE010 = ""; 
    private String rule_name_QJE020 = ""; 
    private String rule_weight_QJE020 = "";
    
    public  RuleForm (){
        
    }
    public String getFlag_rulespeciallist() {
        return flag_rulespeciallist;
    }
    public void setFlag_rulespeciallist(String flag_rulespeciallist) {
        this.flag_rulespeciallist = flag_rulespeciallist;
    }
    public String getFlag_ruleapplyloan() {
        return flag_ruleapplyloan;
    }
    public void setFlag_ruleapplyloan(String flag_ruleapplyloan) {
        this.flag_ruleapplyloan = flag_ruleapplyloan;
    }
    public String getFlag_ruleapplyloanmon() {
        return flag_ruleapplyloanmon;
    }
    public void setFlag_ruleapplyloanmon(String flag_ruleapplyloanmon) {
        this.flag_ruleapplyloanmon = flag_ruleapplyloanmon;
    }
    public String getFlag_ruleexecution() {
        return flag_ruleexecution;
    }
    public void setFlag_ruleexecution(String flag_ruleexecution) {
        this.flag_ruleexecution = flag_ruleexecution;
    }
    public String getRule_final_decision() {
        return rule_final_decision;
    }
    public void setRule_final_decision(String rule_final_decision) {
        this.rule_final_decision = rule_final_decision;
    }
    public String getRule_final_weight() {
        return rule_final_weight;
    }
    public void setRule_final_weight(String rule_final_weight) {
        this.rule_final_weight = rule_final_weight;
    }
    public String getRule_name_QJS010() {
        return rule_name_QJS010;
    }
    public void setRule_name_QJS010(String rule_name_QJS010) {
        this.rule_name_QJS010 = rule_name_QJS010;
    }
    public String getRule_weight_QJS010() {
        return rule_weight_QJS010;
    }
    public void setRule_weight_QJS010(String rule_weight_QJS010) {
        this.rule_weight_QJS010 = rule_weight_QJS010;
    }
    public String getRule_name_QJF050() {
        return rule_name_QJF050;
    }
    public void setRule_name_QJF050(String rule_name_QJF050) {
        this.rule_name_QJF050 = rule_name_QJF050;
    }
    public String getRule_weight_QJF050() {
        return rule_weight_QJF050;
    }
    public void setRule_weight_QJF050(String rule_weight_QJF050) {
        this.rule_weight_QJF050 = rule_weight_QJF050;
    }
    public String getRule_name_QAM010() {
        return rule_name_QAM010;
    }
    public void setRule_name_QAM010(String rule_name_QAM010) {
        this.rule_name_QAM010 = rule_name_QAM010;
    }
    public String getRule_weight_QAM010() {
        return rule_weight_QAM010;
    }
    public void setRule_weight_QAM010(String rule_weight_QAM010) {
        this.rule_weight_QAM010 = rule_weight_QAM010;
    }
    public String getRule_name_QJE010() {
        return rule_name_QJE010;
    }
    public void setRule_name_QJE010(String rule_name_QJE010) {
        this.rule_name_QJE010 = rule_name_QJE010;
    }
    public String getRule_weight_QJE010() {
        return rule_weight_QJE010;
    }
    public void setRule_weight_QJE010(String rule_weight_QJE010) {
        this.rule_weight_QJE010 = rule_weight_QJE010;
    }
    public String getRule_name_QJE020() {
        return rule_name_QJE020;
    }
    public void setRule_name_QJE020(String rule_name_QJE020) {
        this.rule_name_QJE020 = rule_name_QJE020;
    }
    public String getRule_weight_QJE020() {
        return rule_weight_QJE020;
    }
    public void setRule_weight_QJE020(String rule_weight_QJE020) {
        this.rule_weight_QJE020 = rule_weight_QJE020;
    } 
    @Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
}
