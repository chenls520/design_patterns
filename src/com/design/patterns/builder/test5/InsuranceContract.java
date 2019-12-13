package com.design.patterns.builder.test5;


/**
 * 保险合同对象
 * @author chenliangsen
 * @date 2019/12/13 14:12
 */
public class InsuranceContract {
    /**
     * 保险合同编号
     */
    private String contractId;

    /**
     * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订
     * 也就是说，“被保险人”和“被保险公司”这两个属性，不可能同时有值
     */
    private String personName;

    /**
     * 被保险公司的名称
     */
    private String companyName;

    /**
     * 保险开始生效的日期
     */
    private long beginDate;

    /**
     * 保险失效的日期，一定会大于保险开始生效的日期
     */
    private long endDate;

    /**
     * 其他数据
     */
    private String otherData;

    InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    /**
     * 构造保险合同对象的构造器
     * @author chenliangsen
     * @date 2019/12/13 14:16
     */
    public static class ConcreteBuilder {
        /**
         * 保险合同编号
         */
        private String contractId;

        /**
         * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订
         * 也就是说，“被保险人”和“被保险公司”这两个属性，不可能同时有值
         */
        private String personName;

        /**
         * 被保险公司的名称
         */
        private String companyName;

        /**
         * 保险开始生效的日期
         */
        private long beginDate;

        /**
         * 保险失效的日期，一定会大于保险开始生效的日期
         */
        private long endDate;

        /**
         * 其他数据
         */
        private String otherData;

        /**
         * 构造方法，传入必须要有的参数
         * @param contractId 保险合同编号
         * @param beginDate 保险开始生效的日期
         * @param endDate 保险失效的日期
         */
        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        /**
         * 选填数据，被保险人员的名称
         * @param personName 被保险人员的名称
         * @return 构建器对象
         */
        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        /**
         * 选填数据，被保险公司的名称
         * @param companyName 被保险公司的名称
         * @return 构建器对象
         */
        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
         * 选填数据，其他数据
         * @param otherData 其他数据
         * @return 构建器对象
         */
        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        /**
         * 构建真正的对象并返回
         * @return 构建的保险合同的对象
         */
        public InsuranceContract build() {
            //这个地方可以对参数进行校验
            if (contractId == null || contractId.trim().length() == 0) {
                throw new IllegalArgumentException("合同编号不能为空");
            }
            return new InsuranceContract(this);
        }



        public String getContractId() {
            return contractId;
        }

        public void setContractId(String contractId) {
            this.contractId = contractId;
        }

        public String getPersonName() {
            return personName;
        }


        public String getCompanyName() {
            return companyName;
        }


        public long getBeginDate() {
            return beginDate;
        }

        public void setBeginDate(long beginDate) {
            this.beginDate = beginDate;
        }

        public long getEndDate() {
            return endDate;
        }

        public void setEndDate(long endDate) {
            this.endDate = endDate;
        }

        public String getOtherData() {
            return otherData;
        }


    }

    /**
     * 示意，保险合同的某些操作
     */
    public void someOperation() {
        System.out.println("now in Insurance Contract someOperation=" + this.contractId);
    }
}
