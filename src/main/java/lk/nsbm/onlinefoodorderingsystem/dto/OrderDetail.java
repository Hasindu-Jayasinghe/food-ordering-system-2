package lk.nsbm.onlinefoodorderingsystem.dto;


import java.util.List;

public class OrderDetail {
    private int orderDetailId;
    private List<FoodDto> food;

    public OrderDetail() {
    }

    public OrderDetail(int orderDetailId, List<FoodDto> food) {
        this.orderDetailId = orderDetailId;
        this.food = food;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public List<FoodDto> getFood() {
        return food;
    }

    public void setFood(List<FoodDto> food) {
        this.food = food;
    }
}
