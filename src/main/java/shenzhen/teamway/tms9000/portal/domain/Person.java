package shenzhen.teamway.tms9000.portal.domain;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private String personid;

    private String personname;

    public Person() {
    }

    private String personaddress;

    private String persontel;
    List<Orders> orders;

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    private static final long serialVersionUID = 1L;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public String getPersonaddress() {
        return personaddress;
    }

    public void setPersonaddress(String personaddress) {
        this.personaddress = personaddress == null ? null : personaddress.trim();
    }

    public String getPersontel() {
        return persontel;
    }

    public void setPersontel(String persontel) {
        this.persontel = persontel == null ? null : persontel.trim();
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
        Person other = (Person) that;
        return (this.getPersonid() == null ? other.getPersonid() == null : this.getPersonid().equals(other.getPersonid()))
            && (this.getPersonname() == null ? other.getPersonname() == null : this.getPersonname().equals(other.getPersonname()))
            && (this.getPersonaddress() == null ? other.getPersonaddress() == null : this.getPersonaddress().equals(other.getPersonaddress()))
            && (this.getPersontel() == null ? other.getPersontel() == null : this.getPersontel().equals(other.getPersontel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonid() == null) ? 0 : getPersonid().hashCode());
        result = prime * result + ((getPersonname() == null) ? 0 : getPersonname().hashCode());
        result = prime * result + ((getPersonaddress() == null) ? 0 : getPersonaddress().hashCode());
        result = prime * result + ((getPersontel() == null) ? 0 : getPersontel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personid=").append(personid);
        sb.append(", personname=").append(personname);
        sb.append(", personaddress=").append(personaddress);
        sb.append(", persontel=").append(persontel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}