package lk.nsbm.onlinefoodorderingsystem.dto;

import java.time.LocalDate;
import java.util.List;

public class OrderDto {
    private int orderId;
    private LocalDate date;
    private double cost;
    private UserDto userDto;
    private RestaurantDto restaurantDto;
    private List<OrderDetail> orderDetail;

    public OrderDto() {
    }

    public OrderDto(int orderId, LocalDate date, double cost, UserDto userDto, RestaurantDto restaurantDto, List<OrderDetail> orderDetail) {
        this.orderId = orderId;
        this.date = date;
        this.cost = cost;
        this.userDto = userDto;
        this.restaurantDto = restaurantDto;
        this.orderDetail = orderDetail;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public RestaurantDto getRestaurantDto() {
        return restaurantDto;
    }

    public void setRestaurantDto(RestaurantDto restaurantDto) {
        this.restaurantDto = restaurantDto;
    }

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }
}
