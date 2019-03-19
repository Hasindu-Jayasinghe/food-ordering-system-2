package lk.nsbm.onlinefoodorderingsystem.entity;

import javax.persistence.*;

@Entity
public class OrderDetail {
    private int qty;
    private double totalPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders orders;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foodId",referencedColumnName = "foodId",insertable = false,updatable = false)
    private Food food;
    @EmbeddedId
    private OrderDetail_PK orderDetail_PK;

    public OrderDetail() {
    }

    public OrderDetail(int qty, double totalPrice, Orders orders, Food food, OrderDetail_PK orderDetail_PK) {
        this.setQty(qty);
        this.setTotalPrice(totalPrice);
        this.setOrders(orders);
        this.setFood(food);
        this.setOrderDetail_PK(orderDetail_PK);
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public OrderDetail_PK getOrderDetail_PK() {
        return orderDetail_PK;
    }

    public void setOrderDetail_PK(OrderDetail_PK orderDetail_PK) {
        this.orderDetail_PK = orderDetail_PK;
    }
}
