package lk.nsbm.onlinefoodorderingsystem.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String oid;
    private String orderDate;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @OneToOne
    private Restaurant restaurant;

    public Orders(String oid, String orderDate, List<OrderDetail> orderDetails, User user, Restaurant restaurant) {
        this.restaurant = restaurant;
        this.setOid(oid);
        this.setOrderDate(orderDate);
        this.setOrderDetails(orderDetails);
        this.setUser(user);
    }

    public Orders() {
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", orderDate='" + orderDate + '\'' +
                ", orderDetails=" + orderDetails +
                ", user=" + user +
                '}';
    }
}
