package com.raiden.reda.hilmi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang.StringUtils;

/**
 * Action criteria model
 */
public class ActionCriteria {

    /**
     *  Customer case id
     */
    private long customerCaseId;

    /**
     * Original order number on which the record was issued
     */
    private String scopusId;

    /**
     *  Query search depth
     */
    private SearchStrategy searchStrategy;

    /**
     * Customer case getter
     * @return
     */
    public long getCustomerCaseId() {

            return customerCaseId;
    }

    /**
     * Customer case setter
     * @param customerCaseId
     * @return
     */
    public ActionCriteria setCustomerCaseId(long customerCaseId) {
        this.customerCaseId = customerCaseId;
        return this;
    }

    /**
     * Scopus id getter
     * @return
     */
    public String getScopusId() {
        return scopusId;
    }

    /**
     * Scopus id setter
     * @param scopusId
     * @return
     */
    public ActionCriteria setScopusId(String scopusId) {
        this.scopusId = scopusId;
        return this;
    }

    /**
     * SearchStrategy getter
     * @return
     */
    public SearchStrategy getSearchStrategy() {
        return searchStrategy;
    }

    /**
     * SearchStrategy setter
     * @param searchStrategy
     * @return
     */
    public ActionCriteria setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
        return this;
    }

    /**
     * Action criteria empty method
     * @return
     */
    @JsonIgnore
    public boolean isEmpty() {

        if(customerCaseId != 0){
            return false;
        }

        if(StringUtils.isNotEmpty(scopusId)){
            return false;
        }

        if(searchStrategy!=null){
            return false;
        }

        return true;
    }
}
