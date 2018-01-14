package com.raiden.reda.hilmi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang.StringUtils;

/**
 * Action Model class
 */
public class Action {

    /**
     * Action Id
     */
    private long id;

    /**
     * Evolution customer case id
     */
    private long idEvol;

    /**
     * Customer case id
     */
    private long customerCaseId;

    /**
     * Scopus Id
     */
    private String scopusId;

    /**
     * txt
     */
    private String txt;

    /**
     *  Date d'action
     */
    private String dateAction;

    /**
     *  User Id
     */
    private long idUser;

    /**
     *  Commentaire de l'action
     */
    private String comment;

    /**
     * Description / Objet de l'action
     */
    private String description;

    /**
     * Date action getter
     * @return
     */
    public String getDateAction() {
        return dateAction;
    }

    /**
     * Date action setter
     * @param dateAction
     * @return
     */
    public Action setDateAction(String dateAction) {
        this.dateAction = dateAction;
        return this;
    }

    /**
     * Action id getter
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * Action id setter
     * @param id
     * @return
     */
    public Action setId(long id) {
        this.id = id;
        return this;
    }

    /**
     * Id evol getter
     * @return
     */
    public long getIdEvol() {
        return idEvol;
    }

    /**
     * Id evol setter
     * @param idEvol
     * @return
     */
    public Action setIdEvol(long idEvol) {
        this.idEvol = idEvol;
        return this;
    }

    /**
     * Customer case id getter
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
    public Action setCustomerCaseId(long customerCaseId) {
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
    public Action setScopusId(String scopusId) {
        this.scopusId = scopusId;
        return this;
    }

    /**
     * Txt getter
     * @return
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Txt setter
     * @param txt
     * @return
     */
    public Action setTxt(String txt) {
        this.txt = txt;
        return this;
    }

    /**
     * Id user getter
     * @return
     */
    public long getIdUser() {
        return idUser;
    }

    /**
     * Id user setter
     * @param idUser
     * @return
     */
    public Action setIdUser(long idUser) {
        this.idUser = idUser;
        return this;
    }

    /**
     * Comment getter
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * Comment setter
     * @param comment
     * @return
     */
    public Action setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Description getter
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Description setter
     * @param description
     * @return
     */
    public Action setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Is empty method used in creation functionality
     * @return
     */
    @JsonIgnore
    public boolean isEmpty() {

        if(idEvol != 0){
            return false;
        }

        if(idUser != 0){
            return false;
        }

        if(id != 0){
            return false;
        }

        if(customerCaseId != 0){
            return false;
        }

        if(StringUtils.isNotEmpty(scopusId)){
            return false;
        }

        if(StringUtils.isNotEmpty(comment)){
            return false;
        }

        if(StringUtils.isNotEmpty(txt)){
            return false;
        }

        if(StringUtils.isNotEmpty(description)){
            return false;
        }

        if(StringUtils.isNotEmpty(dateAction)){
            return false;
        }
        return true;
    }

    /**
     * Action equal method class
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Action action = (Action) o;

        if (id != action.id) {
            return false;
        }
        if (idEvol != action.idEvol) {
            return false;
        }
        if (customerCaseId != action.customerCaseId) {
            return false;
        }
        if (idUser != action.idUser) {
            return false;
        }
        if (scopusId != null ? !scopusId.equals(action.scopusId) : action.scopusId != null) {
            return false;
        }
        if (txt != null ? !txt.equals(action.txt) : action.txt != null) {
            return false;
        }
        if (dateAction != null ? !dateAction.equals(action.dateAction) : action.dateAction != null) {
            return false;
        }
        if (comment != null ? !comment.equals(action.comment) : action.comment != null) {
            return false;
        }
        return description != null ? description.equals(action.description) : action.description == null;
    }

    /**
     * HashCode
     * @return
     */
    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (idEvol ^ (idEvol >>> 32));
        result = 31 * result + (int) (customerCaseId ^ (customerCaseId >>> 32));
        result = 31 * result + (scopusId != null ? scopusId.hashCode() : 0);
        result = 31 * result + (txt != null ? txt.hashCode() : 0);
        result = 31 * result + (dateAction != null ? dateAction.hashCode() : 0);
        result = 31 * result + (int) (idUser ^ (idUser >>> 32));
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
