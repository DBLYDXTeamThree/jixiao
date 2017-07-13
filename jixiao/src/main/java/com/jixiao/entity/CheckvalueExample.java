package com.jixiao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CheckvalueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckvalueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andValueidIsNull() {
            addCriterion("VALUEID is null");
            return (Criteria) this;
        }

        public Criteria andValueidIsNotNull() {
            addCriterion("VALUEID is not null");
            return (Criteria) this;
        }

        public Criteria andValueidEqualTo(Integer value) {
            addCriterion("VALUEID =", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotEqualTo(Integer value) {
            addCriterion("VALUEID <>", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidGreaterThan(Integer value) {
            addCriterion("VALUEID >", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VALUEID >=", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidLessThan(Integer value) {
            addCriterion("VALUEID <", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidLessThanOrEqualTo(Integer value) {
            addCriterion("VALUEID <=", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidIn(List<Integer> values) {
            addCriterion("VALUEID in", values, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotIn(List<Integer> values) {
            addCriterion("VALUEID not in", values, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidBetween(Integer value1, Integer value2) {
            addCriterion("VALUEID between", value1, value2, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotBetween(Integer value1, Integer value2) {
            addCriterion("VALUEID not between", value1, value2, "valueid");
            return (Criteria) this;
        }

        public Criteria andSxszvalueIsNull() {
            addCriterion("SXSZVALUE is null");
            return (Criteria) this;
        }

        public Criteria andSxszvalueIsNotNull() {
            addCriterion("SXSZVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSxszvalueEqualTo(Integer value) {
            addCriterion("SXSZVALUE =", value, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueNotEqualTo(Integer value) {
            addCriterion("SXSZVALUE <>", value, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueGreaterThan(Integer value) {
            addCriterion("SXSZVALUE >", value, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("SXSZVALUE >=", value, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueLessThan(Integer value) {
            addCriterion("SXSZVALUE <", value, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueLessThanOrEqualTo(Integer value) {
            addCriterion("SXSZVALUE <=", value, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueIn(List<Integer> values) {
            addCriterion("SXSZVALUE in", values, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueNotIn(List<Integer> values) {
            addCriterion("SXSZVALUE not in", values, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueBetween(Integer value1, Integer value2) {
            addCriterion("SXSZVALUE between", value1, value2, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andSxszvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("SXSZVALUE not between", value1, value2, "sxszvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueIsNull() {
            addCriterion("LJZLVALUE is null");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueIsNotNull() {
            addCriterion("LJZLVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueEqualTo(Integer value) {
            addCriterion("LJZLVALUE =", value, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueNotEqualTo(Integer value) {
            addCriterion("LJZLVALUE <>", value, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueGreaterThan(Integer value) {
            addCriterion("LJZLVALUE >", value, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("LJZLVALUE >=", value, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueLessThan(Integer value) {
            addCriterion("LJZLVALUE <", value, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueLessThanOrEqualTo(Integer value) {
            addCriterion("LJZLVALUE <=", value, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueIn(List<Integer> values) {
            addCriterion("LJZLVALUE in", values, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueNotIn(List<Integer> values) {
            addCriterion("LJZLVALUE not in", values, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueBetween(Integer value1, Integer value2) {
            addCriterion("LJZLVALUE between", value1, value2, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andLjzlvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("LJZLVALUE not between", value1, value2, "ljzlvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueIsNull() {
            addCriterion("GZZFVALUE is null");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueIsNotNull() {
            addCriterion("GZZFVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueEqualTo(Integer value) {
            addCriterion("GZZFVALUE =", value, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueNotEqualTo(Integer value) {
            addCriterion("GZZFVALUE <>", value, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueGreaterThan(Integer value) {
            addCriterion("GZZFVALUE >", value, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("GZZFVALUE >=", value, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueLessThan(Integer value) {
            addCriterion("GZZFVALUE <", value, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueLessThanOrEqualTo(Integer value) {
            addCriterion("GZZFVALUE <=", value, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueIn(List<Integer> values) {
            addCriterion("GZZFVALUE in", values, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueNotIn(List<Integer> values) {
            addCriterion("GZZFVALUE not in", values, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueBetween(Integer value1, Integer value2) {
            addCriterion("GZZFVALUE between", value1, value2, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andGzzfvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("GZZFVALUE not between", value1, value2, "gzzfvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueIsNull() {
            addCriterion("JCNLVALUE is null");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueIsNotNull() {
            addCriterion("JCNLVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueEqualTo(Integer value) {
            addCriterion("JCNLVALUE =", value, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueNotEqualTo(Integer value) {
            addCriterion("JCNLVALUE <>", value, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueGreaterThan(Integer value) {
            addCriterion("JCNLVALUE >", value, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("JCNLVALUE >=", value, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueLessThan(Integer value) {
            addCriterion("JCNLVALUE <", value, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueLessThanOrEqualTo(Integer value) {
            addCriterion("JCNLVALUE <=", value, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueIn(List<Integer> values) {
            addCriterion("JCNLVALUE in", values, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueNotIn(List<Integer> values) {
            addCriterion("JCNLVALUE not in", values, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueBetween(Integer value1, Integer value2) {
            addCriterion("JCNLVALUE between", value1, value2, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andJcnlvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("JCNLVALUE not between", value1, value2, "jcnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueIsNull() {
            addCriterion("ZZXTNLVALUE is null");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueIsNotNull() {
            addCriterion("ZZXTNLVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueEqualTo(Integer value) {
            addCriterion("ZZXTNLVALUE =", value, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueNotEqualTo(Integer value) {
            addCriterion("ZZXTNLVALUE <>", value, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueGreaterThan(Integer value) {
            addCriterion("ZZXTNLVALUE >", value, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZZXTNLVALUE >=", value, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueLessThan(Integer value) {
            addCriterion("ZZXTNLVALUE <", value, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueLessThanOrEqualTo(Integer value) {
            addCriterion("ZZXTNLVALUE <=", value, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueIn(List<Integer> values) {
            addCriterion("ZZXTNLVALUE in", values, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueNotIn(List<Integer> values) {
            addCriterion("ZZXTNLVALUE not in", values, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueBetween(Integer value1, Integer value2) {
            addCriterion("ZZXTNLVALUE between", value1, value2, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andZzxtnlvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("ZZXTNLVALUE not between", value1, value2, "zzxtnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueIsNull() {
            addCriterion("CXNLVALUE is null");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueIsNotNull() {
            addCriterion("CXNLVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueEqualTo(Integer value) {
            addCriterion("CXNLVALUE =", value, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueNotEqualTo(Integer value) {
            addCriterion("CXNLVALUE <>", value, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueGreaterThan(Integer value) {
            addCriterion("CXNLVALUE >", value, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("CXNLVALUE >=", value, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueLessThan(Integer value) {
            addCriterion("CXNLVALUE <", value, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueLessThanOrEqualTo(Integer value) {
            addCriterion("CXNLVALUE <=", value, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueIn(List<Integer> values) {
            addCriterion("CXNLVALUE in", values, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueNotIn(List<Integer> values) {
            addCriterion("CXNLVALUE not in", values, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueBetween(Integer value1, Integer value2) {
            addCriterion("CXNLVALUE between", value1, value2, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andCxnlvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("CXNLVALUE not between", value1, value2, "cxnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueIsNull() {
            addCriterion("LDNLVALUE is null");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueIsNotNull() {
            addCriterion("LDNLVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueEqualTo(Integer value) {
            addCriterion("LDNLVALUE =", value, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueNotEqualTo(Integer value) {
            addCriterion("LDNLVALUE <>", value, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueGreaterThan(Integer value) {
            addCriterion("LDNLVALUE >", value, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("LDNLVALUE >=", value, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueLessThan(Integer value) {
            addCriterion("LDNLVALUE <", value, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueLessThanOrEqualTo(Integer value) {
            addCriterion("LDNLVALUE <=", value, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueIn(List<Integer> values) {
            addCriterion("LDNLVALUE in", values, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueNotIn(List<Integer> values) {
            addCriterion("LDNLVALUE not in", values, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueBetween(Integer value1, Integer value2) {
            addCriterion("LDNLVALUE between", value1, value2, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andLdnlvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("LDNLVALUE not between", value1, value2, "ldnlvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueIsNull() {
            addCriterion("ZRXVALUE is null");
            return (Criteria) this;
        }

        public Criteria andZrxvalueIsNotNull() {
            addCriterion("ZRXVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andZrxvalueEqualTo(Integer value) {
            addCriterion("ZRXVALUE =", value, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueNotEqualTo(Integer value) {
            addCriterion("ZRXVALUE <>", value, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueGreaterThan(Integer value) {
            addCriterion("ZRXVALUE >", value, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZRXVALUE >=", value, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueLessThan(Integer value) {
            addCriterion("ZRXVALUE <", value, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueLessThanOrEqualTo(Integer value) {
            addCriterion("ZRXVALUE <=", value, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueIn(List<Integer> values) {
            addCriterion("ZRXVALUE in", values, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueNotIn(List<Integer> values) {
            addCriterion("ZRXVALUE not in", values, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueBetween(Integer value1, Integer value2) {
            addCriterion("ZRXVALUE between", value1, value2, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andZrxvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("ZRXVALUE not between", value1, value2, "zrxvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueIsNull() {
            addCriterion("FWYSVALUE is null");
            return (Criteria) this;
        }

        public Criteria andFwysvalueIsNotNull() {
            addCriterion("FWYSVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFwysvalueEqualTo(Integer value) {
            addCriterion("FWYSVALUE =", value, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueNotEqualTo(Integer value) {
            addCriterion("FWYSVALUE <>", value, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueGreaterThan(Integer value) {
            addCriterion("FWYSVALUE >", value, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("FWYSVALUE >=", value, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueLessThan(Integer value) {
            addCriterion("FWYSVALUE <", value, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueLessThanOrEqualTo(Integer value) {
            addCriterion("FWYSVALUE <=", value, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueIn(List<Integer> values) {
            addCriterion("FWYSVALUE in", values, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueNotIn(List<Integer> values) {
            addCriterion("FWYSVALUE not in", values, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueBetween(Integer value1, Integer value2) {
            addCriterion("FWYSVALUE between", value1, value2, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andFwysvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("FWYSVALUE not between", value1, value2, "fwysvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueIsNull() {
            addCriterion("MBDCVALUE is null");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueIsNotNull() {
            addCriterion("MBDCVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueEqualTo(Integer value) {
            addCriterion("MBDCVALUE =", value, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueNotEqualTo(Integer value) {
            addCriterion("MBDCVALUE <>", value, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueGreaterThan(Integer value) {
            addCriterion("MBDCVALUE >", value, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("MBDCVALUE >=", value, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueLessThan(Integer value) {
            addCriterion("MBDCVALUE <", value, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueLessThanOrEqualTo(Integer value) {
            addCriterion("MBDCVALUE <=", value, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueIn(List<Integer> values) {
            addCriterion("MBDCVALUE in", values, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueNotIn(List<Integer> values) {
            addCriterion("MBDCVALUE not in", values, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueBetween(Integer value1, Integer value2) {
            addCriterion("MBDCVALUE between", value1, value2, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andMbdcvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("MBDCVALUE not between", value1, value2, "mbdcvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueIsNull() {
            addCriterion("GLXLVALUE is null");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueIsNotNull() {
            addCriterion("GLXLVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueEqualTo(Integer value) {
            addCriterion("GLXLVALUE =", value, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueNotEqualTo(Integer value) {
            addCriterion("GLXLVALUE <>", value, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueGreaterThan(Integer value) {
            addCriterion("GLXLVALUE >", value, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLXLVALUE >=", value, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueLessThan(Integer value) {
            addCriterion("GLXLVALUE <", value, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueLessThanOrEqualTo(Integer value) {
            addCriterion("GLXLVALUE <=", value, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueIn(List<Integer> values) {
            addCriterion("GLXLVALUE in", values, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueNotIn(List<Integer> values) {
            addCriterion("GLXLVALUE not in", values, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueBetween(Integer value1, Integer value2) {
            addCriterion("GLXLVALUE between", value1, value2, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andGlxlvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("GLXLVALUE not between", value1, value2, "glxlvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueIsNull() {
            addCriterion("XSKFVALUE is null");
            return (Criteria) this;
        }

        public Criteria andXskfvalueIsNotNull() {
            addCriterion("XSKFVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andXskfvalueEqualTo(Integer value) {
            addCriterion("XSKFVALUE =", value, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueNotEqualTo(Integer value) {
            addCriterion("XSKFVALUE <>", value, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueGreaterThan(Integer value) {
            addCriterion("XSKFVALUE >", value, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("XSKFVALUE >=", value, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueLessThan(Integer value) {
            addCriterion("XSKFVALUE <", value, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueLessThanOrEqualTo(Integer value) {
            addCriterion("XSKFVALUE <=", value, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueIn(List<Integer> values) {
            addCriterion("XSKFVALUE in", values, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueNotIn(List<Integer> values) {
            addCriterion("XSKFVALUE not in", values, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueBetween(Integer value1, Integer value2) {
            addCriterion("XSKFVALUE between", value1, value2, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andXskfvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("XSKFVALUE not between", value1, value2, "xskfvalue");
            return (Criteria) this;
        }

        public Criteria andExcellentIsNull() {
            addCriterion("EXCELLENT is null");
            return (Criteria) this;
        }

        public Criteria andExcellentIsNotNull() {
            addCriterion("EXCELLENT is not null");
            return (Criteria) this;
        }

        public Criteria andExcellentEqualTo(BigDecimal value) {
            addCriterion("EXCELLENT =", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotEqualTo(BigDecimal value) {
            addCriterion("EXCELLENT <>", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentGreaterThan(BigDecimal value) {
            addCriterion("EXCELLENT >", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCELLENT >=", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentLessThan(BigDecimal value) {
            addCriterion("EXCELLENT <", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCELLENT <=", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentIn(List<BigDecimal> values) {
            addCriterion("EXCELLENT in", values, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotIn(List<BigDecimal> values) {
            addCriterion("EXCELLENT not in", values, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCELLENT between", value1, value2, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCELLENT not between", value1, value2, "excellent");
            return (Criteria) this;
        }

        public Criteria andGoodIsNull() {
            addCriterion("GOOD is null");
            return (Criteria) this;
        }

        public Criteria andGoodIsNotNull() {
            addCriterion("GOOD is not null");
            return (Criteria) this;
        }

        public Criteria andGoodEqualTo(BigDecimal value) {
            addCriterion("GOOD =", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotEqualTo(BigDecimal value) {
            addCriterion("GOOD <>", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodGreaterThan(BigDecimal value) {
            addCriterion("GOOD >", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD >=", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLessThan(BigDecimal value) {
            addCriterion("GOOD <", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD <=", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodIn(List<BigDecimal> values) {
            addCriterion("GOOD in", values, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotIn(List<BigDecimal> values) {
            addCriterion("GOOD not in", values, "good");
            return (Criteria) this;
        }

        public Criteria andGoodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD between", value1, value2, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD not between", value1, value2, "good");
            return (Criteria) this;
        }

        public Criteria andEmployableIsNull() {
            addCriterion("EMPLOYABLE is null");
            return (Criteria) this;
        }

        public Criteria andEmployableIsNotNull() {
            addCriterion("EMPLOYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployableEqualTo(BigDecimal value) {
            addCriterion("EMPLOYABLE =", value, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableNotEqualTo(BigDecimal value) {
            addCriterion("EMPLOYABLE <>", value, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableGreaterThan(BigDecimal value) {
            addCriterion("EMPLOYABLE >", value, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPLOYABLE >=", value, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableLessThan(BigDecimal value) {
            addCriterion("EMPLOYABLE <", value, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPLOYABLE <=", value, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableIn(List<BigDecimal> values) {
            addCriterion("EMPLOYABLE in", values, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableNotIn(List<BigDecimal> values) {
            addCriterion("EMPLOYABLE not in", values, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPLOYABLE between", value1, value2, "employable");
            return (Criteria) this;
        }

        public Criteria andEmployableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPLOYABLE not between", value1, value2, "employable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableIsNull() {
            addCriterion("BASICEMPLOYABLE is null");
            return (Criteria) this;
        }

        public Criteria andBasicemployableIsNotNull() {
            addCriterion("BASICEMPLOYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andBasicemployableEqualTo(BigDecimal value) {
            addCriterion("BASICEMPLOYABLE =", value, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableNotEqualTo(BigDecimal value) {
            addCriterion("BASICEMPLOYABLE <>", value, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableGreaterThan(BigDecimal value) {
            addCriterion("BASICEMPLOYABLE >", value, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASICEMPLOYABLE >=", value, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableLessThan(BigDecimal value) {
            addCriterion("BASICEMPLOYABLE <", value, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASICEMPLOYABLE <=", value, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableIn(List<BigDecimal> values) {
            addCriterion("BASICEMPLOYABLE in", values, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableNotIn(List<BigDecimal> values) {
            addCriterion("BASICEMPLOYABLE not in", values, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASICEMPLOYABLE between", value1, value2, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andBasicemployableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASICEMPLOYABLE not between", value1, value2, "basicemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableIsNull() {
            addCriterion("UNEMPLOYABLE is null");
            return (Criteria) this;
        }

        public Criteria andUnemployableIsNotNull() {
            addCriterion("UNEMPLOYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andUnemployableEqualTo(BigDecimal value) {
            addCriterion("UNEMPLOYABLE =", value, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableNotEqualTo(BigDecimal value) {
            addCriterion("UNEMPLOYABLE <>", value, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableGreaterThan(BigDecimal value) {
            addCriterion("UNEMPLOYABLE >", value, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNEMPLOYABLE >=", value, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableLessThan(BigDecimal value) {
            addCriterion("UNEMPLOYABLE <", value, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNEMPLOYABLE <=", value, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableIn(List<BigDecimal> values) {
            addCriterion("UNEMPLOYABLE in", values, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableNotIn(List<BigDecimal> values) {
            addCriterion("UNEMPLOYABLE not in", values, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNEMPLOYABLE between", value1, value2, "unemployable");
            return (Criteria) this;
        }

        public Criteria andUnemployableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNEMPLOYABLE not between", value1, value2, "unemployable");
            return (Criteria) this;
        }

        public Criteria andSuperiorsIsNull() {
            addCriterion("SUPERIORS is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorsIsNotNull() {
            addCriterion("SUPERIORS is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorsEqualTo(BigDecimal value) {
            addCriterion("SUPERIORS =", value, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsNotEqualTo(BigDecimal value) {
            addCriterion("SUPERIORS <>", value, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsGreaterThan(BigDecimal value) {
            addCriterion("SUPERIORS >", value, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUPERIORS >=", value, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsLessThan(BigDecimal value) {
            addCriterion("SUPERIORS <", value, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUPERIORS <=", value, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsIn(List<BigDecimal> values) {
            addCriterion("SUPERIORS in", values, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsNotIn(List<BigDecimal> values) {
            addCriterion("SUPERIORS not in", values, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUPERIORS between", value1, value2, "superiors");
            return (Criteria) this;
        }

        public Criteria andSuperiorsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUPERIORS not between", value1, value2, "superiors");
            return (Criteria) this;
        }

        public Criteria andPeerIsNull() {
            addCriterion("PEER is null");
            return (Criteria) this;
        }

        public Criteria andPeerIsNotNull() {
            addCriterion("PEER is not null");
            return (Criteria) this;
        }

        public Criteria andPeerEqualTo(BigDecimal value) {
            addCriterion("PEER =", value, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerNotEqualTo(BigDecimal value) {
            addCriterion("PEER <>", value, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerGreaterThan(BigDecimal value) {
            addCriterion("PEER >", value, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PEER >=", value, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerLessThan(BigDecimal value) {
            addCriterion("PEER <", value, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PEER <=", value, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerIn(List<BigDecimal> values) {
            addCriterion("PEER in", values, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerNotIn(List<BigDecimal> values) {
            addCriterion("PEER not in", values, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEER between", value1, value2, "peer");
            return (Criteria) this;
        }

        public Criteria andPeerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEER not between", value1, value2, "peer");
            return (Criteria) this;
        }

        public Criteria andInferiorIsNull() {
            addCriterion("INFERIOR is null");
            return (Criteria) this;
        }

        public Criteria andInferiorIsNotNull() {
            addCriterion("INFERIOR is not null");
            return (Criteria) this;
        }

        public Criteria andInferiorEqualTo(BigDecimal value) {
            addCriterion("INFERIOR =", value, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorNotEqualTo(BigDecimal value) {
            addCriterion("INFERIOR <>", value, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorGreaterThan(BigDecimal value) {
            addCriterion("INFERIOR >", value, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INFERIOR >=", value, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorLessThan(BigDecimal value) {
            addCriterion("INFERIOR <", value, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INFERIOR <=", value, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorIn(List<BigDecimal> values) {
            addCriterion("INFERIOR in", values, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorNotIn(List<BigDecimal> values) {
            addCriterion("INFERIOR not in", values, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INFERIOR between", value1, value2, "inferior");
            return (Criteria) this;
        }

        public Criteria andInferiorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INFERIOR not between", value1, value2, "inferior");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}