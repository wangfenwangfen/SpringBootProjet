package application.entity;


import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @Column(name = "image", length = 30)
    private String image;

    @Column(name = "seatCount", length = 30, nullable = false)
   private int seatCount;

    @Column(name = "price", length = 30, nullable = false)
   private double price;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
