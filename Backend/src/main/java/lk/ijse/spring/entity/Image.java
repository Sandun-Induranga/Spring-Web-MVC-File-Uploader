package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String fileString;
    String fileName;

    public Image(String fileString, String fileName) {
        this.fileString = fileString;
        this.fileName = fileName;
    }
}
