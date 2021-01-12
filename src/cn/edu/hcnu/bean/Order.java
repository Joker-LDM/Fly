package cn.edu.hcnu.bean;

import cn.edu.hcnu.bean.Customer;

public class Order {
        private String id;
        private String customerType;  //乘客的类型
        private String ryf;    //燃油费
        private String hkzhf;  //航空综合险
        private String jptgf;  //机票退改险
        private String yhj;   //优惠卷
        private String hszj;   //含税总价
        private Customer customer[];

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCustomerType() {
            return customerType;
        }

        public void setCustomerType(String customerType) {
            this.customerType = customerType;
        }

        public String getRyf() {
            return ryf;
        }

        public void setRyf(String ryf) {
            this.ryf = ryf;
        }

        public String getHkzhf() {
            return hkzhf;
        }

        public void setHkzhf(String hkzhf) {
            this.hkzhf = hkzhf;
        }

        public String getJptgf() {
            return jptgf;
        }

        public void setJptgf(String jptgf) {
            this.jptgf = jptgf;
        }

        public String getYhj() {
            return yhj;
        }

        public void setYhj(String yhj) {
            this.yhj = yhj;
        }

        public String getHszj() {
            return hszj;
        }

        public void setHszj(String hszj) {
            this.hszj = hszj;
        }

        public Customer[] getCustomer() {
            return customer;
        }

        public void setCustomer(Customer[] customer) {
            this.customer = customer;
        }
    }
