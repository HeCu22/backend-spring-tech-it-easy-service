package nl.novi.techiteasy1121.Dtos;

public class SalesDto {
    // De sales info is {id, price, originalStock, sold}.
    private Long id;
    private Double price;
    private Integer originalStock;
    private Integer sold;


    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public Integer getSold() {
        return sold;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }
}

