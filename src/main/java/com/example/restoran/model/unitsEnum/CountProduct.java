package com.example.restoran.model.unitsEnum;
import com.example.restoran.model.wareHouse.WereHouse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Table(name = "count_product")
public class CountProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "count")
    private int count;

    @OneToOne
    @MapsId
    @JoinColumn(name = "were_house_id")
    @JsonIgnore
    private WereHouse wereHouse;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public WereHouse getWereHouse() {
        return wereHouse;
    }

    public void setWereHouse(WereHouse wereHouse) {
        this.wereHouse = wereHouse;
    }
}
