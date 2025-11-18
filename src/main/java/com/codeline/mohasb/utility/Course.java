package com.codeline.mohasb.utility;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Course {
    Integer id;
    String name;
    String instructor;
    Date updatedDate;
    Date createdDate;
    Boolean isActive;


}
