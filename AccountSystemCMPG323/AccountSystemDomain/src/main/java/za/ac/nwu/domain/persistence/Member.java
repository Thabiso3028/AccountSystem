package za.ac.nwu.domain.persistence;

import javax.persistence.*;
import java.io.*;
import  java.time.LocalDate;


@Entity
@Table(name = "Member")
public class Member implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private Long member_Id;

    @Column(name = "fname", nullable = false)
    private String fname;

    @Column(name = "lname", length = 20)
    private String lname;

    @Column(name = "email", length = 20)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Long getMember_Id() {
        return member_Id;
    }

    public void setMember_Id(Long member_Id) {
        this.member_Id = member_Id;
    }
}
