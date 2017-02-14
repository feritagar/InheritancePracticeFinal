/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author FA
 */
public class Windows extends OperatingSystem {
    private String version;
    private String recommendedProcessor;

    public void createRecommendedComputer(){
        System.out.println("For Windows "+ version+", use "+recommendedProcessor+" processor");
    }
    
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRecommendedProcessor() {
        return recommendedProcessor;
    }

    public void setRecommendedProcessor(String recommendedProcessor) {
        this.recommendedProcessor = recommendedProcessor;
    }
    
    
    
}
