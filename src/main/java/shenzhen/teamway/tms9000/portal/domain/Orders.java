package shenzhen.teamway.tms9000.portal.domain;

import java.io.Serializable;

public class Orders implements Serializable {
    private String orderid;

    private String ordernumber;

    private Integer orderprice;

    private String pid;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public Integer getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Integer orderprice) {
        this.orderprice = orderprice;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Orders() {
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orders other = (Orders) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getOrdernumber() == null ? other.getOrdernumber() == null : this.getOrdernumber().equals(other.getOrdernumber()))
            && (this.getOrderprice() == null ? other.getOrderprice() == null : this.getOrderprice().equals(other.getOrderprice()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getOrdernumber() == null) ? 0 : getOrdernumber().hashCode());
        result = prime * result + ((getOrderprice() == null) ? 0 : getOrderprice().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", ordernumber=").append(ordernumber);
        sb.append(", orderprice=").append(orderprice);
        sb.append(", pid=").append(pid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}