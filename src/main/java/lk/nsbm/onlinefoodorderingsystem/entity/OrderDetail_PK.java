package lk.nsbm.onlinefoodorderingsystem.entity;

import java.io.Serializable;

public class OrderDetail_PK implements Serializable {
    String oid;
    String iid;

    public OrderDetail_PK(String oid, String iid) {
        this.oid = oid;
        this.iid = iid;
    }

    public OrderDetail_PK() {
    }

}
